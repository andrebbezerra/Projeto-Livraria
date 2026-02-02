/**
 *
 * @author andre
 */
public class CarrinhoDeCompras {
    
    private double total = 0;
    
    public void adiciona(Livro livro){
        System.out.println("Adicionando: "+livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }
    
    public double getTotal(){
        return total;
    }
    
}
