package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivrosDAO {
    public void inserirLivros(Livros livros) {
        String query = "INSERT INTO livros (titulo, autor, ano_publicacao) VALUES (?,?,?)";

        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getAutor());
            stmt.setInt(3, livros.getAno_publicacao());
            stmt.executeUpdate();

            System.out.println ("Livro cadastrado com sucesso!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
