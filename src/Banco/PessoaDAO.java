/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Login.Conexao;
import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class PessoaDAO {

    private PessoaFisica pf;
    private PessoaJuridica pj;
    private Connection conn;
    

    public PessoaDAO() {
    conn = Conexao.getConexao();
    }
    
    
    private int chave(){
		String sql;
		PreparedStatement ps;
                ResultSet rs;
		int proximoCodigo=0;

		sql = "select max(cliente_id) from cliente";

		try{
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			if(rs.next()){
				proximoCodigo = rs.getInt(1);
			}
			ps.close();
                        return proximoCodigo;
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de Referencia", JOptionPane.ERROR_MESSAGE);
		}
		return 0;
	}
    
    public boolean inserirPessoaFisica(PessoaFisica cliente) {
        String sql;
        PreparedStatement ps;
        
        
        sql = "INSERT INTO cliente(nome,limite_de_credito,cpf,excluido) VALUES (?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setDouble(2, cliente.getLimiteCredito());
            ps.setString(3, cliente.getCpf());
            ps.setBoolean(4, false);
            ps.execute();
            ps.close();
            
           return inserirEndereco(cliente.getEnderecos(), chave());
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } 
        return false;
    }

       private boolean inserirEndereco(ArrayList<Endereco> enderecos, int chave) {
        String sql;
        PreparedStatement ps=null;
        
        
        sql = "INSERT INTO endereco(logradouro,cep,numero,complemento,bairro,municipio,estado,tipo_endereco,excluido,fk_cliente_id) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            
            for(Endereco end : enderecos){
                
            ps = conn.prepareStatement(sql);
            ps.setString(1, end.getLogradouro());
            ps.setString(2, String.valueOf(end.getCep()));
            ps.setInt(3, end.getNumero());
            ps.setString(4, end.getComplemento());
            ps.setString(5, end.getBairro());
            ps.setString(6, end.getMunicipio());
            ps.setString(7, end.getEstado());
            ps.setInt(8, end.getTipoEndereco());
            ps.setBoolean(9, false);
            ps.setInt(10, chave);
            ps.execute();     
            } 
            ps.close(); 
           return true;
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } 
        return false;
    }
       public boolean inserirPessoaJuridica(PessoaJuridica cliente) {
        String sql;
        PreparedStatement ps;
        
        
        sql = "INSERT INTO cliente(nome,nomefantasia,limite_de_credito,cnpj,excluido) VALUES (?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getNomeFantasia());
            ps.setDouble(3, cliente.getLimiteCredito());
            ps.setString(4, cliente.getCnpj());
            ps.setBoolean(5, false);
            ps.execute();
            ps.close();
            
           return inserirEndereco(cliente.getEnderecos(), chave());
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } 
        return false;
    }
}
