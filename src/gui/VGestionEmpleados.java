/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Empleado;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alumnogreibd
 */
public class VGestionEmpleados extends javax.swing.JPanel {

    aplicacion.FachadaAplicacion fa;
    private boolean nuevo;
    /**
     * Creates new form VGestionUsuarios
     */
    public VGestionEmpleados(aplicacion.FachadaAplicacion fa) {
        initComponents();
        this.fa=fa;
        nuevo=false;
        ModeloTablaEmpleados tp = new ModeloTablaEmpleados();
        initComponents();
        tablaEmpleados.setModel(tp);
        tp.setFilas(fa.obtenerEmpleados(this.FiltroId.getText()));
        tablaEmpleados.changeSelection(0,0,false,false);
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
        ModeloTablaEmpleados m = (ModeloTablaEmpleados) tablaEmpleados.getModel();
        if(m.getRowCount()>0){
            this.TxId.setText(m.getFila(tablaEmpleados.getSelectedRow()).getUsuario());
            this.TxNombre.setText(m.getFila(tablaEmpleados.getSelectedRow()).getNombre());
            this.TxEmail.setText(m.getFila(tablaEmpleados.getSelectedRow()).getCorreo());
            this.TxDireccion.setText(m.getFila(tablaEmpleados.getSelectedRow()).getDireccion());
            this.TxTelefono.setText(m.getFila(tablaEmpleados.getSelectedRow()).getTelefono());
            this.TxDni.setText(m.getFila(tablaEmpleados.getSelectedRow()).getDni());
            this.TxSexo.setSelectedItem((m.getFila(tablaEmpleados.getSelectedRow())).getSexo());
            this.TxNomina.setText(Integer.toString(m.getFila(tablaEmpleados.getSelectedRow()).getNomina()));
        }
        
        JTableHeader th;
        th = this.tablaEmpleados.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(255,148,42));
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

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelActualizar = new javax.swing.JPanel();
        BtActualizar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtAlta = new javax.swing.JPanel();
        LAlta = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LConfirmar = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxNombre = new javax.swing.JTextField();
        TxDireccion = new javax.swing.JTextField();
        TxId = new javax.swing.JTextField();
        TxEmail = new javax.swing.JTextField();
        TxDni = new javax.swing.JTextField();
        TxTelefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TxNomina = new javax.swing.JTextField();
        TxSexo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        TxContrasena = new javax.swing.JTextField();
        ContrasenaL = new javax.swing.JLabel();
        ErrorAlta1 = new javax.swing.JLabel();
        AltaCorrecta = new javax.swing.JLabel();
        ErrorID = new javax.swing.JLabel();
        LabelActualizar = new javax.swing.JLabel();
        TxTipo = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        FiltroId = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 550, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 10, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

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

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 159));
        jLabel2.setText("Gestion Empleados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 260, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaEmpleados.setBackground(new java.awt.Color(255, 232, 185));
        tablaEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaEmpleados.setModel(new ModeloTablaEmpleados());
        tablaEmpleados.setSelectionBackground(new java.awt.Color(255, 189, 72));
        tablaEmpleados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tablaEmpleados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 600, 180));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 133, 74));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derechaNaranja.png"))); // NOI18N
        jLabel4.setText("Id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-google-web-search-filled-50.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 226, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelActualizar.setBackground(new java.awt.Color(255, 148, 42));
        panelActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelActualizarMouseClicked(evt);
            }
        });
        panelActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtActualizar.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        BtActualizar.setForeground(new java.awt.Color(215, 215, 215));
        BtActualizar.setText("Actualizar");
        panelActualizar.add(BtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        panelActualizar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jPanel1.add(panelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 41));

        BtAlta.setBackground(new java.awt.Color(255, 148, 42));
        BtAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtAlta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LAlta.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        LAlta.setForeground(new java.awt.Color(215, 215, 215));
        LAlta.setText("Dar alta");
        LAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDarAlta(evt);
            }
        });
        BtAlta.add(LAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-añadir-32.png"))); // NOI18N
        jLabel18.setText("jLabel1");
        BtAlta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        LConfirmar.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        LConfirmar.setForeground(new java.awt.Color(215, 215, 215));
        LConfirmar.setText("Confirmar Alta");
        BtAlta.add(LConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, -1));

        jPanel1.add(BtAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, 41));

        jPanel10.setBackground(new java.awt.Color(255, 148, 42));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(215, 215, 215));
        jLabel17.setText("Dar baja");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-26.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, 41));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Id:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Email:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setText("DNI:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TxNombre.setBackground(new java.awt.Color(255, 232, 185));
        TxNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 220, -1));

        TxDireccion.setBackground(new java.awt.Color(255, 232, 185));
        TxDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, -1));

        TxId.setBackground(new java.awt.Color(255, 232, 185));
        TxId.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });
        jPanel1.add(TxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, -1));

        TxEmail.setBackground(new java.awt.Color(255, 232, 185));
        TxEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxEmailActionPerformed(evt);
            }
        });
        jPanel1.add(TxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        TxDni.setBackground(new java.awt.Color(255, 232, 185));
        TxDni.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDniActionPerformed(evt);
            }
        });
        jPanel1.add(TxDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, -1));

        TxTelefono.setBackground(new java.awt.Color(255, 232, 185));
        TxTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(TxTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setText("Nómina:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        TxNomina.setBackground(new java.awt.Color(255, 232, 185));
        TxNomina.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNominaActionPerformed(evt);
            }
        });
        jPanel1.add(TxNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 220, -1));

        TxSexo.setBackground(new java.awt.Color(204, 204, 204));
        TxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "M" }));
        TxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSexoActionPerformed(evt);
            }
        });
        jPanel1.add(TxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 50, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        TxContrasena.setBackground(new java.awt.Color(255, 232, 185));
        TxContrasena.setForeground(new java.awt.Color(102, 102, 102));
        TxContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(TxContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 220, -1));

        ContrasenaL.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ContrasenaL.setText("Password:");
        jPanel1.add(ContrasenaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        ErrorAlta1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorAlta1.setForeground(new java.awt.Color(255, 51, 51));
        ErrorAlta1.setText("Todos los campos son obligatorios");
        jPanel1.add(ErrorAlta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        AltaCorrecta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AltaCorrecta.setForeground(new java.awt.Color(0, 153, 0));
        AltaCorrecta.setText("Usuario registrado correctamente");
        jPanel1.add(AltaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 40));

        ErrorID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("ID ya existente o vacío");
        jPanel1.add(ErrorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        LabelActualizar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelActualizar.setForeground(new java.awt.Color(0, 153, 0));
        LabelActualizar.setText("Datos actualizados");
        jPanel1.add(LabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        TxTipo.setBackground(new java.awt.Color(204, 204, 204));
        TxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "oficinista", "transportista", "administrador" }));
        TxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(TxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 20));

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setText("Sexo:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setText("Tipo:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 600, 240));

        FiltroId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FiltroId.setBorder(null);
        FiltroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroIdActionPerformed(evt);
            }
        });
        add(FiltroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNombreActionPerformed

    private void TxDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDireccionActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdActionPerformed

    private void TxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxEmailActionPerformed

    private void TxDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDniActionPerformed

    private void TxTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTelefonoActionPerformed

    private void TxNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNominaActionPerformed

    private void FiltroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroIdActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        fa.obtenerEmpleados(FiltroId.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btDarAlta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDarAlta
        // TODO add your handling code here:
        if (!nuevo) {
            BtAlta.setBackground(new Color(245, 184, 0));
            LConfirmar.setVisible(true);
            LAlta.setVisible(false);
            vaciarTxt();
            nuevo = true;
            ContrasenaL.setVisible(true);
            TxContrasena.setVisible(true);
        } else {
            if (TxId.getText().isEmpty() || TxNombre.getText().isEmpty() || TxEmail.getText().isEmpty() || TxDireccion.getText().isEmpty() || TxTelefono.getText().isEmpty() || TxContrasena.getText().isEmpty()) {
                ErrorAlta1.setVisible(true);
            } else {
                fa.registrarUsuario(TxId.getText(), TxContrasena.getText(), TxDni.getText(), TxNombre.getText(), TxEmail.getText(), TxDireccion.getText(), TxTelefono.getText(), (String) TxSexo.getSelectedItem(), (String) TxTipo.getSelectedItem());
                AltaCorrecta.setVisible(true);
                restablecerBoton();
                actualizarTabla();
            }
        }
    }//GEN-LAST:event_btDarAlta

    private void TxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxSexoActionPerformed

    private void TxContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxContrasenaActionPerformed

    private void panelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelActualizarMouseClicked
        // TODO add your handling code here:
        ModeloTablaEmpleados m;
        m = (ModeloTablaEmpleados) tablaEmpleados.getModel();
        if((fa.consultarId(TxId.getText()) || (TxId.getText().equals(m.getFila(tablaEmpleados.getSelectedRow()).getUsuario()))) && !TxId.getText().isEmpty())
       {
        String id=m.getFila(tablaEmpleados.getSelectedRow()).getUsuario();
        restablecerBoton();
        
       }
        else{ErrorID.setVisible(true);
        LabelActualizar.setVisible((false));
        }
        
    }//GEN-LAST:event_panelActualizarMouseClicked

    private void TxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaCorrecta;
    private javax.swing.JLabel BtActualizar;
    private javax.swing.JPanel BtAlta;
    private javax.swing.JLabel ContrasenaL;
    private javax.swing.JLabel ErrorAlta1;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JTextField FiltroId;
    private javax.swing.JLabel LAlta;
    private javax.swing.JLabel LConfirmar;
    private javax.swing.JLabel LabelActualizar;
    private javax.swing.JTextField TxContrasena;
    private javax.swing.JTextField TxDireccion;
    private javax.swing.JTextField TxDni;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JTextField TxNomina;
    private javax.swing.JComboBox TxSexo;
    private javax.swing.JTextField TxTelefono;
    private javax.swing.JComboBox TxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
    public void vaciarTxt() {
        ModeloTablaEmpleados m;

        m = (ModeloTablaEmpleados) tablaEmpleados.getModel();
        this.TxId.setText(null);
        this.TxEmail.setText(null);
        this.TxDni.setText(null);
        this.TxDireccion.setText(null);
        this.TxTelefono.setText(null);
        this.TxNombre.setText(null);
        this.TxNomina.setText(null);
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
        tablaEmpleados.changeSelection(0,0,false,false);
    }
    
    public void actualizarEmpleado(String id) {
        ModeloTablaEmpleados m;

        m = (ModeloTablaEmpleados) tablaEmpleados.getModel();
        ArrayList<Integer> datos = new ArrayList<>();
        datos = fa.datosEmpleado(id);
        fa.actualizarEmpleado(id, new Empleado(TxId.getText(), null, TxDni.getText(), TxNombre.getText(), TxEmail.getText(), TxDireccion.getText(), TxTelefono.getText(), (String) TxSexo.getSelectedItem(),(String) TxTipo.getSelectedItem() ,Integer.parseInt(TxNomina.getText()),datos.get(0)));
        LabelActualizar.setVisible(true);
        m.setFilas(fa.obtenerEmpleados(this.FiltroId.getText()));
        BtActualizar.setEnabled(false);
    }
    public void actualizarTabla(){
        ModeloTablaUsuarios m;

        m = (ModeloTablaUsuarios) tablaEmpleados.getModel();
        //m.setFilas(fa.obtenerUsuarios(this.FiltroId.getText(), this.FiltroNombre.getText()));
    }
    
    private void actualizarCampos()
    {
        tablaEmpleados.changeSelection(0,0,false,false);
        ModeloTablaEmpleados m = (ModeloTablaEmpleados) tablaEmpleados.getModel();
        this.TxId.setText(m.getFila(tablaEmpleados.getSelectedRow()).getUsuario());
        this.TxNombre.setText(m.getFila(tablaEmpleados.getSelectedRow()).getNombre());
        this.TxEmail.setText(m.getFila(tablaEmpleados.getSelectedRow()).getCorreo());
        this.TxDireccion.setText(m.getFila(tablaEmpleados.getSelectedRow()).getDireccion());
        this.TxTelefono.setText(m.getFila(tablaEmpleados.getSelectedRow()).getTelefono());
        this.TxDni.setText(m.getFila(tablaEmpleados.getSelectedRow()).getDni());
        this.TxSexo.setSelectedItem((m.getFila(tablaEmpleados.getSelectedRow())).getSexo());
        this.TxTipo.setSelectedItem(fa.getTipo(m.getFila(tablaEmpleados.getSelectedRow()).getUsuario()));
    }

}
