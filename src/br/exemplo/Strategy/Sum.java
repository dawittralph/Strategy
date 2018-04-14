package br.exemplo.Strategy;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class Sum implements Operation{
    
    /**
     *
     * @param v1 = Primeiro valor do tipo double para executar a soma;
     * @param v2 = Segundo valor do tipo double para executar a soma;
     * @return = Retorna os dois valores passados como parâmetros somados;
     */
    @Override
    public double doOperation(double v1, double v2){
        return v1 + v2;
    }
    
}
