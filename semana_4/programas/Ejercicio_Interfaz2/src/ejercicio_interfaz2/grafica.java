/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_interfaz2;

/**
 *
 * @author johna
 */
public class grafica extends javax.swing.JFrame {

    public int suma;
    public grafica() {
        initComponents();
        progreso.setValue(sliderPrincipal.getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameFinal = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        lblFrame2 = new javax.swing.JLabel();
        botonVolverP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtprincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        frameInterno = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        botonFrameInterno = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        itemMenuVolver = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        panel_elementos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        progreso = new javax.swing.JProgressBar();
        sliderPrincipal = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        txtMostrar = new javax.swing.JTextField();
        btnAumentar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblMouse = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();

        frameFinal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrame2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFrame2.setText("Frame más interno");
        jPanel5.add(lblFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 80));

        botonVolverP.setText("Volver al principal");
        botonVolverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPActionPerformed(evt);
            }
        });
        jPanel5.add(botonVolverP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        javax.swing.GroupLayout frameFinalLayout = new javax.swing.GroupLayout(frameFinal.getContentPane());
        frameFinal.getContentPane().setLayout(frameFinalLayout);
        frameFinalLayout.setHorizontalGroup(
            frameFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        frameFinalLayout.setVerticalGroup(
            frameFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtprincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtprincipal.setText("Tienda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(txtprincipal)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtprincipal)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ima.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 100));

        frameInterno.setClosable(true);
        frameInterno.setIconifiable(true);
        frameInterno.setMaximizable(true);
        frameInterno.setResizable(true);
        frameInterno.setTitle("Frame Interno");
        frameInterno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameInterno.setVisible(false);
        frameInterno.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                frameInternoInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonFrameInterno.setText("Frame nuevo");
        botonFrameInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFrameInternoActionPerformed(evt);
            }
        });

        jMenu2.setText("File");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        itemMenuVolver.setText("volver");
        itemMenuVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuVolverMouseClicked(evt);
            }
        });
        itemMenuVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVolverActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuVolver);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        frameInterno.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout frameInternoLayout = new javax.swing.GroupLayout(frameInterno.getContentPane());
        frameInterno.getContentPane().setLayout(frameInternoLayout);
        frameInternoLayout.setHorizontalGroup(
            frameInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frameInternoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(botonFrameInterno)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        frameInternoLayout.setVerticalGroup(
            frameInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameInternoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(botonFrameInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(frameInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 270, 100));

        progreso.setBackground(new java.awt.Color(255, 255, 255));
        progreso.setForeground(new java.awt.Color(255, 255, 102));

        sliderPrincipal.setValue(25);
        sliderPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPrincipalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(sliderPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAumentar.setText("Aumentar");
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAumentar)
                    .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAumentar)
                .addGap(19, 19, 19))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/indi_2.jpg"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout panel_elementosLayout = new javax.swing.GroupLayout(panel_elementos);
        panel_elementos.setLayout(panel_elementosLayout);
        panel_elementosLayout.setHorizontalGroup(
            panel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_elementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_elementosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panel_elementosLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_elementosLayout.setVerticalGroup(
            panel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_elementosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_elementosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12))
        );

        jPanel1.add(panel_elementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, 180));

        lblMouse.setText("jLabel2");
        jPanel1.add(lblMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        menuPrincipal.setText("Abrir Frame Interno");
        menuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPrincipalMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        suma += 1;
        txtMostrar.setText(String.valueOf(suma));
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void sliderPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPrincipalStateChanged
        progreso.setValue(sliderPrincipal.getValue());
    }//GEN-LAST:event_sliderPrincipalStateChanged

    private void menuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrincipalMouseClicked
        frameInterno.setVisible(true);
        frameInterno.setBounds(50, 50, 400, 200);
        panel_elementos.setVisible(false);
    }//GEN-LAST:event_menuPrincipalMouseClicked

    private void botonFrameInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFrameInternoActionPerformed
            frameFinal.setVisible(true);
            frameFinal.setBounds(20,20,400,300);
            this.setVisible(false);
    }//GEN-LAST:event_botonFrameInternoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void itemMenuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuVolverMouseClicked
        
    }//GEN-LAST:event_itemMenuVolverMouseClicked

    private void itemMenuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVolverActionPerformed
        panel_elementos.setVisible(true);
        frameInterno.setVisible(false);
    }//GEN-LAST:event_itemMenuVolverActionPerformed

    private void botonVolverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPActionPerformed
        this.setVisible(true);
        frameFinal.setVisible(false);
        panel_elementos.setVisible(true);
        frameInterno.setVisible(false);
    }//GEN-LAST:event_botonVolverPActionPerformed

    private void frameInternoInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_frameInternoInternalFrameClosing
        panel_elementos.setVisible(true);
        frameInterno.setVisible(false);
    }//GEN-LAST:event_frameInternoInternalFrameClosing

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        lblMouse.setText("El mouse tiene un evento");
    }//GEN-LAST:event_jLabel3MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFrameInterno;
    private javax.swing.JButton botonVolverP;
    private javax.swing.JButton btnAumentar;
    private javax.swing.JFrame frameFinal;
    private javax.swing.JInternalFrame frameInterno;
    private javax.swing.JMenuItem itemMenuVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFrame2;
    private javax.swing.JLabel lblMouse;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JPanel panel_elementos;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JSlider sliderPrincipal;
    private javax.swing.JTextField txtMostrar;
    private javax.swing.JLabel txtprincipal;
    // End of variables declaration//GEN-END:variables
}
