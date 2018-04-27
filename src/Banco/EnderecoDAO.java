package Banco;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.postgresql.core.ConnectionFactory;

public class EnderecoDAO {

    
    private Connection conn;
    private Statement stm;

    public EnderecoDAO() {
     conn = Conexao.getConexao();
    }

    public String inserirNoBanco(Endereco end) {
        try {
            stm.executeUpdate("INSERT INTO endereco (logradouro, numero, complemento, bairro, municipio, estado, tipoEndereco) VALUES ('"
                    + end.getLogradouro() + "', '" + end.getNumero() + "', '" + end.getComplemento() + "', '" + end.getBairro() + "', '" + end.getMunicipio() + "', '" + end.getEstado() + "', '" + end.getTipoEndereco() + "')");
            return "sucesso";
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public ArrayList<Endereco> buscarEnderecos(int id) {
        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM endereco WHERE fk_cliente_id = ?";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                Endereco endereco = new Endereco();
                
                endereco.setCodigo(rs.getInt("endereco_id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setMunicipio(rs.getString("municipio"));
                endereco.setEstado(rs.getString("estado"));
                endereco.setTipoEndereco(rs.getInt("tipo_endereco"));
                endereco.setCep(rs.getString("cep"));

                enderecos.add(endereco);
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return enderecos;
    }

    public ArrayList<Endereco> relatorioEndereco() {

       List<Endereco> end = new ArrayList<Endereco>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            
            rs = stm.executeQuery("SELECT * FROM produto");
            while (rs.next()) {
                Endereco endereco = new Endereco();

                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setMunicipio(rs.getString("municipio"));
                endereco.setEstado(rs.getString("estado"));
                endereco.setTipoEndereco(rs.getInt("tipo_endereco"));
                endereco.setCep(rs.getString("cep"));

                end.add(endereco);
                
               
            }
            return (ArrayList<Endereco>) end;
        } catch (SQLException ex) {
            return null;
        } 
    }
    
   
        public boolean deletarEndereco(int id) {
        String sql;
        PreparedStatement ps;
        
        sql = "DELETE FROM endereco WHERE endereco_id = ?";        
       

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
        public void alterarEndereco(Endereco endereco) {
            
        String sql;
        PreparedStatement ps;

        sql = "UPDATE endereco SET logradouro = ?, numero = ?, complemento = ?, bairro = ?, municipio = ?, estado = ?, tipo_endereco = ?, cep = ? WHERE endereco_id = ?";
        
            
            try {
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, endereco.getLogradouro());
                ps.setInt(2, endereco.getNumero());
                ps.setString(3, endereco.getComplemento());
                ps.setString(4, endereco.getBairro());
                ps.setString(5, endereco.getMunicipio());
                ps.setString(6, endereco.getEstado());
                ps.setInt(7, endereco.getTipoEndereco());
                ps.setString(8, endereco.getCep());
                ps.setInt(9, endereco.getCodigo());
           

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro333", JOptionPane.ERROR_MESSAGE);
        }
}

}
