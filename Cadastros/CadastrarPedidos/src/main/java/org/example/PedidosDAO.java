package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidosDAO {
    public void inserirPedidos(Pedidos pedidos) {
        String query = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?,?,?)";


        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, pedidos.getCliente());
            stmt.setString(2, pedidos.getData_pedido());
            stmt.setDouble(3, pedidos.getTotal());
            stmt.executeUpdate();
            System.out.println("Pedido cadastrado com sucesso!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
