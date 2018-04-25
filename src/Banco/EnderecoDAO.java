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

       final List<Endereco> end = new ArrayList<Endereco>();
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

}
