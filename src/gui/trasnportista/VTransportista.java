/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trasnportista;

import AppPackage.AnimationClass;
import aplicacion.Usuario;
import gui.VPrincipal;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author alumnogreibd
 */
public class VTransportista extends javax.swing.JPanel {
    private VPrincipal parent;
    private Usuario usuario;
    /**
     * Creates new form VTransportista
     */
    public VTransportista(VPrincipal parent, Usuario usuario ) {
        initComponents();
        this.parent = parent;
        this.usuario=usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Maps = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(183, 112, 255));
        setPreferredSize(new java.awt.Dimension(310, 586));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(194, 133, 248));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(215, 215, 215));
        jLabel7.setText("Gestión paquetes");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-caja-vacía-24.png"))); // NOI18N
        jLabel10.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 70));

        jPanel1.setBackground(new java.awt.Color(194, 133, 248));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-usuario-de-género-neutro-32.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(215, 215, 215));
        jLabel3.setText("Perfil de usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 310, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-colaborador-hombre-96.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, 110));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-lista-con-viñetas-50.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Maps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-mapas-de-google-32(1).png"))); // NOI18N
        Maps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Maps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapsMouseClicked(evt);
            }
        });
        add(Maps, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 150, 40, -1));

        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-apagar-26.png"))); // NOI18N
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 120, 40, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        parent.ventanaGestionPedidosTransportista(this.usuario);
        
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(194,133,248));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(210,168,245));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        parent.ventanaPerfilTransportista(this.usuario);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(194,133,248));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(210,168,245));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        AnimationClass maps = new AnimationClass();
        maps.jLabelXRight(-40, 10, 10, 5, Maps);

        AnimationClass sesion = new AnimationClass();
        maps.jLabelXRight(-40, 10, 10, 5, CerrarSesion);

        AnimationClass mapsl= new AnimationClass();
        maps.jLabelXLeft(10,-40, 10, 5, Maps);

        AnimationClass sesionl = new AnimationClass();
        maps.jLabelXLeft(10,-40, 10, 5, CerrarSesion);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void MapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapsMouseClicked
        openInternet();
    }//GEN-LAST:event_MapsMouseClicked

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        // TODO add your handling code here:
        if(usuario!=null) parent.getFa().conexion(this.usuario.getUsuario(), false);
        parent.setUsuario(null);
        this.setVisible(false);
        parent.ventanaInicial();
    }//GEN-LAST:event_CerrarSesionMouseClicked

    public void openInternet(){
        try{
            Desktop.getDesktop().browse(URI.create("https://www.google.es/maps"));
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Maps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
