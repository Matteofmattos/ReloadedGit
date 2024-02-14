package InterfacesFuncionais;

import java.util.function.Consumer;

public class MethodRef {

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer.accept("Olá");

        Finder finder =  MyClass::doFind;

        int i = finder.find("Matheus", "Felipe");
        System.out.println(i);

        Finder finder2 = String::indexOf;
        int i1 = finder2.find("Matheus", "Felipe");
        System.out.println(i1);

        String_Factory stringFactory = String::new;
        String retorno = stringFactory.create("abcd");
        System.out.println(retorno);
    }
}
