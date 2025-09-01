package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua matricula: ");
        String matricula = input.nextLine();

        System.out.println("Digite seu curso: ");
        String curso = input.nextLine();

        var aluno = new Aluno(nome, matricula, curso);
        var dao = new AlunoDAO();
        dao.inserirAluno(aluno);



    }
}