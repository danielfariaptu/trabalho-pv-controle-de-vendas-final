package Interface.Conta;

import Interface.Compra.*;
import Interface.Endereco.*;
import Model.NewTableModel;
import Interface.*;
import Model.*;
import Banco.*;
import Controle.*;
import Interface.Endereco.*;

import java.util.ArrayList;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class RelatorioFaturas extends javax.swing.JDialog {

    private String[] colunas = {"Código da Fatura", "Data de Quitação", "Juros", "Quantidade de Parcelas"};

    private ArrayList<Fatura> faturas;
    private ArrayList<Cliente> clientes;
    private int id = -1;

    public RelatorioFaturas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public RelatorioFaturas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        tbShowDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        RelatFatura = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmFatura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        field_codFatura = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RelatFatura.setBackground(new java.awt.Color(0, 0, 51));
        RelatFatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RelatFatura.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                RelatFaturaComponentShown(evt);
            }
        });
        RelatFatura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmFatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Da Fatura", "Data de Quitação", "Juros", "Quantidade de Parcelas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tmFatura);

        RelatFatura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Relatório de Faturas");
        RelatFatura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));
        RelatFatura.add(field_codFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 29));

        label1.setDisplayedMnemonic('n');
        label1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setLabelFor(label1);
        label1.setText("DIGITE O CÓDIGO DA FATURA");
        RelatFatura.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        RelatFatura.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        Mostrar.setText("Mostrar ");
        Mostrar.setFocusPainted(false);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        RelatFatura.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 120, 30));

        getContentPane().add(RelatFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RelatFaturaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_RelatFaturaComponentShown

    }//GEN-LAST:event_RelatFaturaComponentShown

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        if ((field_codFatura.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código da compra!");
            field_codFatura.requestFocus();
        } else {
            Iterator i = faturas.iterator();
            int cont = 0;
            while (i.hasNext()) {
                Fatura fatura = (Fatura) i.next();
                if (Integer.parseInt(field_codFatura.getText()) == 0 /*compra.getCodigo()*/) {
                    /*this.id =  compra.getCodigo();*/
                 // ConsultarCompra consultar = new ConsultarCompra(this, true, compra, cliente);
                  //  consultar.setVisible(true);
                } else {
                    cont++;
                }
                if (cont == clientes.size()) {
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                }
            }

        }
    }//GEN-LAST:event_MostrarActionPerformed

    public int getId() {
        return this.id;
    }

    public void tbShowDados() {
        ArrayList<Object> dados = new ArrayList<>();
        dados.clear();

        for (Fatura fatura : faturas) {
            dados.add(new Object[]{
                              
               // fatura.getCodigo(),
                fatura.getDataQuitacao(),
                fatura.getJuros(),
                fatura.getQuantParcelas()
            });
            NewTableModel dadosFatura = new NewTableModel(dados, colunas);
            tmFatura.setModel(dadosFatura);
            repaint();
            validate();
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
                RelatorioFaturas dialog = new RelatorioFaturas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Mostrar;
    private javax.swing.JPanel RelatFatura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_codFatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JTable tmFatura;
    // End of variables declaration//GEN-END:variables
}
