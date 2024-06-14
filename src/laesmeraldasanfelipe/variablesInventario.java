package laesmeraldasanfelipe;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Angel Feregrino
 */
public class variablesInventario {

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public variablesInventario(String id_producto, String nombre, String descripcion, String departamento, String identificador) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.identificador = identificador;
    }

    
    private String id_producto;
    private String nombre;
    private String descripcion;
    private String departamento;
    private String identificador;
    
    
    public static void seleccionarInventario(JTable paramTablaInventario, JTextField paramid_producto, JTextField paramnombre, JTextField paramdescripcion, JTextField paramdepartamento, JTextField paramidentificador) {
        try {
            int fila = paramTablaInventario.getSelectedRow();
            if (fila >= 0) {
                paramid_producto.setText(paramTablaInventario.getValueAt(fila, 0).toString());
                paramnombre.setText(paramTablaInventario.getValueAt(fila, 1).toString());
                paramdescripcion.setText(paramTablaInventario.getValueAt(fila, 2).toString());
                paramdepartamento.setText(paramTablaInventario.getValueAt(fila, 3).toString());  
                paramidentificador.setText(paramTablaInventario.getValueAt(fila, 4).toString());  
                
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {
            
        }
    }
}
