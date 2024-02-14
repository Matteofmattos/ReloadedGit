package TesteGenericsSimples2;

public class Teste {

    public static void main(String[] args) {
        Cachorro<String> cachorro = new Cachorro<>("Austrália","Médio",true,true);
        String t = cachorro.retornaGenerico();

        Cachorro<Double> cachorro2 = new Cachorro<>("Austrália","Médio",true,true);
        cachorro2.retornaGenerico();
    }
}
