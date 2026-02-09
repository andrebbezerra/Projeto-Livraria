package br.com.batista.livraria.produtos;

import java.util.*;

/**
 *
 * @author andre
 */
public class CarrinhoDeCompras {
    
    private final double total = 0;
    private final List<Produto> produtos;
    
    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<Produto>();
    }
    
    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }
    
     public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
 
    public double getTotal(){
        return total;
    }
    
}
