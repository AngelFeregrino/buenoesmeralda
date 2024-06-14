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
public class variablesProducto {

    public String getProducto_id() {
        return producto_id;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public String getStock() {
        return stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public variablesProducto(String producto_id, String entrada, String salida, String stock, String precio) {
        this.producto_id = producto_id;
        this.entrada = entrada;
        this.salida = salida;
        this.stock = stock;
        this.precio = precio;
    }
    
    private String producto_id;
    private String entrada;
    private String salida;
    private String stock;
    private String precio;
    
    public static void seleccionarProducto(JTable paramTablaProducto, JTextField paramproducto_id, JTextField paramentrada, JTextField paramsalida, JTextField paramstock, JTextField paramprecio) {
        try {
            int fila = paramTablaProducto.getSelectedRow();
            if (fila >= 0) {
                paramproducto_id.setText(paramTablaProducto.getValueAt(fila, 0).toString());
                paramentrada.setText(paramTablaProducto.getValueAt(fila, 1).toString());
                paramsalida.setText(paramTablaProducto.getValueAt(fila, 2).toString());
                paramstock.setText(paramTablaProducto.getValueAt(fila, 3).toString());
                paramprecio.setText(paramTablaProducto.getValueAt(fila, 4).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {
            
        }
    }
    
}
