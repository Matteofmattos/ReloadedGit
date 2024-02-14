import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste2 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Matheus","Brasileiro",27,4844d));
        pessoas.add(new Pessoa("Diógenes","Espanhol",12,134215d));
        pessoas.add(new Pessoa("Fernando","Argentino",48,7834647d));
        pessoas.add(new Pessoa("Elisane","Brasileira",17,46d));

        System.out.println("*** Utilizando o comparable...");
        Collections.sort(pessoas);
        pessoas.forEach(s -> System.out.println(s.getIdade()));

        System.out.println("*** Utilizando o comparator...");
        pessoas.sort(new PessoaComparator());
        pessoas.forEach(s -> System.out.println(s.getContaBancaria()));

        System.out.println("*** Comparable invertido");
        Collections.reverse(pessoas);
        pessoas.forEach(s -> System.out.println(s.getIdade()));

        System.out.println("*** Comparable Max");
        Pessoa max = Collections.max(pessoas);
        System.out.println(max.toString());

    }
}
