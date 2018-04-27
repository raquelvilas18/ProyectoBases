/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cliente;

import AppPackage.AnimationClass;
import aplicacion.Paquete;
import aplicacion.Usuario;
import aplicacion.Pedido;

/**
 *
 * @author raquel
 */
public class VPedido extends javax.swing.JPanel {

    private aplicacion.FachadaAplicacion fa;
    private Usuario u;
    private Pedido pd;
    private int numPaquetes;

    /**
     * Creates new form VPedido
     *
     * @param fa
     */
    public VPedido(aplicacion.FachadaAplicacion fa, Usuario u) {
        initComponents();
        this.fa = fa;
        this.u = u;
        Error.setVisible(false);
        Correcto.setVisible(false);
        PanelPaquete.setVisible(false);
        this.LabelAnadirError.setVisible(false);
        this.LabelAñadirCorrecto.setVisible(false);
        this.SinPaquetesLabel.setVisible(false);
        numPaquetes = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPaquete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TxAncho = new javax.swing.JTextField();
        TxPeso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxAlto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxLargo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        BtFinalizarPedido = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel18 = new javax.swing.JLabel();
        BtAñadir = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        LabelAñadirCorrecto = new java.awt.Label();
        LabelAnadirError = new java.awt.Label();
        SinPaquetesLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Express = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txdestino = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TxOrigen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        Correcto = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxTlf = new javax.swing.JTextField();
        TxNombre = new javax.swing.JTextField();
        TxApellidos = new javax.swing.JTextField();
        TxDni = new javax.swing.JTextField();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(680, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPaquete.setBackground(new java.awt.Color(255, 255, 255));
        PanelPaquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 61, 1));
        jLabel4.setText("Paquetes");
        PanelPaquete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, -1));

        jPanel6.setBackground(new java.awt.Color(225, 181, 158));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        PanelPaquete.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 10));

        jLabel14.setBackground(new java.awt.Color(65, 105, 225));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(65, 105, 225));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel14.setText("Ancho");
        PanelPaquete.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        TxAncho.setBackground(new java.awt.Color(165, 180, 253));
        TxAncho.setForeground(new java.awt.Color(0, 0, 0));
        TxAncho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxAncho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        TxAncho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxAnchoMouseClicked(evt);
            }
        });
        TxAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAnchoActionPerformed(evt);
            }
        });
        PanelPaquete.add(TxAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 470, 30));

        TxPeso.setBackground(new java.awt.Color(165, 180, 253));
        TxPeso.setForeground(new java.awt.Color(0, 0, 0));
        TxPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        TxPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxPesoMouseClicked(evt);
            }
        });
        TxPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPesoActionPerformed(evt);
            }
        });
        PanelPaquete.add(TxPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 470, 30));

        jLabel15.setBackground(new java.awt.Color(65, 105, 225));
        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(65, 105, 225));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel15.setText("Peso:");
        PanelPaquete.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        TxAlto.setBackground(new java.awt.Color(165, 180, 253));
        TxAlto.setForeground(new java.awt.Color(0, 0, 0));
        TxAlto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxAlto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        TxAlto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxAltoMouseClicked(evt);
            }
        });
        TxAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAltoActionPerformed(evt);
            }
        });
        PanelPaquete.add(TxAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 470, 30));

        jLabel16.setBackground(new java.awt.Color(65, 105, 225));
        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(65, 105, 225));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel16.setText("Alto:");
        PanelPaquete.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        TxLargo.setBackground(new java.awt.Color(165, 180, 253));
        TxLargo.setForeground(new java.awt.Color(0, 0, 0));
        TxLargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxLargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        TxLargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxLargoMouseClicked(evt);
            }
        });
        TxLargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxLargoActionPerformed(evt);
            }
        });
        PanelPaquete.add(TxLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 470, 30));

        jLabel17.setBackground(new java.awt.Color(65, 105, 225));
        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(65, 105, 225));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel17.setText("Largo");
        PanelPaquete.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        BtFinalizarPedido.setBackground(new java.awt.Color(65, 105, 255));
        BtFinalizarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtFinalizarPedidoMouseClicked(evt);
            }
        });

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("Finalizar Pedido");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-mover-por-carretilla-30_1.png"))); // NOI18N
        jLabel18.setText("jLabel1");

        javax.swing.GroupLayout BtFinalizarPedidoLayout = new javax.swing.GroupLayout(BtFinalizarPedido);
        BtFinalizarPedido.setLayout(BtFinalizarPedidoLayout);
        BtFinalizarPedidoLayout.setHorizontalGroup(
            BtFinalizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtFinalizarPedidoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        BtFinalizarPedidoLayout.setVerticalGroup(
            BtFinalizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtFinalizarPedidoLayout.createSequentialGroup()
                .addGroup(BtFinalizarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtFinalizarPedidoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BtFinalizarPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPaquete.add(BtFinalizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 280, 60));

        BtAñadir.setBackground(new java.awt.Color(65, 105, 255));
        BtAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtAñadirMouseClicked(evt);
            }
        });

        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 204));
        label2.setText("Añadir otro paquete");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-añadir-entrada-30.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        javax.swing.GroupLayout BtAñadirLayout = new javax.swing.GroupLayout(BtAñadir);
        BtAñadir.setLayout(BtAñadirLayout);
        BtAñadirLayout.setHorizontalGroup(
            BtAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtAñadirLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        BtAñadirLayout.setVerticalGroup(
            BtAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtAñadirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtAñadirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelPaquete.add(BtAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 60));

        LabelAñadirCorrecto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelAñadirCorrecto.setForeground(new java.awt.Color(0, 153, 0));
        LabelAñadirCorrecto.setText("Paquete añadido correctamente");
        PanelPaquete.add(LabelAñadirCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 20));

        LabelAnadirError.setForeground(new java.awt.Color(153, 0, 0));
        LabelAnadirError.setText("Rellena todos los campos");
        PanelPaquete.add(LabelAnadirError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        SinPaquetesLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SinPaquetesLabel.setForeground(new java.awt.Color(204, 51, 0));
        SinPaquetesLabel.setText("No puedes finalizar el pedido sin paquetes");
        PanelPaquete.add(SinPaquetesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 102, 0));
        jLabel20.setText("Cancelar pedido");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        PanelPaquete.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(204, 102, 0));
        PanelPaquete.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 120, 10));

        add(PanelPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 620, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

        jLabel3.setBackground(new java.awt.Color(65, 105, 225));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 105, 225));
        jLabel3.setText("Destinatario");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 550));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 10, 550));

        Express.setBackground(new java.awt.Color(65, 105, 225));
        Express.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Express.setForeground(new java.awt.Color(65, 105, 225));
        Express.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        Express.setText("Express:");
        add(Express, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel7.setBackground(new java.awt.Color(65, 105, 225));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(65, 105, 225));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel7.setText("Origen:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        Txdestino.setBackground(new java.awt.Color(165, 180, 253));
        Txdestino.setForeground(new java.awt.Color(0, 0, 0));
        Txdestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txdestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Txdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxdestinoActionPerformed(evt);
            }
        });
        add(Txdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 470, 30));

        jPanel3.setBackground(new java.awt.Color(65, 105, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-comprobado-24.png"))); // NOI18N
        jLabel11.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(215, 215, 215));
        jLabel12.setText("Siguiente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 61, 1));
        jLabel2.setText("Realizar un nuevo pedido");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 260, -1));

        jPanel4.setBackground(new java.awt.Color(225, 181, 158));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 600, 10));

        TxOrigen.setBackground(new java.awt.Color(165, 180, 253));
        TxOrigen.setForeground(new java.awt.Color(0, 0, 0));
        TxOrigen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxOrigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        TxOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxOrigenMouseClicked(evt);
            }
        });
        TxOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxOrigenActionPerformed(evt);
            }
        });
        add(TxOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 470, 30));

        jLabel13.setBackground(new java.awt.Color(65, 105, 225));
        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(65, 105, 225));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel13.setText("Destino:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 210, 20, -1));

        Correcto.setForeground(new java.awt.Color(0, 204, 102));
        Correcto.setText("Pedido realizado correctamente");
        add(Correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        Error.setForeground(new java.awt.Color(255, 51, 51));
        Error.setText("Todos los campos son obligatorios");
        add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(65, 105, 225));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 105, 225));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel6.setText("telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel8.setBackground(new java.awt.Color(65, 105, 225));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(65, 105, 225));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel9.setBackground(new java.awt.Color(65, 105, 225));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(65, 105, 225));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel9.setText("Apellidos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel10.setBackground(new java.awt.Color(65, 105, 225));
        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(65, 105, 225));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel10.setText("DNI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        TxTlf.setBackground(new java.awt.Color(165, 180, 253));
        TxTlf.setForeground(new java.awt.Color(0, 0, 0));
        TxTlf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxTlf.setBorder(null);
        jPanel1.add(TxTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 470, 30));

        TxNombre.setBackground(new java.awt.Color(165, 180, 253));
        TxNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxNombre.setBorder(null);
        jPanel1.add(TxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 470, 30));

        TxApellidos.setBackground(new java.awt.Color(165, 180, 253));
        TxApellidos.setForeground(new java.awt.Color(0, 0, 0));
        TxApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxApellidos.setBorder(null);
        jPanel1.add(TxApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 470, 30));

        TxDni.setBackground(new java.awt.Color(165, 180, 253));
        TxDni.setForeground(new java.awt.Color(0, 0, 0));
        TxDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxDni.setBorder(null);
        jPanel1.add(TxDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 470, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 600, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //public Pedido(String fecha,String cliente,Integer codigo,boolean express,String direccion,String destinatario,String tramitador)
        if (TxApellidos.getText().equals("") || TxNombre.getText().equals("") || TxOrigen.getText().equals("") || Txdestino.getText().equals("") || TxDni.getText().equals("") || TxTlf.getText().equals("")) {
            Error.setVisible(true);
            Correcto.setVisible(false);
        } else {
            pd = fa.nuevoPedido(new Pedido(u.getUsuario(), jRadioButton1.isSelected(), Txdestino.getText(), TxNombre.getText()));
            PanelPaquete.setVisible(true);
            label2.setVisible(true);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void TxOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxOrigenActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void TxdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxdestinoActionPerformed

    private void TxOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxOrigenMouseClicked
        Correcto.setVisible(false);
    }//GEN-LAST:event_TxOrigenMouseClicked

    private void TxAnchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxAnchoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAnchoMouseClicked

    private void TxAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAnchoActionPerformed

    private void TxPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxPesoMouseClicked
        // TODO add your handling code here:
        LabelAñadirCorrecto.setVisible(false);
    }//GEN-LAST:event_TxPesoMouseClicked

    private void TxPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPesoActionPerformed

    private void TxAltoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxAltoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAltoMouseClicked

    private void TxAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAltoActionPerformed

    private void TxLargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxLargoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxLargoMouseClicked

    private void TxLargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxLargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxLargoActionPerformed

    private void BtAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAñadirMouseClicked
        // TODO add your handling code here:
        if (TxPeso.getText().equals("") || TxAlto.getText().equals("") || TxAncho.getText().equals("") || TxPeso.getText().equals("")) {
            this.LabelAnadirError.setVisible(true);
            this.LabelAñadirCorrecto.setVisible(false);

        } else {
            fa.nuevoPaquete(new Paquete(null, pd.getCodigo(), Float.parseFloat(TxPeso.getText()), Float.parseFloat(TxAlto.getText()), Float.parseFloat(TxAncho.getText()), Float.parseFloat(TxLargo.getText()), null, null, u.getUsuario()));
            vaciarTxtPaquetes();
            this.LabelAnadirError.setVisible(false);
            this.LabelAñadirCorrecto.setVisible(true);
            numPaquetes++;
        }
    }//GEN-LAST:event_BtAñadirMouseClicked

    private void BtFinalizarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtFinalizarPedidoMouseClicked
        // TODO add your handling code here:
        if (!TxPeso.getText().equals("") && !TxAlto.getText().equals("") && !TxAncho.getText().equals("") && !TxPeso.getText().equals("")) {
            fa.nuevoPaquete(new Paquete(null, pd.getCodigo(), Float.parseFloat(TxPeso.getText()), Float.parseFloat(TxAlto.getText()), Float.parseFloat(TxAncho.getText()), Float.parseFloat(TxLargo.getText()), null, null, u.getUsuario()));
            vaciarTxtPaquetes();
            this.LabelAnadirError.setVisible(false);
            this.LabelAñadirCorrecto.setVisible(true);
        }
        if (numPaquetes > 0) {
            vaciarTxtPaquetes();
            PanelPaquete.setVisible(false);
            Correcto.setVisible(true);
            Error.setVisible(false);
            TxApellidos.setText("");
            TxNombre.setText("");
            TxOrigen.setText("");
            Txdestino.setText("");
            TxDni.setText("");
            TxTlf.setText("");
            numPaquetes = 0;
        } else {
            this.SinPaquetesLabel.setVisible(true);
            this.LabelAnadirError.setVisible(false);
            this.LabelAñadirCorrecto.setVisible(false);
        }


    }//GEN-LAST:event_BtFinalizarPedidoMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        fa.eliminarPedido(pd.getCodigo());
        vaciarTxtPaquetes();
        PanelPaquete.setVisible(false);
        Correcto.setVisible(false);
        Error.setVisible(false);
        TxApellidos.setText("");
        TxNombre.setText("");
        TxOrigen.setText("");
        Txdestino.setText("");
        TxDni.setText("");
        TxTlf.setText("");
        numPaquetes = 0;
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtAñadir;
    private javax.swing.JPanel BtFinalizarPedido;
    private javax.swing.JLabel Correcto;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel Express;
    private java.awt.Label LabelAnadirError;
    private java.awt.Label LabelAñadirCorrecto;
    public javax.swing.JPanel PanelPaquete;
    private javax.swing.JLabel SinPaquetesLabel;
    private javax.swing.JTextField TxAlto;
    private javax.swing.JTextField TxAncho;
    private javax.swing.JTextField TxApellidos;
    private javax.swing.JTextField TxDni;
    private javax.swing.JTextField TxLargo;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JTextField TxOrigen;
    private javax.swing.JTextField TxPeso;
    private javax.swing.JTextField TxTlf;
    private javax.swing.JTextField Txdestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables

    public void vaciarTxtPaquetes() {
        TxPeso.setText("");
        TxAlto.setText("");
        TxAncho.setText("");
        TxLargo.setText("");
    }

}
