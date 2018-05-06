package Interface.Compra;

import Interface.Produto.*;
import Interface.Endereco.*;
import Model.NewTableModel;
import Interface.*;
import Model.*;
import Banco.*;
import Controle.*;
import Interface.Endereco.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class VincularCliente extends javax.swing.JDialog {

    private String[] colunasFisica = {"Código ", "Nome", "Limite de crédito", "CPF", "País de Origem"};
    private String[] colunasJuridica = {"Código ", "Nome", "Limite de crédito", "Nome Fantasia", "CNPJ", "País de Origem"};

    private ArrayList<Compra> compra = new ArrayList<>();
    private PessoaFisica pF;
    private PessoaJuridica pJ;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Object> dados = new ArrayList<>();

    private int tipo;

    public VincularCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        label.setVisible(false);
        field_idCliente.setVisible(false);

    }

    public VincularCliente(javax.swing.JFrame parent, boolean modal, ArrayList<Cliente> clientes) {
        super(parent, modal);
        initComponents();
        this.clientes = clientes;

        setLocationRelativeTo(null);
        tbShowDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        field_idCliente = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        Vincular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jScrollPane1.setViewportView(tmCliente);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VINCULAR COMPRA AO CLIENTE");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 420, 43));
        CadastroProduto.add(field_idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, 29));

        label.setDisplayedMnemonic('n');
        label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setLabelFor(label);
        label.setText("DIGITE O CÓDIGO DO CLIENTE");
        CadastroProduto.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        Vincular.setBackground(new java.awt.Color(255, 255, 255));
        Vincular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-32.png"))); // NOI18N
        Vincular.setText("Vincular");
        Vincular.setFocusPainted(false);
        Vincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VincularActionPerformed(evt);
            }
        });
        CadastroProduto.add(Vincular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Clientes:");
        CadastroProduto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown

    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void VincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VincularActionPerformed
        if ((field_idCliente.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do Cliente!");
            field_idCliente.requestFocus();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Cliente vinculado a compra com sucesso!");

        }


    }//GEN-LAST:event_VincularActionPerformed

    public void tbShowDados() {

       /*tratar listar no table model.
        ArrayList<Cliente> cli = clientes;
        Iterator i = clientes.iterator();

        while (i.hasNext()) {
            Cliente cliente = (Cliente) i.next();
            if (cliente instanceof PessoaFisica) {

                dados.clear();
                for (Cliente c : cli) {
                    dados.add(new Object[]{
                        c.getCodigo(),
                        pF.getNome(),
                        pF.getCpf(),
                        pF.getLimiteCredito(),});

                    NewTableModel dadosPessoa = new NewTableModel(dados, colunasFisica);
                    tmCliente.setModel(dadosPessoa);
                    repaint();
                    validate();
                }

            } else {

                dados.clear();
                for (Cliente c : cli) {
                    dados.add(new Object[]{
                        c.getCodigo(),
                        pJ.getCnpj(),
                        pJ.getNome(),
                        pJ.getNomeFantasia(),
                        pJ.getLimiteCredito()});

                    NewTableModel dadosPessoa = new NewTableModel(dados, colunasJuridica);
                    tmCliente.setModel(dadosPessoa);
                    repaint();
                    validate();

                }

            }
        
        }
        */
    }

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
                VincularCliente dialog = new VincularCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Vincular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tmCliente;
    // End of variables declaration//GEN-END:variables
}
