package Interface.Produto;

import Controle.GerenciaProduto;
import Interface.NewTableModel;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExcluirProduto extends javax.swing.JDialog {

    GerenciaProduto gp;
    ArrayList<Object> dados = new ArrayList<>();
    String[] colunas = {"Nome", "Preço", "Código de Barras", "Tipo de Uva", "País de Origem", "Tipo de Vinho"};

    ;
    public ExcluirProduto(java.awt.Frame parent, boolean modal, GerenciaProduto gp) {
        super(parent, modal);
        this.gp = gp;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExclusao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 300));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIGITE O NOME DO PRODUTO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 410, 43);

        tfNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jPanel1.add(tfNome);
        tfNome.setBounds(280, 60, 247, 37);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(350, 110, 107, 34);

        btnExcluir.setBackground(new java.awt.Color(102, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/lixeira.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);
        btnExcluir.setBounds(450, 330, 140, 60);
        btnExcluir.setVisible(false);

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/excluir.png"))); // NOI18N
        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(600, 330, 140, 60);

        tabelaExclusao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaExclusao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 156, 790, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaExclusao.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Porfavor selecione uma linha!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if ((JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este Produto?", "Comfima excluir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)) {
            boolean result = gp.excluirProduto((tabelaExclusao.getValueAt(tabelaExclusao.getSelectedRow(), 0).toString()));
            repaint();
            validate();
            tbDadosOnShow();

            if (result) {
                JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não excluido.");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if ((tfNome.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor preencha um dos campos.");
            tfNome.requestFocus();
        } else {
            ArrayList<Produto> pro = gp.consultarProduto(tfNome.getText().trim());
            if (pro.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Produto não cadastrado!");
                dados.clear();
                NewTableModel dadosProduto = new NewTableModel(dados, colunas);
                tabelaExclusao.setModel(dadosProduto);
                repaint();
                validate();
                btnExcluir.setVisible(false);
            } else {
                dados.clear();
                for (Produto p : pro) {
                    dados.add(new Object[]{p.getNome(), p.getPreco(), p.getCodigoBarras(), p.getTipoUva(), p.getPaisOrigem(), p.getTipoVinho()});
                    NewTableModel dadosProduto = new NewTableModel(dados, colunas);
                    tabelaExclusao.setModel(dadosProduto);
                    repaint();
                    validate();
                }
                btnExcluir.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void tbDadosOnShow() {
        tabelaExclusao.isCellEditable(tabelaExclusao.getSelectedRow(), 0);
        ArrayList<Produto> pro = gp.relatorioProduto();
        dados.clear();
        for (Produto p : pro) {
            dados.add(new Object[]{p.getNome(), p.getPreco(), p.getCodigoBarras(), p.getTipoUva(), p.getPaisOrigem(), p.getTipoVinho()});
            NewTableModel dadosProduto = new NewTableModel(dados, colunas);
            tabelaExclusao.setModel(dadosProduto);
            repaint();
            validate();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaExclusao;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
