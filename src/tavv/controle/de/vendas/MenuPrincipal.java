package tavv.controle.de.vendas;

import Interface.Login.Login;
import Banco.PessoaDAO;
import Banco.ProdutoDAO;
import Controle.GerenciaProduto;
import Interface.Cliente.*;
import Interface.Compra.AdicionarAoCarrinho;
import Interface.Compra.FecharCarrinho;
import Interface.Conta.RelatorioClienteConta;
import Interface.Endereco.RelatorioClienteEndereco;
import Interface.Produto.*;
import Interface.Reports.RelatorioClientesJasper;
import Model.*;
import Model.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;

public class MenuPrincipal extends javax.swing.JFrame {

    private int b1, b2, b3, b4, b5, b6, b7, b8;

    private PessoaDAO pdao = new PessoaDAO();
    private ProdutoDAO proDAO = new ProdutoDAO();
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();

    GerenciaProduto gp = new GerenciaProduto();

    public MenuPrincipal() {

        initComponents();

        URL caminhoIcone = getClass().getResource("/icons/icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);

        setResizable(false);
        setLocationRelativeTo(null);
        setSize(1280, 800);

        overlay.setVisible(false);
        overlay.setBackground(new Color(51, 34, 94, 80));

        Navegation.setBackground(new Color(0, 0, 51, 111));

        PainelCliente.setVisible(false);
        PainelCliente.setBackground(new Color(0, 0, 51, 111));

        PainelEndereco.setVisible(false);
        PainelEndereco.setBackground(new Color(0, 0, 51, 111));

        PainelCompra.setVisible(false);
        PainelCompra.setBackground(new Color(0, 0, 51, 111));

        PainelProduto.setVisible(false);
        PainelProduto.setBackground(new Color(0, 0, 51, 111));

        PainelInicio.setVisible(true);
        PainelInicio.setBackground(new Color(0, 0, 51, 111));

        botaoInicio.setBackground(new Color(30, 28, 46));

        PainelInicio.setVisible(true);

        PainelRelatoriosJasper.setVisible(false);
        PainelRelatoriosJasper.setBackground(new Color(0, 0, 51));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overlay = new javax.swing.JPanel();
        Navegation = new javax.swing.JPanel();
        botaoPainelLogOut = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botaoPainelProduto = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botaoConta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        botaoPainelCompra = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        botaoPainelEndereco = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        botaoPainelCliente = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        botaoInicio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        botaoPainelRelatorios = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PainelInicio = new javax.swing.JPanel();
        InicioTitle = new javax.swing.JPanel();
        labelCliente1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelCompra = new javax.swing.JPanel();
        CompraTitle = new javax.swing.JPanel();
        labelCliente2 = new javax.swing.JLabel();
        botaoIncluirCompra = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        botaoMostrarCompra = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        PainelProduto = new javax.swing.JPanel();
        ProdTitle = new javax.swing.JPanel();
        labelPag = new javax.swing.JLabel();
        botaoIncluirProd = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        botaoAlterarProd = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        botaoRemoverProd = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        botaoMostrarProd = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        PainelEndereco = new javax.swing.JPanel();
        EndTitle = new javax.swing.JPanel();
        labelEnd = new javax.swing.JLabel();
        botaoIncluirE = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        botaoAlterarE = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        botaoRemoverE = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        botaoMostrarE = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        PainelCliente = new javax.swing.JPanel();
        ClienteTitle = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        botaoIncluirCli = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        botaoAlterarCli = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        botaoRemoverCli = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        botaoMostrarCli = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PainelRelatoriosJasper = new javax.swing.JPanel();
        InicioTitle1 = new javax.swing.JPanel();
        labelCliente3 = new javax.swing.JLabel();
        btn_Gerar = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - TAVV ");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overlay.setBackground(new java.awt.Color(0, 0, 51));
        overlay.setPreferredSize(new java.awt.Dimension(1280, 800));
        overlay.setRequestFocusEnabled(false);
        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 810));

        Navegation.setPreferredSize(new java.awt.Dimension(62, 500));
        Navegation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPainelLogOut.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelLogOut.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelLogOutMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOGOUT");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelLogOutLayout = new javax.swing.GroupLayout(botaoPainelLogOut);
        botaoPainelLogOut.setLayout(botaoPainelLogOutLayout);
        botaoPainelLogOutLayout.setHorizontalGroup(
            botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelLogOutLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        botaoPainelLogOutLayout.setVerticalGroup(
            botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelLogOutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(botaoPainelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, -1));

        botaoPainelProduto.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelProduto.setToolTipText("");
        botaoPainelProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelProdutoMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Produto");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Wine (3).png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelProdutoLayout = new javax.swing.GroupLayout(botaoPainelProduto);
        botaoPainelProduto.setLayout(botaoPainelProdutoLayout);
        botaoPainelProdutoLayout.setHorizontalGroup(
            botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelProdutoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        botaoPainelProdutoLayout.setVerticalGroup(
            botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Navegation.add(botaoPainelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, -1));

        botaoConta.setBackground(new java.awt.Color(80, 77, 90));
        botaoConta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoConta.setForeground(new java.awt.Color(255, 255, 255));
        botaoConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoContaMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Conta");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bank-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoContaLayout = new javax.swing.GroupLayout(botaoConta);
        botaoConta.setLayout(botaoContaLayout);
        botaoContaLayout.setHorizontalGroup(
            botaoContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoContaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        botaoContaLayout.setVerticalGroup(
            botaoContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoContaLayout.createSequentialGroup()
                .addGroup(botaoContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botaoContaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(botaoContaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, -1));

        botaoPainelCompra.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelCompra.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelCompraMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Compra");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-buy-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelCompraLayout = new javax.swing.GroupLayout(botaoPainelCompra);
        botaoPainelCompra.setLayout(botaoPainelCompraLayout);
        botaoPainelCompraLayout.setHorizontalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelCompraLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        botaoPainelCompraLayout.setVerticalGroup(
            botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(botaoPainelCompraLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, -1));

        botaoPainelEndereco.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelEnderecoMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Endereço");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-address-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelEnderecoLayout = new javax.swing.GroupLayout(botaoPainelEndereco);
        botaoPainelEndereco.setLayout(botaoPainelEnderecoLayout);
        botaoPainelEnderecoLayout.setHorizontalGroup(
            botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelEnderecoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        botaoPainelEnderecoLayout.setVerticalGroup(
            botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(botaoPainelEnderecoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        botaoPainelCliente.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelClienteMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cliente");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-client-management-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelClienteLayout = new javax.swing.GroupLayout(botaoPainelCliente);
        botaoPainelCliente.setLayout(botaoPainelClienteLayout);
        botaoPainelClienteLayout.setHorizontalGroup(
            botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelClienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        botaoPainelClienteLayout.setVerticalGroup(
            botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoPainelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(botaoPainelClienteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 70));

        botaoInicio.setBackground(new java.awt.Color(80, 77, 90));
        botaoInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoInicio.setForeground(new java.awt.Color(255, 255, 255));
        botaoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoInicioMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Início");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icone.png"))); // NOI18N

        javax.swing.GroupLayout botaoInicioLayout = new javax.swing.GroupLayout(botaoInicio);
        botaoInicio.setLayout(botaoInicioLayout);
        botaoInicioLayout.setHorizontalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoInicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        botaoInicioLayout.setVerticalGroup(
            botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)))
                .addGap(21, 21, 21))
        );

        Navegation.add(botaoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        botaoPainelRelatorios.setBackground(new java.awt.Color(80, 77, 90));
        botaoPainelRelatorios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 42, 57), 1, true));
        botaoPainelRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        botaoPainelRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPainelRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPainelRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPainelRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoPainelRelatoriosMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Relatórios(Jasper)");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-arquivo-40.png"))); // NOI18N

        javax.swing.GroupLayout botaoPainelRelatoriosLayout = new javax.swing.GroupLayout(botaoPainelRelatorios);
        botaoPainelRelatorios.setLayout(botaoPainelRelatoriosLayout);
        botaoPainelRelatoriosLayout.setHorizontalGroup(
            botaoPainelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoPainelRelatoriosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        botaoPainelRelatoriosLayout.setVerticalGroup(
            botaoPainelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoPainelRelatoriosLayout.createSequentialGroup()
                .addGroup(botaoPainelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botaoPainelRelatoriosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(botaoPainelRelatoriosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel19)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Navegation.add(botaoPainelRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 240, -1));

        getContentPane().add(Navegation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 960));

        PainelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioTitle.setBackground(new java.awt.Color(80, 77, 90));
        InicioTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente1.setText("INÍCIO");
        InicioTitle.add(labelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelInicio.add(InicioTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logomarca.png"))); // NOI18N
        PainelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 640, 410));

        getContentPane().add(PainelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        PainelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CompraTitle.setBackground(new java.awt.Color(80, 77, 90));
        CompraTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente2.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente2.setText("COMPRA");
        CompraTitle.add(labelCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelCompra.add(CompraTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        botaoIncluirCompra.setBackground(new java.awt.Color(80, 77, 90));
        botaoIncluirCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoIncluirCompra.setForeground(new java.awt.Color(255, 255, 255));
        botaoIncluirCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluirCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirCompraMouseClicked(evt);
            }
        });
        botaoIncluirCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Adicionar ao Carrinho");
        botaoIncluirCompra.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 150, 50));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-o-carrinho-de-compras-filled-50.png"))); // NOI18N
        botaoIncluirCompra.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelCompra.add(botaoIncluirCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 240, 70));

        botaoMostrarCompra.setBackground(new java.awt.Color(80, 77, 90));
        botaoMostrarCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoMostrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        botaoMostrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMostrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMostrarCompraMouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Finalizar Pedido");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-finalizar-pedido-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout botaoMostrarCompraLayout = new javax.swing.GroupLayout(botaoMostrarCompra);
        botaoMostrarCompra.setLayout(botaoMostrarCompraLayout);
        botaoMostrarCompraLayout.setHorizontalGroup(
            botaoMostrarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMostrarCompraLayout.setVerticalGroup(
            botaoMostrarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMostrarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoMostrarCompraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel51)))
                .addGap(21, 21, 21))
        );

        PainelCompra.add(botaoMostrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 250, 70));

        getContentPane().add(PainelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        PainelProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProdTitle.setBackground(new java.awt.Color(80, 77, 90));
        ProdTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPag.setForeground(new java.awt.Color(255, 255, 255));
        labelPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPag.setText("PRODUTO");
        ProdTitle.add(labelPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelProduto.add(ProdTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        botaoIncluirProd.setBackground(new java.awt.Color(80, 77, 90));
        botaoIncluirProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoIncluirProd.setForeground(new java.awt.Color(255, 255, 255));
        botaoIncluirProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluirProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirProdMouseClicked(evt);
            }
        });
        botaoIncluirProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Incluir");
        botaoIncluirProd.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incluir.png"))); // NOI18N
        botaoIncluirProd.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelProduto.add(botaoIncluirProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 70));

        botaoAlterarProd.setBackground(new java.awt.Color(80, 77, 90));
        botaoAlterarProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoAlterarProd.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlterarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarProdMouseClicked(evt);
            }
        });
        botaoAlterarProd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Alterar");
        botaoAlterarProd.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar2.png"))); // NOI18N
        botaoAlterarProd.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelProduto.add(botaoAlterarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, 70));

        botaoRemoverProd.setBackground(new java.awt.Color(80, 77, 90));
        botaoRemoverProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoRemoverProd.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemoverProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverProdMouseClicked(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Remover");

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N

        javax.swing.GroupLayout botaoRemoverProdLayout = new javax.swing.GroupLayout(botaoRemoverProd);
        botaoRemoverProd.setLayout(botaoRemoverProdLayout);
        botaoRemoverProdLayout.setHorizontalGroup(
            botaoRemoverProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverProdLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoRemoverProdLayout.setVerticalGroup(
            botaoRemoverProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoRemoverProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoRemoverProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel73)))
                .addGap(21, 21, 21))
        );

        PainelProduto.add(botaoRemoverProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 70));

        botaoMostrarProd.setBackground(new java.awt.Color(80, 77, 90));
        botaoMostrarProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoMostrarProd.setForeground(new java.awt.Color(255, 255, 255));
        botaoMostrarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMostrarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMostrarProdMouseClicked(evt);
            }
        });

        jLabel74.setBackground(new java.awt.Color(80, 77, 90));
        jLabel74.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Mostrar");

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N

        javax.swing.GroupLayout botaoMostrarProdLayout = new javax.swing.GroupLayout(botaoMostrarProd);
        botaoMostrarProd.setLayout(botaoMostrarProdLayout);
        botaoMostrarProdLayout.setHorizontalGroup(
            botaoMostrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMostrarProdLayout.setVerticalGroup(
            botaoMostrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMostrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoMostrarProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel75)))
                .addGap(21, 21, 21))
        );

        PainelProduto.add(botaoMostrarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 70));

        getContentPane().add(PainelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        PainelEndereco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EndTitle.setBackground(new java.awt.Color(80, 77, 90));
        EndTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEnd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(255, 255, 255));
        labelEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnd.setText("ENDEREÇO");
        EndTitle.add(labelEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelEndereco.add(EndTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        botaoIncluirE.setBackground(new java.awt.Color(80, 77, 90));
        botaoIncluirE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoIncluirE.setForeground(new java.awt.Color(255, 255, 255));
        botaoIncluirE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluirE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirEMouseClicked(evt);
            }
        });
        botaoIncluirE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Incluir");
        botaoIncluirE.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incluir.png"))); // NOI18N
        botaoIncluirE.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelEndereco.add(botaoIncluirE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 70));

        botaoAlterarE.setBackground(new java.awt.Color(80, 77, 90));
        botaoAlterarE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoAlterarE.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlterarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarEMouseClicked(evt);
            }
        });
        botaoAlterarE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Alterar");
        botaoAlterarE.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar2.png"))); // NOI18N
        botaoAlterarE.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelEndereco.add(botaoAlterarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, 70));

        botaoRemoverE.setBackground(new java.awt.Color(80, 77, 90));
        botaoRemoverE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoRemoverE.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemoverE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverEMouseClicked(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(80, 77, 90));
        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Remover");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N

        javax.swing.GroupLayout botaoRemoverELayout = new javax.swing.GroupLayout(botaoRemoverE);
        botaoRemoverE.setLayout(botaoRemoverELayout);
        botaoRemoverELayout.setHorizontalGroup(
            botaoRemoverELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverELayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoRemoverELayout.setVerticalGroup(
            botaoRemoverELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoRemoverELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoRemoverELayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel41)))
                .addGap(21, 21, 21))
        );

        PainelEndereco.add(botaoRemoverE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 70));

        botaoMostrarE.setBackground(new java.awt.Color(80, 77, 90));
        botaoMostrarE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoMostrarE.setForeground(new java.awt.Color(255, 255, 255));
        botaoMostrarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMostrarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMostrarEMouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Mostrar");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N

        javax.swing.GroupLayout botaoMostrarELayout = new javax.swing.GroupLayout(botaoMostrarE);
        botaoMostrarE.setLayout(botaoMostrarELayout);
        botaoMostrarELayout.setHorizontalGroup(
            botaoMostrarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMostrarELayout.setVerticalGroup(
            botaoMostrarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMostrarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoMostrarELayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel43)))
                .addGap(21, 21, 21))
        );

        PainelEndereco.add(botaoMostrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 70));

        getContentPane().add(PainelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        PainelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClienteTitle.setBackground(new java.awt.Color(80, 77, 90));
        ClienteTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("CLIENTE");
        ClienteTitle.add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 11, 137, 38));

        PainelCliente.add(ClienteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        botaoIncluirCli.setBackground(new java.awt.Color(80, 77, 90));
        botaoIncluirCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoIncluirCli.setForeground(new java.awt.Color(255, 255, 255));
        botaoIncluirCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluirCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirCliMouseClicked(evt);
            }
        });
        botaoIncluirCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Incluir");
        botaoIncluirCli.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incluir.png"))); // NOI18N
        botaoIncluirCli.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelCliente.add(botaoIncluirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 70));

        botaoAlterarCli.setBackground(new java.awt.Color(80, 77, 90));
        botaoAlterarCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoAlterarCli.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlterarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarCliMouseClicked(evt);
            }
        });
        botaoAlterarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Alterar");
        botaoAlterarCli.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 12, 48, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar2.png"))); // NOI18N
        botaoAlterarCli.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        PainelCliente.add(botaoAlterarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, 70));

        botaoRemoverCli.setBackground(new java.awt.Color(80, 77, 90));
        botaoRemoverCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoRemoverCli.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemoverCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverCliMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Remover");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N

        javax.swing.GroupLayout botaoRemoverCliLayout = new javax.swing.GroupLayout(botaoRemoverCli);
        botaoRemoverCli.setLayout(botaoRemoverCliLayout);
        botaoRemoverCliLayout.setHorizontalGroup(
            botaoRemoverCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverCliLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoRemoverCliLayout.setVerticalGroup(
            botaoRemoverCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoRemoverCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoRemoverCliLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel33)))
                .addGap(21, 21, 21))
        );

        PainelCliente.add(botaoRemoverCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 70));

        botaoMostrarCli.setBackground(new java.awt.Color(80, 77, 90));
        botaoMostrarCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 16, 63), 1, true));
        botaoMostrarCli.setForeground(new java.awt.Color(255, 255, 255));
        botaoMostrarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMostrarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMostrarCliMouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Mostrar");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N

        javax.swing.GroupLayout botaoMostrarCliLayout = new javax.swing.GroupLayout(botaoMostrarCli);
        botaoMostrarCli.setLayout(botaoMostrarCliLayout);
        botaoMostrarCliLayout.setHorizontalGroup(
            botaoMostrarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        botaoMostrarCliLayout.setVerticalGroup(
            botaoMostrarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMostrarCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMostrarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, botaoMostrarCliLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addGap(21, 21, 21))
        );

        PainelCliente.add(botaoMostrarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 70));

        getContentPane().add(PainelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        PainelRelatoriosJasper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioTitle1.setBackground(new java.awt.Color(80, 77, 90));
        InicioTitle1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCliente3.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente3.setText("RELATÓRIOS (JASPERSOFT)");
        InicioTitle1.add(labelCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 270, 38));

        PainelRelatoriosJasper.add(InicioTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 80));

        btn_Gerar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Gerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-crie-um-novo-40.png"))); // NOI18N
        btn_Gerar.setMnemonic('c');
        btn_Gerar.setText("Gerar");
        btn_Gerar.setToolTipText("Salva os registros");
        btn_Gerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Gerar.setFocusPainted(false);
        btn_Gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GerarActionPerformed(evt);
            }
        });
        PainelRelatoriosJasper.add(btn_Gerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, 70));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente (Pessoa Física)", "Cliente (Pessoa Jurídica)", "Compra", "Conta", "Endereco", "Fatura", "Pagamento", "Produto" }));
        PainelRelatoriosJasper.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 360, 40));

        getContentPane().add(PainelRelatoriosJasper, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 800, 530));

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/liquor-store-back.jpg"))); // NOI18N
        fundo.setLabelFor(fundo);
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPainelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseEntered

        botaoPainelLogOut.setBackground(new Color(125, 116, 134));

    }//GEN-LAST:event_botaoPainelLogOutMouseEntered

    private void botaoPainelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseExited

        botaoPainelLogOut.setBackground(new Color(80, 77, 90));

    }//GEN-LAST:event_botaoPainelLogOutMouseExited

    private void botaoPainelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelLogOutMouseClicked
        Login lg = new Login();
        lg.setSize(640, 516);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoPainelLogOutMouseClicked

    private void botaoPainelProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseClicked
        refazCor();
        botaoPainelProduto.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b7 = 1;
        PainelProduto.setVisible(true);
    }//GEN-LAST:event_botaoPainelProdutoMouseClicked

    private void botaoPainelProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseEntered
        if (b7 != 1) {
            botaoPainelProduto.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoPainelProdutoMouseEntered

    private void botaoPainelProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelProdutoMouseExited
        if (b7 != 1) {
            botaoPainelProduto.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoPainelProdutoMouseExited

    private void botaoContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContaMouseClicked
        refazCor();
        botaoConta.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b6 = 1;

        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioClienteConta tela = new RelatorioClienteConta(this, true, clientes);
        overlay.setVisible(true);
        tela.setVisible(true);
        overlay.setVisible(false);
        refazCor();
        botaoInicio.setBackground(new Color(30, 28, 46));
        zeraCount();
        PainelInicio.setVisible(true);


    }//GEN-LAST:event_botaoContaMouseClicked

    private void botaoContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContaMouseEntered
        if (b6 != 1) {
            botaoConta.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoContaMouseEntered

    private void botaoContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContaMouseExited
        if (b6 != 1) {
            botaoConta.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoContaMouseExited

    private void botaoPainelCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseClicked
        refazCor();
        botaoPainelCompra.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b4 = 1;
        PainelCompra.setVisible(true);
    }//GEN-LAST:event_botaoPainelCompraMouseClicked

    private void botaoPainelCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseEntered
        if (b4 != 1) {
            botaoPainelCompra.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoPainelCompraMouseEntered

    private void botaoPainelCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelCompraMouseExited
        if (b4 != 1) {
            botaoPainelCompra.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoPainelCompraMouseExited

    private void botaoPainelEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseClicked
        refazCor();
        botaoPainelEndereco.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b3 = 1;
        PainelEndereco.setVisible(true);
    }//GEN-LAST:event_botaoPainelEnderecoMouseClicked

    private void botaoPainelEnderecoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseEntered
        if (b3 != 1) {
            botaoPainelEndereco.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoPainelEnderecoMouseEntered

    private void botaoPainelEnderecoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelEnderecoMouseExited
        if (b3 != 1) {
            botaoPainelEndereco.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoPainelEnderecoMouseExited

    private void botaoPainelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseClicked

        refazCor();
        botaoPainelCliente.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b2 = 1;
        PainelCliente.setVisible(true);
    }//GEN-LAST:event_botaoPainelClienteMouseClicked

    private void botaoPainelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseEntered
        if (b2 != 1) {
            botaoPainelCliente.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoPainelClienteMouseEntered

    private void botaoPainelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelClienteMouseExited
        if (b2 != 1) {
            botaoPainelCliente.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoPainelClienteMouseExited

    private void botaoInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseExited
        if (b1 != 1) {
            botaoInicio.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoInicioMouseExited

    private void botaoInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseEntered
        if (b1 != 1) {
            botaoInicio.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoInicioMouseEntered

    private void botaoInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseClicked

        refazCor();
        botaoInicio.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b1 = 1;

        PainelInicio.setVisible(true);
    }//GEN-LAST:event_botaoInicioMouseClicked

    private void botaoMostrarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMostrarCliMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioCliente pesquisa = new RelatorioCliente(this, true, 1, clientes);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_botaoMostrarCliMouseClicked

    private void botaoRemoverCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverCliMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioCliente pesquisa = new RelatorioCliente(this, true, 3, clientes);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_botaoRemoverCliMouseClicked

    private void botaoIncluirCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirCliMouseClicked
        AdicionarCliente dialog = new AdicionarCliente(new javax.swing.JDialog(), true);
        overlay.setVisible(true);
        dialog.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoIncluirCliMouseClicked

    private void botaoAlterarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarCliMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioCliente pesquisa = new RelatorioCliente(this, true, 2, clientes);
        pesquisa.setVisible(true);


    }//GEN-LAST:event_botaoAlterarCliMouseClicked

    private void botaoIncluirEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirEMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioClienteEndereco pesquisar = new RelatorioClienteEndereco(this, true, 1, clientes);
        overlay.setVisible(true);
        pesquisar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoIncluirEMouseClicked

    private void botaoAlterarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarEMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioClienteEndereco pesquisar = new RelatorioClienteEndereco(this, true, 2, clientes);
        overlay.setVisible(true);
        pesquisar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoAlterarEMouseClicked

    private void botaoRemoverEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverEMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioClienteEndereco pesquisar = new RelatorioClienteEndereco(this, true, 4, clientes);
        overlay.setVisible(true);
        pesquisar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoRemoverEMouseClicked

    private void botaoMostrarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMostrarEMouseClicked
        ArrayList<Cliente> clientes = pdao.buscarCliente();
        RelatorioClienteEndereco pesquisar = new RelatorioClienteEndereco(this, true, 3, clientes);
        overlay.setVisible(true);
        pesquisar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoMostrarEMouseClicked

    private void botaoIncluirCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirCompraMouseClicked
        AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho(this, true, proDAO.relatorioProduto(), carrinho);
        overlay.setVisible(true);
        adicionar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoIncluirCompraMouseClicked

    private void botaoMostrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMostrarCompraMouseClicked
        FecharCarrinho fechar = new FecharCarrinho(this, true, carrinho);
        overlay.setVisible(true);
        fechar.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoMostrarCompraMouseClicked

    private void botaoIncluirProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirProdMouseClicked
        CadastroProduto dialog = new CadastroProduto(this, true, gp);
        overlay.setVisible(true);
        dialog.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoIncluirProdMouseClicked

    private void botaoAlterarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarProdMouseClicked
        RelatorioProduto relatorio = new RelatorioProduto(this, true, proDAO.relatorioProduto(), 2);
        overlay.setVisible(true);
        relatorio.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoAlterarProdMouseClicked

    private void botaoRemoverProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverProdMouseClicked
        RelatorioProduto relatorio = new RelatorioProduto(this, true, proDAO.relatorioProduto(), 4);
        overlay.setVisible(true);
        relatorio.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoRemoverProdMouseClicked

    private void botaoMostrarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMostrarProdMouseClicked
        RelatorioProduto relatorio = new RelatorioProduto(this, true, proDAO.relatorioProduto(), 3);
        overlay.setVisible(true);
        relatorio.setVisible(true);
        overlay.setVisible(false);
    }//GEN-LAST:event_botaoMostrarProdMouseClicked

    private void botaoPainelRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelRelatoriosMouseClicked

        refazCor();
        botaoPainelRelatorios.setBackground(new Color(30, 28, 46));
        resetaMenu();
        zeraCount();
        b8 = 1;

        RelatorioClientesJasper relatorio = new RelatorioClientesJasper(new javax.swing.JDialog(), true);
        overlay.setVisible(true);
        relatorio.setVisible(true);
        overlay.setVisible(false);
        refazCor();
        botaoInicio.setBackground(new Color(30, 28, 46));
        zeraCount();
        PainelInicio.setVisible(true);


    }//GEN-LAST:event_botaoPainelRelatoriosMouseClicked

    private void botaoPainelRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelRelatoriosMouseEntered
        if (b8 != 1) {
            botaoPainelRelatorios.setBackground(new Color(125, 116, 134));
        }
    }//GEN-LAST:event_botaoPainelRelatoriosMouseEntered

    private void botaoPainelRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPainelRelatoriosMouseExited
        if (b8 != 1) {
            botaoPainelRelatorios.setBackground(new Color(80, 77, 90));
        }
    }//GEN-LAST:event_botaoPainelRelatoriosMouseExited

    private void btn_GerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GerarActionPerformed

    }//GEN-LAST:event_btn_GerarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    public void resetaMenu() {
        PainelCliente.setVisible(false);
        PainelEndereco.setVisible(false);
        PainelCompra.setVisible(false);
        PainelProduto.setVisible(false);
        PainelRelatoriosJasper.setVisible(false);
        PainelInicio.setVisible(false);
        comboBox.setVisible(false);
        btn_Gerar.setVisible(false);
    }

    public void refazCor() {
        botaoInicio.setBackground(new Color(80, 77, 90));
        botaoPainelCliente.setBackground(new Color(80, 77, 90));
        botaoPainelEndereco.setBackground(new Color(80, 77, 90));
        botaoPainelCompra.setBackground(new Color(80, 77, 90));
        botaoConta.setBackground(new Color(80, 77, 90));
        botaoPainelProduto.setBackground(new Color(80, 77, 90));
        botaoPainelRelatorios.setBackground(new Color(80, 77, 90));
    }

    public void zeraCount() {
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
    }

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteTitle;
    private javax.swing.JPanel CompraTitle;
    private javax.swing.JPanel EndTitle;
    private javax.swing.JPanel InicioTitle;
    private javax.swing.JPanel InicioTitle1;
    private javax.swing.JPanel Navegation;
    private javax.swing.JPanel PainelCliente;
    private javax.swing.JPanel PainelCompra;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JPanel PainelInicio;
    private javax.swing.JPanel PainelProduto;
    private javax.swing.JPanel PainelRelatoriosJasper;
    private javax.swing.JPanel ProdTitle;
    private javax.swing.JPanel botaoAlterarCli;
    private javax.swing.JPanel botaoAlterarE;
    private javax.swing.JPanel botaoAlterarProd;
    private javax.swing.JPanel botaoConta;
    private javax.swing.JPanel botaoIncluirCli;
    private javax.swing.JPanel botaoIncluirCompra;
    private javax.swing.JPanel botaoIncluirE;
    private javax.swing.JPanel botaoIncluirProd;
    private javax.swing.JPanel botaoInicio;
    private javax.swing.JPanel botaoMostrarCli;
    private javax.swing.JPanel botaoMostrarCompra;
    private javax.swing.JPanel botaoMostrarE;
    private javax.swing.JPanel botaoMostrarProd;
    private javax.swing.JPanel botaoPainelCliente;
    private javax.swing.JPanel botaoPainelCompra;
    private javax.swing.JPanel botaoPainelEndereco;
    private javax.swing.JPanel botaoPainelLogOut;
    private javax.swing.JPanel botaoPainelProduto;
    private javax.swing.JPanel botaoPainelRelatorios;
    private javax.swing.JPanel botaoRemoverCli;
    private javax.swing.JPanel botaoRemoverE;
    private javax.swing.JPanel botaoRemoverProd;
    private javax.swing.JButton btn_Gerar;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCliente1;
    private javax.swing.JLabel labelCliente2;
    private javax.swing.JLabel labelCliente3;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelPag;
    private javax.swing.JPanel overlay;
    // End of variables declaration//GEN-END:variables
}
