package br.exemplo.Strategy;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class useStrategy {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.SetOperation(new Multiplication());
        System.out.println("O resultado da operação é: " + calc.executeOperation(10, 5));
    }
    
}
