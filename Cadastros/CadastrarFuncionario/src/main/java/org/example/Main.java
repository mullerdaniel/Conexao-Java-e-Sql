package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o nome do funcionario: ");
        String nome = input.nextLine();

        System.out.println("Digite o cargo do funcionario");
        String cargo = input.nextLine();

        System.out.println("Digite o salario do funcionario: ");
        Double salario = input.nextDouble();

        var funcionarios = new Funcionarios(nome,cargo,salario);
        var dao = new FuncionariosDAO();
        dao.inserirFuncionarios(funcionarios);
    }
}