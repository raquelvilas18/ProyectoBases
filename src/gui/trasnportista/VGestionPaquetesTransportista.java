/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trasnportista;

import gui.ModeloTablaLocalizador;
import gui.ModeloTablaPaquetes;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import aplicacion.*;
import gui.ModeloTablaTransportistas;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author alumnogreibd
 */
public class VGestionPaquetesTransportista extends javax.swing.JPanel {

    aplicacion.FachadaAplicacion fa;
    Usuario t;

    /**
     * Creates new form VGestionPaquetes
     */
    public VGestionPaquetesTransportista(aplicacion.FachadaAplicacion fa, Usuario t) {
        initComponents();
        this.fa=fa;
        LabelError.setVisible(false);
        LabelCorrecto.setVisible(false);
        
        JTableHeader th;
        th = this.tablaPaquetes.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(183,112,255));
        th.setBackground(Color.WHITE);
        
        ModeloTablaPaquetes tp = new ModeloTablaPaquetes();
        tablaPaquetes.setModel(tp);
        tp.setFilas(fa.paquetesTransportista(t.getUsuario()));
        
        tablaPaquetes.changeSelection(0,0,false,false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tablaPaquetes.setDefaultRenderer(String.class, centerRenderer);
        tablaPaquetes.setDefaultRenderer(Integer.class, centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaquetes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TxtPosicion = new javax.swing.JTextField();
        BtActualizar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabelError = new java.awt.Label();
        LabelCorrecto = new java.awt.Label();
        BtnEntregado = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 159));
        jLabel2.setText("Gestion Paquetes");
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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaPaquetes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaPaquetes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tablaPaquetes.setModel(new ModeloTablaPaquetes());
        tablaPaquetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPaquetes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaPaquetes.setSelectionBackground(new java.awt.Color(183, 112, 255));
        tablaPaquetes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaPaquetes.setShowHorizontalLines(false);
        tablaPaquetes.setShowVerticalLines(false);
        tablaPaquetes.setSurrendersFocusOnKeystroke(true);
        tablaPaquetes.getTableHeader().setResizingAllowed(false);
        tablaPaquetes.getTableHeader().setReorderingAllowed(false);
        tablaPaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPaquetesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPaquetes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 590, 280));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(194, 133, 248));
        jLabel4.setText("Posicion:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 280, 10));

        TxtPosicion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TxtPosicion.setBorder(null);
        TxtPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPosicionActionPerformed(evt);
            }
        });
        add(TxtPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 200, -1));

        BtActualizar.setBackground(new java.awt.Color(194, 133, 248));
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
        jLabel14.setText("Actualizar posicion");
        BtActualizar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        BtActualizar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 33, 36));

        add(BtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 300, 60));

        LabelError.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelError.setForeground(new java.awt.Color(204, 0, 0));
        LabelError.setText("inserta una posicion");
        add(LabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 260, -1));

        LabelCorrecto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        LabelCorrecto.setForeground(new java.awt.Color(51, 153, 0));
        LabelCorrecto.setText("posicion actualizada correctamente");
        add(LabelCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 260, -1));

        BtnEntregado.setBackground(new java.awt.Color(194, 133, 248));
        BtnEntregado.setToolTipText("");
        BtnEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEntregadoMouseClicked(evt);
            }
        });
        BtnEntregado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(215, 215, 215));
        jLabel16.setText("Paquete entregado");
        BtnEntregado.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-mover-por-carretilla-30_1.png"))); // NOI18N
        jLabel17.setText("jLabel1");
        BtnEntregado.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 33, 36));

        add(BtnEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 300, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPaquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPaquetesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaPaquetesMouseClicked

    private void BtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtActualizarMouseClicked
        if(this.TxtPosicion.getText().isEmpty()){
            LabelCorrecto.setVisible(false);
            LabelError.setVisible(true);
        }else{
            LabelCorrecto.setVisible(true);
            LabelError.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtActualizarMouseClicked

    private void TxtPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPosicionActionPerformed

    private void BtnEntregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntregadoMouseClicked
        // TODO add your handling code here:
        ModeloTablaPaquetes tt;
        tt = (ModeloTablaPaquetes) tablaPaquetes.getModel();
        fa.paqueteEntregado(tt.getFila(tablaPaquetes.getSelectedRow()).getPedido().toString(), tt.getFila(tablaPaquetes.getSelectedRow()).getCodigo().toString());
    }//GEN-LAST:event_BtnEntregadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtActualizar;
    private javax.swing.JPanel BtnEntregado;
    private java.awt.Label LabelCorrecto;
    private java.awt.Label LabelError;
    private javax.swing.JTextField TxtPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaPaquetes;
    // End of variables declaration//GEN-END:variables
}
