package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    public void inserirProduto(Produto produto) {
        String query = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?,?,?)";


        try (Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getpreco());
            stmt.setInt(3, produto.getquantidade());
            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarPreco(String nome, double novoPreco) {
        String sql = "UPDATE produtos SET preco = ? WHERE nome = ?";

        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1,novoPreco);
            stmt.setString(2,nome);
            stmt.executeUpdate();

            System.out.println("Novo preço atualizado com sucesso!");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
