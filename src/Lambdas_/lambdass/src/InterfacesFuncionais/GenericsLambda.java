package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericsLambda {

    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Matheus","Felipe","Oliveira","Mattos");

        Consumer consumer = System.out::println;

        myForEach(listaNomes,consumer);
    }

    private static <T> void myForEach(List<T> lista, Consumer<T> consumer){
        lista.forEach(consumer);
    }
}
