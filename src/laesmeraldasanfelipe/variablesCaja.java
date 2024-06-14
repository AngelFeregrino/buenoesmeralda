/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laesmeraldasanfelipe;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Angel Feregrino
 */
public class variablesCaja {

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public variablesCaja(String cantidad, String descripcion) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

   

    private String cantidad;
    private String descripcion;
    
        public static void seleccionarCaja(JTable paramTablaCaja, JTextField paramid_transaccion, JTextField paramentrada, JTextField paramsalida, JTextField paramtotal, JTextField paramdescripcion) {
        try {
            int fila = paramTablaCaja.getSelectedRow();
            if (fila >= 0) {
                paramid_transaccion.setText(paramTablaCaja.getValueAt(fila, 0).toString());
                paramentrada.setText(paramTablaCaja.getValueAt(fila, 1).toString());
                paramsalida.setText(paramTablaCaja.getValueAt(fila, 2).toString());
                paramtotal.setText(paramTablaCaja.getValueAt(fila, 3).toString());
                paramdescripcion.setText(paramTablaCaja.getValueAt(fila, 4).toString());
               
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {
            
        }
    }
    
}
