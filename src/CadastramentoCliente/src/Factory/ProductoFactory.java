package Factory;

import dominio.Produto;
import generics.Persistence;

public class ProductoFactory implements PersistenteFactory{

    @Override
    public Persistence criaObjeto(String nome, String codigo) {
        return new Produto(nome,codigo);
    }
}
