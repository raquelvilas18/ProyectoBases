/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.FachadaAplicacion;
import aplicacion.Usuario;

/**
 *
 * @author raquel
 */
public class VPerfilOficinista extends javax.swing.JPanel {

    private Usuario usuario;
    private FachadaAplicacion fa;

    /**
     * Creates new form VPerfil
     */
    public VPerfilOficinista(FachadaAplicacion fa, Usuario usuario) {
        initComponents();
        JLabelMensaje.setVisible(false);
        this.usuario = usuario;
        this.actualizador(usuario);
        this.fa = fa;
        this.ActualizarLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jTextField16 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JActualizar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JNombre = new javax.swing.JTextField();
        JCorreo = new javax.swing.JTextField();
        JTelefono = new javax.swing.JTextField();
        JDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JLabelMensaje = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        JDNI = new javax.swing.JTextField();
        ActualizarLabel = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(65, 105, 225));
        jLabel6.setFont(new java.awt.Font("Samanata", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 105, 225));
        jLabel6.setText("Correo:");

        jTextField16.setBackground(new java.awt.Color(165, 180, 253));
        jTextField16.setForeground(new java.awt.Color(153, 153, 153));
        jTextField16.setBorder(null);

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(680, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoPequeno.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 300, 110));

        jId.setBackground(new java.awt.Color(143, 207, 122));
        jId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jId.setForeground(new java.awt.Color(0, 0, 0));
        jId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jId.setBorder(null);
        add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 470, 30));

        jLabel3.setBackground(new java.awt.Color(89, 171, 36));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(89, 171, 36));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel3.setText("Id:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        JActualizar.setBackground(new java.awt.Color(89, 171, 36));
        JActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JActualizarMouseEntered(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel10.setText("jLabel1");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(215, 215, 215));
        jLabel11.setText("Actualizar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout JActualizarLayout = new javax.swing.GroupLayout(JActualizar);
        JActualizar.setLayout(JActualizarLayout);
        JActualizarLayout.setHorizontalGroup(
            JActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        JActualizarLayout.setVerticalGroup(
            JActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        add(JActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

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

        jLabel12.setBackground(new java.awt.Color(89, 171, 36));
        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(89, 171, 36));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel12.setText("Nombre:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel14.setBackground(new java.awt.Color(89, 171, 36));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(89, 171, 36));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel14.setText("Correo");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel15.setBackground(new java.awt.Color(89, 171, 36));
        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(89, 171, 36));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel15.setText("Sexo");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jLabel16.setBackground(new java.awt.Color(89, 171, 36));
        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(89, 171, 36));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel16.setText("DIreccion");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        JNombre.setBackground(new java.awt.Color(143, 207, 122));
        JNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JNombre.setForeground(new java.awt.Color(0, 0, 0));
        JNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JNombre.setBorder(null);
        add(JNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 470, 30));

        JCorreo.setBackground(new java.awt.Color(143, 207, 122));
        JCorreo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JCorreo.setForeground(new java.awt.Color(0, 0, 0));
        JCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JCorreo.setBorder(null);
        add(JCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 470, 30));

        JTelefono.setBackground(new java.awt.Color(143, 207, 122));
        JTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTelefono.setForeground(new java.awt.Color(0, 0, 0));
        JTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTelefono.setBorder(null);
        add(JTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 470, 30));

        JDireccion.setBackground(new java.awt.Color(143, 207, 122));
        JDireccion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JDireccion.setForeground(new java.awt.Color(0, 0, 0));
        JDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDireccion.setBorder(null);
        add(JDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 470, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 61, 1));
        jLabel2.setText("Datos personales");
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

        JLabelMensaje.setForeground(new java.awt.Color(255, 0, 0));
        JLabelMensaje.setText("Id ya existente!");
        add(JLabelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, 20));

        jLabel17.setBackground(new java.awt.Color(89, 171, 36));
        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(89, 171, 36));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel17.setText("Telefono");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        sexo.setBackground(new java.awt.Color(143, 207, 122));
        sexo.setForeground(new java.awt.Color(0, 0, 0));
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "M" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 50, 30));

        jLabel18.setBackground(new java.awt.Color(89, 171, 36));
        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(89, 171, 36));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-Verde.png"))); // NOI18N
        jLabel18.setText("DNI");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        JDNI.setBackground(new java.awt.Color(143, 207, 122));
        JDNI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JDNI.setForeground(new java.awt.Color(0, 0, 0));
        JDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDNI.setBorder(null);
        add(JDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 470, 30));

        ActualizarLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ActualizarLabel.setForeground(new java.awt.Color(0, 153, 0));
        ActualizarLabel.setText("Datos actualizados correctamente");
        add(ActualizarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActualizarMouseClicked
        // TODO add your handling code here:
        if ((fa.consultarId(jId.getText()) || (jId.getText().equals(usuario.getUsuario()))) && !jId.getText().isEmpty()) {
            JLabelMensaje.setVisible(false);
            usuario.setCorreo(JCorreo.getText());
            usuario.setDireccion(JDireccion.getText());
            usuario.setDni(JDNI.getText());
            usuario.setNombre(JNombre.getText());
            usuario.setSexo((String) sexo.getSelectedItem());
            usuario.setTelefono(JTelefono.getText());
            usuario.setUsuario(jId.getText());
            fa.actualizar(usuario);
            this.ActualizarLabel.setVisible(true);

        } else {
            JLabelMensaje.setVisible(true);
        }
    }//GEN-LAST:event_jActualizarMouseClicked

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed


    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed

    }//GEN-LAST:event_jLabel11MousePressed

    private void JActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JActualizarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarLabel;
    private javax.swing.JPanel JActualizar;
    private javax.swing.JTextField JCorreo;
    private javax.swing.JTextField JDNI;
    private javax.swing.JTextField JDireccion;
    private javax.swing.JLabel JLabelMensaje;
    private javax.swing.JTextField JNombre;
    private javax.swing.JTextField JTelefono;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JComboBox<String> sexo;
    // End of variables declaration//GEN-END:variables
    public void actualizador(Usuario usuario) {
        JNombre.setText(usuario.getNombre());
        JDireccion.setText(usuario.getDni());
        JCorreo.setText(usuario.getCorreo());
        JDNI.setText(usuario.getDni());
        JTelefono.setText(usuario.getTelefono());
        JDireccion.setText(usuario.getDireccion());
        jId.setText(usuario.getUsuario());
        sexo.setSelectedItem(usuario.getSexo());
    }
}
