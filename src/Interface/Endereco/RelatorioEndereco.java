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
    private int x;
    private String[] colunas = {"Logradouro", "Complemento", "Número", "Bairro", "CEP", "Município", "Estado", "Tipo de Endereço"};

    private EnderecoDAO endDAO;
    private ArrayList<Cliente> clientes;
    private Endereco end;
    ArrayList<Object> dados = new ArrayList<>();

    GerenciaEndereco ge;

    public RelatorioEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        labelEnd.setVisible(false);
        field_codEndereco.setVisible(false);
        MostrarCodEnd.setVisible(false);

        labelClienteCod.setVisible(false);
        field_codCliente.setVisible(false);
        MostrarCodCli.setVisible(false);

        RadioCliCod.setSelected(true);
        desbloqueiaCliCod();
    }

    public RelatorioEndereco(java.awt.Frame parent, boolean modal, int x, Cliente cli, Endereco end) {
        super(parent, modal);
        initComponents();
        this.x = x;
        this.clientes = clientes;
        this.fk_cliente = fk_cliente;
        labelEnd.setVisible(false);
        field_codEndereco.setVisible(false);
        MostrarCodEnd.setVisible(false);

        labelClienteCod.setVisible(false);
        field_codCliente.setVisible(false);
        MostrarCodCli.setVisible(false);

        setLocationRelativeTo(null);

        RadioCliCod.setSelected(true);
        desbloqueiaCliCod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroProduto = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RadioEndCod = new javax.swing.JRadioButton();
        RadioCliCod = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmEnderecos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        field_codEndereco = new javax.swing.JTextField();
        labelEnd = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        MostrarCodEnd = new javax.swing.JButton();
        field_codCliente = new javax.swing.JTextField();
        MostrarCodCli = new javax.swing.JButton();
        labelClienteCod = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione tipo de busca: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        RadioEndCod.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(RadioEndCod);
        RadioEndCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioEndCod.setForeground(new java.awt.Color(255, 255, 255));
        RadioEndCod.setText("Por Código de Endereço");
        RadioEndCod.setFocusPainted(false);
        RadioEndCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioEndCodActionPerformed(evt);
            }
        });
        jPanel1.add(RadioEndCod);

        RadioCliCod.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(RadioCliCod);
        RadioCliCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadioCliCod.setForeground(new java.awt.Color(255, 255, 255));
        RadioCliCod.setText("Por Código de Cliente");
        RadioCliCod.setFocusPainted(false);
        RadioCliCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCliCodActionPerformed(evt);
            }
        });
        jPanel1.add(RadioCliCod);

        CadastroProduto.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 440, 70));

        jScrollPane1.setViewportView(tmEnderecos);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCA DE ENDEREÇOS");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));
        CadastroProduto.add(field_codEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 29));

        labelEnd.setDisplayedMnemonic('n');
        labelEnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(255, 255, 255));
        labelEnd.setLabelFor(labelEnd);
        labelEnd.setText("DIGITE O CÓDIGO DO ENDEREÇO");
        CadastroProduto.add(labelEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        MostrarCodEnd.setBackground(new java.awt.Color(255, 255, 255));
        MostrarCodEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        MostrarCodEnd.setText("MOSTRAR");
        MostrarCodEnd.setFocusPainted(false);
        MostrarCodEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCodEndActionPerformed(evt);
            }
        });
        CadastroProduto.add(MostrarCodEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 30));
        CadastroProduto.add(field_codCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 29));

        MostrarCodCli.setBackground(new java.awt.Color(255, 255, 255));
        MostrarCodCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        MostrarCodCli.setText("MOSTRAR");
        MostrarCodCli.setFocusPainted(false);
        MostrarCodCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCodCliActionPerformed(evt);
            }
        });
        CadastroProduto.add(MostrarCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 30));

        labelClienteCod.setDisplayedMnemonic('n');
        labelClienteCod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelClienteCod.setForeground(new java.awt.Color(255, 255, 255));
        labelClienteCod.setLabelFor(labelEnd);
        labelClienteCod.setText("DIGITE O CÓDIGO DO CLIENTE");
        CadastroProduto.add(labelClienteCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

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

    private void MostrarCodEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCodEndActionPerformed
        if ((field_codEndereco.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do endereço!");
            field_codEndereco.requestFocus();
        }

        /*int linhaSelecionada = table.getSelectedRow();
            if (linhaSelecionada == -1) {
                return; //Nada selecionado
            }
            TesteTableModel model = (TesteTableModel)table.getModel();
            Contato selecionado = model.getContato(linhaSelecionada);
            ContatosDialog cf = new ContatosDialog(selecionado);
            cf.setVisible(true); */
        
        
        if (tmEnderecos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Por favor selecione uma linha!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            TableModel tm = tmEnderecos.getModel();
            //Implementar backend// Endereco endereco = ge.retornaEndereco((tm.getValueAt(tmEnderecos.getSelectedRow(), 0).toString()));

            end = ge.retornaEndereco((tm.getValueAt(tmEnderecos.getSelectedRow(), 0).toString()));

            ConsultarEndereco pesquisar = new ConsultarEndereco(this, true, end);
            pesquisar.setVisible(true);

        }

    }//GEN-LAST:event_MostrarCodEndActionPerformed


    private void MostrarCodCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCodCliActionPerformed
        if ((field_codCliente.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do endereço!");
            field_codCliente.requestFocus();
        } else {
            int codigo =  Integer.valueOf(field_codCliente.getText());
            ArrayList<Endereco> end = endDAO.buscarEnderecos(codigo);
            if (end.isEmpty()) {
                dados.clear();
                NewTableModel dadosProduto = new NewTableModel(dados, colunas);
                tmEnderecos.setModel(dadosProduto);
                repaint();
                validate();
            } else {
                dados.clear();
                for (Endereco e : end) {
                    dados.add(new Object[]{
                        e.getLogradouro(),
                        e.getComplemento(),
                        e.getNumero(),
                        e.getBairro(),
                        e.getCep(),
                        e.getMunicipio(),
                        e.getEstado(),
                        e.getTipoEndereco()});
                    NewTableModel dadosEndereco = new NewTableModel(dados, colunas);
                    tmEnderecos.setModel(dadosEndereco);
                    repaint();
                    validate();
                }
            }
        }
        
    }//GEN-LAST:event_MostrarCodCliActionPerformed

    private void RadioCliCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCliCodActionPerformed
        resetaCampos();
        labelClienteCod.setVisible(true);
        field_codCliente.setVisible(true);
        MostrarCodCli.setVisible(true);
    }//GEN-LAST:event_RadioCliCodActionPerformed

    private void RadioEndCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEndCodActionPerformed
        resetaCampos();
        labelEnd.setVisible(true);
        field_codEndereco.setVisible(true);
        MostrarCodEnd.setVisible(true);

    }//GEN-LAST:event_RadioEndCodActionPerformed

    public void tbShowDados() {
        ArrayList<Endereco> end = ge.relatorioEnderecos();
        dados.clear();
        for (Endereco e : end) {
            dados.add(new Object[]{
                e.getLogradouro(),
                e.getComplemento(),
                e.getNumero(),
                e.getBairro(),
                e.getCep(),
                e.getMunicipio(),
                e.getEstado(),
                e.getTipoEndereco()});
            NewTableModel dadosEndereco = new NewTableModel(dados, colunas);
            tmEnderecos.setModel(dadosEndereco);
            repaint();
            validate();
        }
        //tmEnderecos.isCellEditable(tmEnderecos.getSelectedRow(), tmEnderecos.getSelectedColumn());
    }

    private void resetaCampos() {
        labelClienteCod.setVisible(false);
        field_codCliente.setVisible(false);
        MostrarCodCli.setVisible(false);

        labelEnd.setVisible(false);
        field_codEndereco.setVisible(false);
        MostrarCodEnd.setVisible(false);
    }

    private void desbloqueiaCliCod() {
        labelClienteCod.setVisible(true);
        field_codCliente.setVisible(true);
        MostrarCodCli.setVisible(true);
    }

    private void desbloqueiaEndCod() {
        labelEnd.setVisible(true);
        field_codEndereco.setVisible(true);
        MostrarCodEnd.setVisible(true);
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
    private javax.swing.JButton MostrarCodCli;
    private javax.swing.JButton MostrarCodEnd;
    private javax.swing.JRadioButton RadioCliCod;
    private javax.swing.JRadioButton RadioEndCod;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_codCliente;
    private javax.swing.JTextField field_codEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClienteCod;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JTable tmEnderecos;
    // End of variables declaration//GEN-END:variables
}
