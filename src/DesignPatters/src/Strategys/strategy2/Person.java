package Strategys.strategy2;

public class Person {

    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    private Movimentar movimentarStrategy;
    private Comer comerStrategy;
    private Trabalhar trabalharStrategy;

    public Person(Movimentar movimentarStrategy, Comer comerStrategy, Trabalhar trabalharStrategy ){
        this.comerStrategy=comerStrategy;
        this.movimentarStrategy=movimentarStrategy;
        this.trabalharStrategy=trabalharStrategy;
    }

    public void Comer(){
        this.comerStrategy.comer();
    }

    public void Trabalhar(){
        this.trabalharStrategy.trabalhar();
    }

    public void Movimentar(){
        this.movimentarStrategy.movimentar();
    }
    
}
