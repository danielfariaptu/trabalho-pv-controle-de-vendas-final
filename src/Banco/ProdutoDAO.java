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

    private Connection con;
    private Statement stm;

    public ProdutoDAO() {
        con = Conexao.getConexao();
    }

    public void inserirNoBanco(Produto produto) {
        PreparedStatement ps;
        int id = chave();
        String sql;
        
        sql =  "INSERT INTO produto(produto_id, nome, preco,estoque ,codigo_de_barras, tipo_de_uva, pais_de_origem, tipo_de_vinho) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, produto.getNome());
            ps.setDouble(3, produto.getPreco());
            ps.setInt(4, produto.getEstoque());
            ps.setString(5, produto.getCodigoBarras());
            ps.setString(6, produto.getTipoUva());
            ps.setString(7, produto.getPaisOrigem());
            ps.setString(8, produto.getTipoVinho());
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

    public void alterarNoBanco(Produto produto) {
            
        String sql;
        PreparedStatement ps;

        sql = "UPDATE produto SET nome = ?, preco = ?, estoque = ?, tipo_de_uva = ?, pais_de_origem = ?, tipo_de_vinho = ? WHERE codigo_de_barras = ?";
        
            
            try {
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());            
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getEstoque());
            ps.setString(4, produto.getTipoUva());
            ps.setString(5, produto.getPaisOrigem());
            ps.setString(6, produto.getTipoVinho());
            ps.setString(7, produto.getCodigoBarras());
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro333", JOptionPane.ERROR_MESSAGE);
        }
}
        
    public ArrayList relatorioProduto() {
        ArrayList<Produto> produtos;
        ResultSet rs;

        try {
            produtos = new ArrayList<>();
            rs = stm.executeQuery("SELECT * FROM produto");
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
        private int chave() {
        String sql;
        PreparedStatement ps;
        ResultSet rs;
        int proximoCodigo = -1;

        sql = "select max(produto_id) from produto";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                proximoCodigo = rs.getInt(1);
            }
            ps.close();
            return proximoCodigo+1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Referencia", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
}
