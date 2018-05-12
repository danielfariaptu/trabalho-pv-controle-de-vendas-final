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

    public ContaDAO() {
        conn = Conexao.getConexao();

    }

    public Conta buscarConta(int id) {
        Conta conta = new Conta();

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
        conta.setCompras(compraDAO.buscarCompras(conta.getId()));  
        Iterator i = conta.getCompras().iterator();
        double total = 0;
        while(i.hasNext()){
            Compra compra = (Compra) i.next();
            total += compra.getTotal();
        }
        conta.setTotal(total);
        return conta;
    }

}
