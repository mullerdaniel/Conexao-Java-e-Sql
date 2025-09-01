package org.example;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    // METODO CONSTRUTOR
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome;
    }

    public double getpreco(){
        return this.preco;
    }

    public double setpreco(double  preco){
        return this.preco;
    }

    public int getquantidade(){
        return this.quantidade;
    }

    public int setquantidade(int quantidade){
        return this.quantidade;
    }
}
