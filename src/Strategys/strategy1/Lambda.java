package Strategys.strategy1;

public class Lambda {
public static void main(String[] args) {
    OperationStrategy power = ( v1, v2 )->{  return Math.pow(v1, v2); };
    Double powerR = power.calculate(2d, 4d);
    System.out.println("Potência por lambda: "+powerR);


    OperationStrategy power_func = new OperationStrategy() {
        @Override
        public Double calculate( Double value1, Double value2) {
            return Math.pow(value1, value2);
        }
    };

    Double calculate = power_func.calculate(2d, 4d);
    System.out.println("Potência por interface funcional: "+calculate);
}
    
}
