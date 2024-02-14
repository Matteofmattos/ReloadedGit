package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Foreachs {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,5,1,8,4,7,33);
        System.out.println(lista);
        List<Boolean> booleans = avaliaExpressao(lista, (n) -> {
            return n % 2 == 0;
        });
        System.out.println(booleans);

        List<Boolean> respostas = avaliaExpressao(lista, (n) -> {
            return n>5;
        });
        System.out.println(respostas);
    }

    private static List<Boolean> avaliaExpressao(List<Integer> values, Predicate<Integer> predicate) {
        List<Boolean> results = new ArrayList<>();
        values.forEach((n)->{
            boolean test = predicate.test(n);
            results.add(test);
        });
        return results;
    }
}
