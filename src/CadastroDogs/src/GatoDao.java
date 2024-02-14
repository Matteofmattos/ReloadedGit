import java.util.ArrayList;
import java.util.List;

public class GatoDao implements IGato {
    private static final List<Gato> gatos = new ArrayList<>();
    @Override
    public String cadastrar(Gato Gato) {
        if (gatos.isEmpty()){
            gatos.add(Gato);
            return "Cadastramento concluído.";
        } else {
            for (Gato cat: gatos){
                if (cat.getNome().equals(Gato.getNome())){
                    return "Este cat já está cadastrado.";
                } else {
                    gatos.add(Gato);
                    return "Cadastramento concluído.";
                }
            }
        }
        return null;
    }

    @Override
    public String consultar(String nome) {
        if (gatos.isEmpty()){
            return "Ainda não temos cats cadastrados no nosso sistema. :/ ";
        } else {
            for (Gato cat: gatos){
                if (cat.getNome().equals(nome)){
                    System.out.println( "Encontrei! ");
                    return cat.toString();
                }
            }
        }
        return "Ops...Não consegui localizar este cat.";
    }

    @Override
    public String remover(String nome) {
        if (gatos.isEmpty()){
            return "Ainda não temos cats cadastrados no nosso sistema. :/ ";
        } else {
            for (Gato cat: gatos){
                if (cat.getNome().equals(nome)){
                    gatos.remove(cat);
                    return "Exclusão feita com sucesso!";
                }
            }
        }
        return "Ops...Não consegui localizar este cat.";
    }
    @Override
    public String alterar(String nome, String raca) {
        if (gatos.isEmpty()){
            return "Ainda não temos cats cadastrados no nosso sistema. :/ ";
        } else {
            for (Gato cat: gatos){
                if (cat.getNome().equals(nome)){
                    cat.setNome(nome);
                    cat.setRaca(raca);
                    return "Alteração concluída com sucesso!";
                }
            }
        }
        return "Ops...Não consegui localizar este cat.";
    }
}
