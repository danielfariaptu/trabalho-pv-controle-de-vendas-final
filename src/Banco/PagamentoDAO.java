package Banco;

import Model.Pagamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PagamentoDAO {

    private Connection con;
    private Statement stm;

    public PagamentoDAO() {
        try {
            String url = "jdbc:postgresql://localhost:5432/tavv", usuario = "postgres", senha = "123321";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String inserirNoBanco(Pagamento pag) {
        try {
            stm.executeUpdate("INSERT INTO pagamento (data, valor, tipo, juros) VALUES ('"
                    + pag.getData() + "', '" + pag.getValor() + "', '" + pag.getTipo() + "', '" + pag.getJuros() + "')");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }
}
