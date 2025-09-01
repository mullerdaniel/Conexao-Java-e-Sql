package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionariosDAO {
    public void inserirFuncionarios(Funcionarios funcionarios) {
        String query = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?,?,?)";

        try(Connection conn = Conexao.conectar()) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1,funcionarios.getNome());
            stmt.setString(2,funcionarios.getCargo());
            stmt.setDouble(3,funcionarios.getSalario());
            stmt.executeUpdate();

            System.out.println("Funcionario cadastrado com sucesso!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
