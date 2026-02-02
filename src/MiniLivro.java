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
    public boolean aplicaDescontoDe10Porcento() {
        return super.aplicaDescontoDe10Porcento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
