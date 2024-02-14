package Strategys.strategy1;

public class Teste1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2d,3d);
        Double multiplicacao = calculator.getResult(new MultiplicaStrategy());
        System.out.println("Multiplicação: "+multiplicacao);


        Double soma = calculator.getResult(new SomaStrategy());
        System.out.println("Soma: "+soma);

        Double subtracao = calculator.getResult(new SubtracaoStrategy());
        System.out.println("Substração: "+subtracao);
    }

    
}
