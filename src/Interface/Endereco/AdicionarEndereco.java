package Interface.Endereco;

import Interface.*;
import Model.*;
import Banco.*;
import Controle.*;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AdicionarEndereco extends javax.swing.JDialog {

    private Endereco end;
    private int id;
    private PessoaDAO pDAO = new PessoaDAO();
    private ArrayList<Endereco> enderecos = new ArrayList<>();

    public AdicionarEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AdicionarEndereco(javax.swing.JDialog parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        this.id = id;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbAviso = new javax.swing.JLabel();
        field_Logradouro = new javax.swing.JTextField();
        field_Complemento = new javax.swing.JTextField();
        labelLogradouro = new javax.swing.JLabel();
        lbTipoUva = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbPaisOrigem = new javax.swing.JLabel();
        lbCodigoBarras = new javax.swing.JLabel();
        lbTipoVinho = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        closeIcon = new javax.swing.JLabel();
        field_Numero = new javax.swing.JTextField();
        field_Bairro = new javax.swing.JTextField();
        jCBoxUf = new javax.swing.JComboBox<>();
        lbCodigoBarras1 = new javax.swing.JLabel();
        field_Municipio = new javax.swing.JTextField();
        lbTipoVinho1 = new javax.swing.JLabel();
        jCBoxTipoEndereco = new javax.swing.JComboBox<>();
        field_CEP = new javax.swing.JFormattedTextField();

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
        jLabel1.setText("CADASTRO DE ENDEREÇO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 350, 43));

        lbAviso.setForeground(new java.awt.Color(255, 255, 255));
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroProduto.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        field_Logradouro.setNextFocusableComponent(field_Complemento);
        CadastroProduto.add(field_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 300, 29));

        field_Complemento.setNextFocusableComponent(field_CEP);
        CadastroProduto.add(field_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 29));

        labelLogradouro.setDisplayedMnemonic('n');
        labelLogradouro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        labelLogradouro.setLabelFor(labelLogradouro);
        labelLogradouro.setText("LOGRADOURO*:");
        CadastroProduto.add(labelLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lbTipoUva.setDisplayedMnemonic('t');
        lbTipoUva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoUva.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoUva.setText("NÚMERO*:");
        CadastroProduto.add(lbTipoUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 20));

        lbPreco.setDisplayedMnemonic('p');
        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(255, 255, 255));
        lbPreco.setLabelFor(field_Complemento);
        lbPreco.setText("COMPLEMENTO:");
        CadastroProduto.add(lbPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        lbPaisOrigem.setDisplayedMnemonic('a');
        lbPaisOrigem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPaisOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lbPaisOrigem.setText("BAIRRO*:");
        CadastroProduto.add(lbPaisOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lbCodigoBarras.setDisplayedMnemonic('c');
        lbCodigoBarras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigoBarras.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoBarras.setLabelFor(field_CEP);
        lbCodigoBarras.setText("ESTADO*:");
        CadastroProduto.add(lbCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        lbTipoVinho.setDisplayedMnemonic('I');
        lbTipoVinho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoVinho.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoVinho.setText("TIPO DE ENDEREÇO*:");
        CadastroProduto.add(lbTipoVinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        btnFechar.setBackground(new java.awt.Color(255, 255, 255));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-32.png"))); // NOI18N
        btnFechar.setText("Cancelar");
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 140, 60));

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        btnConfirmar.setText("Cadastrar");
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarKeyPressed(evt);
            }
        });
        CadastroProduto.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 140, 60));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-apagar-32.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setFocusPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        btnLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimparKeyPressed(evt);
            }
        });
        CadastroProduto.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 140, 60));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        field_Numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_NumeroFocusLost(evt);
            }
        });
        field_Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_NumeroActionPerformed(evt);
            }
        });
        field_Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_NumeroKeyTyped(evt);
            }
        });
        CadastroProduto.add(field_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 300, 30));
        CadastroProduto.add(field_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 300, 29));

        jCBoxUf.setMaximumRowCount(4);
        jCBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBoxUf.setToolTipText("");
        CadastroProduto.add(jCBoxUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 300, 30));

        lbCodigoBarras1.setDisplayedMnemonic('c');
        lbCodigoBarras1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigoBarras1.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoBarras1.setLabelFor(field_CEP);
        lbCodigoBarras1.setText("CEP*:");
        CadastroProduto.add(lbCodigoBarras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));
        CadastroProduto.add(field_Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, 29));

        lbTipoVinho1.setDisplayedMnemonic('I');
        lbTipoVinho1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoVinho1.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoVinho1.setText("MUNICÍPIO*:");
        CadastroProduto.add(lbTipoVinho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jCBoxTipoEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Residencial", "Comercial", "Outro" }));
        CadastroProduto.add(jCBoxTipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 300, 30));

        try {
            field_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CadastroProduto.add(field_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 300, 30));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!field_Logradouro.getText().isEmpty()) {
            if (!field_Numero.getText().isEmpty()) {
                if (!field_Bairro.getText().isEmpty()) {
                    if (!field_Municipio.getText().isEmpty()) {
                        if (!field_CEP.getText().isEmpty()) {
                            if (!jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()).equals("- Selecione -")) {
                                if (!jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("- Selecione -")) {
                                    int tipo;
                                    if (jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("Residencial")) {
                                        tipo = 1;
                                    } else if (jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("Comercial")) {
                                        tipo = 2;
                                    } else {
                                        tipo = 3;
                                    }
                                    end = new Endereco(field_Logradouro.getText(), Integer.parseInt(field_Numero.getText()), field_CEP.getText(),field_Complemento.getText(), field_Bairro.getText(), field_Municipio.getText(), jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()), tipo);
                                    pDAO.inserirEndereco(end, id);
                                    if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(rootPane, "Endereço adicionado ao cliente. Deseja adicionar mais algum?")) {
                                        limpaCampos();
                                    } else {
                                        dispose();
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Tipo de endereco é obrigatório!");
                                    jCBoxTipoEndereco.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "UF é obrigatório!");
                                jCBoxUf.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo CEP é obrigatório!");
                            field_CEP.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Municipio é obrigatório!");
                        field_Municipio.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Bairro é obrigatório!");
                    field_Bairro.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Numero é obrigatório!");
                field_Numero.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Logradouro é obrigatório!");
            field_Logradouro.requestFocus();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == 10) {
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown

    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if (evt.getKeyCode() == 10) {
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void field_NumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_NumeroFocusLost
        lbAviso.setVisible(false);
    }//GEN-LAST:event_field_NumeroFocusLost

    private void field_NumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_NumeroKeyTyped

    }//GEN-LAST:event_field_NumeroKeyTyped

    private void field_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_NumeroActionPerformed

    public void limpaCampos() {
        field_Logradouro.setText("");
        field_Numero.setText("");
        field_Complemento.setText("");
        field_Bairro.setText("");
        field_Municipio.setText("");
        field_CEP.setText("");
        jCBoxTipoEndereco.setSelectedIndex(0);
        jCBoxUf.setSelectedIndex(0);
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
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
                AdicionarEndereco dialog = new AdicionarEndereco(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_Bairro;
    private javax.swing.JFormattedTextField field_CEP;
    private javax.swing.JTextField field_Complemento;
    private javax.swing.JTextField field_Logradouro;
    private javax.swing.JTextField field_Municipio;
    private javax.swing.JTextField field_Numero;
    private javax.swing.JComboBox<String> jCBoxTipoEndereco;
    private javax.swing.JComboBox<String> jCBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbCodigoBarras;
    private javax.swing.JLabel lbCodigoBarras1;
    private javax.swing.JLabel lbPaisOrigem;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipoUva;
    private javax.swing.JLabel lbTipoVinho;
    private javax.swing.JLabel lbTipoVinho1;
    // End of variables declaration//GEN-END:variables
}
