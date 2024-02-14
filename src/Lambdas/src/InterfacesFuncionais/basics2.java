package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class basics2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,5,1,8,4,7,33);
        System.out.println(lista);

        List<String> resultados = realizaOperacao(lista, (int a) -> {
            return String.valueOf(a * 5);
        });
        System.out.println(resultados);


        List<String> resultados2 = realizaOperacao(lista, (int a) -> {
            return String.valueOf(a +10);
        });
        System.out.println(resultados2);
    }

    private static List<String> realizaOperacao(List<Integer> values, IntFunction<String> function) {
        List<String> values1 = new ArrayList<>();
        values.forEach((a)-> {
            String apply = function.apply(a);
            values1.add(apply);
        });
        return values1;
    }
}
