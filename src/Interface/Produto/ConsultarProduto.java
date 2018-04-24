package Interface.Produto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interface.*;
import Banco.*;
import Model.*;
import Controle.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ConsultarProduto extends javax.swing.JDialog {

    private PessoaJuridica pj;
    private PessoaFisica pf;
    private ProdutoDAO prodDAO = new ProdutoDAO();
    private Produto prod;
    private Cliente cliente;
    private int excluido;
    private int tipoCliente;
    
    /**
     * Creates new form NewJDialog
     */
    public ConsultarProduto(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();   
    }

    public ConsultarProduto(javax.swing.JDialog parent, boolean modal, Produto prod) {
        super(parent, modal);
        this.tipoCliente = tipoCliente;
        this.cliente = cliente;
        initComponents();
          setLocationRelativeTo(null);
            showsCampos();
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
        jBtn_Fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProduto = new javax.swing.JPanel();
        fundo7 = new javax.swing.JLabel();
        Painel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tipoUva = new javax.swing.JLabel();
        fundo9 = new javax.swing.JLabel();
        Painel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        codigoProduto = new javax.swing.JLabel();
        Painel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        fundo11 = new javax.swing.JLabel();
        Painel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        fundo13 = new javax.swing.JLabel();
        fundo14 = new javax.swing.JLabel();
        Painel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        paisDeOrigem = new javax.swing.JLabel();
        fundo15 = new javax.swing.JLabel();
        Painel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        codigoDeBarras = new javax.swing.JLabel();
        fundo16 = new javax.swing.JLabel();
        Painel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tipoDeVinho = new javax.swing.JLabel();

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
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 40, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR ENDEREÇO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 300, -1));

        jBtn_Fechar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow Back.png"))); // NOI18N
        jBtn_Fechar.setMnemonic('S');
        jBtn_Fechar.setText("Voltar");
        jBtn_Fechar.setToolTipText("Salva os registros");
        jBtn_Fechar.setFocusPainted(false);
        jBtn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_FecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 120, 40));

        TableProduto.setBackground(new java.awt.Color(255, 255, 255));
        TableProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableProduto.setPreferredSize(new java.awt.Dimension(500, 873));

        fundo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("TIPO DE UVA:");

        tipoUva.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tipoUva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel4Layout = new javax.swing.GroupLayout(Painel4);
        Painel4.setLayout(Painel4Layout);
        Painel4Layout.setHorizontalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUva, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel4Layout.setVerticalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tipoUva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        Painel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("CÓDIGO DO PRODUTO:");

        codigoProduto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        codigoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Painel6Layout = new javax.swing.GroupLayout(Painel6);
        Painel6.setLayout(Painel6Layout);
        Painel6Layout.setHorizontalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel6Layout.setVerticalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("PREÇO:");

        preco.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        preco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel7Layout = new javax.swing.GroupLayout(Painel7);
        Painel7.setLayout(Painel7Layout);
        Painel7Layout.setHorizontalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel7Layout.setVerticalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("NOME: ");

        nome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel8Layout = new javax.swing.GroupLayout(Painel8);
        Painel8.setLayout(Painel8Layout);
        Painel8Layout.setHorizontalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel8Layout.setVerticalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        fundo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("PAIS DE ORIGEM:");

        paisDeOrigem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        paisDeOrigem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel9Layout = new javax.swing.GroupLayout(Painel9);
        Painel9.setLayout(Painel9Layout);
        Painel9Layout.setHorizontalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(paisDeOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Painel9Layout.setVerticalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paisDeOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        fundo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("CÓDIGO DE BARRAS:");

        codigoDeBarras.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        codigoDeBarras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel10Layout = new javax.swing.GroupLayout(Painel10);
        Painel10.setLayout(Painel10Layout);
        Painel10Layout.setHorizontalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(codigoDeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Painel10Layout.setVerticalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codigoDeBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        fundo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("TIPO DE VINHO:");

        tipoDeVinho.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tipoDeVinho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel12Layout = new javax.swing.GroupLayout(Painel12);
        Painel12.setLayout(Painel12Layout);
        Painel12Layout.setHorizontalGroup(
            Painel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(tipoDeVinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Painel12Layout.setVerticalGroup(
            Painel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tipoDeVinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TableProdutoLayout = new javax.swing.GroupLayout(TableProduto);
        TableProduto.setLayout(TableProdutoLayout);
        TableProdutoLayout.setHorizontalGroup(
            TableProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fundo11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(fundo7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Painel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fundo14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(fundo15, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TableProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fundo13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Painel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Painel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fundo9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Painel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TableProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Painel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fundo16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        TableProdutoLayout.setVerticalGroup(
            TableProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableProdutoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Painel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(TableProduto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 620, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_FecharActionPerformed
      this.dispose();

        
    }//GEN-LAST:event_jBtn_FecharActionPerformed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    /**
     * @param args the command line arguments
     */
    
     public void showsCampos(){
        nome.setText(prod.getNome());
        tipoUva.setText(prod.getTipoUva());
        preco.setText(String.valueOf(prod.getPreco()));
        paisDeOrigem.setText(prod.getPaisOrigem());
        codigoDeBarras.setText(prod.getCodigoBarras());
        tipoDeVinho.setText(prod.getTipoVinho());
    }

     
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarProduto dialog = new ConsultarProduto(new javax.swing.JDialog(), true);
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
    private javax.swing.JPanel Painel10;
    private javax.swing.JPanel Painel12;
    private javax.swing.JPanel Painel4;
    private javax.swing.JPanel Painel6;
    private javax.swing.JPanel Painel7;
    private javax.swing.JPanel Painel8;
    private javax.swing.JPanel Painel9;
    private javax.swing.JPanel TableProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel codigoDeBarras;
    private javax.swing.JLabel codigoProduto;
    private javax.swing.JLabel fundo11;
    private javax.swing.JLabel fundo13;
    private javax.swing.JLabel fundo14;
    private javax.swing.JLabel fundo15;
    private javax.swing.JLabel fundo16;
    private javax.swing.JLabel fundo7;
    private javax.swing.JLabel fundo9;
    private javax.swing.JButton jBtn_Fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel paisDeOrigem;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel tipoDeVinho;
    private javax.swing.JLabel tipoUva;
    // End of variables declaration//GEN-END:variables

}