package Banco;

import Model.Compra;
import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class CompraDAO {

    private PreparedStatement ps;
    String sql;
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    LocalDateTime agora = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-y");
    String data = agora.format(formatter);

    public CompraDAO() {
        this.con = Conexao.getConexao(); 
    }
    
    public void realizarCompra(Compra compra, int id_cliente){
        sql = "insert into compra(compra_id, data, fk_conta_id) values(?, ?, ?)";
        Iterator i = compra.getProdutos().iterator();
        int id_compra = chave();
        int id_conta = verificarConta(id_cliente);
        
        if(id_conta <= -1){
            criarConta(compra.getTotal(), id_cliente);
        }
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_compra);
            ps.setString(2, data);    
            ps.setInt(3, id_conta);
            ps.execute();
            ps.close();
            
            sql = "insert into produto_compra(compra_id, codigo_de_barras)";
            
            while(i.hasNext()){
                Produto produto = (Produto) i.next();               
                
                ps = con.prepareStatement(sql);
                ps.setInt(1, id_compra);
                ps.setString(2, produto.getCodigoBarras());
                ps.execute();
                ps.close();
            }

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar compra");
        }
    }
    public int verificarConta(int id){
        sql = "SELECT * FROM conta where fk_cliente_id = ?";
        int cont = -1;
        try {           
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cont = rs.getInt("conta_id");
            }
            ps.close();
            rs.close();
            return cont;
        } catch (SQLException ex) {
            return cont;
        }
    }
    
    public int criarConta(double total, int id_cliente){
        int id_conta = chaveConta();
        
        String data = agora.plusMonths(1).format(formatter);
        sql = "insert into conta (id_conta, total, data_vencimento, fk_cliente_id) values(?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_conta);
            ps.setDouble(2, total);  
            ps.setString(3, data);
            ps.setInt(4, id_cliente);
            ps.execute();
            ps.close();           

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta");
        }
        
        return id_conta;
    }
    
    private int chave() {
        String sql;
        
        int proximoCodigo = -1;

        sql = "select max(compra_id) from compra";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                proximoCodigo = rs.getInt(1);
            }
            ps.close();
            return proximoCodigo + 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Referencia", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
        private int chaveConta() {
        String sql;
        
        int proximoCodigo = -1;

        sql = "select max(conta_id) from ccnta";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                proximoCodigo = rs.getInt(1);
            }
            ps.close();
            return proximoCodigo + 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Referencia", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
}
