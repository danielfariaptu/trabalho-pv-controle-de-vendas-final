package Banco;

import Model.Compra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompraDAO {

    private Connection con;
    private Statement stm;

    public CompraDAO() {
        try {
            String url = "jdbc:postgresql://localhost:5432/clinica", usuario = "postgres", senha = "123321";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String inserirNoBanco(Compra com) {
        try {
            stm.executeUpdate("INSERT INTO compra (produto, total, data) VALUES ('" + com.getProdutos() + "', '" + com.getTotal() + "', '" + com.getData() + "')");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public String excluirDoBanco(String produto) {
        try {
            stm.execute("DELETE FROM compra WHERE produto = " + produto + "");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public String alterarNoBanco(Compra com) {
        try {
            stm.execute("UPDATE compra SET " + " produto = '" + com.getProdutos() + "', " + " totaol = '" + com.getTotal() + "', " + " data = '" + com.getData() + "' WHERE produto = " + com.getProdutos());
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();

        }
    }
}
