package Interface.Compra;

import Controle.GerenciaCompra;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CadastroCompra extends javax.swing.JDialog {

    HashSet backup = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
    HashSet teclaEnter = (HashSet) backup.clone();
    GerenciaCompra gcom;

    public CadastroCompra(java.awt.Frame parent, boolean modal, GerenciaCompra gcom) {
        super(parent, modal);
        initComponents();
        this.gcom = gcom;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroProduto.setBackground(new java.awt.Color(51, 0, 102));
        CadastroProduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroProdutoComponentShown(evt);
            }
        });
        CadastroProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE COMPRA");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 43));

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/confirmar_1.png"))); // NOI18N
        btnConfirmar.setText("Cadastro");
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
        CadastroProduto.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 140, 60));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/excluir.png"))); // NOI18N
        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 140, 60));

        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroProduto.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

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
        CadastroProduto.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 140, 60));

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
        CadastroProduto.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 140, 60));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
 
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == 10) {
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if (evt.getKeyCode() == 10) {
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();
        abilitaCampos(true);
       // tfNome.requestFocus();
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyTyped
        if (evt.getKeyCode() == 10) {
            btnNovoActionPerformed(null);
        }
    }//GEN-LAST:event_btnNovoKeyTyped

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown
        lbAviso.setVisible(true);
        lbAviso.setForeground(Color.black);
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        enterToTab();
        limpaCampos();
        abilitaCampos(true);
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
        //tfNome.requestFocus();
    }//GEN-LAST:event_CadastroProdutoComponentShown

    public void limpaCampos() {
        
    }

    public void abilitaCampos(boolean status) {
        
    }

    public void enterToTab() {
        teclaEnter.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, teclaEnter);
        btnLimpar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnConfirmar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnNovo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAviso;
    // End of variables declaration//GEN-END:variables
}
