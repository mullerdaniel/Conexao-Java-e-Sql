package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = input.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = input.nextDouble();

        System.out.println("Digite a quantidade de produtos disponiveis: ");
        int quantidade = input.nextInt();

        var produto = new Produto(nome, preco, quantidade);
        var dao = new ProdutoDAO();
        dao.inserirProduto(produto);
    }
}