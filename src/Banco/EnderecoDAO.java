package Banco;

import Model.Endereco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EnderecoDAO {

    private Connection con;
    private Statement stm;

    public EnderecoDAO() {
        try {
            String url = "jdbc:postgresql://localhost:5432/tavv", usuario = "postgres", senha = "123321";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
     public String inserirNoBanco(Endereco end) {
        try {
            stm.executeUpdate("INSERT INTO endereco (logradouro, numero, complemento, bairro, municipio, estado, tipoEndereco) VALUES ('"
                    + end.getLogradouro()+ "', '" + end.getNumero()+ "', '" + end.getComplemento()+ "', '" + end.getBairro()+ "', '" + end.getMunicipio()+ "', '" + end.getEstado()+ "', '" + end.getTipoEndereco()+ "')");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }
}
