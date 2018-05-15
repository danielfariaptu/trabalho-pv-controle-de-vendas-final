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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import tavv.controle.de.vendas.MenuPrincipal;

public class FaturaDAO {

    private PreparedStatement ps, ps2,ps3;
    private ResultSet rs, rs2;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Connection con;
    private CompraDAO compraDAO = new CompraDAO();
    
    LocalDateTime agora = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String data = agora.format(formatter);

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
        String sql = "INSERT INTO pagamento(pagamento_id, valor, juros, fk_fatura_id, status) VALUES (?, ?, ?, ?, ?)";

        int idPagamento = chavePagamento();
        Iterator i = parcelas.iterator();

        try {
            while (i.hasNext()) {
                Pagamento parcela = (Pagamento) i.next();

                ps2 = con.prepareStatement(sql);
                ps2.setInt(1, idPagamento);
                ps2.setDouble(2, parcela.getValor());
                ps2.setDouble(3, parcela.getJuros());
                ps2.setInt(4, idFatura);
                ps2.setInt(5, 0);
                ps2.execute();
                ps2.close();

                idPagamento++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro criarParcelas: " + e.getMessage());
        }

    }

    public void atualizarStatusCompras(int idConta) {
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

    public ArrayList<Fatura> buscarFaturas(Conta conta) {
        String sql;
        ArrayList<Fatura> faturas = new ArrayList<Fatura>();

        sql = "select * from fatura where conta_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, conta.getId());
            rs = ps.executeQuery();

            while (rs.next()) {
                Fatura fatura = new Fatura();
                
                if(rs.getString("data_quitacao") != null){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(rs.getString("data_quitacao"), formatter);
                    fatura.setDataQuitacao(date);
                }                
                
                fatura.setConta(conta);                
                fatura.setJuros(rs.getDouble("juros"));
                fatura.setQuantParcelas(rs.getInt("quantidade_parcelas"));
                fatura.setParcelas(buscarParcelas(rs.getInt("fatura_id")));
                fatura.setId(rs.getInt("fatura_id"));
                
                faturas.add(fatura);
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro buscarFaturas", JOptionPane.ERROR_MESSAGE);
        }
        return faturas;
    }

    public ArrayList<Pagamento> buscarParcelas(int idFatura) {
        ArrayList<Pagamento> parcelas = new ArrayList<Pagamento>();

        String sql = "select * from pagamento where fk_fatura_id = ?";

        try {
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, idFatura);
            rs2 = ps2.executeQuery();
            
            while (rs2.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setValor(rs2.getDouble("valor"));
                pagamento.setJuros(rs2.getDouble("juros"));
                pagamento.setStatus(rs2.getInt("status"));
                pagamento.setId(rs2.getInt("pagamento_id"));
                
                parcelas.add(pagamento);
            }
            ps2.close();
            rs2.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro buscarFaturas", JOptionPane.ERROR_MESSAGE);
        }
        return parcelas;
    }
    public void pagarParcela(int idParcela, Fatura fatura){
        String sql = "update pagamento set status = 1 where pagamento_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idParcela);
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro atualizarStatusCompras: " + e.getMessage());
        }
        
        try {
            sql = "select count(status) from pagamento where status != 0 and fk_fatura_id = ?";
            
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, fatura.getId());
            rs2 = ps2.executeQuery();
            if(rs2.next()){
                    if(rs2.getInt(1) == fatura.getQuantParcelas()){
                    String sql2 = "update fatura set data_quitacao = ? where fatura_id = ?";
                    ps3= con.prepareStatement(sql2);
                    ps3.setString(1, data);
                    ps3.setInt(2, fatura.getId());
                    ps3.execute();
                    ps3.close();
                }
            }            
            ps2.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro atualizarStatusCompras: " + e.getMessage());
        }
    }

}
