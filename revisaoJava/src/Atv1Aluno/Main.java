package Atv1Aluno;

public class Main {
    public static void main(String[] args) throws Exception {
        Livro livro1;

        livro1 = new Livro();

        livro1.setAno(2017);
        livro1.setTitulo("A cabana");
        livro1.setAutor("William P. Young");

        System.out.println("Ano: "+livro1.getAno());
        System.out.println("Título: "+livro1.getTitulo());
        System.out.println(("Autor: "+livro1.getAutor()));
}
}
