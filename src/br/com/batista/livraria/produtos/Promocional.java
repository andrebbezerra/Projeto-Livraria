package br.com.batista.livraria.produtos;

/**
 *
 * @author andre
 */
@FunctionalInterface
public interface Promocional {
    
    boolean aplicaDescontoDe(double porcentagem);
    
    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDescontoDe(0.1);
    }
}
