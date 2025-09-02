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


        // ATUALIZAR O PREÇO
        System.out.println("\n--------------------------------------------------------------------------\nVocê deseja atualizar o preço do produto?\n\n1- Sim\n2- Não\nOpção: ");
        int opcao = input.nextInt();
        input.nextLine();

        if (opcao == 1) {
            System.out.println("Digite o nome do produto: ");
            nome = input.nextLine();

            System.out.println("Digite o novo preço: ");
            preco = input.nextDouble();

            dao.atualizarPreco(nome, preco);
        } else {
            System.out.println("Sistema Finalizado...");
        }
    }
}