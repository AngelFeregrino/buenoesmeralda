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
public class variablesEntrada {

    public String getEntrada_Producto_id() {
        return entrada_Producto_id;
    }

    public void setEntrada_Producto_id(String entrada_Producto_id) {
        this.entrada_Producto_id = entrada_Producto_id;
    }

    public String getEntrada_Fecha() {
        return entrada_Fecha;
    }

    public void setEntrada_Fecha(String entrada_Fecha) {
        this.entrada_Fecha = entrada_Fecha;
    }

    public String getEntrada_Cantidad() {
        return entrada_Cantidad;
    }

    public void setEntrada_Cantidad(String entrada_Cantidad) {
        this.entrada_Cantidad = entrada_Cantidad;
    }

    public variablesEntrada(String entrada_Producto_id, String entrada_Fecha, String entrada_Cantidad) {
        this.entrada_Producto_id = entrada_Producto_id;
        this.entrada_Fecha = entrada_Fecha;
        this.entrada_Cantidad = entrada_Cantidad;
    }
    private String entrada_Producto_id;
    private String entrada_Fecha;
    private String entrada_Cantidad;

    
}
