/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author Dell
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnInventario = new javax.swing.JButton();
        BtnPuntosVenta = new javax.swing.JButton();
        BtnVentas = new javax.swing.JButton();
        BtnReporteVentas = new javax.swing.JButton();
        BtnRecursosHumanos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image11.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, 70));

        BtnInventario.setBackground(new java.awt.Color(255, 204, 0));
        BtnInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnInventario.setText("Inventario");
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 30));

        BtnPuntosVenta.setBackground(new java.awt.Color(255, 204, 0));
        BtnPuntosVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnPuntosVenta.setText("Puntos de Venta");
        BtnPuntosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntosVentaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPuntosVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, 30));

        BtnVentas.setBackground(new java.awt.Color(255, 204, 0));
        BtnVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnVentas.setText("Ventas");
        BtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, 30));

        BtnReporteVentas.setBackground(new java.awt.Color(255, 204, 0));
        BtnReporteVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnReporteVentas.setText("Reporte de Ventas");
        BtnReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 30));

        BtnRecursosHumanos.setBackground(new java.awt.Color(255, 204, 0));
        BtnRecursosHumanos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRecursosHumanos.setText("Recursos Humanos");
        BtnRecursosHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecursosHumanosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRecursosHumanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 150, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("La Preferida de Cajeme");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        // TODO add your handling code here:
        // Crear una instancia del formulario de Gestión de Inventario
    FrmInventario gestionInventario = new FrmInventario();
    
    // Mostrar el formulario de Gestión de Inventario
    gestionInventario.setVisible(true);
    
    // Opcional: Cerrar o esconder la ventana actual
    this.dispose(); // Esto cierra la ventana actual (opcional)
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnPuntosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntosVentaActionPerformed
    // Crear una nueva instancia de FrmPuntosVenta
    FrmPuntosVenta puntosVenta = new FrmPuntosVenta();
    
    // Hacer visible la ventana FrmPuntosVenta
    puntosVenta.setVisible(true);
    
   
    this.dispose(); // Cierra el FrmMenu
    this.setVisible(false); // Solo oculta el FrmMenu
    }//GEN-LAST:event_BtnPuntosVentaActionPerformed

    private void BtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentasActionPerformed
    // Crear una nueva instancia de FrmPuntosVenta
    FrmVentas registroPedido = new FrmVentas();
    
    // Hacer visible la ventana FrmPuntosVenta
    registroPedido.setVisible(true);
    
   
    this.dispose(); // Cierra el FrmMenu
    this.setVisible(false); // Solo oculta el FrmMenu
    }//GEN-LAST:event_BtnVentasActionPerformed

    private void BtnReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteVentasActionPerformed
        // TODO add your handling code here:
        // Crear una instancia del formulario de Reporte de Ventas
    FrmReporteVentas reporteVentas = new FrmReporteVentas();
    
    // Mostrar el formulario de Reporte de Ventas
    reporteVentas.setVisible(true);
    
    // Opcional: Cerrar o esconder la ventana actual
    this.dispose(); // Esto cierra la ventana actual (opcional)
    }//GEN-LAST:event_BtnReporteVentasActionPerformed

    private void BtnRecursosHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecursosHumanosActionPerformed
        // TODO add your handling code here:
        // Crear una instancia del formulario de Recursos Humanos
    FrmRecursosHumanos recursosHumanos = new FrmRecursosHumanos();
    
    // Mostrar el formulario de Recursos Humanos
    recursosHumanos.setVisible(true);
    
    // Opcional: Cerrar o esconder la ventana actual
    this.dispose(); // Esto cierra la ventana actual (opcional)
    }//GEN-LAST:event_BtnRecursosHumanosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnPuntosVenta;
    private javax.swing.JButton BtnRecursosHumanos;
    private javax.swing.JButton BtnReporteVentas;
    private javax.swing.JButton BtnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
