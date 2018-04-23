/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Cliente;

import Banco.PessoaDAO;
import Interface.Endereco.AdicionarEndereco;
import Model.Cliente;
import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class AlterarCliente extends javax.swing.JDialog {

    private PessoaDAO pDAO = new PessoaDAO();
    private Cliente cliente;
    int tipoPessoa;

    /**
     * Creates new form NewJDialog
     */

    public AlterarCliente(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);

        initComponents();

    }

    public AlterarCliente(javax.swing.JDialog parent, boolean modal, int tipoPessoa, Cliente cliente) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        this.cliente = cliente;
        this.tipoPessoa = tipoPessoa;
        jTF_cpf.setVisible(false);
        labelCPF.setVisible(false);

        jTF_NomeFantasia.setVisible(false);
        LabelnomeFantasia.setVisible(false);

        jTF_cnpj.setVisible(false);
        LabelCNPJ.setVisible(false);

        if (tipoPessoa == 2) {
            desbloqueiaCampoFisica();
        } else if (tipoPessoa == 1) {
            desbloqueiaCampoJuridica();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        closeIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTf_Nome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        jTF_cpf = new javax.swing.JTextField();
        LabelnomeFantasia = new javax.swing.JLabel();
        jTF_NomeFantasia = new javax.swing.JTextField();
        LabelCNPJ = new javax.swing.JLabel();
        jTF_cnpj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_LimiteCredito = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jBtn_Salvar = new javax.swing.JButton();
        jBtn_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALTERAÇÃO DE CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 290, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome*:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 17));
        jPanel1.add(jTf_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        labelCPF.setForeground(new java.awt.Color(255, 255, 255));
        labelCPF.setText("CPF*:");
        jPanel1.add(labelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTF_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_cpfActionPerformed(evt);
            }
        });
        jPanel1.add(jTF_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        LabelnomeFantasia.setForeground(new java.awt.Color(255, 255, 255));
        LabelnomeFantasia.setText("Nome Fantasia*:");
        jPanel1.add(LabelnomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));
        jPanel1.add(jTF_NomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 300, 30));

        LabelCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        LabelCNPJ.setText("CNPJ*:");
        jPanel1.add(LabelCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jPanel1.add(jTF_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Limite de Credito*:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, -1));
        jPanel1.add(jTF_LimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Campos marcados com \"*\" são obrigatórios");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 230, 40));

        jBtn_Salvar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        jBtn_Salvar.setMnemonic('S');
        jBtn_Salvar.setText("Salvar");
        jBtn_Salvar.setToolTipText("Salva os registros");
        jBtn_Salvar.setFocusPainted(false);
        jBtn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 120, 40));

        jBtn_Limpar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-apagar-32.png"))); // NOI18N
        jBtn_Limpar.setMnemonic('L');
        jBtn_Limpar.setText("Limpar");
        jBtn_Limpar.setToolTipText("Salva os registros");
        jBtn_Limpar.setFocusPainted(false);
        jBtn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LimparActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBtn_LimparActionPerformed

    private void jBtn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalvarActionPerformed
        if (tipoPessoa == 2) {
            AlterarPessoaFisica();
        } else if (tipoPessoa == 1) {
            AlterarPessoaJuridica();
        }
        
    }//GEN-LAST:event_jBtn_SalvarActionPerformed

    private void jTF_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_cpfActionPerformed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlterarCliente dialog = new AlterarCliente(new javax.swing.JDialog(), true);
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

    //jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex())
    private void AlterarPessoaFisica() {        
        PessoaFisica pf = (PessoaFisica) cliente;
         
        if (!jTf_Nome.getText().isEmpty()) {
            if (!jTF_cpf.getText().isEmpty()) {
                if (!jTF_LimiteCredito.getText().isEmpty()) {
                     pf.setNome(jTf_Nome.getText());
                     pf.setCpf(jTF_cpf.getText());
                     pf.setLimiteCredito(Double.parseDouble(jTF_LimiteCredito.getText()));
                     
                     pDAO.alterarPessoa(pf);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Limite de credito é obrigatório!");
                    jTF_LimiteCredito.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo CPF é obrigatório!");
                jTF_cpf.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Nome é obrigatório!");
            jTf_Nome.requestFocus();
        }
    }

    private void AlterarPessoaJuridica() {
        
        PessoaJuridica pj = (PessoaJuridica) cliente;

        if (!jTF_cnpj.getText().isEmpty()) {
            if (!jTf_Nome.getText().isEmpty()) {
                if (!jTF_NomeFantasia.getText().isEmpty()) {
                    if (!jTF_LimiteCredito.getText().isEmpty()) {
                       pj.setNome(jTf_Nome.getText());
                       pj.setCnpj(jTF_cnpj.getText());
                       pj.setLimiteCredito(Double.parseDouble(jTF_LimiteCredito.getText()));
                       pj.setNomeFantasia(jTF_NomeFantasia.getText());
                       
                       pDAO.alterarPessoa(pj);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Limite de credito é obrigatório!");
                        jTF_LimiteCredito.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Nome fantasia é obrigatório!");
                    jTF_NomeFantasia.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Nome é obrigatório!");
                jTf_Nome.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo CNPJ é obrigatório!");
            jTF_cnpj.requestFocus();
        }

    }

    private void desbloqueiaCampoFisica() {
        PessoaFisica pf = (PessoaFisica) cliente;
         
        jTf_Nome.setText(pf.getNome());
        jTF_cpf.setText(pf.getCpf());
        jTF_LimiteCredito.setText(String.valueOf(pf.getLimiteCredito()));
        
        jTF_cpf.setVisible(true);
        labelCPF.setVisible(true);

        jTF_cnpj.setVisible(false);
        LabelCNPJ.setVisible(false);
        jTF_NomeFantasia.setVisible(false);
        LabelnomeFantasia.setVisible(false);

    }

    private void desbloqueiaCampoJuridica() {
        PessoaJuridica pj = (PessoaJuridica) cliente;

        jTf_Nome.setText(pj.getNome());
        jTF_NomeFantasia.setText(pj.getNomeFantasia());
        jTF_cnpj.setText(pj.getCnpj());
        jTF_LimiteCredito.setText(String.valueOf(pj.getLimiteCredito()));

        jTF_cnpj.setVisible(true);
        LabelCNPJ.setVisible(true);
        jTF_NomeFantasia.setVisible(true);
        LabelnomeFantasia.setVisible(true);

        jTF_cpf.setVisible(false);
        labelCPF.setVisible(false);
    }

    private void limparCampos() {

        jTF_LimiteCredito.setText("");
        jTF_NomeFantasia.setText("");
        jTF_cnpj.setText("");
        jTF_cpf.setText("");
        jTf_Nome.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCNPJ;
    private javax.swing.JLabel LabelnomeFantasia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JButton jBtn_Limpar;
    private javax.swing.JButton jBtn_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_LimiteCredito;
    private javax.swing.JTextField jTF_NomeFantasia;
    private javax.swing.JTextField jTF_cnpj;
    private javax.swing.JTextField jTF_cpf;
    private javax.swing.JTextField jTf_Nome;
    private javax.swing.JLabel labelCPF;
    // End of variables declaration//GEN-END:variables
}
