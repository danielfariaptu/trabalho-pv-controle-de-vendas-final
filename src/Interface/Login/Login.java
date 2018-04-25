package Interface.Login;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import Banco.LoginDAO;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tavv.controle.de.vendas.MenuPrincipal;

public class Login extends javax.swing.JFrame {

    LoginDAO logDAO = new LoginDAO();
   
       
    private Boolean chamarMenuPrincipal;

    private String senhaResultado;
    private static MenuPrincipal telaInicial;

    public Login() {
       
        
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        overlay.setVisible(false);
        overlay.setBackground(new Color(51,34,94,80));
        URL caminhoIcone = getClass().getResource("/icons/icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        fieldNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        iconeUsuario = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        fieldSenha = new javax.swing.JPasswordField();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        btnSair = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        overlay = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistema Tabajara Atacado e Varejo de Vinhos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel.setBackground(new java.awt.Color(0, 0, 51));

        fieldNome.setBackground(new java.awt.Color(227, 226, 242));
        fieldNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.setBorder(null);
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(51, 0, 51));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.setFocusable(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 0, 51));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setFocusable(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        iconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-credenciais-do-usuário-64.png"))); // NOI18N

        labelLogin.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");

        fieldSenha.setBackground(new java.awt.Color(227, 226, 242));
        fieldSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSenha.setBorder(null);
        fieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaActionPerformed(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Nome de Usuário: ");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha: ");

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(null);
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/black_info.png"))); // NOI18N
        jButton1.setText("INFO");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(fieldNome)
                                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelUsuario)))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(iconeUsuario)
                        .addGap(26, 26, 26)
                        .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 118, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addGap(8, 8, 8)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        overlay.setBackground(new java.awt.Color(0, 0, 51));
        overlay.setPreferredSize(new java.awt.Dimension(640, 487));
        overlay.setRequestFocusEnabled(false);
        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed

    }//GEN-LAST:event_fieldNomeActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if ((fieldNome.getText().trim().equals("")) && (fieldSenha.getText().trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Verifique se algum campo está vazio!");
        } else {

            senhaResultado = logDAO.AutenticaSenha(fieldNome.getText(), fieldSenha.getText());

            chamarMenuPrincipal = logDAO.RealizaLogin(fieldNome.getText(), senhaResultado, fieldSenha.getText());
            
            if(chamarMenuPrincipal){
             MenuPrincipal mp = new MenuPrincipal();
		mp.setVisible(true);
                this.dispose();
             
            }
        }
           
    }//GEN-LAST:event_btnEntrarActionPerformed


    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      
        Cadastro dialog = new Cadastro(new javax.swing.JDialog(), true);
        overlay.setVisible(true);
	dialog.setVisible(true);
        overlay.setVisible(false);
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void fieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Tabajara Atacado e Varejo de Vinhos, Todos os Direitos Reservados, 2018.");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel iconeUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel overlay;
    // End of variables declaration//GEN-END:variables

}
