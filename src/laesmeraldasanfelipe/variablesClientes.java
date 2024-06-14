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
public class variablesClientes {
    private String id_Cliente;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private String direccion;

    public variablesClientes(String id_Cliente, String nombre, String apellido_pat, String apellido_mat, String direccion) {
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.direccion = direccion;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public static void seleccionarCliente(JTable paramTablaCliente, JTextField paramid_cliente, JTextField paramnombre, JTextField paramapellido_pat, JTextField paramapellido_mat, JTextField paramdireccion) {
        try {
            int fila = paramTablaCliente.getSelectedRow();
            if (fila >= 0) {
                paramid_cliente.setText(paramTablaCliente.getValueAt(fila, 0).toString());
                paramnombre.setText(paramTablaCliente.getValueAt(fila, 1).toString());
                paramapellido_pat.setText(paramTablaCliente.getValueAt(fila, 2).toString());
                paramapellido_mat.setText(paramTablaCliente.getValueAt(fila, 3).toString());
                paramdireccion.setText(paramTablaCliente.getValueAt(fila, 4).toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {
            
        }
    }
            
}
