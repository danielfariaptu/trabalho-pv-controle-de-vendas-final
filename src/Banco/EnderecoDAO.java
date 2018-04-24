package Banco;

import Model.Endereco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    public ArrayList<Endereco> buscarEnderecos(int id){
        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
        
        PreparedStatement ps = null;        
        ResultSet rs = null;


        String sql = "SELECT * FROM endereco WHERE fk_cliente_id = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
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
}
