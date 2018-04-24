/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alumnogreibd
 */
public class VGestionPaquetesOficinista extends javax.swing.JPanel {

    aplicacion.FachadaAplicacion fa;

    /**
     * Creates new form VGestionPaquetes
     */
    public VGestionPaquetesOficinista(aplicacion.FachadaAplicacion fa) {
        initComponents();
        this.fa=fa;
        ModeloTablaPedidos tp = new ModeloTablaPedidos();
        tablaPedidos.setModel(tp);
        tp.setFilas(fa.pedidosSinTramitar(this.CodigoTxt.getText()));
        
        JTableHeader th;
        th = this.tablaPedidos.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(89,171,36));
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CodigoTxt = new javax.swing.JTextField();
        FiltroNombre = new javax.swing.JTextField();
        BtActualizar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtBaja = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

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
        jLabel2.setText("Gestion Pedidos");
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-google-web-search-Verde.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaPedidos.setModel(new ModeloTablaPedidos());
        tablaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPedidos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaPedidos.setSelectionBackground(new java.awt.Color(89, 171, 36));
        tablaPedidos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaPedidos.setShowHorizontalLines(false);
        tablaPedidos.setShowVerticalLines(false);
        tablaPedidos.setSurrendersFocusOnKeystroke(true);
        tablaPedidos.getTableHeader().setResizingAllowed(false);
        tablaPedidos.getTableHeader().setReorderingAllowed(false);
        tablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPedidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 190, 590, 290));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(89, 171, 36));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel4.setText("Codigo:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 500, 10));

        CodigoTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        CodigoTxt.setBorder(null);
        CodigoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTxtActionPerformed(evt);
            }
        });
        add(CodigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 420, -1));

        FiltroNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FiltroNombre.setBorder(null);
        FiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroNombreActionPerformed(evt);
            }
        });
        add(FiltroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 150, -1));

        BtActualizar.setBackground(new java.awt.Color(89, 171, 36));
        BtActualizar.setToolTipText("");
        BtActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(215, 215, 215));
        jLabel14.setText("Actualizar");
        BtActualizar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        BtActualizar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 33, 36));

        add(BtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 516, 270, 50));

        BtBaja.setBackground(new java.awt.Color(89, 171, 36));
        BtBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtBaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(215, 215, 215));
        jLabel17.setText("Eliminar");
        BtBaja.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-26.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        BtBaja.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 33, 36));

        add(BtBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 516, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        ModeloTablaUsuarios tp = new ModeloTablaUsuarios();
        tablaPedidos.setModel(tp);
        tp.setFilas(fa.obtenerUsuarios(this.CodigoTxt.getText(), this.FiltroNombre.getText()));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidosMouseClicked
        // TODO add your handling code here:
        /*ErrorAlta.setVisible(false);
        AltaCorrecta.setVisible(false);
        LabelActualizar.setVisible(false);*/
    }//GEN-LAST:event_tablaPedidosMouseClicked

    private void CodigoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTxtActionPerformed

    private void FiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtActualizar;
    private javax.swing.JPanel BtBaja;
    private javax.swing.JTextField CodigoTxt;
    private javax.swing.JTextField FiltroNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
