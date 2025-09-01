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
}
