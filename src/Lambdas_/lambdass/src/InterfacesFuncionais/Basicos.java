package InterfacesFuncionais;

import java.util.function.*;

public class Basicos {

    public static void main(String[] args) {
        System.out.println("-----------------## IntBinaryOperator ###---------------");
        IntBinaryOperator intBinaryOperator = (int a,int b)-> {
            return (a+b)/2;
        };
        int i = intBinaryOperator.applyAsInt(2, 2);
        System.out.println(i);

        System.out.println("-----------------## BiFunction ###---------------");
        BiFunction<Integer,Integer,String> biFunction = (Integer a,Integer b) -> {
            return String.valueOf(a+b).concat("...");
        };
        String apply = biFunction.apply(4, 5);
        System.out.println(apply);

        System.out.println("-----------------## Runnable ###---------------");
        Runnable runnable = () -> System.out.println("Runable....");
        runnable.run();

        System.out.println("-----------------## Consumer ###---------------");
        Consumer<String> consumer = ( String a)-> {
            System.out.println(a.concat("..."));
        };
        consumer.accept("Hello");

        System.out.println("-----------------## Supplier ###---------------");
        Supplier<Double> supplier = ()-> { return 3.1415;};
        Double pi = supplier.get();
        System.out.println(pi);

        System.out.println("-----------------## MyConsumer ###---------------");
        MyConsumer<Double> myConsumer = System.out::println;
        myConsumer.accept(3.12);

        System.out.println("-----------------## IntFunction ###---------------");
        IntFunction<String> intFunction = (int a) -> {
            return String.valueOf(a + 4);
        };
        String result = intFunction.apply(3);
        System.out.println(result);
    }

}

