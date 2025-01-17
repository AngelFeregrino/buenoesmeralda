/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package laesmeraldasanfelipe;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static laesmeraldasanfelipe.VentanaVenta.jTextFieldcantidad;

/**
 *
 * @author Angel Feregrino
 */
public class Salida extends javax.swing.JInternalFrame {

    /**
     * Creates new form producto
     */
    public static int total;

    public Salida() {
        initComponents();
        this.setSize(1040, 500);
        jTextField1.setText(null);
        jTextField5.setText(null);
        jTextFieldNombre.setText(null);
        jTextFieldDescripcion.setText(null);
        Calendar c2 = new GregorianCalendar();
        FechaEntrada.setCalendar(c2);
        
        Conexion.mostrarSalida(jTable1);

    }

    public variablesSalida dar_valores() {

        variablesSalida r = null;
        String salida_Producto_ID = jTextField1.getText();
        int añoIni = FechaEntrada.getCalendar().get(Calendar.YEAR);
        int mesIni = FechaEntrada.getCalendar().get(Calendar.MONTH);
        int diaIni = FechaEntrada.getCalendar().get(Calendar.DAY_OF_MONTH);
        String Fecha = "" + añoIni + "-" + (mesIni + 1) + "-" + diaIni;

        String Cantidad = jTextField5.getText();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FechaEntrada = new com.toedter.calendar.JDateChooser();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonInsertar = new javax.swing.JButton();
        jButtonLimipiar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setIconifiable(true);
        setResizable(true);
        setTitle("Ventas de Productos");
        setPreferredSize(new java.awt.Dimension(981, 504));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        jLabel1.setText("Producto ID");

        jLabel4.setText("Fecha");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel5.setText("Cantidad");

        jTextField1.setEditable(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldNombre.setEditable(false);

        jLabel6.setText("Nombre");

        jTextFieldDescripcion.setEditable(false);

        jLabel7.setText("Descripcion");

        jTextFieldCodigo.setEditable(false);

        jLabel8.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldDescripcion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar))
                    .addComponent(jTextFieldCodigo)
                    .addComponent(jTextField5)
                    .addComponent(FechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonInsertar.setText("Vender");
        jButtonInsertar.setPreferredSize(new java.awt.Dimension(75, 75));
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonLimipiar.setText("Limpiar");
        jButtonLimipiar.setPreferredSize(new java.awt.Dimension(72, 72));
        jButtonLimipiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimipiarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.setPreferredSize(new java.awt.Dimension(72, 72));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimipiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimipiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimipiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimipiarActionPerformed
        jTextField1.setText(null);
        jTextField5.setText(null);
        jTextFieldNombre.setText(null);
        jTextFieldDescripcion.setText(null);
        jTextFieldCodigo.setText(null);
    }//GEN-LAST:event_jButtonLimipiarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        BuscarProductoSalida obj = new BuscarProductoSalida();
        obj.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed

        if (jTextField1.getText().isEmpty() || jTextField5.getText().isEmpty()
                || jTextFieldCodigo.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty()
                || jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algun Campo esta Vacio");

        } else {
            VentanaVenta obj = new VentanaVenta();
            obj.setVisible(true);
            VentanaVenta.jTextField1.setText(jTextField1.getText());
            VentanaVenta.jTextFieldNombre.setText(jTextFieldNombre.getText());
            VentanaVenta.jTextFieldDescripcion.setText(jTextFieldDescripcion.getText());
            VentanaVenta.jTextFieldCodigo.setText(jTextFieldCodigo.getText());
            int añoIni = FechaEntrada.getCalendar().get(Calendar.YEAR);
            int mesIni = FechaEntrada.getCalendar().get(Calendar.MONTH);
            int diaIni = FechaEntrada.getCalendar().get(Calendar.DAY_OF_MONTH);
            String Fecha = "" + añoIni + "-" + (mesIni + 1) + "-" + diaIni;
            VentanaVenta.jTextFieldfecha.setText(Fecha);
            VentanaVenta.jTextFieldcantidad.setText(jTextField5.getText());

            String id = jTextField1.getText();
            String precio1;
            String query = "SELECT precio FROM producto WHERE producto.producto_id=" + id;

            try {
                precio1 = Conexion.ejecutarprecio(query);
                int precio = Integer.parseInt(precio1);
                String cant = jTextFieldcantidad.getText();
                int cantidad = Integer.parseInt(cant);
                total = precio * cantidad;
                String mostrartotal = String.valueOf(total);
                VentanaVenta.jLabelTotal.setText("$ " + mostrartotal);
            } catch (SQLException ex) {
                Logger.getLogger(Salida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /*        variablesSalida x = null;
        x = dar_valores();
        try {
            Conexion.guardarSalida(x);
        } catch (SQLException ex) {
            Logger.getLogger(Salida.class.getName()).log(Level.SEVERE, null, ex);
        }
        Conexion.mostrarSalida(jTable1);
        jTextField1.setText(null);
        jTextFieldNombre.setText(null);
        jTextFieldDescripcion.setText(null);
        jTextFieldCodigo.setText(null);*/
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (jTextField1.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEntrada;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonLimipiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextFieldCodigo;
    public static javax.swing.JTextField jTextFieldDescripcion;
    public static javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
