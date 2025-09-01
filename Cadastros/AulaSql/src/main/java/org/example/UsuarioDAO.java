package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public void inserirUsuario(Usuario user){
        String query = "INSERT INTO usuarios (nome, email) VALUES (?,?)";

        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, user.getNome());
            stmt.setString(2,user.getEmail());
            stmt.executeUpdate();

            System.out.println("Usuario cadastrado com sucesso!");

        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Usuario não cadastrado!");
        }

    }
}
