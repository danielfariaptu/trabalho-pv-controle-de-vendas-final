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

public class AdicionarAoCarrinho extends javax.swing.JDialog {

    private String[] colunas = {"Código ", "Nome", "Preço", "Estoque","Tipo de Uva","Tipo de Vinho","País de Origem"};
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Object> dados = new ArrayList<>();
    private int tipo;
    private Compra compra;
    private ArrayList<Produto> carrinho;

    public AdicionarAoCarrinho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        label.setVisible(false);
        field_codProduto.setVisible(false);

    }

    public AdicionarAoCarrinho(javax.swing.JFrame parent, boolean modal, ArrayList<Produto> produtos, ArrayList<Produto> carrinho) {
        super(parent, modal);
        initComponents();
        this.produtos = produtos;
        this.carrinho = carrinho;

        setLocationRelativeTo(null);
        tbShowDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        field_codProduto = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        AdicionarCarrinho = new javax.swing.JButton();
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

        jScrollPane1.setViewportView(tmProduto);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADICIONAR AO CARRINHO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));
        CadastroProduto.add(field_codProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, 29));

        label.setDisplayedMnemonic('n');
        label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setLabelFor(label);
        label.setText("DIGITE O CÓDIGO DO PRODUTO");
        CadastroProduto.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        AdicionarCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        AdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-32.png"))); // NOI18N
        AdicionarCarrinho.setText("ADICIONAR");
        AdicionarCarrinho.setFocusPainted(false);
        AdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarCarrinhoActionPerformed(evt);
            }
        });
        CadastroProduto.add(AdicionarCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Produtos:");
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

    private void AdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarCarrinhoActionPerformed
        if ((field_codProduto.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do produto!");
            field_codProduto.requestFocus();
        } else {            
                Iterator i = produtos.iterator();
            int cont = 0;
            while (i.hasNext()) {
                Produto produto = (Produto) i.next();
                if (field_codProduto.getText().equals(produto.getCodigoBarras())) {
                    carrinho.add(produto);
                    JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho com sucesso!");
                }else{
                    cont++;
                }
                if(cont == produtos.size()){
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                }

            }    
        }
    }//GEN-LAST:event_AdicionarCarrinhoActionPerformed

    public void tbShowDados() {
        
        // tratar listar no table model.
        ArrayList<Produto> prod = produtos;
        dados.clear();
        for (Produto p : prod) {
            dados.add(new Object[]{
                p.getCodigoBarras(),
                p.getNome(),
                p.getPreco(),
                p.getEstoque(),
                p.getTipoUva(),
                p.getTipoVinho(),
                p.getPaisOrigem()});
            NewTableModel dadosEndereco = new NewTableModel(dados, colunas);
            tmProduto.setModel(dadosEndereco);
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
                AdicionarAoCarrinho dialog = new AdicionarAoCarrinho(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton AdicionarCarrinho;
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_codProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tmProduto;
    // End of variables declaration//GEN-END:variables
}
