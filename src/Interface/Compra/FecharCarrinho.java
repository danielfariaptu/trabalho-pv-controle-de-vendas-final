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

public class FecharCarrinho extends javax.swing.JDialog {

    private String[] colunas = {"Código ", "Nome", "Preço", "Estoque", "Tipo de Uva", "Tipo de Vinho", "País de Origem"};

    private ArrayList<Produto> carrinho;
    private ArrayList<Object> dados = new ArrayList<>();
    
    
    private Compra compra = new Compra();
    private GerenciaCompra gc = new GerenciaCompra();
    
    //DATA
    private LocalDate hoje = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String hojeFormatado = hoje.format(formatter);

    public FecharCarrinho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        label.setVisible(false);
        field_codProduto.setVisible(false);

    }

    public FecharCarrinho(javax.swing.JFrame parent, boolean modal, ArrayList<Produto> carrinho) {
        super(parent, modal);
        initComponents();
        this.carrinho = carrinho;
        setLocationRelativeTo(null);
        tbShowDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmCompra = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        FinalizarCompra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dataLocal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        field_codProduto = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        RemoverCarrinho = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Itens no Carrinho: ");
        CadastroProduto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jScrollPane1.setViewportView(tmCompra);

        CadastroProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 290));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FECHAR COMPRA");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        FinalizarCompra.setBackground(new java.awt.Color(255, 255, 255));
        FinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        FinalizarCompra.setText("FINALIZAR PEDIDO");
        FinalizarCompra.setFocusPainted(false);
        FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCompraActionPerformed(evt);
            }
        });
        CadastroProduto.add(FinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 200, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataLocal.setDisplayedMnemonic('n');
        dataLocal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataLocal.setForeground(new java.awt.Color(255, 255, 255));
        dataLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataLocal.setLabelFor(label);
        jPanel3.add(dataLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 30));

        CadastroProduto.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 240, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total da Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setDisplayedMnemonic('n');
        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setLabelFor(label);
        label1.setText("TOTAL: R$ ");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 40));

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(153, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, 40));

        CadastroProduto.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 200, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remover item do carrinho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(field_codProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 29));

        label.setDisplayedMnemonic('n');
        label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setLabelFor(label);
        label.setText("DIGITE O CÓDIGO DO PRODUTO");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        RemoverCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        RemoverCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-32.png"))); // NOI18N
        RemoverCarrinho.setText("REMOVER");
        RemoverCarrinho.setFocusPainted(false);
        RemoverCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverCarrinhoActionPerformed(evt);
            }
        });
        jPanel1.add(RemoverCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 130, 30));

        CadastroProduto.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 500, 100));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown

    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCompraActionPerformed

        //tratar finalizar compra
        int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Finalizar a compra?");

        if (JOptionPane.YES_OPTION == opcao) {
            compra.setProdutos(carrinho);
            compra.setTotal(gc.getTotal(carrinho));
            compra.setData(hoje);
            
            RelatorioCliente relatorioCliente = new RelatorioCliente(this, true);
            relatorioCliente.setVisible(true);
            int id = relatorioCliente.getId();
            if(id > -1){
                gc.finalizarCompra(compra, id);
                JOptionPane.showMessageDialog(rootPane, "Compra realizada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                carrinho.clear();
                this.dispose(); 
            }            
        } else if (JOptionPane.NO_OPTION == opcao) {
            JOptionPane.showMessageDialog(rootPane, "Compra não realizada!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_FinalizarCompraActionPerformed

    private void RemoverCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverCarrinhoActionPerformed

        if ((field_codProduto.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do produto!");
            field_codProduto.requestFocus();
        } else {

            Iterator i = carrinho.iterator();
            int cont = 0;
            while (i.hasNext()) {
                Produto produto = (Produto) i.next();
                if (field_codProduto.getText().equals(produto.getCodigoBarras())) {

                    int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Remover do carrinho?");

                    if (JOptionPane.YES_OPTION == opcao) {

                        i.remove();
                        cont--;
                        
                        JOptionPane.showMessageDialog(rootPane, "Produto removido do carrinho!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        tbShowDados();
                        break;
                    } else if (JOptionPane.NO_OPTION == opcao) {
                        JOptionPane.showMessageDialog(rootPane, "Produto não removido!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else {
                    cont++;
                }
                if (cont == carrinho.size()) {
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                }

            }

        }
    }//GEN-LAST:event_RemoverCarrinhoActionPerformed

    public void tbShowDados() {
        
        total.setText(String.valueOf(gc.getTotal(carrinho)));
        dataLocal.setText(hojeFormatado);
        ArrayList<Produto> prod = carrinho;
        
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
            tmCompra.setModel(dadosEndereco);
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
                FecharCarrinho dialog = new FecharCarrinho(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton FinalizarCompra;
    private javax.swing.JButton RemoverCarrinho;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel dataLocal;
    private javax.swing.JTextField field_codProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JTable tmCompra;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
