/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laesmeraldasanfelipe;

/**
 *
 * @author Angel Feregrino
 */
public class variablesPrecio {

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public variablesPrecio(String ID, String Precio) {
        this.ID = ID;
        this.Precio = Precio;
    }
    private String ID;
    private String Precio;
}
