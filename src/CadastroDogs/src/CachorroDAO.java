import java.util.ArrayList;
import java.util.List;

public class CachorroDAO implements ICachorro {
    private static List<Cachorro> cachorros = new ArrayList<>();
    @Override
    public String cadastrar(Cachorro cachorro) {
        if (cachorros.isEmpty()){
            cachorros.add(cachorro);
            return "Cadastramento concluído.";
        } else {
            for (Cachorro dog: cachorros){
                if (dog.getNome().equals(cachorro.getNome())){
                    return "Este dog já está cadastrado.";
                } else {
                    cachorros.add(cachorro);
                    for (Cachorro dog1 : cachorros){System.out.println(dog1);}
                    return "Cadastramento concluído.";
                }
            }
        }
        return null;
    }

    @Override
    public String consultar(String nome) {
        if (cachorros.isEmpty()){
            return "Ainda não temos dogs cadastrados no nosso sistema. :/ ";
        } else {
            for (Cachorro dog: cachorros){
                if (dog.getNome().equals(nome)){
                    System.out.println( "Encontrei! ");
                    return dog.toString();
                }
            }
        }
        return "Ops...Não consegui localizar este dog.";
    }

    @Override
    public String remover(String nome) {
        if (cachorros.isEmpty()){
            return "Ainda não temos dogs cadastrados no nosso sistema. :/ ";
        } else {
            for (Cachorro dog: cachorros){
                if (dog.getNome().equals(nome)){
                    cachorros.remove(dog);
                    return "Exclusão feita com sucesso!";
                }
            }
        }
        return "Ops...Não consegui localizar este dog.";
    }
    @Override
    public String alterar(String nome, String raca) {
        if (cachorros.isEmpty()){
            return "Ainda não temos dogs cadastrados no nosso sistema. :/ ";
        } else {
            for (Cachorro dog: cachorros){
                if (dog.getNome().equals(nome)){
                    dog.setNome(nome);
                    dog.setRaca(raca);
                    return "Alteração concluída com sucesso!";
                }
            }
        }
        return "Ops...Não consegui localizar este dog.";
    }
}

