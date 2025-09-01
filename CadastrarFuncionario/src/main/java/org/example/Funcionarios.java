package org.example;

public class Funcionarios {

    private String nome;
    private String cargo;
    private Double salario;


    // METODO CONSTRUTOR
    public Funcionarios(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {
        return this.cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public Double setSalario(Double salario) {
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome;
    }
}
