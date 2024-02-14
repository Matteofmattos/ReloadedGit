package generics;

import Dao.SingletonMap;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public abstract class GenericDao<T extends Persistence> implements  IGenericDao<T>{
    private Map<Class<T>,Map<String,T>> map;
    public GenericDao( ) {
        map = SingletonMap.getInstance().getMap();
    }
    public abstract Class<T> getClasse();
    public abstract void alterar(T entity, T dado);
    @Override
    public void cadastrar(T entity) {
        Map<String, T> mapInterno = map.get(getClasse());

        if ( mapInterno == null ) {
            mapInterno = new HashMap<>();
            mapInterno.put(entity.getCodigo(),entity);
            map.put(getClasse(),mapInterno);
            out.println("Cadastramento feito com sucesso! ");
        } else {
            if (mapInterno.get(entity.getCodigo())==null ){
                mapInterno.put(entity.getCodigo(),entity);
                out.println("Cadastramento feito com sucesso! ");
            } else {
                out.println("Ops.. há um valor da classe "+ getClasse() + " utilizando este código.");
            }
        }
    }
    @Override
    public void consultar(String codigo) {
        Map<String,T> mapInterno = map.get(getClasse());
        if ( mapInterno == null ) {
            out.println("Ainda não há um dado de acordo com o tipo da classe informada. ");
        } else {
            if (mapInterno.get(codigo)==null ){
                out.println("O código solicitado não corresponde a nenhum dado cadastrado do tipo "+getClasse());
            } else {
                out.println("Encontrei! ");
                out.println(mapInterno.get(codigo));
            }
        }
    }

    @Override
    public void excluir(String codigo) {
            Map<String,T> mapInterno = map.get(getClasse());
            if ( mapInterno == null ) {
                out.println("Ainda não há um dado de acordo com o tipo da classe informada. ");
            } else {
                if (mapInterno.get(codigo)==null ){
                    out.println("O código solicitado não corresponde a nenhum dado cadastrado do tipo "+getClasse());
                } else {
                    out.println("Excluindo...! ");
                    out.println(mapInterno.remove(codigo));
                }
            }
        }

    public void atualizar(T entity) {
        Map<String,T> mapInterno = map.get(getClasse());
        if ( mapInterno == null ) {
            out.println("Ainda não há um dado de acordo com o tipo da classe informada. ");
        } else {
            if (mapInterno.get(entity.getCodigo())==null ){
                out.println("O código solicitado não corresponde a nenhum dado cadastrado do tipo "+getClasse());
            } else {
                T dado = mapInterno.get(entity.getCodigo());
                out.println("Atualizando...");
                alterar(entity,dado);
            }
        }
    }
}
