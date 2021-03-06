/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Cliente;

import Banco.PessoaDAO;
import Interface.Endereco.AdicionarEndereco;
import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author danie
 */
public class AdicionarCliente extends javax.swing.JDialog {

    private PessoaJuridica pj;
    private PessoaFisica pf;
    private Endereco end = new Endereco();
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private PessoaDAO pDAO = new PessoaDAO();

    /**
     * Creates new form NewJDialog
     */
    public AdicionarCliente(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);

        initComponents();

        setLocationRelativeTo(null);

        jTF_cpf.setVisible(false);
        labelCPF.setVisible(false);

        jTF_NomeFantasia.setVisible(false);
        LabelnomeFantasia.setVisible(false);

        jTF_cnpj.setVisible(false);
        LabelCNPJ.setVisible(false);

        jRb_Pfisica.setSelected(true);
        desbloqueiaCampoFisica();

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
        jPanel2 = new javax.swing.JPanel();
        jRb_Pfisica = new javax.swing.JRadioButton();
        jRbPessoaJuridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTf_Nome = new javax.swing.JTextField();
        LabelCNPJ = new javax.swing.JLabel();
        jTF_cnpj = new javax.swing.JFormattedTextField();
        jTF_cpf = new javax.swing.JFormattedTextField();
        labelCPF = new javax.swing.JLabel();
        LabelnomeFantasia = new javax.swing.JLabel();
        jTF_NomeFantasia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_LimiteCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF_Logradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Complemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Bairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTF_Municipio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jBtn_Salvar = new javax.swing.JButton();
        jCBoxUf = new javax.swing.JComboBox<>();
        jCBoxTipoEndereco = new javax.swing.JComboBox<>();
        jBtn_Limpar = new javax.swing.JButton();
        field_CEP = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

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
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 230, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jRb_Pfisica.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(jRb_Pfisica);
        jRb_Pfisica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRb_Pfisica.setForeground(new java.awt.Color(255, 255, 255));
        jRb_Pfisica.setMnemonic('F');
        jRb_Pfisica.setText("Pessoa Física");
        jRb_Pfisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRb_PfisicaActionPerformed(evt);
            }
        });
        jPanel2.add(jRb_Pfisica);
        jRb_Pfisica.setBounds(18, 33, 125, 27);

        jRbPessoaJuridica.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(jRbPessoaJuridica);
        jRbPessoaJuridica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRbPessoaJuridica.setForeground(new java.awt.Color(255, 255, 255));
        jRbPessoaJuridica.setMnemonic('J');
        jRbPessoaJuridica.setText("Pessoa Jurídica");
        jRbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbPessoaJuridicaActionPerformed(evt);
            }
        });
        jPanel2.add(jRbPessoaJuridica);
        jRbPessoaJuridica.setBounds(208, 33, 150, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 690, 80));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome*:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 17));
        jPanel1.add(jTf_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        LabelCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        LabelCNPJ.setText("CNPJ*:");
        jPanel1.add(LabelCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        try {
            jTF_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTF_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        try {
            jTF_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTF_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        labelCPF.setForeground(new java.awt.Color(255, 255, 255));
        labelCPF.setText("CPF*:");
        jPanel1.add(labelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        LabelnomeFantasia.setForeground(new java.awt.Color(255, 255, 255));
        LabelnomeFantasia.setText("Nome Fantasia*:");
        jPanel1.add(LabelnomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));
        jPanel1.add(jTF_NomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 300, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Limite de Crédito*:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, -1));
        jPanel1.add(jTF_LimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logradouro*:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));
        jPanel1.add(jTF_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 430, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número*:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 80, 20));
        jPanel1.add(jTF_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 190, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Complemento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));
        jPanel1.add(jTF_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 430, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bairro*:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));
        jPanel1.add(jTF_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 190, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Município*:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, -1));
        jPanel1.add(jTF_Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 330, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEP*:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 57, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UF*:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 50, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de endereço*:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, -1));

        jBtn_Salvar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        jBtn_Salvar.setMnemonic('S');
        jBtn_Salvar.setText("Salvar");
        jBtn_Salvar.setToolTipText("Salva os registros");
        jBtn_Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Salvar.setFocusPainted(false);
        jBtn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 120, 40));

        jCBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBoxUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxUfActionPerformed(evt);
            }
        });
        jPanel1.add(jCBoxUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 130, 30));

        jCBoxTipoEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Residencial", "Comercial", "Outro" }));
        jPanel1.add(jCBoxTipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 190, 30));

        jBtn_Limpar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-apagar-32.png"))); // NOI18N
        jBtn_Limpar.setMnemonic('L');
        jBtn_Limpar.setText("Limpar");
        jBtn_Limpar.setToolTipText("Salva os registros");
        jBtn_Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Limpar.setFocusPainted(false);
        jBtn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LimparActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 120, 40));

        try {
            field_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(field_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Obs: Campos marcados com * são Obrigatórios!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void jBtn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalvarActionPerformed
        // TODO add your handling code here:
        if (jRbPessoaJuridica.isSelected()) {
            CadastrarPessoaJuridica();

        } else if (jRb_Pfisica.isSelected()) {
            CadastrarPessoaFisica();

        }

    }//GEN-LAST:event_jBtn_SalvarActionPerformed

    private void jRb_PfisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRb_PfisicaActionPerformed
        desbloqueiaCampoFisica();
    }//GEN-LAST:event_jRb_PfisicaActionPerformed

    private void jRbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbPessoaJuridicaActionPerformed
        desbloqueiaCampoJuridica();
    }//GEN-LAST:event_jRbPessoaJuridicaActionPerformed

    private void jCBoxUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxUfActionPerformed

    private void jBtn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBtn_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                AdicionarCliente dialog = new AdicionarCliente(new javax.swing.JDialog(), true);
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

    private static String format(String pattern, Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter(pattern);
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private void CadastrarPessoaFisica() {

        if (!jTf_Nome.getText().isEmpty()) {
            if (!jTF_cpf.getText().equals("   .   .   -  ")) {
                if (!jTF_LimiteCredito.getText().isEmpty()) {
                    if (!jTF_Logradouro.getText().isEmpty()) {
                        if (!jTF_numero.getText().isEmpty()) {
                            if (!jTF_Bairro.getText().isEmpty()) {
                                if (!jTF_Municipio.getText().isEmpty()) {
                                    if (!field_CEP.getText().equals("     -   ")) {
                                        if (!jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()).equals("- Selecione -")) {
                                            if (!jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("- Selecione -")) {
                                                enderecos.add(capturarEndereco());
                                                pf = new PessoaFisica(jTF_cpf.getText().trim(), jTf_Nome.getText().trim(), enderecos, Double.valueOf(jTF_LimiteCredito.getText().trim()));

                                                int id = pDAO.inserirPessoaFisica(pf);
                                                if (id >= 0) {
                                                    limparCampos();
                                                    JOptionPane.showMessageDialog(rootPane, "Cliente salvo com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

                                                    int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja adicionar algum endereço ?");
                                                    if (JOptionPane.YES_OPTION == opcao) {

                                                        AdicionarEndereco dialog = new AdicionarEndereco(this, true, id);
                                                        dialog.setLocationRelativeTo(null);
                                                        dialog.setVisible(true);
                                                    }
                                                    dispose();

                                                } else {
                                                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar cliente", "Mensagem", JOptionPane.ERROR_MESSAGE);
                                                    this.dispose();
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(rootPane, "Tipo de endereco é obrigatório");
                                                jCBoxTipoEndereco.requestFocus();
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(rootPane, "UF é obrigatório");
                                            jCBoxUf.requestFocus();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(rootPane, "Campo CEP é obrigatório");
                                        field_CEP.requestFocus();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Campo Municipio é obrigatório");
                                    jTF_Municipio.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Campo Bairro é obrigatório!");
                                jTF_Bairro.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo Numero  é obrigatório!");
                            jTF_numero.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Logradouro  é obrigatório!");
                        jTF_Logradouro.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Limite de credito  é obrigatório!");
                    jTF_LimiteCredito.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo CPF é obrigatório!");
                jTF_cpf.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Nome é obrigatório");
            jTf_Nome.requestFocus();
        }
    }

    private void CadastrarPessoaJuridica() {

        if (!jTf_Nome.getText().isEmpty()) {
            if (!jTF_NomeFantasia.getText().isEmpty()) {
                if (!jTF_cnpj.getText().equals("  .   .   /    -  ")) {
                    if (!jTF_LimiteCredito.getText().isEmpty()) {
                        if (!jTF_Logradouro.getText().isEmpty()) {
                            if (!jTF_numero.getText().isEmpty()) {
                                if (!jTF_Bairro.getText().isEmpty()) {
                                    if (!jTF_Municipio.getText().isEmpty()) {
                                        if (!field_CEP.getText().equals("     -   ")) {
                                            if (!jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()).equals("- Selecione -")) {
                                                if (!jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("- Selecione -")) {

                                                    enderecos.add(capturarEndereco());
                                                    pj = new PessoaJuridica(jTF_NomeFantasia.getText().trim(), jTF_cnpj.getText().trim(), jTf_Nome.getText().trim(), enderecos, Double.parseDouble(jTF_LimiteCredito.getText().trim()));

                                                    int id = pDAO.inserirPessoaJuridica(pj);
                                                    if (id >= 0) {
                                                        limparCampos();
                                                        JOptionPane.showMessageDialog(rootPane, "Cliente salvo com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

                                                        int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja adicionar algum endereço ?");
                                                        if (JOptionPane.YES_OPTION == opcao) {

                                                            AdicionarEndereco dialog = new AdicionarEndereco(this, true, id);
                                                            dialog.setLocationRelativeTo(null);
                                                            dialog.setVisible(true);
                                                        }
                                                        dispose();

                                                    } else {
                                                        JOptionPane.showMessageDialog(rootPane, "Erro ao salvar cliente", "Mensagem", JOptionPane.ERROR_MESSAGE);
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
                                        jTF_Municipio.requestFocus();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Campo Bairro é obrigatório!");
                                    jTF_Bairro.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Campo Numero é obrigatório!");
                                jTF_numero.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo Logradouro é obrigatório!");
                            jTF_Logradouro.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Limite de credito é obrigatório!");
                        jTF_LimiteCredito.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo CPNJ é obrigatório!");
                    jTF_NomeFantasia.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Nome Fantasia é obrigatório!");
                jTf_Nome.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Nome é obrigatório!");
            jTF_cnpj.requestFocus();
        }

    }

    private void desbloqueiaCampoFisica() {
        jTF_cpf.setVisible(true);
        labelCPF.setVisible(true);
        jTF_cnpj.setVisible(false);
        LabelCNPJ.setVisible(false);
        jTF_NomeFantasia.setVisible(false);
        LabelnomeFantasia.setVisible(false);

    }

    private void desbloqueiaCampoJuridica() {

        jTF_cnpj.setEditable(true);
        jTF_cnpj.setVisible(true);
        LabelCNPJ.setVisible(true);
        jTF_NomeFantasia.setVisible(true);
        LabelnomeFantasia.setVisible(true);

        jTF_cpf.setVisible(false);
        labelCPF.setVisible(false);
    }

    private void limparCampos() {

        jTF_Bairro.setText("");
        jTF_Complemento.setText("");
        jTF_LimiteCredito.setText("");
        jTF_Logradouro.setText("");
        jTF_Municipio.setText("");
        jTF_NomeFantasia.setText("");
        jCBoxTipoEndereco.setSelectedIndex(0);
        field_CEP.setText("");
        jTF_cnpj.setText("");
        jTF_cpf.setText("");
        jTF_numero.setText("");
        jTf_Nome.setText("");
        jCBoxUf.setSelectedIndex(0);
    }

    private Endereco capturarEndereco() {
        end.setLogradouro(jTF_Logradouro.getText());
        end.setNumero(Integer.parseInt(jTF_numero.getText()));
        end.setBairro(jTF_Bairro.getText());
        end.setMunicipio(jTF_Municipio.getText());
        end.setComplemento(jTF_Complemento.getText());
        end.setCep(field_CEP.getText());
        end.setEstado(jCBoxUf.getItemAt(jCBoxUf.getSelectedIndex()));
        if (jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("Residencial")) {
            end.setTipoEndereco(1);
        } else if (jCBoxTipoEndereco.getItemAt(jCBoxTipoEndereco.getSelectedIndex()).equals("Comercial")) {
            end.setTipoEndereco(2);
        } else {
            end.setTipoEndereco(3);

        }
        return end;
    }

    private void addEnderecosArray(ArrayList<Endereco> add) {
        enderecos = add;
        enderecos.add(capturarEndereco());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCNPJ;
    private javax.swing.JLabel LabelnomeFantasia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JFormattedTextField field_CEP;
    private javax.swing.JButton jBtn_Limpar;
    private javax.swing.JButton jBtn_Salvar;
    private javax.swing.JComboBox<String> jCBoxTipoEndereco;
    private javax.swing.JComboBox<String> jCBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRbPessoaJuridica;
    private javax.swing.JRadioButton jRb_Pfisica;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_Complemento;
    private javax.swing.JTextField jTF_LimiteCredito;
    private javax.swing.JTextField jTF_Logradouro;
    private javax.swing.JTextField jTF_Municipio;
    private javax.swing.JTextField jTF_NomeFantasia;
    private javax.swing.JFormattedTextField jTF_cnpj;
    private javax.swing.JFormattedTextField jTF_cpf;
    private javax.swing.JTextField jTF_numero;
    private javax.swing.JTextField jTf_Nome;
    private javax.swing.JLabel labelCPF;
    // End of variables declaration//GEN-END:variables
}
