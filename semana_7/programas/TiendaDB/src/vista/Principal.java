/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejo
 */
public class Principal extends javax.swing.JFrame {

    public String instruccion;
    DefaultTableModel modeloTabla;
    
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setBounds(100, 100, 740, 400);
        
        this.btnAgregarV.setSize(200, 60);
        this.btnModificar.setSize(200, 60);
        this.btnResumen.setSize(200, 60);
        this.btnVendedores.setSize(200, 60);
        
        modeloTabla= new DefaultTableModel();
        modeloTabla.addColumn("Cedula Cliente");
        modeloTabla.addColumn("Nombre Cliente");
        modeloTabla.addColumn("Apellido Cliente");
        modeloTabla.addColumn("Num Compra");
        modeloTabla.addColumn("Nombre Vendedor");
        modeloTabla.addColumn("Apellido Vendedor");
        modeloTabla.addColumn("Lugar");
        this.tablaPrincipal.setModel(modeloTabla);
        
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResumen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarV = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVendedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResumen.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnResumen.setText("Resumen compras");
        btnResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResumenMouseClicked(evt);
            }
        });
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });
        getContentPane().add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, -1));

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tablaPrincipal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 720, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Panel Principal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 40));

        btnAgregarV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAgregarV.setText("Agregar Vendedores");
        btnAgregarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnModificar.setText("Modificar Inventario");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 130, -1));

        btnVendedores.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnVendedores.setText("Lista de Vendedores");
        getContentPane().add(btnVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed


    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResumenMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarV;
    private javax.swing.JButton btnModificar;
    public javax.swing.JButton btnResumen;
    private javax.swing.JButton btnVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaPrincipal;
    // End of variables declaration//GEN-END:variables
}