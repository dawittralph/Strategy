package br.exemplo.Strategy;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class Calculator {
    private Operation operation;
    
    public Calculator(Operation operation){
        this.operation = operation;
    }
    
    public Calculator(){
        
    }
    
    public void SetOperation(Operation operation){
        this.operation = operation;
    }
    
    public double executeOperation(double v1, double v2){
        return this.operation.doOperation(v1, v2);
    }
    
}
