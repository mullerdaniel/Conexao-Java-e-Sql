package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String titulo = input.nextLine();

        System.out.println("Digite o autor do livro");
        String autor = input.nextLine();

        System.out.println("Digite o ano de lançamento do livro: ");
        int ano_publicacao = input.nextInt();

        var livros = new Livros(titulo, autor, ano_publicacao);
        var dao = new LivrosDAO();
        dao.inserirLivros(livros);

    }
}