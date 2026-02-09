package br.com.batista.livraria.produtos;


import br.com.batista.livraria.Autor;

/**
 *
 * @author andre
 */
public class Ebook extends Livro implements Promocional{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
         double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no Ebook");
        return true;
        
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    @Override
    public String toString(){
        return "Eu sou um Ebook";
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
