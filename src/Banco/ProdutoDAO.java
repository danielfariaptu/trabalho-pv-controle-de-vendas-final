package Banco;

import Model.Endereco;
import Model.PessoaFisica;
import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class ProdutoDAO {

    PreparedStatement ps;
    private Connection con;
    private Statement stm;

    public ProdutoDAO() {
        con = Conexao.getConexao();
    }

    public void inserirNoBanco(Produto produto) {
        String sql;
        
        sql =  "INSERT INTO produto(nome, preco,estoque ,codigo_de_barras, tipo_de_uva, pais_de_origem, tipo_de_vinho) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getEstoque());
            ps.setString(4, produto.getCodigoBarras());
            ps.setString(5, produto.getTipoUva());
            ps.setString(6, produto.getPaisOrigem());
            ps.setString(7, produto.getTipoVinho());
            ps.execute();
            ps.close();

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto");
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

    public void alterarProduto(Produto produto) {
            
        String sql;
        PreparedStatement ps;

        sql = "UPDATE produto SET nome = ?, preco = ?, estoque = ?, codigo_de_barras = ?, tipo_de_uva = ?, pais_de_origem = ?, tipo_de_vinho = ? WHERE codigo_de_barras = ?";
        
            
            try {
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());            
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getEstoque());
            ps.setString(4, produto.getCodigoBarras());        
            ps.setString(5, produto.getTipoUva());
            ps.setString(6, produto.getPaisOrigem());
            ps.setString(7, produto.getTipoVinho());
            ps.setString(8, produto.getCodigoBarras());;
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro"+e.getMessage());
        }
}
        
    public ArrayList relatorioProduto() {
        ArrayList<Produto> produtos;
        String sql;
        ResultSet rs;
         produtos = new ArrayList<>();
        
        sql = "SELECT * FROM produto";        
        

        try {
           
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                produtos.add(new Produto(rs.getString("nome"), rs.getDouble("preco"), rs.getInt("estoque"), rs.getString("codigo_de_barras"), rs.getString("tipo_de_uva"), rs.getString("pais_de_origem"), rs.getString("tipo_de_vinho")));
            }
            return produtos;
        } catch (SQLException ex) {
            return null;
        }
    }
    public void excluirProduto(String codigo){
        String sql;
        PreparedStatement ps;
        
        sql = "DELETE FROM produto WHERE codigo_de_barras = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.execute();
            ps.close();
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ao excluir produto", JOptionPane.ERROR_MESSAGE);
        }      
    }
}
