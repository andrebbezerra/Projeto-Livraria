package br.com.batista.livraria.produtos;

/**
 *
 * @author andre
 */
public interface Produto extends Comparable<Produto>{
     double getValor();
     
     @Override
     public int compareTo(Produto outro);
}
