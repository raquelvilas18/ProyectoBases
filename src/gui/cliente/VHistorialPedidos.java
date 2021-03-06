/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cliente;

import aplicacion.Usuario;
import gui.ModeloTablaPedidos;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.JLabel;
/**
 *
 * @author raquel
 */
public class VHistorialPedidos extends javax.swing.JPanel {

    /**
     * Creates new form VHistorialPedidos
     */

    private Usuario usuario;
    public VHistorialPedidos(aplicacion.FachadaAplicacion fa,java.awt.Frame parent,Usuario usuario) {
        ModeloTablaPedidos tp=new ModeloTablaPedidos();
        initComponents();
        tablaPedidos.setModel(tp);
        this.usuario=usuario;
        tp.setFilas(fa.pedidosPrecio(usuario.getUsuario()));
        //SELECCION Y CENTRADO DE TEXTO
        tablaPedidos.changeSelection(0,0,false,false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tablaPedidos.setDefaultRenderer(String.class, centerRenderer);
        tablaPedidos.setDefaultRenderer(Integer.class, centerRenderer);
        /////////////////////////////////
        JTableHeader th;
        th = this.tablaPedidos.getTableHeader();
        Font fuente = new Font("SansSerif", Font.PLAIN, 16);
        th.setFont(fuente);
        th.setForeground(new Color(65,105,225));
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

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
        jLabel2.setForeground(new java.awt.Color(221, 61, 1));
        jLabel2.setText("Historial de pedidos");
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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaPedidos.setBackground(new java.awt.Color(254, 254, 254));
        tablaPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaPedidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tablaPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tablaPedidos.setModel(new ModeloTablaPedidos());
        tablaPedidos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaPedidos.setSelectionBackground(new java.awt.Color(111, 133, 255));
        tablaPedidos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaPedidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 600, 360));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
