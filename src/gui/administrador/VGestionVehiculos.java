/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

import aplicacion.Transportista;
import aplicacion.Usuario;
import aplicacion.Vehiculo;
import gui.ModeloTablaVehiculos;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;
/**
 *
 * @author alumnogreibd
 */
public class VGestionVehiculos extends javax.swing.JPanel {

    /**
     * Creates new form VGestionVehiculos
     */
    private aplicacion.FachadaAplicacion fa;
    private Usuario usr;
    private boolean nuevo;
    
    public VGestionVehiculos(aplicacion.FachadaAplicacion fa,Usuario usr) {
        this.fa=fa;
        this.usr=usr;
        initComponents();
        ModeloTablaVehiculos tv = new ModeloTablaVehiculos();
        tablaVehi.setModel(tv);
        tv.setFilas(fa.obtenerVehiculos(FiltroMatricula.getText()));
        tablaVehi.changeSelection(0,0,false,false);
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        BtAlta.setVisible(true);
        ErrorAlta1.setVisible(false);
        ErrorID.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);
        
        ArrayList<String> transportistas = fa.transportistasComboBox();
        
        for(int i= 0; i<transportistas.size();i++){
            TxTransp.insertItemAt(transportistas.get(i), i+1);
        }
        
        ModeloTablaVehiculos mv = (ModeloTablaVehiculos) tablaVehi.getModel();
        if(mv.getRowCount()>0){
            this.TxMatricula.setText(mv.getFila(tablaVehi.getSelectedRow()).getMatricula());
            this.TxCapacidad.setText(mv.getFila(tablaVehi.getSelectedRow()).getCapacidad().toString());
            this.TxItv.setText(mv.getFila(tablaVehi.getSelectedRow()).getItv());
            this.TxDireccion.setText(mv.getFila(tablaVehi.getSelectedRow()).getDireccion());
            this.TxTransp.setSelectedItem(mv.getFila(tablaVehi.getSelectedRow()).getTrans());
            this.TxFechaCompra.setText(mv.getFila(tablaVehi.getSelectedRow()).getFechaCompra());
        }
        
        JTableHeader th;
        th = this.tablaVehi.getTableHeader();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        FiltroMatricula = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtActualizar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtBaja = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FechaCompra = new javax.swing.JLabel();
        mt = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxCapacidad = new javax.swing.JTextField();
        TxFechaCompra = new javax.swing.JTextField();
        TxMatricula = new javax.swing.JTextField();
        TxItv = new javax.swing.JTextField();
        ErrorID = new javax.swing.JLabel();
        BtAlta = new javax.swing.JPanel();
        LConfirmar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LAlta = new javax.swing.JLabel();
        LabelActualizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AltaCorrecta = new javax.swing.JLabel();
        ErrorAlta1 = new javax.swing.JLabel();
        TxDireccion = new javax.swing.JTextField();
        TxTransp = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(660, 592));
        setPreferredSize(new java.awt.Dimension(660, 592));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setToolTipText("");

        tablaVehi.setModel(new ModeloTablaVehiculos());
        tablaVehi.setGridColor(new java.awt.Color(255, 255, 255));
        tablaVehi.setSelectionBackground(new java.awt.Color(255, 189, 72));
        tablaVehi.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaVehi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVehiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVehi);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 600, 180));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 133, 74));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derechaNaranja.png"))); // NOI18N
        jLabel4.setText("matricula:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        FiltroMatricula.setBorder(null);
        FiltroMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroMatriculaActionPerformed(evt);
            }
        });
        add(FiltroMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 280, 20));

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

        jPanel1.add(BtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 41));

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

        jPanel1.add(BtBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 180, 41));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Capacidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        FechaCompra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FechaCompra.setText("Fecha de Compra");
        jPanel1.add(FechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        mt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mt.setText("Matricula:");
        jPanel1.add(mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("ITV:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setText("Transportista:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        TxCapacidad.setBackground(new java.awt.Color(255, 232, 185));
        TxCapacidad.setForeground(new java.awt.Color(102, 102, 102));
        TxCapacidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapacidadActionPerformed(evt);
            }
        });
        jPanel1.add(TxCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 180, -1));

        TxFechaCompra.setBackground(new java.awt.Color(255, 232, 185));
        TxFechaCompra.setForeground(new java.awt.Color(102, 102, 102));
        TxFechaCompra.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxFechaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxFechaCompraActionPerformed(evt);
            }
        });
        jPanel1.add(TxFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 160, -1));

        TxMatricula.setBackground(new java.awt.Color(255, 232, 185));
        TxMatricula.setForeground(new java.awt.Color(102, 102, 102));
        TxMatricula.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(TxMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, -1));

        TxItv.setBackground(new java.awt.Color(255, 232, 185));
        TxItv.setForeground(new java.awt.Color(102, 102, 102));
        TxItv.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxItv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxItvActionPerformed(evt);
            }
        });
        jPanel1.add(TxItv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, -1));

        ErrorID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("Matricula ya existente o esta vacía");
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

        jPanel1.add(BtAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, 41));

        LabelActualizar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelActualizar.setForeground(new java.awt.Color(0, 153, 0));
        LabelActualizar.setText("Datos actualizados");
        jPanel1.add(LabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        AltaCorrecta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AltaCorrecta.setForeground(new java.awt.Color(0, 153, 0));
        AltaCorrecta.setText("Vehículo registrado correctamente");
        jPanel1.add(AltaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 40));

        ErrorAlta1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorAlta1.setForeground(new java.awt.Color(255, 51, 51));
        ErrorAlta1.setText("Todos los campos son obligatorios");
        jPanel1.add(ErrorAlta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        TxDireccion.setBackground(new java.awt.Color(255, 232, 185));
        TxDireccion.setForeground(new java.awt.Color(102, 102, 102));
        TxDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, -1));

        TxTransp.setBackground(new java.awt.Color(255, 232, 185));
        TxTransp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        TxTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTranspActionPerformed(evt);
            }
        });
        jPanel1.add(TxTransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 600, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-google-web-search-filled-50.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 390, 10));

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
        jLabel2.setText("Gestion Vehiculos");
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
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroMatriculaActionPerformed

    private void BtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtActualizarMouseClicked
        ModeloTablaVehiculos  m = (ModeloTablaVehiculos) tablaVehi.getModel();
        if((fa.consultarMatricula(TxMatricula.getText()) || (TxMatricula.getText().equals(m.getFila(tablaVehi.getSelectedRow()).getMatricula()))) && !TxMatricula.getText().isEmpty())
        {
            String matricula=m.getFila(tablaVehi.getSelectedRow()).getMatricula();
            restablecerBoton();
            actualizarVehiculo(matricula);
            actualizarCampos();
        }
        else{ErrorID.setVisible(true);
            LabelActualizar.setVisible((false));
            actualizarCampos();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtActualizarMouseClicked

    private void BtBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtBajaMouseClicked
        restablecerBoton();
        eliminarVehiculo();
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBajaMouseClicked

    private void TxCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapacidadActionPerformed

    private void TxFechaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxFechaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxFechaCompraActionPerformed

    private void TxMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMatriculaActionPerformed

    private void TxItvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxItvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxItvActionPerformed

    private void BtAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAltaMouseClicked
        if (!nuevo) {
            BtAlta.setBackground(new Color(245, 184, 0));
            LConfirmar.setVisible(true);
            LAlta.setVisible(false);
            vaciarTxt();
            nuevo = true;
            FechaCompra.setVisible(true);
            TxFechaCompra.setVisible(true);
        } else {
            if (TxMatricula.getText().isEmpty() || TxCapacidad.getText().isEmpty() || TxItv.getText().isEmpty() || TxFechaCompra.getText().isEmpty()  || TxDireccion.getText().isEmpty()) {
                ErrorAlta1.setVisible(true);
            } else {
                if(TxTransp.getSelectedIndex()==0){
                   fa.registrarVehi(new Vehiculo(TxMatricula.getText(),TxItv.getText(),TxFechaCompra.getText(),Integer.parseInt(TxCapacidad.getText()),null,TxDireccion.getText()));
 
                }
                else fa.registrarVehi(new Vehiculo(TxMatricula.getText(),TxItv.getText(),TxFechaCompra.getText(),Integer.parseInt(TxCapacidad.getText()),TxTransp.getSelectedItem().toString(),TxDireccion.getText()));
                AltaCorrecta.setVisible(true);
                restablecerBoton();
                actualizarTabla();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtAltaMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        ModeloTablaVehiculos tv = new ModeloTablaVehiculos();
        tablaVehi.setModel(tv);
        tv.setFilas(fa.obtenerVehiculos(this.FiltroMatricula.getText()));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void TxDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDireccionActionPerformed

    private void tablaVehiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVehiMouseClicked
        // TODO add your handling code here:
        actualizarDatos();
        ErrorID.setVisible(false);
        BtActualizar.setEnabled(true);
        ErrorAlta1.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);
        
    }//GEN-LAST:event_tablaVehiMouseClicked

    private void TxTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTranspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTranspActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaCorrecta;
    private javax.swing.JPanel BtActualizar;
    private javax.swing.JPanel BtAlta;
    private javax.swing.JPanel BtBaja;
    private javax.swing.JLabel ErrorAlta1;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JLabel FechaCompra;
    private javax.swing.JTextField FiltroMatricula;
    private javax.swing.JLabel LAlta;
    private javax.swing.JLabel LConfirmar;
    private javax.swing.JLabel LabelActualizar;
    private javax.swing.JTextField TxCapacidad;
    private javax.swing.JTextField TxDireccion;
    private javax.swing.JTextField TxFechaCompra;
    private javax.swing.JTextField TxItv;
    private javax.swing.JTextField TxMatricula;
    private javax.swing.JComboBox TxTransp;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mt;
    private javax.swing.JTable tablaVehi;
    // End of variables declaration//GEN-END:variables

public void restablecerBoton(){
        nuevo = false;
        BtActualizar.setEnabled(false);
        BtAlta.setBackground(new Color(255, 148, 42));
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        FechaCompra.setVisible(true);
        tablaVehi.changeSelection(0,0,false,false);
}

public void actualizarVehiculo(String matricula){
    
    ModeloTablaVehiculos mv;
    mv = (ModeloTablaVehiculos) tablaVehi.getModel();
    if(TxTransp.getSelectedIndex()==0){
            fa.actualizarVehi(matricula, new Vehiculo(TxMatricula.getText(), TxItv.getText(), TxFechaCompra.getText(), Integer.parseInt(TxCapacidad.getText()), null, TxDireccion.getText()));
    }
    else{
     fa.actualizarVehi(matricula, new Vehiculo(TxMatricula.getText(), TxItv.getText(), TxFechaCompra.getText(), Integer.parseInt(TxCapacidad.getText()), TxTransp.getSelectedItem().toString(), TxDireccion.getText()));
    }
    LabelActualizar.setVisible(true);
    mv.setFilas(fa.obtenerVehiculos(FiltroMatricula.getText()));
    BtActualizar.setEnabled(false);
    
}

public void eliminarVehiculo(){
    ModeloTablaVehiculos m;

        m = (ModeloTablaVehiculos) tablaVehi.getModel();
        fa.eliminarVehi((m.getFila(tablaVehi.getSelectedRow()).getMatricula()));
        m.setFilas(fa.obtenerVehiculos(this.FiltroMatricula.getText()));
}

    public void actualizarDatos() {
        ModeloTablaVehiculos mv;

        mv = (ModeloTablaVehiculos) tablaVehi.getModel();
        this.TxMatricula.setText(mv.getFila(tablaVehi.getSelectedRow()).getMatricula());
        this.TxItv.setText(mv.getFila(tablaVehi.getSelectedRow()).getItv());
        this.TxCapacidad.setText(mv.getFila(tablaVehi.getSelectedRow()).getCapacidad().toString());
        this.TxDireccion.setText(mv.getFila(tablaVehi.getSelectedRow()).getDireccion());
        this.TxTransp.setSelectedItem(mv.getFila(tablaVehi.getSelectedRow()).getTrans());
        this.TxFechaCompra.setText(mv.getFila(tablaVehi.getSelectedRow()).getFechaCompra());
    }
    
    private void actualizarCampos()
    {
        tablaVehi.changeSelection(0,0,false,false);
        ModeloTablaVehiculos mv = (ModeloTablaVehiculos) tablaVehi.getModel();
        this.TxMatricula.setText(mv.getFila(tablaVehi.getSelectedRow()).getMatricula());
        this.TxItv.setText(mv.getFila(tablaVehi.getSelectedRow()).getItv());
        this.TxCapacidad.setText(mv.getFila(tablaVehi.getSelectedRow()).getCapacidad().toString());
        this.TxDireccion.setText(mv.getFila(tablaVehi.getSelectedRow()).getDireccion());
        this.TxTransp.setSelectedItem(mv.getFila(tablaVehi.getSelectedRow()).getTrans());
        this.TxFechaCompra.setText(mv.getFila(tablaVehi.getSelectedRow()).getFechaCompra());
    }
    
    public void vaciarTxt() {
        ModeloTablaVehiculos m;

        m = (ModeloTablaVehiculos) tablaVehi.getModel();
        this.TxMatricula.setText(null);
        this.TxItv.setText(null);
        this.TxCapacidad.setText(null);
        this.TxDireccion.setText(null);
        //this.TxTransp.setText(null);
        this.TxFechaCompra.setText(null);
    }

    public void actualizarTabla(){
        ModeloTablaVehiculos m;

        m = (ModeloTablaVehiculos) tablaVehi.getModel();
        m.setFilas(fa.obtenerVehiculos(FiltroMatricula.getText()));
    }

}

