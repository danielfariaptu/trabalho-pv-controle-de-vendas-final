package Banco;

import Login.Conexao;
import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*

public class CadastroDAO {

    private PreparedStatement statement;
    private ResultSet resultSet;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Boolean verificaSenha;
    private Connection conn;
    
    public CadastroDAO() {
              conn= Conexao.getConexao();


    }

*/
public class ProdutoDAO {

    private Connection con;
    private Statement stm;

    public ProdutoDAO() {
        con = Conexao.getConexao();
    }

    public String inserirNoBanco(Produto pro) {
        try {
            stm.executeUpdate("INSERT INTO produto (nome, preco, codigoBarras, tipoUva, paisOrigem, tipoVinho) VALUES ('"
                    + pro.getNome() + "', '" + pro.getPreco() + "', '" + pro.getCodigoBarras() + "', '" + pro.getTipoUva() + "', '" + pro.getPaisOrigem() + "', '" + pro.getTipoVinho() + "')");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public String excluirDoBanco(String nome) {
        try {
            stm.execute("DELETE FROM produto WHERE nome = " + nome + "");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public String alterarNoBanco(Produto pro) {
        try {
            stm.execute("UPDATE produo SET " + "nome= '" + pro.getNome() + "' " + ", preco= '" + pro.getPreco() + "', codigoBarras= '" + pro.getCodigoBarras() + "', tipoUva= '" + pro.getTipoUva() + "', paisOrigem= '" + pro.getPaisOrigem() + "', tipoVinho= '" + pro.getTipoVinho() + "' WHERE nome = " + pro.getNome() + "");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public ArrayList consultarNoBanco(String nome) {
        ArrayList<Produto> produtos;
        ResultSet rs;

        try {
            produtos = new ArrayList<>();
            rs = stm.executeQuery("SELECT * " + " FROM produto " + " WHERE nome = '" + nome + "' ORDER BY nome ");
            while (rs.next()) {
                produtos.add(new Produto(rs.getString("nome"), rs.getDouble("preco"), rs.getString("codigoBarras"), rs.getString("tipoUva"), rs.getString("paisOrgem"), rs.getString("tpoVnho")));
            }
            return produtos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList relatorioProduto() {
        ArrayList<Produto> produtos;
        ResultSet rs;

        try {
            produtos = new ArrayList<>();
            rs = stm.executeQuery("SELECT * FROM cliente ORDER BY codigo");
            while (rs.next()) {
                produtos.add(new Produto(rs.getString("nome"), rs.getDouble("preco"), rs.getString("codigoBarras"), rs.getString("tipoUva"), rs.getString("paisOrgem"), rs.getString("tpoVnho")));
            }
            return produtos;
        } catch (SQLException ex) {
            return null;
        }
    }
}
