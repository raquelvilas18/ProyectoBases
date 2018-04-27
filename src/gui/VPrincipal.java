/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.trasnportista.VGestionPaquetesTransportista;
import gui.trasnportista.VPerfilTransportista;
import gui.trasnportista.VTransportista;
import gui.cliente.VPedido;
import gui.cliente.VHistorialPedidos;
import gui.cliente.VPedidosActivos;
import gui.administrador.VAdmin;
import gui.cliente.VPerfil;
import gui.cliente.VUsr;
import gui.oficinista.VPerfilOficinista;
import gui.oficinista.VGestionPaquetesOficinista;
import gui.oficinista.VGestionUsuariosOficinista;
import aplicacion.FachadaAplicacion;
import gui.oficinista.VOficinista;
import gui.administrador.VGestionUsuarios;
import gui.administrador.VGestionPaquetes;
import gui.administrador.VGestionEmpleados;
import gui.administrador.VGestionVehiculos;
import gui.administrador.VPerfilAdmin;
import aplicacion.Usuario;
import gui.administrador.VGestionLocales;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author carlo
 */
public class VPrincipal extends javax.swing.JFrame {

    aplicacion.FachadaAplicacion fa;
    private JPanel panelActivo;
   Usuario usuario;

    public FachadaAplicacion getFa() {
        return fa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setFa(FachadaAplicacion fa) {
        this.fa = fa;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    /**
     * Creates new form vPrincipal
     */
    public VPrincipal(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        initComponents();
        usuario=null;
        this.setLocationRelativeTo(null);
        autentificacionIncorrecta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelLocPaquete = new javax.swing.JPanel();
        textoUsuario4 = new javax.swing.JLabel();
        textoUsuario5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        JUsuario = new javax.swing.JTextField();
        textoUsuario3 = new javax.swing.JLabel();
        autentificacionIncorrecta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLocPaquete.setBackground(new java.awt.Color(255, 255, 255));
        panelLocPaquete.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(253, 156, 104)));
        panelLocPaquete.setForeground(new java.awt.Color(255, 255, 255));
        panelLocPaquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario4.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        textoUsuario4.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario4.setText("Localizador de paquetes");
        panelLocPaquete.add(textoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        textoUsuario5.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario5.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Cardboard_Box_30px.png"))); // NOI18N
        textoUsuario5.setText("Identificador:");
        panelLocPaquete.add(textoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        panelLocPaquete.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 450, 10));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(null);
        panelLocPaquete.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 250, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Search_30px.png"))); // NOI18N
        jButton4.setActionCommand("botonBuscar");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelLocPaquete.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        panelBase.add(panelLocPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 740, 290));

        panelLogin.setBackground(new java.awt.Color(214, 225, 254));
        panelLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario.setText("Contraseña:");
        panelLogin.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Male_User_100px.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, 110));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 80, 20));

        JContrasena.setBackground(new java.awt.Color(214, 225, 254));
        JContrasena.setForeground(new java.awt.Color(0, 0, 0));
        JContrasena.setBorder(null);
        JContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JContrasenaActionPerformed(evt);
            }
        });
        JContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JContrasenaKeyPressed(evt);
            }
        });
        panelLogin.add(JContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_User_32px.png"))); // NOI18N
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Key_2_28px.png"))); // NOI18N
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 102, 0));
        botonRegistrarse.setText("Registrate");
        botonRegistrarse.setBorder(null);
        botonRegistrarse.setContentAreaFilled(false);
        botonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        panelLogin.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 120, 40));

        JUsuario.setBackground(new java.awt.Color(214, 225, 254));
        JUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JUsuario.setBorder(null);
        JUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUsuarioActionPerformed(evt);
            }
        });
        panelLogin.add(JUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 30));

        textoUsuario3.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario3.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario3.setText("Usuario:");
        panelLogin.add(textoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        autentificacionIncorrecta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        autentificacionIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        autentificacionIncorrecta.setText("Autentificación incorrecta");
        panelLogin.add(autentificacionIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Entrar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));

        panelLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 130, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Aun no tienes cuenta? ");
        panelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelLogin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 230, 10));

        panelBase.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLogo.setForeground(new java.awt.Color(255, 255, 255));
        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Captura_2.JPG"))); // NOI18N
        panelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 200));

        panelBase.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 740, 260));

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Multiply_30px.png"))); // NOI18N
        botonCerrar.setActionCommand("botonBuscar");
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        panelBase.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 30));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
        if(usuario!=null) fa.conexion(this.usuario.getUsuario(), false);
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        panelLogin.setVisible(false);
        VRegistro panelRegistro = new VRegistro(fa, this);
        panelBase.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
        panelRegistro.setVisible(true);
        panelActivo = panelRegistro;

    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JUsuarioActionPerformed

    private void JContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JContrasenaActionPerformed


    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if ((!JUsuario.getText().equals("")) && (!JContrasena.getText().equals("")) && fa.comprobarAutentificacion(JUsuario.getText(), JContrasena.getText())) {
            //aquí ya está conectado, ahora decidimos que tipo de ventana requiere
            if (fa.getTipo(JUsuario.getText()).equals("oficinista")) {
                autentificacionIncorrecta.setVisible(false);
                ventanaOficinista(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                JContrasena.setText("");
            } else if (fa.getTipo(JUsuario.getText()).equals("transportista")) {
                autentificacionIncorrecta.setVisible(false);
                ventanaTransportista(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                JContrasena.setText("");
            } else if (fa.getTipo(JUsuario.getText()).equals("cliente")) {
                autentificacionIncorrecta.setVisible(false);
                ventanaUsuario(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                JContrasena.setText("");
            } else if (fa.getTipo(JUsuario.getText()).equals("administrador")) {
                autentificacionIncorrecta.setVisible(false);
                ventanaAdmin(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                JContrasena.setText("");
            }
        } else {
            autentificacionIncorrecta.setVisible(true);
        }    }//GEN-LAST:event_jPanel1MouseClicked

    private void JContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JContrasenaKeyPressed
        int key = evt.getKeyCode();
        if (evt.getKeyCode() == 10) {
            if ((!JUsuario.getText().equals("")) && (!JContrasena.getText().equals("")) && fa.comprobarAutentificacion(JUsuario.getText(), JContrasena.getText())) {
                if (fa.getTipo(JUsuario.getText()).equals("oficinista")) {
                    autentificacionIncorrecta.setVisible(false);
                    ventanaOficinista(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                    JContrasena.setText("");
                } else if (fa.getTipo(JUsuario.getText()).equals("transportista")) {
                    autentificacionIncorrecta.setVisible(false);
                    ventanaTransportista(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                    JContrasena.setText("");
                } else if (fa.getTipo(JUsuario.getText()).equals("cliente")) {
                    autentificacionIncorrecta.setVisible(false);
                    ventanaUsuario(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                    JContrasena.setText("");
                } else if (fa.getTipo(JUsuario.getText()).equals("administrador")) {
                    autentificacionIncorrecta.setVisible(false);
                    ventanaAdmin(fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
                    JContrasena.setText("");
                }
            } else {
                autentificacionIncorrecta.setVisible(true);
            }
        }
    }//GEN-LAST:event_JContrasenaKeyPressed

    public void ventanaPedido(Usuario usuario) {
        panelActivo.setVisible(false);
        VPedido panelPedido;
        if(usuario!=null) panelPedido = new VPedido(fa, usuario);
        else panelPedido = new VPedido(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        panelBase.add(panelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPedido;
    }

    public void ventanaPrincipal() {
        panelActivo.setVisible(false);
        panelLogin.setVisible(true);
    }

    public void ventanaUsuario(Usuario usuario) {
        if (panelActivo != null) {
            panelActivo.setVisible(false);
        }
        this.usuario=usuario;
        panelLocPaquete.setVisible(false);
        panelLogin.setVisible(false);
        panelLogo.setVisible(false);
        VUsr panelUsr = new VUsr(this, usuario);
        panelBase.add(panelUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
        panelUsr.setVisible(true);
        VPerfil panelPerfil = new VPerfil(fa, usuario);
        panelBase.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPerfil;
    }

    public void ventanaPerfilAdmin(Usuario usuario) {
        panelActivo.setVisible(false);
        VPerfilAdmin panel;
        if(usuario!=null){
            panel = new VPerfilAdmin(fa,usuario);
        }
        else{
            panel = new VPerfilAdmin(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        }
        panelBase.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panel;
    }

    public void ventanaPerfilTransportista(Usuario usuario) {
        panelActivo.setVisible(false);
        VPerfilTransportista panel;
        if(usuario!=null){
            panel = new VPerfilTransportista(fa, usuario);
        }
        else{
            panel = new VPerfilTransportista(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        }
        panelBase.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panel;
    }
    
    public void ventanaPerfilOficinista(Usuario usuario){
        panelActivo.setVisible(false);
        VPerfilOficinista panel;
        if(usuario!=null){
            panel = new VPerfilOficinista(fa, usuario);
        }
        else{
            panel = new VPerfilOficinista(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        }
        panelBase.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panel;
    }
    
    public void ventanaTransportista(Usuario usuario) {
        if (panelActivo != null) {
            panelActivo.setVisible(false);
        }
        this.usuario=usuario;
        panelLocPaquete.setVisible(false);
        panelLogin.setVisible(false);
        panelLogo.setVisible(false);
        VTransportista panelTransportista = new VTransportista(this, usuario);
        panelBase.add(panelTransportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
        panelTransportista.setVisible(true);
        VPerfilTransportista panelPerfil = new VPerfilTransportista(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        panelBase.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPerfil;
    }

    public void ventanaAdmin(Usuario usuario) {
        if (panelActivo != null) {
            panelActivo.setVisible(false);
        }
        this.usuario=usuario;
        panelLocPaquete.setVisible(false);
        panelLogin.setVisible(false);
        panelLogo.setVisible(false);
        VAdmin panelAdmin = new VAdmin(this, usuario);
        panelBase.add(panelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
        panelAdmin.setVisible(true);
        VPerfilAdmin panelPerfil = new VPerfilAdmin(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        panelBase.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPerfil;
    }

    public void ventanaOficinista(Usuario usuario) {
        if (panelActivo != null) {
            panelActivo.setVisible(false);
        }
        this.usuario=usuario;
        panelLocPaquete.setVisible(false);
        panelLogin.setVisible(false);
        panelLogo.setVisible(false);
        VOficinista panelAdmin = new VOficinista(this, usuario);
        panelBase.add(panelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
        panelAdmin.setVisible(true);
        VPerfilOficinista panelPerfil = new VPerfilOficinista(fa, fa.consultarUsuario(JUsuario.getText(), JContrasena.getText()));
        panelBase.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPerfil;
    }

    public void ventanaGestionEmpleados() {
        panelActivo.setVisible(false);
        VGestionEmpleados panelGU = new VGestionEmpleados(fa);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }

    public void ventanagestionUsuarios() {
        panelActivo.setVisible(false);
        VGestionUsuarios panelGU = new VGestionUsuarios(fa);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }
    
    public void ventanagestionUsuariosOficinista() {
        panelActivo.setVisible(false);
        VGestionUsuariosOficinista panelGU = new VGestionUsuariosOficinista(fa);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }
    
    public void ventanaGestionPedidosOficinista() {
        panelActivo.setVisible(false);
        VGestionPaquetesOficinista panelGU = new VGestionPaquetesOficinista(fa);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }
    
    
    public void ventanaGestionPedidosTransportista(Usuario u) {
        panelActivo.setVisible(false);
        VGestionPaquetesTransportista panelGU = new VGestionPaquetesTransportista(fa, u);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }   
    
    public void ventanagestionPaquetes() {
        panelActivo.setVisible(false);
        VGestionPaquetes panelGU = new VGestionPaquetes(fa);
        panelBase.add(panelGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelGU;
    }

    public void ventanaPerfil(Usuario usuario) {
        panelActivo.setVisible(false);
        VPerfil panelPerfil = new VPerfil(fa, usuario);
        panelBase.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPerfil;
    }

    public void ventanaPedidosActivos(Usuario usuario) {
        panelActivo.setVisible(false);
        VPedidosActivos panelPedidosA = new VPedidosActivos(fa, this, usuario);
        panelBase.add(panelPedidosA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelPedidosA;
    }

    public void ventanaHistorial(Usuario usuario) {
        panelActivo.setVisible(false);
        VHistorialPedidos panelHistorial = new VHistorialPedidos(fa, this, usuario);
        panelBase.add(panelHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelActivo = panelHistorial;
    }

    public void ventanaInicial() {

        panelActivo.setVisible(false);
        panelLocPaquete.setVisible(true);
        panelLogin.setVisible(true);
        panelLogo.setVisible(true);
    }
    
    public void ventanaGestionVehiculos(Usuario usr){
        
        panelActivo.setVisible(false);
        VGestionVehiculos panelGV = new VGestionVehiculos(fa,usr);
        panelBase.add(panelGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelGV.setVisible(true);
        panelActivo = panelGV;
        
    }
    
    public void ventanaGestionLocales(){
        
        panelActivo.setVisible(false);
        VGestionLocales panelGL = new VGestionLocales(fa);
        panelBase.add(panelGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 680, 580));
        panelGL.setVisible(true);
        panelActivo = panelGL;
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JContrasena;
    private javax.swing.JTextField JUsuario;
    private javax.swing.JLabel autentificacionIncorrecta;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelLocPaquete;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel textoUsuario3;
    private javax.swing.JLabel textoUsuario4;
    private javax.swing.JLabel textoUsuario5;
    // End of variables declaration//GEN-END:variables
}
