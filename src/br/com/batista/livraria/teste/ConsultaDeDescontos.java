package br.com.batista.livraria.teste;

import br.com.batista.livraria.produtos.GerenciadorDeCupons;

/**
 *
 * @author andre
 */
public class ConsultaDeDescontos {
    
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        
        Double desconto = gerenciador.validaCupom("CUP74");

        if(desconto != null){
            System.out.println("Desconto encontrado: " + desconto + "%");
        } else {
            System.out.println("Cupom inválido.");
        }
    }
    
}
