package Atv1Aluno;

import Atv2Aluno.Autor;

public class Livro {
    private int ano;
    private String titulo;
    private Autor autor;

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Livro(int ano, String titulo, Autor autor) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
}
