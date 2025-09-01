package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    public void inserirAluno(Aluno aluno){
        String query = "INSERT INTO alunos (nome, matricula, curso) VALUES (?,?,?)";


        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getCurso());
            stmt.executeUpdate();

            System.out.println("Aluno cadastrado com sucesso!");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
