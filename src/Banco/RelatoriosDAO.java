package Banco;

import Banco.Conexao;
import java.sql.Connection;

import java.util.HashMap;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatoriosDAO {

    private Integer cont = 1;
    private Connection conn;

    public RelatoriosDAO() {
        conn = Conexao.getConexao();

    }

    public void runReportClienteFisica() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Pessoas Físicas", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportpessoafisica.jasper", param, conn);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }

    public void runReportClienteJuridica() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Pessoas Jurídicas", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportpessoajuridica.jasper", param, conn);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }

    public void runReportConta() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Contas", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportconta.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
        public void runReportEndereco() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Endereços", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportendereco.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
        
         public void runReportFatura() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Faturas", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportfatura.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
      
         
         public void runReportPagamento() {
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Pagamentos", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportpagamento.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }

    public void runReportProduto() {
       try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Produtos", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportproduto.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
    
      public void runReportCompra() {
       try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório de Compras", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);
            HashMap param = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport("src/reportcompra.jasper", param, conn);
            //JasperViewer.viewReport(jasperPrint, false);
            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
        }
    }
         

}
