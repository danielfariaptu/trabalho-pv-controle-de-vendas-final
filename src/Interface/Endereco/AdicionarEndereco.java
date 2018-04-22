package Interface.Endereco;

import Interface.Cliente.CadastrarCliente;
import Interface.Validador;
import Model.Endereco;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class AdicionarEndereco extends javax.swing.JDialog {

    private Endereco end;
    private ArrayList<Endereco> enderecos = new ArrayList<>();

    HashSet backup = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
    HashSet teclaEnter = (HashSet) backup.clone();

    public AdicionarEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AdicionarEndereco(java.awt.Frame parent, boolean modal, Endereco end) {
        super(parent, modal);
        initComponents();
        this.end = end;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_Logradouro = new javax.swing.JTextField();
        jTF_Municipio = new javax.swing.JTextField();
        jTF_numero = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        jTF_Bairro = new javax.swing.JTextField();
        lbLogradouro = new javax.swing.JLabel();
        lbMunicipio = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        jbEstado = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jTF_cep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBoxUf = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBoxTipoEndereco = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroCliente.setBackground(new java.awt.Color(41, 30, 35));
        CadastroCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroClienteComponentShown(evt);
            }
        });
        CadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADICIONAR ENDEREÇO");
        CadastroCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 360, 43));

        jTF_Logradouro.setNextFocusableComponent(jTF_numero);
        CadastroCliente.add(jTF_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 300, 29));
        CadastroCliente.add(jTF_Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 300, 29));

        jTF_numero.setNextFocusableComponent(tfComplemento);
        jTF_numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTF_numeroFocusLost(evt);
            }
        });
        jTF_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_numeroKeyTyped(evt);
            }
        });
        CadastroCliente.add(jTF_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 130, 29));

        tfComplemento.setNextFocusableComponent(jTF_Bairro);
        CadastroCliente.add(tfComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 300, 29));

        jTF_Bairro.setNextFocusableComponent(jTF_Municipio);
        CadastroCliente.add(jTF_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 300, 29));

        lbLogradouro.setDisplayedMnemonic('l');
        lbLogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        lbLogradouro.setLabelFor(lbLogradouro);
        lbLogradouro.setText(" Logradouro*");
        CadastroCliente.add(lbLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbMunicipio.setDisplayedMnemonic('m');
        lbMunicipio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lbMunicipio.setLabelFor(jTF_Municipio);
        lbMunicipio.setText(" Municipio*");
        CadastroCliente.add(lbMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, 20));

        lbNumero.setDisplayedMnemonic('n');
        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(255, 255, 255));
        lbNumero.setLabelFor(jTF_numero);
        lbNumero.setText(" Numero*");
        CadastroCliente.add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jbEstado.setDisplayedMnemonic('e');
        jbEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jbEstado.setText(" Estado*");
        CadastroCliente.add(jbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lbComplemento.setDisplayedMnemonic('c');
        lbComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lbComplemento.setLabelFor(tfComplemento);
        lbComplemento.setText("Complemento");
        CadastroCliente.add(lbComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel9.setDisplayedMnemonic('b');
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setLabelFor(jTF_Bairro);
        jLabel9.setText(" Bairro*");
        CadastroCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(102, 102, 102));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/confirmar_1.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 140, 40));

        lbAviso.setForeground(new java.awt.Color(255, 255, 255));
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroCliente.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setText("Limpar");
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
        CadastroCliente.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 140, 40));

        btnNovo.setBackground(new java.awt.Color(102, 102, 102));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnNovoKeyTyped(evt);
            }
        });
        CadastroCliente.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 140, 40));
        CadastroCliente.add(jTF_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 300, -1));

        jLabel2.setDisplayedMnemonic('P');
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEP*");
        CadastroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jCBoxUf.setMaximumRowCount(4);
        jCBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        CadastroCliente.add(jCBoxUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de endereço*:");
        CadastroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jCBoxTipoEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Residencial", "Comercial" }));
        CadastroCliente.add(jCBoxTipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 190, -1));

        getContentPane().add(CadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!jTF_Logradouro.getText().isEmpty()) {
            if (!jTF_numero.getText().isEmpty()) {
                if (!jTF_Bairro.getText().isEmpty()) {
                    if (!jTF_Municipio.getText().isEmpty()) {
                        if (!jTF_cep.getText().isEmpty()) {
                            if (!jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()).equals("- Selecione -")) {
                                if (!jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("- Selecione -")) {
                                    int tipo;
                                    if (jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("Residencial")) {
                                        tipo = 1;
                                    } else {
                                        tipo = 2;
                                    }
                                    end = new Endereco(jTF_Logradouro.getText(), Integer.parseInt(jTF_numero.getText()), tfComplemento.getText(), jTF_Bairro.getText(), jTF_Municipio.getText(), jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()), tipo);
                                    enderecos.add(end);
                                    if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(rootPane, "Endereco adicionado ao cliente. Deseja adicionar mais algum?")) {
                                        limpaCampos();
                                    } else {
                                        this.dispose();
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Tipo de endereco e  obrigatorio!");
                                    jCBoxTipoEndereco.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "UF e  obrigatorio!");
                                jCBoxUf.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo CEP e  obrigatorio!");
                            jTF_cep.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Municipio e  obrigatorio!");
                        jTF_Municipio.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Bairro e  obrigatorio!");
                    jTF_Bairro.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Numero e obrigatorio!");
                jTF_numero.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Logradouro e obrigatorio!");
            jTF_Logradouro.requestFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if (evt.getKeyCode() == 10) {
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void CadastroClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroClienteComponentShown
        lbAviso.setVisible(true);
        lbAviso.setForeground(Color.black);
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        enterToTab();
        limpaCampos();
        abilitaCampos(true);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        jTF_Logradouro.requestFocus();
    }//GEN-LAST:event_CadastroClienteComponentShown

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();
        abilitaCampos(true);
        jTF_Logradouro.requestFocus();
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyTyped
        if (evt.getKeyCode() == 10) {
            btnNovoActionPerformed(null);
        }
    }//GEN-LAST:event_btnNovoKeyTyped

    private void jTF_numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTF_numeroFocusLost
        lbAviso.setVisible(false);
    }//GEN-LAST:event_jTF_numeroFocusLost

    private void jTF_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_numeroKeyTyped
        tratarNumeros(evt);
    }//GEN-LAST:event_jTF_numeroKeyTyped

    public void limpaCampos() {
        jTF_Logradouro.setText(null);
        jTF_numero.setText(null);
        tfComplemento.setText(null);
        jTF_Bairro.setText(null);
        jTF_Municipio.setText(null);
        jCBoxTipoEndereco.setSelectedIndex(0);
        jCBoxUf.setSelectedIndex(0);
    }

    public void abilitaCampos(boolean status) {
        jTF_Logradouro.setEnabled(status);
        jTF_numero.setEnabled(status);
        tfComplemento.setEnabled(status);
        jTF_Bairro.setEnabled(status);
        jTF_Municipio.setEnabled(status);
        jCBoxUf.setEnabled(status);
        jCBoxTipoEndereco.setEnabled(status);
    }

    public void enterToTab() {
        teclaEnter.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, teclaEnter);
        btnLimpar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnSalvar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnNovo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
    }

    public void tratarNumeros(java.awt.event.KeyEvent evt) {
        if (!Validador.isCharNumber(evt.getKeyChar())) {
            evt.consume();
            lbAviso.setText("Aceita Apenas Números!");
            lbAviso.setForeground(Color.red);
            lbAviso.setVisible(true);
        } else {
            lbAviso.setVisible(false);
        }
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JPanel CadastroCliente;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jCBoxTipoEndereco;
    private javax.swing.JComboBox<String> jCBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_Logradouro;
    private javax.swing.JTextField jTF_Municipio;
    private javax.swing.JTextField jTF_cep;
    private javax.swing.JTextField jTF_numero;
    private javax.swing.JLabel jbEstado;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JTextField tfComplemento;
    // End of variables declaration//GEN-END:variables
}
