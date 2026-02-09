package br.com.batista.livraria;

/**
 *
 * @author andre
 */
public class Autor {
    String nome;
    String email;
    String cpf;
    
   public void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do autor: ";
        System.out.println(mensagem);
        System.out.println("Nome: "+ nome);
        System.out.println("Email: "+ email);
        System.out.println("CPF: "+ cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Autor)) return false;      
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
    }
    
}
