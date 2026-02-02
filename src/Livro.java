/**
 *
 * @author andre
 */
public abstract class Livro implements Produto, Promocional{
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    Autor autor;
    
    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: "+ nome);
        System.out.println("Descrição: "+ descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("ISBN: "+ isbn);
        
        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        
        System.out.println("--");
    }

    public Livro(Autor autor) {
        this();
        this.autor = autor;
    }

    public Livro() {
        this.isbn = "000--00-00000-00-0";
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
   
    boolean temAutor(){
        return this.autor != null;
    }
    void setValor(double valor){
        this.valor = valor;
    }
    
    @Override
    public double getValor(){
        return this.valor;
    }
    
}
