/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

import aplicacion.Usuario;
import gui.ModeloTablaClientes;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alumnogreibd
 */
public class VGestionClientes extends javax.swing.JPanel {

    aplicacion.FachadaAplicacion fa;
    private boolean nuevo;

    /**
     * Creates new form VGestionUsuarios
     */
    public VGestionClientes(aplicacion.FachadaAplicacion fa) {
        initComponents();
        this.fa = fa;

        ModeloTablaClientes tp = new ModeloTablaClientes();
        initComponents();
        tablaUsr.setModel(tp);
        tp.setFilas(fa.obtenerClientes(this.FiltroId.getText(), this.FiltroNombre.getText()));
        tablaUsr.changeSelection(0, 0, false, false);
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        BtAlta.setVisible(true);
        ErrorAlta1.setVisible(false);
        ErrorID.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);
        ContrasenaL.setVisible(false);
        TxContrasena.setVisible(false);
        EliminarError.setVisible(false);
        ModeloTablaClientes m = (ModeloTablaClientes) tablaUsr.getModel();
        if (m.getRowCount() > 0) {
            this.TxId.setText(m.getFila(tablaUsr.getSelectedRow()).getUsuario());
            this.TxNombre.setText(m.getFila(tablaUsr.getSelectedRow()).getNombre());
            this.TxCorreo.setText(m.getFila(tablaUsr.getSelectedRow()).getCorreo());
            this.TxDireccion.setText(m.getFila(tablaUsr.getSelectedRow()).getDireccion());
            this.TxTelefono.setText(m.getFila(tablaUsr.getSelectedRow()).getTelefono());
            this.TxDni.setText(m.getFila(tablaUsr.getSelectedRow()).getDni());
            this.TxSexo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getSexo());
            this.TxTipo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getTipo());

        }

        JTableHeader th;
        th = this.tablaUsr.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(255, 148, 42));
        th.setBackground(Color.WHITE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        FiltroNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FiltroId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BtActualizar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtBaja = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ContrasenaL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxNombre = new javax.swing.JTextField();
        TxDireccion = new javax.swing.JTextField();
        TxId = new javax.swing.JTextField();
        TxCorreo = new javax.swing.JTextField();
        TxTelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TxSexo = new javax.swing.JComboBox();
        TxDni = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ErrorID = new javax.swing.JLabel();
        BtAlta = new javax.swing.JPanel();
        LConfirmar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LAlta = new javax.swing.JLabel();
        LabelActualizar = new javax.swing.JLabel();
        TxContrasena = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AltaCorrecta = new javax.swing.JLabel();
        ErrorAlta1 = new javax.swing.JLabel();
        TxTipo = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        EliminarError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsr = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 550));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 10, 580));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 159));
        jLabel2.setText("Gestion Clientes");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 260, -1));

        jPanel6.setBackground(new java.awt.Color(116, 126, 173));

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

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 600, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-google-web-search-filled-50.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, 10));

        FiltroNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FiltroNombre.setBorder(null);
        FiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroNombreActionPerformed(evt);
            }
        });
        add(FiltroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 150, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 133, 74));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derechaNaranja.png"))); // NOI18N
        jLabel5.setText("Nombre:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        FiltroId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FiltroId.setBorder(null);
        FiltroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroIdActionPerformed(evt);
            }
        });
        add(FiltroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 133, 74));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derechaNaranja.png"))); // NOI18N
        jLabel4.setText("Id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 226, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtActualizar.setBackground(new java.awt.Color(255, 148, 42));
        BtActualizar.setToolTipText("");
        BtActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtActualizarMouseClicked(evt);
            }
        });
        BtActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(215, 215, 215));
        jLabel14.setText("Actualizar");
        BtActualizar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        BtActualizar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jPanel1.add(BtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 41));

        BtBaja.setBackground(new java.awt.Color(255, 148, 42));
        BtBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtBajaMouseClicked(evt);
            }
        });
        BtBaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(215, 215, 215));
        jLabel17.setText("Dar baja");
        BtBaja.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-26.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        BtBaja.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jPanel1.add(BtBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 200, 41));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        ContrasenaL.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ContrasenaL.setText("Password:");
        jPanel1.add(ContrasenaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Id:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Email:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setText("Tipo:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        TxNombre.setBackground(new java.awt.Color(255, 232, 185));
        TxNombre.setForeground(new java.awt.Color(102, 102, 102));
        TxNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, -1));

        TxDireccion.setBackground(new java.awt.Color(255, 232, 185));
        TxDireccion.setForeground(new java.awt.Color(102, 102, 102));
        TxDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 220, -1));

        TxId.setBackground(new java.awt.Color(255, 232, 185));
        TxId.setForeground(new java.awt.Color(102, 102, 102));
        TxId.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });
        jPanel1.add(TxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, -1));

        TxCorreo.setBackground(new java.awt.Color(255, 232, 185));
        TxCorreo.setForeground(new java.awt.Color(102, 102, 102));
        TxCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(TxCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        TxTelefono.setBackground(new java.awt.Color(255, 232, 185));
        TxTelefono.setForeground(new java.awt.Color(102, 102, 102));
        TxTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(TxTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setText("Sexo:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        TxSexo.setBackground(new java.awt.Color(255, 232, 185));
        TxSexo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "H" }));
        jPanel1.add(TxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        TxDni.setBackground(new java.awt.Color(255, 232, 185));
        TxDni.setForeground(new java.awt.Color(102, 102, 102));
        TxDni.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDniActionPerformed(evt);
            }
        });
        jPanel1.add(TxDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setText("DNI:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        ErrorID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("ID ya existente o vacío");
        jPanel1.add(ErrorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        BtAlta.setBackground(new java.awt.Color(255, 148, 42));
        BtAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtAltaMouseClicked(evt);
            }
        });
        BtAlta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LConfirmar.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        LConfirmar.setForeground(new java.awt.Color(215, 215, 215));
        LConfirmar.setText("Confirmar Alta");
        BtAlta.add(LConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-añadir-32.png"))); // NOI18N
        jLabel18.setText("jLabel1");
        BtAlta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        LAlta.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        LAlta.setForeground(new java.awt.Color(215, 215, 215));
        LAlta.setText("Dar alta");
        BtAlta.add(LAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jPanel1.add(BtAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 190, 41));

        LabelActualizar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelActualizar.setForeground(new java.awt.Color(0, 153, 0));
        LabelActualizar.setText("Datos actualizados");
        jPanel1.add(LabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        TxContrasena.setBackground(new java.awt.Color(255, 232, 185));
        TxContrasena.setForeground(new java.awt.Color(102, 102, 102));
        TxContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(TxContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 220, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        AltaCorrecta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AltaCorrecta.setForeground(new java.awt.Color(0, 153, 0));
        AltaCorrecta.setText("Usuario registrado correctamente");
        jPanel1.add(AltaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 40));

        ErrorAlta1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorAlta1.setForeground(new java.awt.Color(255, 51, 51));
        ErrorAlta1.setText("Todos los campos son obligatorios");
        jPanel1.add(ErrorAlta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        TxTipo.setBackground(new java.awt.Color(255, 232, 185));
        TxTipo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrador", "oficinista", "transportista", "cliente" }));
        TxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(TxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setText("Telefono:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        EliminarError.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EliminarError.setForeground(new java.awt.Color(153, 0, 0));
        EliminarError.setText("No puedes eliminar clientes con pedidos activos");
        jPanel1.add(EliminarError, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 600, 200));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaUsr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaUsr.setModel(new gui.ModeloTablaClientes());
        tablaUsr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUsr.setGridColor(new java.awt.Color(255, 189, 72));
        tablaUsr.setSelectionBackground(new java.awt.Color(255, 189, 72));
        tablaUsr.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaUsr.setShowHorizontalLines(false);
        tablaUsr.setShowVerticalLines(false);
        tablaUsr.setSurrendersFocusOnKeystroke(true);
        tablaUsr.getTableHeader().setResizingAllowed(false);
        tablaUsr.getTableHeader().setReorderingAllowed(false);
        tablaUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsr);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 600, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        ModeloTablaClientes tp = new ModeloTablaClientes();
        tablaUsr.setModel(tp);
        tp.setFilas(fa.obtenerClientes(this.FiltroId.getText(), this.FiltroNombre.getText()));

    }//GEN-LAST:event_jLabel6MouseClicked

    private void FiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroNombreActionPerformed

    private void FiltroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroIdActionPerformed

    private void TxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNombreActionPerformed

    private void TxDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDireccionActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdActionPerformed

    private void TxCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCorreoActionPerformed

    private void TxTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTelefonoActionPerformed

    private void actualizarCampos() {
        tablaUsr.changeSelection(0, 0, false, false);
        ModeloTablaClientes m = (ModeloTablaClientes) tablaUsr.getModel();
        this.TxId.setText(m.getFila(tablaUsr.getSelectedRow()).getUsuario());
        this.TxNombre.setText(m.getFila(tablaUsr.getSelectedRow()).getNombre());
        this.TxCorreo.setText(m.getFila(tablaUsr.getSelectedRow()).getCorreo());
        this.TxDireccion.setText(m.getFila(tablaUsr.getSelectedRow()).getDireccion());
        this.TxTelefono.setText(m.getFila(tablaUsr.getSelectedRow()).getTelefono());
        this.TxDni.setText(m.getFila(tablaUsr.getSelectedRow()).getDni());
        this.TxSexo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getSexo());
        this.TxTipo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getTipo());
    }


    private void tablaUsrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsrMouseClicked
        // TODO add your handling code here:
        actualizarDatos();
        ErrorID.setVisible(false);
        BtActualizar.setEnabled(true);
        ErrorAlta1.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);
        EliminarError.setVisible(false);
    }//GEN-LAST:event_tablaUsrMouseClicked

    private void BtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtActualizarMouseClicked
        ModeloTablaClientes m = (ModeloTablaClientes) tablaUsr.getModel();
        if ((fa.consultarId(TxId.getText()) || (TxId.getText().equals(m.getFila(tablaUsr.getSelectedRow()).getUsuario()))) && !TxId.getText().isEmpty()) {
            String id = m.getFila(tablaUsr.getSelectedRow()).getUsuario();
            restablecerBoton();
            actualizarUsuario(id);
            actualizarCampos();
        } else {
            ErrorID.setVisible(true);
            LabelActualizar.setVisible((false));
            actualizarCampos();
        }
    }//GEN-LAST:event_BtActualizarMouseClicked

    private void TxDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDniActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ErrorAlta1.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void BtBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtBajaMouseClicked
        ModeloTablaClientes m = (ModeloTablaClientes) tablaUsr.getModel();
        if ((int) m.getFila(tablaUsr.getSelectedRow()).getPedidosActivos() > 0) {
            EliminarError.setVisible(true);
        } else {
            restablecerBoton();
            eliminarUsuario();
            tablaUsr.changeSelection(0, 0, false, false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBajaMouseClicked

    private void BtAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAltaMouseClicked
        if (!nuevo) {
            BtAlta.setBackground(new Color(245, 184, 0));
            LConfirmar.setVisible(true);
            LAlta.setVisible(false);
            vaciarTxt();
            nuevo = true;
            ContrasenaL.setVisible(true);
            TxContrasena.setVisible(true);
        } else {
            if (TxId.getText().isEmpty() || TxNombre.getText().isEmpty() || TxCorreo.getText().isEmpty() || TxDireccion.getText().isEmpty() || TxTelefono.getText().isEmpty() || TxContrasena.getText().isEmpty()) {
                ErrorAlta1.setVisible(true);
            } else {
                fa.registrarUsuario(TxId.getText(), TxContrasena.getText(), TxDni.getText(), TxNombre.getText(), TxCorreo.getText(), TxDireccion.getText(), TxTelefono.getText(), (String) TxSexo.getSelectedItem(), (String) TxTipo.getSelectedItem());
                AltaCorrecta.setVisible(true);
                restablecerBoton();
                actualizarTabla();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BtAltaMouseClicked

    private void TxContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxContrasenaActionPerformed

    private void TxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaCorrecta;
    private javax.swing.JPanel BtActualizar;
    private javax.swing.JPanel BtAlta;
    private javax.swing.JPanel BtBaja;
    private javax.swing.JLabel ContrasenaL;
    private javax.swing.JLabel EliminarError;
    private javax.swing.JLabel ErrorAlta1;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JTextField FiltroId;
    private javax.swing.JTextField FiltroNombre;
    private javax.swing.JLabel LAlta;
    private javax.swing.JLabel LConfirmar;
    private javax.swing.JLabel LabelActualizar;
    private javax.swing.JTextField TxContrasena;
    private javax.swing.JTextField TxCorreo;
    private javax.swing.JTextField TxDireccion;
    private javax.swing.JTextField TxDni;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JComboBox TxSexo;
    private javax.swing.JTextField TxTelefono;
    private javax.swing.JComboBox TxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaUsr;
    // End of variables declaration//GEN-END:variables

    public void actualizarDatos() {
        ModeloTablaClientes m;

        m = (ModeloTablaClientes) tablaUsr.getModel();
        this.TxId.setText(m.getFila(tablaUsr.getSelectedRow()).getUsuario());
        this.TxNombre.setText(m.getFila(tablaUsr.getSelectedRow()).getNombre());
        this.TxCorreo.setText(m.getFila(tablaUsr.getSelectedRow()).getCorreo());
        this.TxDireccion.setText(m.getFila(tablaUsr.getSelectedRow()).getDireccion());
        this.TxTelefono.setText(m.getFila(tablaUsr.getSelectedRow()).getTelefono());
        this.TxDni.setText(m.getFila(tablaUsr.getSelectedRow()).getDni());
        this.TxSexo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getSexo());
        this.TxTipo.setSelectedItem((m.getFila(tablaUsr.getSelectedRow())).getTipo());
    }

    //public Usuario(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo) {
    public void actualizarUsuario(String id) {
        ModeloTablaClientes m;

        m = (ModeloTablaClientes) tablaUsr.getModel();
        fa.actualizarUsr(id, new Usuario(TxId.getText(), null, TxDni.getText(), TxNombre.getText(), TxCorreo.getText(), TxDireccion.getText(), TxTelefono.getText(), (String) TxSexo.getSelectedItem(), null));
        LabelActualizar.setVisible(true);
        m.setFilas(fa.obtenerClientes(this.FiltroId.getText(), this.FiltroNombre.getText()));
        BtActualizar.setEnabled(false);
    }

    public void eliminarUsuario() {
        ModeloTablaClientes m;

        m = (ModeloTablaClientes) tablaUsr.getModel();
        fa.eliminarUsuario((m.getFila(tablaUsr.getSelectedRow()).getUsuario()));
        m.setFilas(fa.obtenerClientes(this.FiltroId.getText(), this.FiltroNombre.getText()));
    }

    public void actualizarTabla() {
        ModeloTablaClientes m;

        m = (ModeloTablaClientes) tablaUsr.getModel();
        m.setFilas(fa.obtenerClientes(this.FiltroId.getText(), this.FiltroNombre.getText()));
    }

    public void vaciarTxt() {
        ModeloTablaClientes m;

        m = (ModeloTablaClientes) tablaUsr.getModel();
        this.TxId.setText(null);
        this.TxNombre.setText(null);
        this.TxCorreo.setText(null);
        this.TxDireccion.setText(null);
        this.TxTelefono.setText(null);
        this.TxDni.setText(null);
        this.TxContrasena.setText(null);
    }

    public void restablecerBoton() {
        nuevo = false;
        BtActualizar.setEnabled(false);
        BtAlta.setBackground(new Color(255, 148, 42));
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        ContrasenaL.setVisible(false);
        TxContrasena.setVisible(false);
        //tablaUsr.changeSelection(0,0,false,false);
    }
}
