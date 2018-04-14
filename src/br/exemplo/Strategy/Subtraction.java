package br.exemplo.Strategy;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class Subtraction implements Operation{

    @Override
    public double doOperation(double v1, double v2) {
        return v1 - v2;
    }
    
    
}
