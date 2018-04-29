/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

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
public class VAdmin extends javax.swing.JPanel {
    private VPrincipal parent;
    private Usuario usuario;

    /**
     * Creates new form VAdmin
     */
    public VAdmin(VPrincipal vp, Usuario usuario) {
        initComponents();
        parent = vp; 
        this.usuario = usuario;
        PanelEliminar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        no = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Si = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Maps = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(255, 157, 110));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-usuario-de-género-neutro-32.png"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(215, 215, 215));
        jLabel14.setText("Perfil de usuario");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        setBackground(new java.awt.Color(255, 148, 42));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-colaborador-hombre-96.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 110));

        jPanel2.setBackground(new java.awt.Color(250, 170, 49));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-usuario-de-género-neutro-32.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(215, 215, 215));
        jLabel5.setText("Perfil de usuario");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 310, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-lista-con-viñetas-50.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PanelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setText("Estás seguro de que quieres ");
        PanelEliminar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, 40));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel23.setText("eliminar tu cuenta de usuario ?");
        PanelEliminar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        no.setBackground(new java.awt.Color(204, 204, 204));
        no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        no.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("no");
        no.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -5, -1, 30));

        PanelEliminar.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, 20));

        Si.setBackground(new java.awt.Color(204, 204, 204));
        Si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SiMouseClicked(evt);
            }
        });
        Si.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("si");
        Si.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -5, -1, 30));

        PanelEliminar.add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        add(PanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 220, 70));

        jPanel1.setBackground(new java.awt.Color(250, 170, 49));
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-casa-24.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(215, 215, 215));
        jLabel3.setText("Gestion sucursales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 310, 40));

        jPanel7.setBackground(new java.awt.Color(250, 170, 49));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-grupo-de-usuarios-hombre-hombre-24.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(215, 215, 215));
        jLabel16.setText("Gestion empleados");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 310, 40));

        jPanel8.setBackground(new java.awt.Color(250, 170, 49));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-trabajo-permanente-32.png"))); // NOI18N
        jLabel17.setText("jLabel1");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(215, 215, 215));
        jLabel18.setText("Gestion clientes");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 310, 40));

        jPanel9.setBackground(new java.awt.Color(250, 170, 49));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-caja-vacía-24.png"))); // NOI18N
        jLabel19.setText("jLabel1");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel20.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(215, 215, 215));
        jLabel20.setText("Gestion paquetes");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 310, 40));

        jPanel10.setBackground(new java.awt.Color(250, 170, 49));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-camión-24.png"))); // NOI18N
        jLabel21.setText("jLabel1");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 33, 36));

        jLabel22.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(215, 215, 215));
        jLabel22.setText("Gestion vehículos");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 212, -1));

        add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 310, 40));

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

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-retire-hombre-usuario-26.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        parent.ventanaGestionLocales();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        parent.ventanaGestionEmpleados();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        parent.ventanagestionUsuarios();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel8.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel8.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        parent.ventanagestionPaquetes();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        parent.ventanaGestionVehiculos(this.usuario);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        jPanel10.setBackground(new Color(250, 170, 49));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        jPanel10.setBackground(new Color(255, 183, 75));
    }//GEN-LAST:event_jPanel10MouseEntered

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        parent.ventanaPerfilAdmin(this.usuario);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        // TODO add your handling code here:
        this.PanelEliminar.setVisible(false);
    }//GEN-LAST:event_noMouseClicked

    private void SiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiMouseClicked
        // TODO add your handling code here:
        this.parent.getFa().eliminarUsuario(this.usuario.getUsuario());
        parent.setUsuario(null);
        this.setVisible(false);
        parent.ventanaInicial();
    }//GEN-LAST:event_SiMouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        if (PanelEliminar.isVisible()) {
            this.PanelEliminar.setVisible(false);
        } else {
            this.PanelEliminar.setVisible(true);
        }
    }//GEN-LAST:event_jLabel24MouseClicked
    
    public void openInternet(){
        try{
            Desktop.getDesktop().browse(URI.create("https://www.google.es/maps"));
        }catch(Exception e){
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Maps;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel Si;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel no;
    // End of variables declaration//GEN-END:variables
}
