import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste1 {

    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();

        inteiros.add(3);
        inteiros.add(12);
        inteiros.add(39);
        inteiros.add(42);
        inteiros.add(5);

        System.out.println(inteiros);

        Collections.sort(inteiros);

        System.out.println(inteiros);

    }
}
