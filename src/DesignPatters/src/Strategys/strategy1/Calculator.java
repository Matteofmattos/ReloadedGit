package Strategys.strategy1;

public class Calculator {

    Double value1;
    Double value2;

    public Calculator(Double v1, Double v2){
        this.value1=v1;
        this.value2=v2;
    }

    public Double getResult(OperationStrategy strategy){
        return strategy.calculate(value1, value2);
    }
    
}
