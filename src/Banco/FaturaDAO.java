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
import Model.Fatura;
import Model.Pagamento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import tavv.controle.de.vendas.MenuPrincipal;

public class FaturaDAO {

    private PreparedStatement ps,ps2;
    private ResultSet rs;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Connection con;
    private CompraDAO compraDAO = new CompraDAO();

    public FaturaDAO() {
        con = Conexao.getConexao();

    }

    public void criarFatura(Fatura fatura, int idConta) {

        String sql = "INSERT INTO public.fatura(fatura_id, quantidade_parcelas, juros, conta_id) VALUES (?, ?, ?, ?)";
        int idFatura = chave();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFatura);
            ps.setInt(2, fatura.getQuantParcelas());
            ps.setDouble(3, fatura.getJuros());
            ps.setInt(4, idConta);      
            ps.execute();
            ps.close();

            criarParcelas(fatura.getParcelas(), idFatura); 
            atualizarStatusCompras(idConta);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro criarFatura: " + e.getMessage());
        }
    }

    public void criarParcelas(ArrayList<Pagamento> parcelas, int idFatura) {
        String sql = "INSERT INTO pagamento(pagamento_id, valor, juros, fk_fatura_id) VALUES (?, ?, ?, ?)";

        int idPagamento = chavePagamento();
        JOptionPane.showMessageDialog(null, "Size: "+parcelas.size());
        Iterator i = parcelas.iterator();

        try {
            while (i.hasNext()) {
                Pagamento parcela = (Pagamento) i.next();                
                
                ps2 = con.prepareStatement(sql);
                ps2.setInt(1, idPagamento);
                ps2.setDouble(2, parcela.getValor());
                ps2.setDouble(3, parcela.getJuros());
                ps2.setInt(4, idFatura);
                ps2.execute();
                ps2.close();

                idPagamento++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro criarParcelas: " + e.getMessage());
        }

    }
    
    public void atualizarStatusCompras(int idConta){
        String sql = "update compra set status = 1 where fk_conta_id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idConta);            
            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro atualizarStatusCompras: " + e.getMessage());
        }
    }

    public int chave() {
        String sql;

        int proximoCodigo = -1;

        sql = "select max(fatura_id) from fatura";

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

    public int chavePagamento() {
        String sql;

        int proximoCodigo = -1;

        sql = "select max(pagamento_id) from pagamento";

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
