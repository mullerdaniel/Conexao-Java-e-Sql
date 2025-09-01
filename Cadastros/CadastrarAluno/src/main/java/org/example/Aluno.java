package org.example;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;


    // METODO CONSTRUTOR
    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String setMatricula(String matricula) {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public String setCurso(String curso){
        return this.curso;
    }
}
