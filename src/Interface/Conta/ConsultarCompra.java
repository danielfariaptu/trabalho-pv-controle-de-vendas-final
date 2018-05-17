package Interface.Conta;

import Interface.Cliente.*;
import Banco.PessoaDAO;
import Model.Cliente;
import Model.Compra;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.time.LocalDate;

public class ConsultarCompra extends javax.swing.JDialog {

    private PessoaDAO pDAO = new PessoaDAO();
    private Compra compra;
    private Cliente cliente;

    public ConsultarCompra(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public ConsultarCompra(javax.swing.JDialog parent, boolean modal, Compra compra, Cliente cliente) {
        super(parent, modal);

        this.compra = compra;
        this.cliente = cliente;
        initComponents();
        setLocationRelativeTo(null);

        ShowsCampos();

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
        PainelFatura = new javax.swing.JPanel();
        fundo7 = new javax.swing.JLabel();
        Painel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        dataCompra = new javax.swing.JLabel();
        Painel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        qtdProdutos = new javax.swing.JLabel();
        Painel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codigoCompra = new javax.swing.JLabel();
        Painel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JLabel();
        fundo9 = new javax.swing.JLabel();
        Painel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JLabel();
        fundo10 = new javax.swing.JLabel();
        Painel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        limiteCreditoCliente = new javax.swing.JLabel();
        fundo11 = new javax.swing.JLabel();
        fundo13 = new javax.swing.JLabel();
        fundo14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fundo8 = new javax.swing.JLabel();
        Painel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        totalCompra = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fundo12 = new javax.swing.JLabel();

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
        jLabel1.setText("CONSULTA DE COMPRA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 300, -1));

        jBtn_Fechar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow Back.png"))); // NOI18N
        jBtn_Fechar.setMnemonic('S');
        jBtn_Fechar.setText("Voltar");
        jBtn_Fechar.setToolTipText("Salva os registros");
        jBtn_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Fechar.setFocusPainted(false);
        jBtn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_FecharActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 120, 40));

        PainelFatura.setBackground(new java.awt.Color(255, 255, 255));

        fundo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("DATA DE COMPRA:");

        dataCompra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dataCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel9Layout = new javax.swing.GroupLayout(Painel9);
        Painel9.setLayout(Painel9Layout);
        Painel9Layout.setHorizontalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(dataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel9Layout.setVerticalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel9Layout.createSequentialGroup()
                .addGroup(Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(dataCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("QUANTIDADE DE PRODUTOS:");

        qtdProdutos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        qtdProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel8Layout = new javax.swing.GroupLayout(Painel8);
        Painel8.setLayout(Painel8Layout);
        Painel8Layout.setHorizontalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(qtdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        Painel8Layout.setVerticalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(qtdProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Painel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("CÓDIGO:");

        codigoCompra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        codigoCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel4Layout = new javax.swing.GroupLayout(Painel4);
        Painel4.setLayout(Painel4Layout);
        Painel4Layout.setHorizontalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Painel4Layout.setVerticalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("NOME: ");

        nomeCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        nomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel5Layout = new javax.swing.GroupLayout(Painel5);
        Painel5.setLayout(Painel5Layout);
        Painel5Layout.setHorizontalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Painel5Layout.setVerticalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        Painel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("CÓDIGO:");

        codigoCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout Painel6Layout = new javax.swing.GroupLayout(Painel6);
        Painel6.setLayout(Painel6Layout);
        Painel6Layout.setHorizontalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Painel6Layout.setVerticalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(codigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("LIMITE DE CRÉDITO:");

        limiteCreditoCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        limiteCreditoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Painel7Layout = new javax.swing.GroupLayout(Painel7);
        Painel7.setLayout(Painel7Layout);
        Painel7Layout.setHorizontalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(limiteCreditoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        Painel7Layout.setVerticalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(limiteCreditoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fundo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        fundo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        fundo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("DADOS DO CLIENTE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("DADOS DA COMPRA");

        fundo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("TOTAL DA COMPRA:");

        totalCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalCompra.setForeground(new java.awt.Color(255, 0, 51));
        totalCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 51));
        jLabel15.setText("R$");

        javax.swing.GroupLayout Painel10Layout = new javax.swing.GroupLayout(Painel10);
        Painel10.setLayout(Painel10Layout);
        Painel10Layout.setHorizontalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        Painel10Layout.setVerticalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel10Layout.createSequentialGroup()
                .addGroup(Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fundoRelatorio.png"))); // NOI18N

        javax.swing.GroupLayout PainelFaturaLayout = new javax.swing.GroupLayout(PainelFatura);
        PainelFatura.setLayout(PainelFaturaLayout);
        PainelFaturaLayout.setHorizontalGroup(
            PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundo14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Painel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fundo11, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFaturaLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(164, 164, 164))
                                .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Painel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fundo13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(fundo7, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fundo9, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fundo10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Painel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PainelFaturaLayout.createSequentialGroup()
                .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Painel8, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Painel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fundo12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Painel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PainelFaturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fundo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelFaturaLayout.setVerticalGroup(
            PainelFaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(fundo14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Painel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fundo9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundo11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(fundo13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fundo8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(fundo7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fundo12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(PainelFatura);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 680, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ConsultarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarCompra dialog = new ConsultarCompra(new javax.swing.JDialog(), true);
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

    private void ShowsCampos() {

        codigoCliente.setText(Integer.toString(cliente.getCodigo()));
        nomeCliente.setText(cliente.getNome());
        limiteCreditoCliente.setText(String.valueOf(cliente.getLimiteCredito()));

        codigoCompra.setText(String.valueOf(compra.getId()));
        qtdProdutos.setText(Integer.toString(compra.getProdutos().size()));
        dataCompra.setText(String.valueOf(compra.getData()));
        totalCompra.setText(Double.toString(compra.getTotal()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel10;
    private javax.swing.JPanel Painel4;
    private javax.swing.JPanel Painel5;
    private javax.swing.JPanel Painel6;
    private javax.swing.JPanel Painel7;
    private javax.swing.JPanel Painel8;
    private javax.swing.JPanel Painel9;
    private javax.swing.JPanel PainelFatura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel codigoCliente;
    private javax.swing.JLabel codigoCompra;
    private javax.swing.JLabel dataCompra;
    private javax.swing.JLabel fundo10;
    private javax.swing.JLabel fundo11;
    private javax.swing.JLabel fundo12;
    private javax.swing.JLabel fundo13;
    private javax.swing.JLabel fundo14;
    private javax.swing.JLabel fundo7;
    private javax.swing.JLabel fundo8;
    private javax.swing.JLabel fundo9;
    private javax.swing.JButton jBtn_Fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel limiteCreditoCliente;
    private javax.swing.JLabel nomeCliente;
    private javax.swing.JLabel qtdProdutos;
    private javax.swing.JLabel totalCompra;
    // End of variables declaration//GEN-END:variables
}
