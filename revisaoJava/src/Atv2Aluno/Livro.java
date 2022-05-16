package Atv2Aluno;

public class Livro {
    private String nome;
    private String autor;
    private double preco;
    private int quantidade;

    public Livro(String nome, String autor, double preco, int quantidade){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
    
}
