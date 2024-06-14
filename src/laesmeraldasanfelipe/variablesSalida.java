/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laesmeraldasanfelipe;

/**
 *
 * @author Angel Feregrino
 */
public class variablesSalida {

    public String getSalida_Producto_id() {
        return salida_Producto_id;
    }

    public void setSalida_Producto_id(String salida_Producto_id) {
        this.salida_Producto_id = salida_Producto_id;
    }

    public String getSalida_Fecha() {
        return salida_Fecha;
    }

    public void setSalida_Fecha(String salida_Fecha) {
        this.salida_Fecha = salida_Fecha;
    }

    public String getSalida_Cantidad() {
        return salida_Cantidad;
    }

    public void setSalida_Cantidad(String salida_Cantidad) {
        this.salida_Cantidad = salida_Cantidad;
    }

    public variablesSalida(String salida_Producto_id, String salida_Fecha, String salida_Cantidad) {
        this.salida_Producto_id = salida_Producto_id;
        this.salida_Fecha = salida_Fecha;
        this.salida_Cantidad = salida_Cantidad;
    }

   

    
   
    private String salida_Producto_id;
    private String salida_Fecha;
    private String salida_Cantidad;
}
