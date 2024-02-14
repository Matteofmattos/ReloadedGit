package Strategys.strategy2;

public class Teste2 {

    public static void main(String[] args) {
        Person john = new Person(new CarStrategy(),new JantarStrategy(),new ProgramarStrategy());
        john.setNome("John Richard");

        System.out.println("Olá! Meu nome é "+john.getNome());
        john.Trabalhar();
        john.Movimentar();
        john.Comer();
    }
    
}
