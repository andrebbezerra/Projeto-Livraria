package br.com.batista.livraria.produtos;

/**
 *
 * @author andre
 */
public class ConsultaDeDescontos {
    
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        
        if(gerenciador.validaCupom("CUP1234")){
            System.out.println("Cupom de desconto valido.");
            
        } else{
            System.out.println("Esse cupom não existe.");
        }
    }
    
}
