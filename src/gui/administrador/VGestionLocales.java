/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

import aplicacion.Local;
import aplicacion.Usuario;
import gui.ModeloTablaLocales;
import gui.ModeloTablaUsuarios;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alumnogreibd
 */
public class VGestionLocales extends javax.swing.JPanel {

    aplicacion.FachadaAplicacion fa;
    private boolean nuevo;

    /**
     * Creates new form VGestionUsuarios
     */
    public VGestionLocales(aplicacion.FachadaAplicacion fa) {
        initComponents();
        this.fa = fa;

        ModeloTablaLocales tl = new ModeloTablaLocales();
        initComponents();
        tablaLoc.setModel(tl);
        tl.setFilas(fa.obtenerLocales(this.FiltroCodigo.getText()));
        tablaLoc.changeSelection(0,0,false,false);
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        BtAlta.setVisible(true);
        ErrorAlta1.setVisible(false);
        ErrorID.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);
        ErrorEncargado.setVisible(false);
        ModeloTablaLocales m = (ModeloTablaLocales) tablaLoc.getModel();
        if(m.getRowCount()>0){
            this.TxCodigo.setText(m.getFila(tablaLoc.getSelectedRow()).getCodigo());
            this.TxEncargado.setText(m.getFila(tablaLoc.getSelectedRow()).getEncargado());
            this.TxCapacidad.setText(m.getFila(tablaLoc.getSelectedRow()).getCapacidad().toString());
            this.TxDireccion.setText(m.getFila(tablaLoc.getSelectedRow()).getDireccion());

        }
        
        JTableHeader th;
        th = this.tablaLoc.getTableHeader();
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FiltroCodigo = new javax.swing.JTextField();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxEncargado = new javax.swing.JTextField();
        TxDireccion = new javax.swing.JTextField();
        TxCodigo = new javax.swing.JTextField();
        TxCapacidad = new javax.swing.JTextField();
        ErrorID = new javax.swing.JLabel();
        BtAlta = new javax.swing.JPanel();
        LConfirmar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LAlta = new javax.swing.JLabel();
        LabelActualizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AltaCorrecta = new javax.swing.JLabel();
        ErrorAlta1 = new javax.swing.JLabel();
        ErrorEncargado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLoc = new javax.swing.JTable();

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
        jLabel2.setText("Gestion Locales");
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

        FiltroCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FiltroCodigo.setBorder(null);
        FiltroCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroCodigoActionPerformed(evt);
            }
        });
        add(FiltroCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 133, 74));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derechaNaranja.png"))); // NOI18N
        jLabel4.setText("Codigo:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

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
        jLabel7.setText("Encargado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Código:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Capacidad");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        TxEncargado.setBackground(new java.awt.Color(255, 232, 185));
        TxEncargado.setForeground(new java.awt.Color(102, 102, 102));
        TxEncargado.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxEncargadoActionPerformed(evt);
            }
        });
        jPanel1.add(TxEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, -1));

        TxDireccion.setBackground(new java.awt.Color(255, 232, 185));
        TxDireccion.setForeground(new java.awt.Color(102, 102, 102));
        TxDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 220, -1));

        TxCodigo.setBackground(new java.awt.Color(255, 232, 185));
        TxCodigo.setForeground(new java.awt.Color(102, 102, 102));
        TxCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(TxCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, -1));

        TxCapacidad.setBackground(new java.awt.Color(255, 232, 185));
        TxCapacidad.setForeground(new java.awt.Color(102, 102, 102));
        TxCapacidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        TxCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCapacidadActionPerformed(evt);
            }
        });
        jPanel1.add(TxCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        ErrorID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("Código ya existente o vacío");
        jPanel1.add(ErrorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        AltaCorrecta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        AltaCorrecta.setForeground(new java.awt.Color(0, 153, 0));
        AltaCorrecta.setText("Local registrado correctamente");
        jPanel1.add(AltaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 40));

        ErrorAlta1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorAlta1.setForeground(new java.awt.Color(255, 51, 51));
        ErrorAlta1.setText("Todos los campos son obligatorios");
        jPanel1.add(ErrorAlta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        ErrorEncargado.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ErrorEncargado.setForeground(new java.awt.Color(255, 51, 51));
        ErrorEncargado.setText("Encargado no válido");
        jPanel1.add(ErrorEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 600, 200));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaLoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaLoc.setModel(new ModeloTablaLocales());
        tablaLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaLoc.setGridColor(new java.awt.Color(255, 189, 72));
        tablaLoc.setSelectionBackground(new java.awt.Color(255, 189, 72));
        tablaLoc.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaLoc.setShowHorizontalLines(false);
        tablaLoc.setShowVerticalLines(false);
        tablaLoc.setSurrendersFocusOnKeystroke(true);
        tablaLoc.getTableHeader().setResizingAllowed(false);
        tablaLoc.getTableHeader().setReorderingAllowed(false);
        tablaLoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLoc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 600, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        ModeloTablaLocales tp = new ModeloTablaLocales();
        tablaLoc.setModel(tp);
        tp.setFilas(fa.obtenerLocales(this.FiltroCodigo.getText()));

    }//GEN-LAST:event_jLabel6MouseClicked

    private void FiltroCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroCodigoActionPerformed

    private void TxEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxEncargadoActionPerformed

    private void TxDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDireccionActionPerformed

    private void TxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCodigoActionPerformed

    private void TxCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCapacidadActionPerformed

    private void actualizarCampos()
    {
        tablaLoc.changeSelection(0,0,false,false);
        ModeloTablaLocales m = (ModeloTablaLocales) tablaLoc.getModel();
        this.TxCodigo.setText(m.getFila(tablaLoc.getSelectedRow()).getCodigo());
        this.TxEncargado.setText(m.getFila(tablaLoc.getSelectedRow()).getEncargado());
        this.TxCapacidad.setText(m.getFila(tablaLoc.getSelectedRow()).getCapacidad().toString());
        this.TxDireccion.setText(m.getFila(tablaLoc.getSelectedRow()).getDireccion());
    }
    
    
    private void tablaLocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLocMouseClicked
        // TODO add your handling code here:
        actualizarDatos();
        ErrorID.setVisible(false);
        BtActualizar.setEnabled(true);
        ErrorAlta1.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);

    }//GEN-LAST:event_tablaLocMouseClicked

    private void BtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtActualizarMouseClicked
       ModeloTablaLocales  ml = (ModeloTablaLocales) tablaLoc.getModel();
        if((fa.consultarCodigo(TxCodigo.getText()) || (TxCodigo.getText().equals(ml.getFila(tablaLoc.getSelectedRow()).getCodigo()))) && !TxCodigo.getText().isEmpty())
        {
            String codigo=ml.getFila(tablaLoc.getSelectedRow()).getCodigo();
            restablecerBoton();
            actualizarLocal(codigo);
            actualizarCampos();
        }
        else{
            ErrorID.setVisible(true);
            LabelActualizar.setVisible((false));
            actualizarCampos();
        }
    }//GEN-LAST:event_BtActualizarMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ErrorAlta1.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void BtBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtBajaMouseClicked
        restablecerBoton();
        eliminarLocal();
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBajaMouseClicked

    private void BtAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAltaMouseClicked
        if (!nuevo) {
            BtAlta.setBackground(new Color(245, 184, 0));
            LConfirmar.setVisible(true);
            LAlta.setVisible(false);
            vaciarTxt();
            nuevo = true;
        } else {
            if (TxCodigo.getText().isEmpty() || TxEncargado.getText().isEmpty() || TxCapacidad.getText().isEmpty() || TxDireccion.getText().isEmpty() ) {
                ErrorAlta1.setVisible(true);
            } else {
                fa.registrarLocal(new Local(TxCodigo.getText(), TxDireccion.getText(), TxEncargado.getText(), Integer.parseInt(TxCapacidad.getText())));
                AltaCorrecta.setVisible(true);
                restablecerBoton();
                actualizarTabla();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BtAltaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaCorrecta;
    private javax.swing.JPanel BtActualizar;
    private javax.swing.JPanel BtAlta;
    private javax.swing.JPanel BtBaja;
    private javax.swing.JLabel ErrorAlta1;
    private javax.swing.JLabel ErrorEncargado;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JTextField FiltroCodigo;
    private javax.swing.JLabel LAlta;
    private javax.swing.JLabel LConfirmar;
    private javax.swing.JLabel LabelActualizar;
    private javax.swing.JTextField TxCapacidad;
    private javax.swing.JTextField TxCodigo;
    private javax.swing.JTextField TxDireccion;
    private javax.swing.JTextField TxEncargado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaLoc;
    // End of variables declaration//GEN-END:variables
    public void actualizarDatos() {
        ModeloTablaLocales m;

        m = (ModeloTablaLocales) tablaLoc.getModel();
        this.TxCodigo.setText(m.getFila(tablaLoc.getSelectedRow()).getCodigo());
        this.TxEncargado.setText(m.getFila(tablaLoc.getSelectedRow()).getEncargado());
        this.TxCapacidad.setText(m.getFila(tablaLoc.getSelectedRow()).getCapacidad().toString());
        this.TxDireccion.setText(m.getFila(tablaLoc.getSelectedRow()).getDireccion());
    }

    //public Usuario(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo) {
    public void actualizarLocal(String codigo) {
        ModeloTablaLocales m;
        String local;
        m = (ModeloTablaLocales) tablaLoc.getModel();
        local=fa.trabajaEn(TxEncargado.getText());
        if(local.equals(codigo) || local.equals(TxEncargado.getText())){
        fa.actualizarLocal(codigo, new Local(TxCodigo.getText(),TxDireccion.getText(), TxEncargado.getText(), Integer.parseInt(TxCapacidad.getText())));
        ErrorEncargado.setVisible(false);
        LabelActualizar.setVisible(true);
        m.setFilas(fa.obtenerLocales(this.FiltroCodigo.getText()));
        BtActualizar.setEnabled(false);
        }else{
            ErrorEncargado.setVisible(true);
        }
    }

    public void eliminarLocal() {
        ModeloTablaLocales m;

        m = (ModeloTablaLocales) tablaLoc.getModel();
        fa.eliminarLocal(new Local(m.getFila(tablaLoc.getSelectedRow()).getCodigo(),m.getFila(tablaLoc.getSelectedRow()).getDireccion(),m.getFila(tablaLoc.getSelectedRow()).getEncargado(),m.getFila(tablaLoc.getSelectedRow()).getCapacidad()));
        m.setFilas(fa.obtenerLocales(this.FiltroCodigo.getText()));
    }
    
    public void actualizarTabla(){
        ModeloTablaLocales m;

        m = (ModeloTablaLocales) tablaLoc.getModel();
        m.setFilas(fa.obtenerLocales(this.FiltroCodigo.getText()));
    }

    public void vaciarTxt() {
        ModeloTablaLocales m;

        m = (ModeloTablaLocales) tablaLoc.getModel();
        this.TxCodigo.setText(null);
        this.TxEncargado.setText(null);
        this.TxCapacidad.setText(null);
        this.TxDireccion.setText(null);
    }

    public void restablecerBoton() {
        nuevo = false;
        BtActualizar.setEnabled(false);
        BtAlta.setBackground(new Color(255, 148, 42));
        ErrorID.setVisible(false);
        LConfirmar.setVisible(false);
        LAlta.setVisible(true);
        //tablaLoc.changeSelection(0,0,false,false);
    }
}
