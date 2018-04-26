package Interface.Produto;

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

public class RelatorioProduto extends javax.swing.JDialog {

    private String[] colunas = {"Codigo", "Nome", "Preço", "Estoque"};
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Object> dados = new ArrayList<>();
    private int tipo;
    

    public RelatorioProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        labelEnd.setVisible(false);
        field_codProduto.setVisible(false);

        RadioCliCod.setSelected(true);
        desbloqueiaCliCod();
    }

    public RelatorioProduto(javax.swing.JFrame parent, boolean modal, ArrayList<Produto> produtos,int tipo) {
        super(parent, modal);
        initComponents();
        this.tipo = tipo;
        this.produtos = produtos;

        setLocationRelativeTo(null);
        tbShowDados();
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
        field_codProduto = new javax.swing.JTextField();
        labelEnd = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        MostrarCodProd = new javax.swing.JButton();

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
        jLabel1.setText("BUSCA DE PRODUTO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 43));
        CadastroProduto.add(field_codProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 29));

        labelEnd.setDisplayedMnemonic('n');
        labelEnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(255, 255, 255));
        labelEnd.setLabelFor(labelEnd);
        labelEnd.setText("DIGITE O CÓDIGO DO PRODUTO");
        CadastroProduto.add(labelEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        MostrarCodProd.setBackground(new java.awt.Color(255, 255, 255));
        MostrarCodProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mostrar-propriedade.-26.png"))); // NOI18N
        MostrarCodProd.setText("MOSTRAR");
        MostrarCodProd.setFocusPainted(false);
        MostrarCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCodProdActionPerformed(evt);
            }
        });
        CadastroProduto.add(MostrarCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 30));

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

    private void MostrarCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCodProdActionPerformed
        if ((field_codProduto.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o código do endereço!");
            field_codProduto.requestFocus();
        } else {
            Iterator i = produtos.iterator();
            int cont = 0;
            while (i.hasNext()) {
                Produto produto = (Produto) i.next();
                if (field_codProduto.getText().equals(produto.getCodigoBarras())){
                    if (tipo == 2) {
                        
                        AlterarProduto alterar = new AlterarProduto(this, true, produto);
                        alterar.setVisible(true);
                        
                    } else if (tipo == 3) {
                           ConsultarProduto consultar = new  ConsultarProduto(this, true, produto);
                           consultar.setVisible(true);
                    } else {
                        
                        ExcluirProduto excluir = new ExcluirProduto(this, true, produto);
                        excluir.setVisible(true);
                        
                    }
                }else{
                    cont++;
                }
                if(cont == produtos.size()){
                    JOptionPane.showMessageDialog(rootPane, "Codigo não encontrado!");
                }

            }

        }


    }//GEN-LAST:event_MostrarCodProdActionPerformed

    private void RadioCliCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCliCodActionPerformed
        resetaCampos();
    }//GEN-LAST:event_RadioCliCodActionPerformed

    private void RadioEndCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEndCodActionPerformed
        resetaCampos();
        labelEnd.setVisible(true);
        field_codProduto.setVisible(true);
        MostrarCodProd.setVisible(true);

    }//GEN-LAST:event_RadioEndCodActionPerformed

    public void tbShowDados() {
        ArrayList<Produto> prod = produtos;
        dados.clear();
        for (Produto p : prod) {
            dados.add(new Object[]{
                p.getCodigoBarras(),
                p.getNome(),
                p.getPreco(),
                p.getEstoque()});
            NewTableModel dadosEndereco = new NewTableModel(dados, colunas);
            tmEnderecos.setModel(dadosEndereco);
            repaint();
            validate();
        }
    }

    private void resetaCampos() {

        MostrarCodProd.setVisible(false);
    }

    private void desbloqueiaCliCod() {
    }

    private void desbloqueiaEndCod() {
        labelEnd.setVisible(true);
        field_codProduto.setVisible(true);
        MostrarCodProd.setVisible(true);
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
                RelatorioProduto dialog = new RelatorioProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton MostrarCodProd;
    private javax.swing.JRadioButton RadioCliCod;
    private javax.swing.JRadioButton RadioEndCod;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JTextField field_codProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JTable tmEnderecos;
    // End of variables declaration//GEN-END:variables
}
