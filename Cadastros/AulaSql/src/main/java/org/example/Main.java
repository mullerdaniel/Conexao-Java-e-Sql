package org.example;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu email: ");
        String email = input.nextLine();

        var user = new Usuario(nome, email);
        var dao = new UsuarioDAO();
        dao.inserirUsuario(user);



        }
    }



