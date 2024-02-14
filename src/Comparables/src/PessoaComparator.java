import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return (int) (o1.getContaBancaria()-o2.getContaBancaria());
    }

}
