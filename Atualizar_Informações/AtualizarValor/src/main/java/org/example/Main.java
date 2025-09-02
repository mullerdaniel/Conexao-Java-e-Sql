package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String client = input.nextLine();

        System.out.println("Digite a data do pedido (EX: 2025/01/01");
        String data_pedido = input.nextLine();

        System.out.println("Digite o valor total do pedido: ");
        double total = input.nextDouble();

        var pedidos = new Pedidos(client, data_pedido, total);
        var dao = new PedidosDAO();
        dao.inserirPedidos(pedidos);


        // ATUALIZAR O VALOR
        System.out.println("\n--------------------------------------------------------------------------\nVocê deseja atualizar o Valor do pedido?\n\n1- Sim\n2- Não\nOpção: ");
        int opcao = input.nextInt();
        input.nextLine();

        if (opcao == 1) {
            System.out.println("Digite o id do pedido: ");
            int id = input.nextInt();

            System.out.println("Digite o novo valor pedido: ");
            total = input.nextDouble();

            dao.atualizarValor(id, total);
        } else {
            System.out.println("Sistema Finalizado...");
        }
    }
}