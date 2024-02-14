package TesteGenericsSimples1;

public class Teste {

    public static void main(String[] args) {
        ClasseGenerica<String> classeGenericaTeste = new ClasseGenerica<>();
        String string = classeGenericaTeste.metodoGenerico("Matheus");

        Class<String> stringClass1 = classeGenericaTeste.metodoGenerico1();
        System.out.println(stringClass1); //Devolvendo a classe instanciada e  mostrando seu parâmetro generico;

        Class stringClass = classeGenericaTeste.metodoGenerico2();
        System.out.println(stringClass); //Devolvendo a classe instanciada apenas.

        Class<Cachorro> cachorroClass = classeGenericaTeste.metodoGenerico3();
        System.out.println(cachorroClass); //Devolvendo a classe instanciada e  mostrando seu parâmetro generico definido na própria classe;

    }
}
