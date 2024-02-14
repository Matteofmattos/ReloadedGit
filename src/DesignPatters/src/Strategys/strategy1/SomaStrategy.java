package Strategys.strategy1;

public class SomaStrategy implements OperationStrategy {

    @Override
    public Double calculate(Double value1, Double value2) {

        return value1+value2;
    }
    
}
