
package laesmeraldasanfelipe;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Feregrino
 */
public class VentanaVenta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVenta
     */
    public static String recibido1;

    public VentanaVenta() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public variablesSalida dar_valores() {

        variablesSalida r = null;
        String salida_Producto_ID = jTextField1.getText();
        String Fecha = jTextFieldfecha.getText();
        String Cantidad = jTextFieldcantidad.getText();
        r = new variablesSalida(salida_Producto_ID, Fecha, Cantidad);
        return r;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelinfo = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldcantidad = new javax.swing.JTextField();
        jTextFieldfecha = new javax.swing.JTextField();
        jPanelticket = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCambio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldRecibido = new javax.swing.JTextField();
        jPanelAceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelbarra = new javax.swing.JPanel();
        jPanelext = new javax.swing.JPanel();
        jLabelX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 93, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelinfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Producto"));
        jPanelinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jPanelinfo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 50, 170, -1));

        jLabel1.setText("Producto ID");
        jPanelinfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 29, -1, -1));

        jLabel6.setText("Nombre");
        jPanelinfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 75, -1, -1));

        jTextFieldNombre.setEditable(false);
        jPanelinfo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 96, 170, -1));

        jLabel7.setText("Descripcion");
        jPanelinfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 121, -1, -1));

        jTextFieldDescripcion.setEditable(false);
        jPanelinfo.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 142, 170, -1));

        jLabel8.setText("Codigo");
        jPanelinfo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 167, -1, -1));

        jTextFieldCodigo.setEditable(false);
        jPanelinfo.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 188, 170, -1));

        jLabel9.setText("Cantidad");
        jPanelinfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 259, -1, -1));

        jLabel12.setText("Fecha");
        jPanelinfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 213, -1, -1));

        jTextFieldcantidad.setEditable(false);
        jTextFieldcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldcantidadKeyTyped(evt);
            }
        });
        jPanelinfo.add(jTextFieldcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 280, 170, -1));

        jTextFieldfecha.setEditable(false);
        jPanelinfo.add(jTextFieldfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 234, 170, -1));

        jPanel1.add(jPanelinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 340));

        jPanelticket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelticket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total a Pagar");
        jPanelticket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 400, -1));

        jLabelTotal.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText(" ");
        jPanelticket.add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, 400, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dinero Recibido:");
        jPanelticket.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, 390, -1));

        jLabelCambio.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jLabelCambio.setForeground(new java.awt.Color(0, 0, 255));
        jLabelCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCambio.setText(" ");
        jPanelticket.add(jLabelCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cambio");
        jPanelticket.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, -1));

        jTextFieldRecibido.setText("0");
        jTextFieldRecibido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldRecibidoMouseClicked(evt);
            }
        });
        jTextFieldRecibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRecibidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRecibidoKeyTyped(evt);
            }
        });
        jPanelticket.add(jTextFieldRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        jPanelAceptar.setBackground(new java.awt.Color(255, 255, 0));
        jPanelAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAceptarMouseExited(evt);
            }
        });

        jLabelAceptar.setFont(new java.awt.Font("Roboto Thin", 3, 14)); // NOI18N
        jLabelAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laesmeraldasanfelipe/img/aceptar.png"))); // NOI18N
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanelAceptarLayout = new javax.swing.GroupLayout(jPanelAceptar);
        jPanelAceptar.setLayout(jPanelAceptarLayout);
        jPanelAceptarLayout.setHorizontalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanelAceptarLayout.setVerticalGroup(
            jPanelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanelticket.add(jPanelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, 50));

        jPanel1.add(jPanelticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 410, 340));

        jPanelbarra.setBackground(new java.awt.Color(255, 153, 102));
        jPanelbarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelbarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelext.setBackground(new java.awt.Color(255, 153, 102));
        jPanelext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelextMouseExited(evt);
            }
        });

        jLabelX.setBackground(new java.awt.Color(255, 255, 255));
        jLabelX.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelX.setText("X");

        javax.swing.GroupLayout jPanelextLayout = new javax.swing.GroupLayout(jPanelext);
        jPanelext.setLayout(jPanelextLayout);
        jPanelextLayout.setHorizontalGroup(
            jPanelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelX, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanelextLayout.setVerticalGroup(
            jPanelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelbarra.add(jPanelext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ticket");
        jPanelbarra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jPanel1.add(jPanelbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelextMouseClicked
        dispose();
    }//GEN-LAST:event_jPanelextMouseClicked

    private void jPanelextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelextMouseEntered
        jPanelext.setBackground(Color.red);
        jLabelX.setForeground(Color.white);
    }//GEN-LAST:event_jPanelextMouseEntered

    private void jPanelextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelextMouseExited
        jPanelext.setBackground(new Color(255, 153, 102));
        jLabelX.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPanelextMouseExited

    private void jTextFieldRecibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRecibidoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (jTextField1.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldRecibidoKeyTyped

    private void jPanelAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseEntered
        jPanelAceptar.setBackground(Color.red);
        jLabelAceptar.setForeground(Color.white);
    }//GEN-LAST:event_jPanelAceptarMouseEntered

    private void jPanelAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseExited
        jPanelAceptar.setBackground(Color.yellow);
        jLabelAceptar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPanelAceptarMouseExited

    private void jPanelAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAceptarMouseClicked
        variablesSalida x = null;
        x = dar_valores();
        try {
            Conexion.guardarSalida(x);
        } catch (SQLException ex) {
            Logger.getLogger(Salida.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText(null);
        jTextFieldcantidad.setText(null);
        jTextFieldfecha.setText(null);
        jTextFieldNombre.setText(null);
        jTextFieldDescripcion.setText(null);
        Conexion.mostrarSalida(Salida.jTable1);
        dispose();

    }//GEN-LAST:event_jPanelAceptarMouseClicked

    private void jTextFieldcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcantidadKeyTyped

        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (jTextField1.getText().trim().length() == 10) {   
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldcantidadKeyTyped

    private void jTextFieldRecibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRecibidoKeyReleased
        if(jTextFieldRecibido.getText().isEmpty()){
        }
        recibido1 = jTextFieldRecibido.getText();
        int recibido = Integer.parseInt(recibido1);
        int cambio = recibido - Salida.total;
        String mostrarcambio = String.valueOf(cambio);
        jLabelCambio.setText("$ " + mostrarcambio);
    }//GEN-LAST:event_jTextFieldRecibidoKeyReleased

    private void jTextFieldRecibidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRecibidoMouseClicked
        jTextFieldRecibido.setText("");
    }//GEN-LAST:event_jTextFieldRecibidoMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelCambio;
    public static javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAceptar;
    private javax.swing.JPanel jPanelbarra;
    private javax.swing.JPanel jPanelext;
    private javax.swing.JPanel jPanelinfo;
    private javax.swing.JPanel jPanelticket;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldCodigo;
    public static javax.swing.JTextField jTextFieldDescripcion;
    public static javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRecibido;
    public static javax.swing.JTextField jTextFieldcantidad;
    public static javax.swing.JTextField jTextFieldfecha;
    // End of variables declaration//GEN-END:variables

}
