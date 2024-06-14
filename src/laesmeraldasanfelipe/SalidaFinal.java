/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package laesmeraldasanfelipe;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel Feregrino
 */
public class SalidaFinal extends javax.swing.JInternalFrame {

    /**
     * Creates new form producto
     */
    public static int total = 0;
    public static String mostrartotal;
    public static String VenderTotal;

    public SalidaFinal() {
        initComponents();
        this.setSize(1040, 500);
        jTextField1.setText(null);
        jTextField5.setText(null);
        jTextFieldNombre.setText(null);
        jTextFieldDescripcion.setText(null);

        Calendar c2 = new GregorianCalendar();
        FechaEntrada.setCalendar(c2);

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
        jButtonEliminar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();

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

            },
            new String [] {
                "Producto ID", "Nombre", "Descripcion", "Codigo", "Cantidad", "Precio", "Fecha"
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

        jButtonInsertar.setText("Agregar");
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

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(72, 72));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");
        jButtonVender.setPreferredSize(new java.awt.Dimension(72, 72));
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButtonLimipiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimipiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
        BuscarProductoSalidaFinal obj = new BuscarProductoSalidaFinal();
        obj.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed

        if (jTextField1.getText().isEmpty() || jTextField5.getText().isEmpty()
                || jTextFieldCodigo.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty()
                || jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algun Campo esta Vacio");

        } else {
            String id = jTextField1.getText();
            String precio1;
            String query = "SELECT precio FROM producto WHERE producto.producto_id=" + id;
            try {
                precio1 = Conexion.ejecutarprecio(query);
                int precio = Integer.parseInt(precio1);
                String cant = jTextField5.getText();
                int cantidad = Integer.parseInt(cant);
                total = precio * cantidad;
                mostrartotal = String.valueOf(total);
            } catch (SQLException ex) {
                Logger.getLogger(SalidaFinal.class.getName()).log(Level.SEVERE, null, ex);
            }

            int añoIni = FechaEntrada.getCalendar().get(Calendar.YEAR);
            int mesIni = FechaEntrada.getCalendar().get(Calendar.MONTH);
            int diaIni = FechaEntrada.getCalendar().get(Calendar.DAY_OF_MONTH);
            String Fecha = "" + añoIni + "-" + (mesIni + 1) + "-" + diaIni;

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object[] fila = new Object[7];

            fila[0] = jTextField1.getText();

            fila[1] = jTextFieldNombre.getText();

            fila[2] = jTextFieldDescripcion.getText();

            fila[3] = jTextFieldCodigo.getText();

            fila[4] = jTextField5.getText();

            fila[5] = mostrartotal;

            fila[6] = Fecha;

            modelo.addRow(fila);
            jTable1.setModel(modelo);
            jTextField1.setText(null);
            jTextFieldNombre.setText(null);
            jTextFieldDescripcion.setText(null);
            jTextFieldCodigo.setText(null);
            jTextField5.setText(null);
            /*
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
                Logger.getLogger(SalidaFinal.class.getName()).log(Level.SEVERE, null, ex);
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
        }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (jTextField5.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //Sección 2
        int a = jTable1.getSelectedRow();
        //Sección 3
        if (a < 0) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");
        } else {
            //Sección 4
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");
            if (JOptionPane.OK_OPTION == confirmar) {
                //Sección 6
                model.removeRow(a);
                //Sección 7
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        

        VentanaVentaFinal obj = new VentanaVentaFinal();
        obj.setVisible(true);
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String fila[] = new String[7];
            fila[0] = jTable1.getValueAt(i, 0).toString();
            fila[1] = jTable1.getValueAt(i, 1).toString();
            fila[2] = jTable1.getValueAt(i, 2).toString();
            fila[3] = jTable1.getValueAt(i, 3).toString();
            fila[4] = jTable1.getValueAt(i, 4).toString();
            fila[5] = jTable1.getValueAt(i, 5).toString();
            fila[6] = jTable1.getValueAt(i, 6).toString();

            VentanaVentaFinal.model2.addRow(fila);
        }
        total=0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String precio = (String) jTable1.getValueAt(i, 5);
            int precioint = Integer.parseInt(precio);
            total=total+(precioint);  
        }
        
         mostrartotal = String.valueOf(total);
        VentanaVentaFinal.jLabelTotal.setText("$ " + mostrartotal);
        

    }//GEN-LAST:event_jButtonVenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEntrada;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonLimipiar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
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
