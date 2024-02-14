package Strategys.strategy1;

public class SubtracaoStrategy implements OperationStrategy{

    @Override
    public Double calculate(Double value1, Double value2) {
        
        return value2-value1;
    }
    
}
