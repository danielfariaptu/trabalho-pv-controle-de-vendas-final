package Interface.Produto;

import Interface.*;
import Model.*;
import Banco.*;
import Controle.*;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class PesquisarProduto extends javax.swing.JDialog {

    GerenciaProduto gp;
    ProdutoDAO pDAO = new ProdutoDAO();
   
    int x;
    
    public PesquisarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
  
    public PesquisarProduto(java.awt.Frame parent, boolean modal, GerenciaProduto gp, int x) {
        super(parent, modal);
        initComponents();
        this.gp = gp;
        this.x = x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_idProduto = new javax.swing.JTextField();
        lbIDProd = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        closeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroProduto.setBackground(new java.awt.Color(0, 0, 51));
        CadastroProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CadastroProduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroProdutoComponentShown(evt);
            }
        });
        CadastroProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROCURAR PRODUTO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 350, 43));
        CadastroProduto.add(field_idProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 300, 29));

        lbIDProd.setDisplayedMnemonic('n');
        lbIDProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbIDProd.setForeground(new java.awt.Color(255, 255, 255));
        lbIDProd.setLabelFor(lbIDProd);
        lbIDProd.setText("ID DO PRODUTO:");
        CadastroProduto.add(lbIDProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 140, 60));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        if (!field_idProduto.getText().isEmpty()) {      
                Produto produto = gp.acharProduto(field_idProduto.getText());
                if(produto != null){
                    pDAO.excluirDoBanco(produto.getCodigoBarras());
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                    field_idProduto.requestFocus();
                }
         }else {
          JOptionPane.showMessageDialog(rootPane, "Digite o ID do Produto!");
          field_idProduto.requestFocus();
      }          
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown
       
    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

   
       public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
       java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		PesquisarProduto dialog = new PesquisarProduto(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
	}
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbIDProd;
    // End of variables declaration//GEN-END:variables
}