/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author raquel
 */
public class VPerfil extends javax.swing.JPanel {
    
    private String usuario;

    /**
     * Creates new form VPerfil
     */
    public VPerfil(String usuario) {
        initComponents();
        this.usuario = usuario;
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
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

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

        jTextField2.setBackground(new java.awt.Color(165, 180, 253));
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 470, 30));

        jLabel3.setBackground(new java.awt.Color(65, 105, 225));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 105, 225));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel3.setText("Id:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(65, 105, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-actualizar-26.png"))); // NOI18N
        jLabel10.setText("jLabel1");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(215, 215, 215));
        jLabel11.setText("Actualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

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

        jTextField9.setBackground(new java.awt.Color(165, 180, 253));
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(null);
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 470, 30));

        jLabel12.setBackground(new java.awt.Color(65, 105, 225));
        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(65, 105, 225));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel12.setText("Nombre:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel13.setBackground(new java.awt.Color(65, 105, 225));
        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(65, 105, 225));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel13.setText("Apellidos");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel14.setBackground(new java.awt.Color(65, 105, 225));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(65, 105, 225));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel14.setText("Correo");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel15.setBackground(new java.awt.Color(65, 105, 225));
        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(65, 105, 225));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel15.setText("Telefono");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel16.setBackground(new java.awt.Color(65, 105, 225));
        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(65, 105, 225));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel16.setText("DNI");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel17.setBackground(new java.awt.Color(65, 105, 225));
        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(65, 105, 225));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-derecha-3-24.png"))); // NOI18N
        jLabel17.setText("password");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jTextField15.setBackground(new java.awt.Color(165, 180, 253));
        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(null);
        add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 470, 30));

        jTextField17.setBackground(new java.awt.Color(165, 180, 253));
        jTextField17.setForeground(new java.awt.Color(153, 153, 153));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(null);
        add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 470, 30));

        jTextField18.setBackground(new java.awt.Color(165, 180, 253));
        jTextField18.setForeground(new java.awt.Color(153, 153, 153));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(null);
        add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 470, 30));

        jTextField19.setBackground(new java.awt.Color(165, 180, 253));
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(null);
        add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 470, 30));

        jTextField20.setBackground(new java.awt.Color(165, 180, 253));
        jTextField20.setForeground(new java.awt.Color(153, 153, 153));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(null);
        add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 470, 30));

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
