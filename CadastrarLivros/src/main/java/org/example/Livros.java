package org.example;

public class Livros {

    private String titulo;
    private String autor;
    private int ano_publicacao;


    // METODO CONSTRUTOR
    public Livros(String titulo, String autor, int ano_publicacao) {
        this.titulo = titulo;
        this. autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public int setAno_publicacao(int ano_publicacao) {
        return this.ano_publicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) {
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String setTitulo(String titulo) {
        return this.titulo;
    }
}
