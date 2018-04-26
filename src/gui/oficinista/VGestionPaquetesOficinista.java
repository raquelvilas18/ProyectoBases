/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.oficinista;

import gui.ModeloTablaTransportistas;
import gui.ModeloTablaPedidos;
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
        this.fa = fa;
        ModeloTablaPedidos tp = new ModeloTablaPedidos();
        tablaPedidos.setModel(tp);
        tp.setFilas(fa.pedidosSinTramitar());
        
        ModeloTablaTransportistas tt = new ModeloTablaTransportistas();
        tablaTransp.setModel(tt);
        //tt.setFilas(fa.obtenerTransportistas());

        JTableHeader th;
        th = this.tablaPedidos.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(89, 171, 36));
        th.setBackground(Color.WHITE);

        JTableHeader th2;
        th2 = this.tablaTransp.getTableHeader();
        th2.setFont(fuente);
        th2.setForeground(new Color(89, 171, 36));
        th2.setBackground(Color.WHITE);
        tablaPedidos.changeSelection(0, 0, false, false);

        LabelTramitar.setVisible(false);
        LabelEliminar.setVisible(false);
        errorLabel.setVisible(false);

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
        tablaPedidos = new javax.swing.JTable();
        BtTramitar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtEliminar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LabelTramitar = new java.awt.Label();
        LabelEliminar = new java.awt.Label();
        errorLabel = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTransp = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

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
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Transportistas");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 260, -1));

        jPanel6.setBackground(new java.awt.Color(116, 126, 173));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 600, 5));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaPedidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 580, 140));

        BtTramitar.setBackground(new java.awt.Color(89, 171, 36));
        BtTramitar.setToolTipText("");
        BtTramitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtTramitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtTramitarMouseClicked(evt);
            }
        });
        BtTramitar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(215, 215, 215));
        jLabel14.setText("Asignar pedido");
        BtTramitar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        BtTramitar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        add(BtTramitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 526, 270, 40));

        BtEliminar.setBackground(new java.awt.Color(89, 171, 36));
        BtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtEliminarMouseClicked(evt);
            }
        });
        BtEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(215, 215, 215));
        jLabel17.setText("Eliminar");
        BtEliminar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-26.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        BtEliminar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 33, 36));

        add(BtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 526, 300, 40));

        LabelTramitar.setForeground(new java.awt.Color(0, 153, 0));
        LabelTramitar.setText("Pedido tramitado correctamente");
        add(LabelTramitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        LabelEliminar.setForeground(new java.awt.Color(0, 153, 0));
        LabelEliminar.setText("Pedido eliminado correctamente");
        add(LabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("Ningun elemento seleccionado");
        add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablaTransp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaTransp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tablaTransp.setModel(new ModeloTablaTransportistas());
        tablaTransp.setGridColor(new java.awt.Color(255, 255, 255));
        tablaTransp.setRowSelectionAllowed(false);
        tablaTransp.setSelectionBackground(new java.awt.Color(89, 171, 36));
        tablaTransp.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaTransp);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 590, 150));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Pedidos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 260, -1));

        jPanel7.setBackground(new java.awt.Color(116, 126, 173));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 600, 5));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPedidosMouseClicked
        // TODO add your handling code here:
        LabelTramitar.setVisible(false);
        LabelEliminar.setVisible(false);
        errorLabel.setVisible(false);
    }//GEN-LAST:event_tablaPedidosMouseClicked

    private void BtTramitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtTramitarMouseClicked
        // TODO add your handling code here:
        ModeloTablaPedidos tp = new ModeloTablaPedidos();
        tablaPedidos.setModel(tp);
        fa.tramitarPedido(tp.getFila(tablaPedidos.getSelectedRow()).getCodigo());
        LabelTramitar.setVisible(true);
    }//GEN-LAST:event_BtTramitarMouseClicked

    private void BtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtEliminarMouseClicked
        // TODO add your handling code here:
        ModeloTablaPedidos tp = new ModeloTablaPedidos();
        tablaPedidos.setModel(tp);
        fa.eliminarPedido(tp.getFila(tablaPedidos.getSelectedRow()).getCodigo());
        LabelEliminar.setVisible(true);
    }//GEN-LAST:event_BtEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtEliminar;
    private javax.swing.JPanel BtTramitar;
    private java.awt.Label LabelEliminar;
    private java.awt.Label LabelTramitar;
    private java.awt.Label errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaTransp;
    // End of variables declaration//GEN-END:variables
}
