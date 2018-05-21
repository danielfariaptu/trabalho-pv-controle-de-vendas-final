package Interface.Conta;

import Model.NewTableModel;
import Model.*;
import Banco.*;

import java.util.ArrayList;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class RelatorioClienteConta extends javax.swing.JDialog {

    private String[] colunas = {"Código ", "Nome", "Limite de crédito", "Nome Fantasia", "CNPJ", "CPF"};

    private PessoaFisica pF;
    private PessoaJuridica pJ;
    private ContaDAO contaDAO = new ContaDAO();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Object> dados = new ArrayList<>();

    private int tipo;

    public RelatorioClienteConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        label.setVisible(false);
        field_idCliente.setVisible(false);

    }

    public RelatorioClienteConta(javax.swing.JFrame parent, boolean modal, ArrayList<Cliente> clientes) {
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
        PuxarDados = new javax.swing.JButton();
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

        tmCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmCliente);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR CONTA DO CLIENTE");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 420, 43));
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

        PuxarDados.setBackground(new java.awt.Color(255, 255, 255));
        PuxarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        PuxarDados.setText("Puxar dados");
        PuxarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PuxarDados.setFocusPainted(false);
        PuxarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuxarDadosActionPerformed(evt);
            }
        });
        CadastroProduto.add(PuxarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, 30));

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

    private void PuxarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuxarDadosActionPerformed
        if ((field_idCliente.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do Cliente!");
            field_idCliente.requestFocus();
        } else {

            if (!field_idCliente.getText().isEmpty()) {
                Iterator i = clientes.iterator();
                int tipo;
                int cont = 0;
                while (i.hasNext()) {
                    Cliente cliente = (Cliente) i.next();
                    if (cliente instanceof PessoaFisica) {
                        tipo = 2;
                    } else {
                        tipo = 1;
                        field_idCliente.requestFocus();
                    }

                    if (cliente.getCodigo() == Integer.parseInt(field_idCliente.getText())) {
                        int teste = contaDAO.buscarConta(cliente.getCodigo()).getId();
                        if (teste != -1) {
                            SubMenuConta conta = new SubMenuConta(this, true, tipo, cliente);
                            conta.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esse cliente ainda não possui conta a mesma será criada após a primeira compra!");
                        }
                        this.dispose();

                    } else {
                        cont++;
                    }
                }
                if (cont == clientes.size()) {
                    JOptionPane.showMessageDialog(rootPane, "Código não encontrado!");
                    field_idCliente.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Digite o Código do Cliente!");
                field_idCliente.requestFocus();
            }

        }
    }//GEN-LAST:event_PuxarDadosActionPerformed

    private void tmClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmClienteMouseClicked
        NewTableModel model = (NewTableModel) tmCliente.getModel();
        int selectedRowIndex = tmCliente.getSelectedRow();
        field_idCliente.setText(model.getValueAt(selectedRowIndex, 0).toString());

    }//GEN-LAST:event_tmClienteMouseClicked

    public void tbShowDados() {
        dados.clear();
        Iterator i = clientes.iterator();

        while (i.hasNext()) {
            Cliente cliente = (Cliente) i.next();
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pF = (PessoaFisica) cliente;
                dados.add(new Object[]{
                    pF.getCodigo(),
                    pF.getNome(),
                    pF.getLimiteCredito(),
                    null,
                    null,
                    pF.getCpf()});

                NewTableModel dadosPessoa = new NewTableModel(dados, colunas);
                tmCliente.setModel(dadosPessoa);
                repaint();
                validate();

            } else {
                PessoaJuridica pJ = (PessoaJuridica) cliente;

                dados.add(new Object[]{
                    pJ.getCodigo(),
                    pJ.getNome(),
                    pJ.getLimiteCredito(),
                    pJ.getNomeFantasia(),
                    pJ.getCnpj(),
                    null});

                NewTableModel dadosPessoa = new NewTableModel(dados, colunas);
                tmCliente.setModel(dadosPessoa);
                repaint();
                validate();
            }
        }

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
                RelatorioClienteConta dialog = new RelatorioClienteConta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton PuxarDados;
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
