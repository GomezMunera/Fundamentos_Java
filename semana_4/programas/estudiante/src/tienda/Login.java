/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author JHON ZAPATA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        pswContrasena.setVisible(true);
        txtMostrar.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        lblIngresoExitoso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        pnlTienda = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        plnUsuario = new javax.swing.JPanel();
        lblNombre = new java.awt.Label();
        lblPassword = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        pswContrasena = new javax.swing.JPasswordField();
        chkMostrar = new javax.swing.JCheckBox();
        txtMostrar = new javax.swing.JTextField();
        bttIngreso = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngresoExitoso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIngresoExitoso.setText("INGRESO AUTORIZADO");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(lblIngresoExitoso)
                .addGap(193, 193, 193))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lblIngresoExitoso)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda/imagen/ima.jpg"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 140));

        pnlTienda.setBackground(new java.awt.Color(0, 204, 204));

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogin.setText("LOGIN TIENDA");

        javax.swing.GroupLayout pnlTiendaLayout = new javax.swing.GroupLayout(pnlTienda);
        pnlTienda.setLayout(pnlTiendaLayout);
        pnlTiendaLayout.setHorizontalGroup(
            pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiendaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnlTiendaLayout.setVerticalGroup(
            pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiendaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 140));

        plnUsuario.setBackground(new java.awt.Color(204, 204, 255));

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        javax.swing.GroupLayout plnUsuarioLayout = new javax.swing.GroupLayout(plnUsuario);
        plnUsuario.setLayout(plnUsuarioLayout);
        plnUsuarioLayout.setHorizontalGroup(
            plnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnUsuarioLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(plnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        plnUsuarioLayout.setVerticalGroup(
            plnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnUsuarioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(plnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 270, 150));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 87, -1));
        jPanel2.add(pswContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 90, 30));

        chkMostrar.setText("ver contraseña");
        chkMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(chkMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));
        jPanel2.add(txtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 130, 140));

        bttIngreso.setText("INGRESAR");
        bttIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(bttIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarActionPerformed
        if (chkMostrar.isSelected()){
            pswContrasena.setVisible(false);
            txtMostrar.setVisible(true);
            txtMostrar.setText(String.valueOf(pswContrasena.getPassword()));
          
        }
            else{
            pswContrasena.setVisible(true);
            txtMostrar.setVisible(false);
        }
    }//GEN-LAST:event_chkMostrarActionPerformed

    private void bttIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIngresoActionPerformed
       if (autenticar()){
           jFrame1.setVisible(true);
           jFrame1.setBounds(20,20,400,350);
           this.setVisible(false);
       }
       else{
           JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña no valida", "esto es un error", 0);
           
       }
    }//GEN-LAST:event_bttIngresoActionPerformed
        public boolean autenticar(){
            String user = txtUsuario.getText();
        char passArray[] = pswContrasena.getPassword();

        for (int i = 0; i < passArray.length; i++) {
            char c = passArray[i];
            if (!Character.isLetterOrDigit(c)) return false;
        }
        String pass = new String(passArray);
        return user.equals("Jhon Zapata")&& pass.equals("ejemplotienda");
        
        /*
        boolean valido = false;
        for(Trabajador persona:trabajadores){
            valido = user.equals(persona.nombre) && pass.equals(persona.password);
            break;
        }

        return valido;
        */
        }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttIngreso;
    private javax.swing.JCheckBox chkMostrar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIngresoExitoso;
    private javax.swing.JLabel lblLogin;
    private java.awt.Label lblNombre;
    private java.awt.Label lblPassword;
    private javax.swing.JPanel plnUsuario;
    private javax.swing.JPanel pnlTienda;
    private javax.swing.JPasswordField pswContrasena;
    private javax.swing.JTextField txtMostrar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
