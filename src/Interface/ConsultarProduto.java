package Interface;

import Controle.GerenciaProduto;
import Model.Produto;
import Interface.NewTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ConsultarProduto extends javax.swing.JDialog {

    GerenciaProduto gp;
    ArrayList<Object> dados = new ArrayList<>();
    String[] colunas = {"Nome", "Preço",  "Código de Barras","Tipo de Uva", "País de Origem", "Tipo de Vinho"};

    public ConsultarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.gp = gp;
        initComponents();
        tbDadosOnShow();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnCancelar3 = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbAviso = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Código de Barras", "Tipo de Uva", "País de Origem", "Tipo de Vinho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaConsulta);

        btnAlterar.setBackground(new java.awt.Color(102, 102, 102));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/alterar.png"))); // NOI18N
        btnAlterar.setText("Editar");
        btnAlterar.setToolTipText("Após selecionar um elemento na tabela clique para altera-lo");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar3.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/excluir.png"))); // NOI18N
        btnCancelar3.setText("Fechar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome.setLabelFor(tfNome);
        lbNome.setText("NOME:");
        lbNome.setToolTipText("");

        lbAviso.setText("Aviso.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(lbAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnProcurar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcurar)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAviso))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(tabelaConsulta.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(rootPane, "Porfavor selecione uma linha!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            TableModel tm = tabelaConsulta.getModel();
            Produto produto = gp.retornaProduto((tm.getValueAt(tabelaConsulta.getSelectedRow(), 0).toString()));
            
        }

        tbDadosOnShow();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        if ((tfNome.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor informe o nome do produto.");
            tfNome.requestFocus();
        } else {
            ArrayList<Produto> pro = gp.consultarProduto(tfNome.getText().trim());
            if (pro.isEmpty()) {
                dados.clear();
                NewTableModel dadosProduto = new NewTableModel(dados, colunas);
                tabelaConsulta.setModel(dadosProduto);
                repaint();
                validate();
            } else {
                dados.clear();
                for (Produto p : pro) {
                    dados.add(new Object[]{p.getNome(), p.getPreco(), p.getCodigoBarras(), p.getTipoUva(), p.getPaisOrigem(), p.getTipoVinho()});
                    NewTableModel dadosProduto = new NewTableModel(dados, colunas);
                    tabelaConsulta.setModel(dadosProduto);
                    repaint();
                    validate();
                }
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    public void tbDadosOnShow() {
        ArrayList<Produto> pro = gp.relatorioProduto();
        dados.clear();
        for (Produto p : pro) {
            dados.add(new Object[]{p.getNome(), p.getPreco(),p.getPreco(), p.getCodigoBarras(), p.getTipoUva(), p.getPaisOrigem(), p.getTipoVinho()});
            NewTableModel dadosProduto = new NewTableModel(dados, colunas);
            tabelaConsulta.setModel(dadosProduto);
            repaint();
            validate();
        }
        tabelaConsulta.isCellEditable(tabelaConsulta.getSelectedRow(), tabelaConsulta.getSelectedColumn());
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTable tabelaConsulta;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
