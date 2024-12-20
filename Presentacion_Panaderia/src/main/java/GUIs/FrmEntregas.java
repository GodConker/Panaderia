package GUIs;

import javax.swing.JOptionPane;

public class FrmEntregas extends javax.swing.JFrame {

    // Variables para los precios de los productos
    private final double precioDonas = 60.00;
    private final double precioEmpanadas = 50.00;
    private final double precioCoricos = 30.00;

    public FrmEntregas() {
        initComponents();
        setLocationRelativeTo(null);
        TxtfMontoTotal.setEditable(false); // Asegurarse de que el campo sea solo lectura
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBXCantidadPaqueteDonas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CBXCantidadPaqueteEmpanadas = new javax.swing.JComboBox<>();
        CBXCantidadPaqueteCoricos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CBXTiendas = new javax.swing.JComboBox<>();
        BtnConfirmarEntrega = new javax.swing.JButton();
        BtnRegresarMenu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CBXRepartidores = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        TxtfMontoTotal = new javax.swing.JTextField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image11.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Buscar Producto:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image11.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Entregas:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageDona.png"))); // NOI18N

        CBXCantidadPaqueteDonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1 Paquete", "2 Paquetes", "3 Paquetes", "4 Paquetes", "5 Paquetes", "6 Paquetes", "7 Paquetes", "8 Paquetes", "9 Paquetes", "10 Paquetes" }));
        CBXCantidadPaqueteDonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXCantidadPaqueteDonasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Paquete Donas (Cant. 6)");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageEmpanada.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Paquete Empanadas (Cant. 18)");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imageCorico.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Paquete Coricos (Cant. 12)");

        CBXCantidadPaqueteEmpanadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1 Paquete", "2 Paquetes", "3 Paquetes", "4 Paquetes", "5 Paquetes", "6 Paquetes", "7 Paquetes", "8 Paquetes", "9 Paquetes", "10 Paquetes" }));
        CBXCantidadPaqueteEmpanadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXCantidadPaqueteEmpanadasActionPerformed(evt);
            }
        });

        CBXCantidadPaqueteCoricos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1 Paquete", "2 Paquetes", "3 Paquetes", "4 Paquetes", "5 Paquetes", "6 Paquetes", "7 Paquetes", "8 Paquetes", "9 Paquetes", "10 Paquetes" }));
        CBXCantidadPaqueteCoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXCantidadPaqueteCoricosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Seleccione tienda a surtir:");

        CBXTiendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes \"Lety\"", "Tiendita \"Las Haciendas\"", "Miscelanea \"Del Pueblo\"", "Tiendita \"Seguro Social\"", "Abarrotes \"Surtido Rico\"" }));
        CBXTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXTiendasActionPerformed(evt);
            }
        });

        BtnConfirmarEntrega.setText("Confirmar Entrega");
        BtnConfirmarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarEntregaActionPerformed(evt);
            }
        });

        BtnRegresarMenu.setText("Regresar al Menú");
        BtnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarMenuActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Seleccione al repartidor:");

        CBXRepartidores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antonio Valle", "Daniel Castro", "Ramón Pérez", "Isaac Félix", " " }));
        CBXRepartidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXRepartidoresActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Monto Total:");

        TxtfMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfMontoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CBXCantidadPaqueteDonas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(CBXCantidadPaqueteEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(CBXCantidadPaqueteCoricos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConfirmarEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBXTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBXRepartidores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(CBXCantidadPaqueteDonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBXCantidadPaqueteEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXCantidadPaqueteCoricos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBXTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXRepartidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtfMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnConfirmarEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRegresarMenu)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarMenuActionPerformed
        // Crear una nueva instancia de FrmMenu
        FrmMenu menu = new FrmMenu();
        // Hacer visible la ventana FrmMenu
        menu.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_BtnRegresarMenuActionPerformed

    private void CBXCantidadPaqueteDonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXCantidadPaqueteDonasActionPerformed
        // TODO add your handling code here:
        String donasSeleccionadas = CBXCantidadPaqueteDonas.getSelectedItem().toString();
        calcularMontoTotal();

    }//GEN-LAST:event_CBXCantidadPaqueteDonasActionPerformed

    private void CBXCantidadPaqueteEmpanadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXCantidadPaqueteEmpanadasActionPerformed
        // TODO add your handling code here:
        String empanadasSeleccionadas = CBXCantidadPaqueteEmpanadas.getSelectedItem().toString();
        calcularMontoTotal();

    }//GEN-LAST:event_CBXCantidadPaqueteEmpanadasActionPerformed

    private void CBXCantidadPaqueteCoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXCantidadPaqueteCoricosActionPerformed
        // TODO add your handling code here:
        String coricosSeleccionados = CBXCantidadPaqueteCoricos.getSelectedItem().toString();
        calcularMontoTotal();


    }//GEN-LAST:event_CBXCantidadPaqueteCoricosActionPerformed

    private void CBXTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXTiendasActionPerformed
        // TODO add your handling code here:
        String tiendaSeleccionada = CBXTiendas.getSelectedItem().toString();

    }//GEN-LAST:event_CBXTiendasActionPerformed

    private void BtnConfirmarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarEntregaActionPerformed

        // Obtener los valores seleccionados de los combo boxes
        String donasSeleccionadas = CBXCantidadPaqueteDonas.getSelectedItem().toString();
        String empanadasSeleccionadas = CBXCantidadPaqueteEmpanadas.getSelectedItem().toString();
        String coricosSeleccionados = CBXCantidadPaqueteCoricos.getSelectedItem().toString();

        // Verificar si todos los combo boxes están en "Ninguno"
        if (donasSeleccionadas.equals("Ninguno") && empanadasSeleccionadas.equals("Ninguno") && coricosSeleccionados.equals("Ninguno")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona al menos un producto antes de confirmar la entrega.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se ha seleccionado ningún producto
        }

        String tiendaSeleccionada = CBXTiendas.getSelectedItem().toString();
        String repartidorSeleccionado = CBXRepartidores.getSelectedItem().toString(); // Suponiendo que tienes este JComboBox
        String montoTotal = TxtfMontoTotal.getText(); // Obtener el monto total

        // Crear un resumen del pedido
        String resumen = "Resumen del pedido:\n"
                + "Donas: " + donasSeleccionadas + " paquetes\n"
                + "Empanadas: " + empanadasSeleccionadas + " paquetes\n"
                + "Coricos: " + coricosSeleccionados + " paquetes\n"
                + "Tienda: " + tiendaSeleccionada + "\n"
                + "Repartidor: " + repartidorSeleccionado + "\n" // Añadir el repartidor
                + "Monto Total: $" + montoTotal + "\n\n"
                + "¿Deseas confirmar el pedido?";

        // Mostrar el resumen y pedir confirmación
        int respuesta = JOptionPane.showConfirmDialog(null, resumen, "Confirmar Pedido", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            // Mostrar mensaje de pedido exitoso
            JOptionPane.showMessageDialog(null, "¡Pedido exitoso!");

            // Preguntar si desea hacer otra entrega
            int otraEntrega = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra entrega?", "Nueva Entrega", JOptionPane.YES_NO_OPTION);

            if (otraEntrega == JOptionPane.YES_OPTION) {
                // Reiniciar campos para una nueva entrega
                CBXCantidadPaqueteDonas.setSelectedItem("Ninguno");
                CBXCantidadPaqueteEmpanadas.setSelectedItem("Ninguno");
                CBXCantidadPaqueteCoricos.setSelectedItem("Ninguno");
                TxtfMontoTotal.setText("0.00");
                // Puedes restablecer también otros campos si es necesario
            } else {
                // Redirigir al menú principal si el usuario no quiere hacer otra entrega
                redirigirAlMenu();
            }
        } else {
            // Mostrar mensaje de cancelación
            JOptionPane.showMessageDialog(null, "Pedido cancelado.");

            // No redirigir al menú principal, simplemente permanecer en la ventana actual.
        }
    }

// Método para redirigir al menú principal
    private void redirigirAlMenu() {
        // Crear una nueva instancia de FrmMenu
        FrmMenu menu = new FrmMenu();
        // Hacer visible la ventana FrmMenu
        menu.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }

    private void calcularMontoTotal() {
        double montoTotal = 0.0;

        // Obtener la cantidad seleccionada de cada ComboBox
        String donasSeleccionadas = CBXCantidadPaqueteDonas.getSelectedItem().toString();
        String empanadasSeleccionadas = CBXCantidadPaqueteEmpanadas.getSelectedItem().toString();
        String coricosSeleccionados = CBXCantidadPaqueteCoricos.getSelectedItem().toString();

        // Convertir las selecciones en números
        int cantidadDonas = obtenerCantidad(donasSeleccionadas);
        int cantidadEmpanadas = obtenerCantidad(empanadasSeleccionadas);
        int cantidadCoricos = obtenerCantidad(coricosSeleccionados);

        // Calcular el monto total
        montoTotal += cantidadDonas * precioDonas;
        montoTotal += cantidadEmpanadas * precioEmpanadas;
        montoTotal += cantidadCoricos * precioCoricos;

        // Mostrar el monto total en el TextField (solo lectura)
        TxtfMontoTotal.setText(String.format("%.2f", montoTotal));
    }

    private int obtenerCantidad(String seleccion) {
        if (seleccion.equals("Ninguno")) {
            return 0;
        } else {
            // Extraer el número de la cadena (ej: "3 Paquetes" -> 3)
            return Integer.parseInt(seleccion.split(" ")[0]);
        }

    }//GEN-LAST:event_BtnConfirmarEntregaActionPerformed

    private void CBXRepartidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXRepartidoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXRepartidoresActionPerformed

    private void TxtfMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfMontoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfMontoTotalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEntregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmarEntrega;
    private javax.swing.JButton BtnRegresarMenu;
    private javax.swing.JComboBox<String> CBXCantidadPaqueteCoricos;
    private javax.swing.JComboBox<String> CBXCantidadPaqueteDonas;
    private javax.swing.JComboBox<String> CBXCantidadPaqueteEmpanadas;
    private javax.swing.JComboBox<String> CBXRepartidores;
    private javax.swing.JComboBox<String> CBXTiendas;
    private javax.swing.JTextField TxtfMontoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
