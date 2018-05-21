package Interface.Conta;

import Interface.Cliente.*;
import Banco.PessoaDAO;
import Controle.GerenciaCompra;
import Controle.GerenciaConta;

import Model.CalculaJuros;
import Model.Cliente;
import Model.Compra;
import Model.Conta;
import Model.NewTableModel;
import Model.Pagamento;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class TelaPagamento extends javax.swing.JDialog {

    private GerenciaCompra gerenciaCompra = new GerenciaCompra();
    private GerenciaConta gerenciaFatura = new GerenciaConta();
    private Cliente cliente;
    private Conta conta;
    private double juros;

    private ArrayList<Compra> compras = new ArrayList<>();
    private ArrayList<Object> dados = new ArrayList<>();
    private ArrayList<Pagamento> pag = new ArrayList<>();
    private CalculaJuros calculaJuros = new CalculaJuros();

    private String[] colunas = {"Total da Compra", "Quantidade de Produtos", "Data de Compra"};

    public TelaPagamento(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public TelaPagamento(javax.swing.JDialog parent, boolean modal, Conta conta) {
        super(parent, modal);
        this.compras = conta.getCompras();
        this.cliente = conta.getCliente();
        this.conta = conta;
        initComponents();
        setLocationRelativeTo(null);

        tbShowDados();
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
        btnSimularData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmCompras = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jurosPorAtraso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        valorTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboParcelas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valorTotal1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DataPagamento = new javax.swing.JFormattedTextField();
        btnFinalizarFatura1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

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
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 40, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINALIZAR FATURA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 300, -1));

        btnSimularData.setBackground(new java.awt.Color(255, 255, 255));
        btnSimularData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimularData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money.png"))); // NOI18N
        btnSimularData.setMnemonic('S');
        btnSimularData.setText("Simular");
        btnSimularData.setToolTipText("Salva os registros");
        btnSimularData.setFocusPainted(false);
        btnSimularData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularData, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 110, 40));

        tmCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Total da Compra", "Quantidade De Produtos", "Data De Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tmCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 710, 130));

        jurosPorAtraso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jurosPorAtraso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jurosPorAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jurosPorAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 160, 40));

        valorTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Parcelas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QTD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 50, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Simular Data de Pagamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 250, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COMPRAS EM ABERTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Juros Por Atraso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 160, 40));

        comboParcelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        comboParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParcelasActionPerformed(evt);
            }
        });
        jPanel1.add(comboParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 70, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R$");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 30, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("R$");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 30, 40));

        valorTotal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(valorTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 160, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Obs: O Juro de parcelamento é de 7%.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 410, 70));

        try {
            DataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataPagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(DataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, 40));

        btnFinalizarFatura1.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizarFatura1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFinalizarFatura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money.png"))); // NOI18N
        btnFinalizarFatura1.setMnemonic('S');
        btnFinalizarFatura1.setText("Finalizar Fatura");
        btnFinalizarFatura1.setToolTipText("Salva os registros");
        btnFinalizarFatura1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarFatura1.setFocusPainted(false);
        btnFinalizarFatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarFatura1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarFatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 210, 70));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor Total");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularDataActionPerformed
        calculaJuros();
        /* if (!DataPagamento.getText().equals("  /  /    ")) {
            calculaJuros();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe uma data!");
        }*/

        Calendar cal = new GregorianCalendar();
        LocalDate dataAgora = LocalDate.now();

        
        if (!DataPagamento.getText().equals("  /  /    ")) {

            LocalDate dataSimulada = LocalDate.parse(DataPagamento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Calendar dataAtual = Calendar.getInstance();
            dataAtual.set(Calendar.DAY_OF_MONTH, dataAgora.getDayOfMonth());
            dataAtual.set(Calendar.MONTH, dataAgora.getMonth().getValue());
            dataAtual.set(Calendar.YEAR, dataAgora.getYear());

            Calendar dataSimu = Calendar.getInstance();
            dataSimu.set(Calendar.DAY_OF_MONTH, dataSimulada.getDayOfMonth());
            dataSimu.set(Calendar.MONTH, dataSimulada.getMonth().getValue());
            dataSimu.set(Calendar.YEAR, dataSimulada.getYear());

            if (dataSimu.before(dataAtual)) {
                JOptionPane.showMessageDialog(null, "A data digitada é inválida para simulação!!\n" + "Dia: " + dataSimulada.getDayOfMonth() + "Mês: " + dataSimulada.getMonth().getValue() + "Ano: " + dataSimulada.getYear()); //C
            } else {
                calculaJuros();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe uma data!");
        }
    }//GEN-LAST:event_btnSimularDataActionPerformed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void btnFinalizarFatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarFatura1ActionPerformed
        int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Pagar a Fatura?");

        if (JOptionPane.YES_OPTION == opcao) {
            gerenciaFatura.montarFatura(conta, juros, Integer.parseInt(comboParcelas.getItemAt(comboParcelas.getSelectedIndex())), gerenciaCompra.getTotalCompras(compras));
            JOptionPane.showMessageDialog(rootPane, "Fatura paga com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            Iterator i = conta.getCompras().iterator();
            while (i.hasNext()) {
                Compra compra = (Compra) i.next();
                if (compra.getStatus() == 0) {
                    compra.setStatus(1);
                }
            }
            this.dispose();
        }
        if (JOptionPane.NO_OPTION == opcao) {
            JOptionPane.showMessageDialog(rootPane, "A Fatura não foi paga!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnFinalizarFatura1ActionPerformed

    private void comboParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParcelasActionPerformed
        calculaJuros();
    }//GEN-LAST:event_comboParcelasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                TelaPagamento dialog = new TelaPagamento(new javax.swing.JDialog(), true);
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

    public void calculaJuros() {
        juros = 0;
        if (!DataPagamento.getText().equals("  /  /    ")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataSimulada = LocalDate.parse(DataPagamento.getText(), formatter);
            juros = calculaJuros.calculaJurosPorAtraso(gerenciaCompra.getTotalCompras(compras), dataSimulada);
        }
        int parcelas = Integer.parseInt(comboParcelas.getItemAt(comboParcelas.getSelectedIndex()));
        juros += calculaJuros.calculaJurosPorParcelamento(gerenciaCompra.getTotalCompras(compras), parcelas);
        jurosPorAtraso.setText(String.valueOf(juros));
    }

    public void tbShowDados() {
        jurosPorAtraso.setText("0.0");
        valorTotal.setText(String.valueOf(gerenciaCompra.getTotalCompras(compras)));
        dados.clear();
        for (Compra compra : compras) {
            dados.add(new Object[]{
                compra.getTotal(),
                compras.size(),
                compra.getData()});
            NewTableModel dadosCompra = new NewTableModel(dados, colunas);
            tmCompras.setModel(dadosCompra);
            repaint();
            validate();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataPagamento;
    private javax.swing.JButton btnFinalizarFatura1;
    private javax.swing.JButton btnSimularData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JComboBox<String> comboParcelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jurosPorAtraso;
    private javax.swing.JTable tmCompras;
    private javax.swing.JLabel valorTotal;
    private javax.swing.JLabel valorTotal1;
    // End of variables declaration//GEN-END:variables
}
