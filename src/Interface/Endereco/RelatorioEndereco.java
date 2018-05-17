package Interface.Endereco;

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

public class RelatorioEndereco extends javax.swing.JDialog {

    private int fk_cliente;
    private String[] colunas = {"Codigo", "Logradouro", "Número", "Bairro", "CEP"};

    private EnderecoDAO endDAO;
    private int tipo;
    private Cliente cliente;
    private Endereco end;
    private int codCli;
    

    GerenciaEndereco ge;

    public RelatorioEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
 
    }

    public RelatorioEndereco(javax.swing.JDialog parent, boolean modal, Cliente cliente, int tipo, int codCli) {
        super(parent, modal);
        initComponents();
        this.cliente = cliente;
        this.tipo = tipo;
        this.codCli = codCli;
        setLocationRelativeTo(null);
        tbShowDados();
     
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmEnderecos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        field_codEndereco = new javax.swing.JTextField();
        labelEnd = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        MostrarCodCliente = new javax.swing.JButton();
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

        tmEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Logradouro", "Número", "Bairro", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tmEnderecos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmEnderecosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmEnderecos);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCA DE ENDEREÇOS");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));
        CadastroProduto.add(field_codEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, 29));

        labelEnd.setDisplayedMnemonic('n');
        labelEnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(255, 255, 255));
        labelEnd.setLabelFor(labelEnd);
        labelEnd.setText("DIGITE O CÓDIGO DO ENDEREÇO");
        CadastroProduto.add(labelEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        MostrarCodCliente.setBackground(new java.awt.Color(255, 255, 255));
        MostrarCodCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        MostrarCodCliente.setText("MOSTRAR");
        MostrarCodCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarCodCliente.setFocusPainted(false);
        MostrarCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCodClienteActionPerformed(evt);
            }
        });
        CadastroProduto.add(MostrarCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Endereços:");
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

    private void MostrarCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCodClienteActionPerformed
        if ((field_codEndereco.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do endereço!");
            field_codEndereco.requestFocus();
        } else {
            Iterator i = cliente.getEnderecos().iterator();
            int cont = 0;
            while (i.hasNext()) {
                Endereco endereco = (Endereco) i.next();
                if (Integer.parseInt(field_codEndereco.getText()) == endereco.getCodigo()) {
                    if (tipo == 2) {
                        AlterarEndereco alterar = new AlterarEndereco(this, true, endereco);
                        alterar.setVisible(true);
                        dispose();
                        
                        
                    } else if (tipo == 3) {
                           ConsultarEndereco consultar = new  ConsultarEndereco(this, true, endereco,codCli);
                           consultar.setVisible(true);
                           dispose();
                           
                           
                    } else {
                        ExcluirEndereco excluir = new ExcluirEndereco(this, true, Integer.parseInt(field_codEndereco.getText()),endereco,codCli);
                        excluir.setVisible(true);
                        dispose();
                    }
                }else{
                    cont++;
                }
                if(cont == cliente.getEnderecos().size()){
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                }

            }

        }


    }//GEN-LAST:event_MostrarCodClienteActionPerformed

    private void tmEnderecosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmEnderecosMouseClicked
          NewTableModel model = (NewTableModel)tmEnderecos.getModel();
        int selectedRowIndex = tmEnderecos.getSelectedRow();
        field_codEndereco.setText(model.getValueAt(selectedRowIndex, 0).toString());
        
    }//GEN-LAST:event_tmEnderecosMouseClicked

    public void tbShowDados() {
        ArrayList<Object> dados = new ArrayList<>();
        dados.clear();
        ArrayList<Endereco> end = cliente.getEnderecos();
       
        for (Endereco e : end) {
            dados.add(new Object[]{
                e.getCodigo(),
                e.getLogradouro(),
                e.getNumero(),
                e.getBairro(),
                e.getCep(),});
            NewTableModel dadosEndereco = new NewTableModel(dados, colunas);
            tmEnderecos.setModel(dadosEndereco);
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
                RelatorioEndereco dialog = new RelatorioEndereco(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton MostrarCodCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_codEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JTable tmEnderecos;
    // End of variables declaration//GEN-END:variables
}
