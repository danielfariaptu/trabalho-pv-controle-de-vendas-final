package Banco;

import Banco.Conexao;
import Criptografia.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interface.Login.Login;
import Model.Compra;
import Model.Conta;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import tavv.controle.de.vendas.MenuPrincipal;

public class ContaDAO {

    private PreparedStatement ps;
    private ResultSet resultSet;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Connection conn;
    private CompraDAO compraDAO = new CompraDAO();
    
    LocalDateTime agora = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    

    public ContaDAO() {
        conn = Conexao.getConexao();

    }

    public Conta buscarConta(int id) {
        Conta conta = new Conta();
        conta.setId(-1);

        ResultSet rs;

        String sql = "SELECT * FROM conta where fk_cliente_id = ?";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(rs.getString("data_vencimento"), formatter);

                conta.setId(rs.getInt("conta_id"));
                conta.setDataVencimento(date);
            }

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage(), "// Erro buscarConta", JOptionPane.ERROR_MESSAGE);
        }
        if(conta.getId() != -1){
            conta.setCompras(compraDAO.buscarCompras(conta.getId()));  
        Iterator i = conta.getCompras().iterator();
        double total = 0;
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            total += compra.getTotal();
        }
        conta.setTotal(total);
        }        
        return conta;
    }
    
    public void dataVencimento(int idConta, LocalDate data){
        
        String dataPlus = data.plusMonths(1).format(formatter);
        
        String sql = "update conta set data_vencimento = ? where conta_id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dataPlus);
            ps.setInt(2, idConta);
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "dataVencimento: " + e.getMessage());
        }
    }

}
