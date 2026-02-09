package br.com.batista.livraria.produtos;


import br.com.batista.livraria.Autor;

/**
 *
 * @author andre
 */
public class MiniLivro extends Livro implements Promocional{
    
    public MiniLivro(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
     public int compareTo(Produto outro){
         
        if(this.getValor() < outro.getValor()){
         return -1;
        }
        if(this.getValor() > outro.getValor()){
         return 1;
        }
        return 0;
        
     }

   
    
    
}
