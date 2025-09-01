package org.example;

public class Usuario {
    private String nome;
    private String email;


    // METODO CONSTRUTOR
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    // GET SET DO NOME
    public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome;
    }


    // GET SET DO EMAIL
    public String getEmail(){
        return this.email;
    }

    public String setEmail(String email){
        return this.email;
    }


}
