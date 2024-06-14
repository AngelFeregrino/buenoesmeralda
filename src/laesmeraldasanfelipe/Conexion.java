package laesmeraldasanfelipe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisa
 */
public class Conexion {

    private static Statement sentencia;
    private static ResultSet resultado;
    private static Connection conn = null;

    //public static int precio;
    //public static int cantidad;
    //public static int suma;
    public static void Conectar() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/sanfelipe";
        String user = LaEsmeraldaSanfelipe.usuario;
        String pass = LaEsmeraldaSanfelipe.contraseña;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            sentencia = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Conexion establecida con la Base de Datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido hacer la conexion " + e.getMessage());
            System.exit(1);
        }
    }

    public static void mostrarRegistroInventario(JTable paramTablaRegistroInventario) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID_PRODUCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("DEPARTAMENTO");
        modelo.addColumn("CODIGO");

        paramTablaRegistroInventario.setModel(modelo);
        String sql = "SELECT * FROM `inventario`;";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
            paramTablaRegistroInventario.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static DefaultTableModel buscarInventarioID(String buscar) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID_PRODUCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("DEPARTAMENTO");
        modelo.addColumn("CODIGO");

        String sql = "SELECT * FROM `inventario` WHERE id_producto LIKE " + buscar + ";";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
        } catch (Exception e) {
        }
        return modelo;
    }

    public static DefaultTableModel buscarInventarioNombre(String buscar) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID_PRODUCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("DEPARTAMENTO");
        modelo.addColumn("CODIGO");

        String sql = "SELECT * FROM inventario WHERE descripcion like '" + buscar + "'; ";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
        } catch (Exception e) {
        }
        return modelo;
    }

    public static int guardarInventario(variablesInventario x) {
        String q = "INSERT INTO `inventario`(`id_producto`, `nombre`, `descripcion`, `departamento`,`identificador`) VALUES ('" + x.getId_producto() + "','" + x.getNombre() + "','" + x.getDescripcion() + "','" + x.getDepartamento() + "','" + x.getIdentificador() + "')";
        String r = "INSERT INTO `producto`(`producto_id`, `entrada`, `salida`, `stock`, `precio`) VALUES ('" + x.getId_producto() + "','0','0','0','0')";
        int res = 1;
        try {
            ejecutar(q);
            res = 1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            res = 0;
        }
        return res;
    }

    public static void actualizaInventario(variablesInventario x) {
        String r = "INSERT INTO `producto`(`producto_id`, `entrada`, `salida`, `stock`, `precio`) VALUES ('" + x.getId_producto() + "','0','0','0','0')";
        ejecutar(r);
    }

    public static void modificarInventario(variablesInventario x) {
        String q = "UPDATE `inventario` SET `nombre` = '" + x.getNombre() + "', `descripcion` = '" + x.getDescripcion() + "', `departamento` = '" + x.getDepartamento() + "', `identificador` = '" + x.getIdentificador() + "' WHERE `inventario`.`id_producto` = " + x.getId_producto() + "; ";
        ejecutar(q);
    }

    public static void eliminarInventario(variablesInventario x) {
        String q = "DELETE FROM `inventario` WHERE id_producto=" + x.getId_producto() + ";";
        String r = "DELETE FROM `producto` WHERE producto_id=" + x.getId_producto() + ";";
        ejecutar(q);
        ejecutar(r);
    }

    public static void mostrarProducto(JTable paramTablaProducto) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("PRODUCTO_ID");
        modelo.addColumn("ENTRADA");
        modelo.addColumn("SALIDA");
        modelo.addColumn("STOCK");
        modelo.addColumn("PRECIO");

        paramTablaProducto.setModel(modelo);
        String sql = "SELECT * FROM `producto`;";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
            paramTablaProducto.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static void guardarProducto(variablesProducto x) {
        String q = "INSERT INTO `producto`(`producto_id`, `entrada`, `salida`, `stock`, `precio`) VALUES ('" + x.getProducto_id() + "','" + x.getEntrada() + "','" + x.getSalida() + "','" + x.getStock() + "','" + x.getPrecio() + "')";
        ejecutar(q);
    }

    public static void modificarPrecio(variablesPrecio x) {
        String q = "UPDATE `producto` SET `precio`='" + x.getPrecio() + "' WHERE producto_id=" + x.getID() + "";
        ejecutar(q);
    }

    public static void eliminarProducto(variablesProducto x) {
        String q = "DELETE FROM `producto` WHERE producto_id=" + x.getProducto_id() + ";";
        ejecutar(q);

    }

    public static void guardarEntrada(variablesEntrada x) {
        String q = "INSERT INTO `entrada`(`id_entrada`, `entrada_producto_id`, `entrada_fecha`, `entrada_cantidad`) VALUES ('NULL','" + x.getEntrada_Producto_id() + "','" + x.getEntrada_Fecha() + "','" + x.getEntrada_Cantidad() + "')";
        ejecutar(q);

    }

    public static void mostrarEntrada(JTable paramTablaEntrada) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID ENTRADA");
        modelo.addColumn("PRODUCTO ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("CANTIDAD");

        paramTablaEntrada.setModel(modelo);
        String sql = "SELECT * FROM `entrada`;";
        String[] datos = new String[4];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                modelo.addRow(datos);
            }
            paramTablaEntrada.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static void guardarSalida(variablesSalida x) throws SQLException {
        String q = "INSERT INTO `salida`(`id_salida`, `salida_producto_id`, `salida_fecha`, `salida_cantidad`) VALUES ('NULL','" + x.getSalida_Producto_id() + "','" + x.getSalida_Fecha() + "','" + x.getSalida_Cantidad() + "')";
        ejecutar(q);
        String precioS = "SELECT precio FROM producto WHERE producto.producto_id=" + x.getSalida_Producto_id() + "; ";
        String sumaS = "SELECT SUM(entrada) FROM caja;";
        String restaS = "SELECT SUM(salida) FROM caja;";

        int precio = ejecutar2(precioS);
        int suma = ejecutar2(sumaS);
        int resta = ejecutar2(restaS);
        int total;
        int cantidad=Integer.parseInt(x.getSalida_Cantidad());
        total = precio * cantidad ;
        
        
        
        int totalsql = total + suma;
        int totalfinal=totalsql-resta;

        String cajaentrada = "INSERT INTO `caja`(`id_transaccion`, `entrada`, `salida`, `total`, `descripcion`) "
                + "VALUES ('NULL','" + total + "','0','" + totalfinal + "','ventas')";
        ejecutar(cajaentrada);

    }

    public static void mostrarSalida(JTable paramTablaEntrada) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID SALIDA");
        modelo.addColumn("PRODUCTO ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("CANTIDAD");

        paramTablaEntrada.setModel(modelo);
        String sql = "SELECT * FROM `salida`;";
        String[] datos = new String[4];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                modelo.addRow(datos);
            }
            paramTablaEntrada.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static void mostrarCliente(JTable paramTablaCliente) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID CLIENTE");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO PATERNO");
        modelo.addColumn("APELLIDO MATERNO");
        modelo.addColumn("DIRECCION");

        paramTablaCliente.setModel(modelo);
        String sql = "SELECT * FROM `cliente`;";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
            //paramTablaCliente.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static void guardarClientes(variablesClientes x) {
        String q = "INSERT INTO `cliente`(`id_cliente`, `nombre`, `apellido paterno`, `apellido materno`, `direccion`) VALUES "
                + "('" + x.getId_Cliente() + "','" + x.getNombre() + "','" + x.getApellido_pat() + "','" + x.getApellido_mat() + "','" + x.getDireccion() + "')";
        ejecutar(q);
    }

    public static void modificarClientes(variablesClientes x) {
        String q = "UPDATE `cliente` SET `nombre`='" + x.getNombre() + "',`apellido paterno`='"
                + x.getApellido_pat() + "',`apellido materno`='" + x.getApellido_mat() + "',`direccion`='"
                + x.getDireccion() + "' WHERE id_cliente=" + x.getId_Cliente();
        ejecutar(q);
    }

    public static void eliminarClientes(variablesClientes x) {
        String q = "DELETE FROM `cliente` WHERE id_cliente=" + x.getId_Cliente() + ";";
        ejecutar(q);
    }

    public static void mostrarCaja(JTable paramTablaCaja) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID TRANSACCION");
        modelo.addColumn("ENTRADA");
        modelo.addColumn("SALIDA");
        modelo.addColumn("TOTAL");
        modelo.addColumn("DESCRIPCION");

        paramTablaCaja.setModel(modelo);
        String sql = "SELECT * FROM `caja`;";
        String[] datos = new String[5];

        try {
            ejecutar(sql);
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                modelo.addRow(datos);
            }
            paramTablaCaja.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 12: en mostrar tabla");
        }

    }

    public static void EntradaCaja(variablesCaja x) throws SQLException {
        String suma2 = "SELECT SUM(entrada) FROM caja;";
        int suma = ejecutar2(suma2);

        String temp = x.getCantidad();
        int cantidad = Integer.parseInt(temp);
        int total = suma + cantidad;
        
        String restaS = "SELECT SUM(salida) FROM caja;";
        int resta = ejecutar2(restaS);
        int sqlfinal=total-resta;
        

        String cajaentrada = "INSERT INTO `caja`(`id_transaccion`, `entrada`, `salida`, `total`, `descripcion`) "
                + "VALUES ('NULL','" + x.getCantidad() + "','0','" + sqlfinal + "','" + x.getDescripcion() + "')";
        ejecutar(cajaentrada);
    }

    public static void SalidaCaja(variablesCaja x) throws SQLException {

        String suma2 = "SELECT SUM(entrada) FROM caja;";
        int suma = ejecutar2(suma2);

        String temp = x.getCantidad();
        int cantidad = Integer.parseInt(temp);
        int total = suma - cantidad;
        
        String restaS = "SELECT SUM(salida) FROM caja;";
        int resta = ejecutar2(restaS);
        int sqlfinal=total-resta;

        String cajasalida = "INSERT INTO `caja`(`id_transaccion`, `entrada`, `salida`, `total`, `descripcion`) "
                + "VALUES ('NULL','0','"+x.getCantidad()+"','" + sqlfinal + "','" + x.getDescripcion() + "')";
        ejecutar(cajasalida);
    }

    public static void ejecutar(String q) {
        try {
            sentencia.executeUpdate(q);
            System.out.println("correcto");

        } catch (Exception e) {
            System.out.println("error");

        }
    }

    public static int ejecutar2(String q) throws SQLException {

        ResultSet myRS;
        PreparedStatement miConsulta; //Debajo de esta linea "con" es el nombre mi conexion//

        miConsulta = conn.prepareStatement(q);
        myRS = miConsulta.executeQuery();
//La finalidad de esto es guardar el resultado de la xconsulta en un String llamado tiempo"
        myRS.next();
        int valor = myRS.getInt(1);
//La siguiente linea solo imprime el String tiempo para corroborar el proceso//
        System.out.println("" + valor);
        return valor;
        
        

    }
    
    public static double preciodouble(String q) throws SQLException {

        ResultSet myRS;
        PreparedStatement miConsulta; //Debajo de esta linea "con" es el nombre mi conexion//

        miConsulta = conn.prepareStatement(q);
        myRS = miConsulta.executeQuery();
//La finalidad de esto es guardar el resultado de la xconsulta en un String llamado tiempo"
        myRS.next();
        double valor = myRS.getDouble(1);
//La siguiente linea solo imprime el String tiempo para corroborar el proceso//
        System.out.println("" + valor);
        return valor;
    }
    
    public static String ejecutarprecio(String q) throws SQLException {

        ResultSet myRS;
        PreparedStatement miConsulta; //Debajo de esta linea "con" es el nombre mi conexion//

        miConsulta = conn.prepareStatement(q);
        myRS = miConsulta.executeQuery();
//La finalidad de esto es guardar el resultado de la xconsulta en un String llamado tiempo"
        myRS.next();
        String valor = myRS.getString(1);
//La siguiente linea solo imprime el String tiempo para corroborar el proceso//
        System.out.println("" + valor);
        return valor;

    }
    

    public double entradaCaja() {
        double result = 0;
        String precio = "SELECT precio FROM producto WHERE id_producto=;";
        return result;
    }
    
    /*
    public static ArrayList<String> llenar_combo() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM `hotel`";
        try {
            resultado = sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("no_hotel"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static ArrayList<String> llenar_comboHot() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM `hotel`";
        try {
            resultado = sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("no_hotel"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static ArrayList<String> llenar_comboHues() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM `huesped`";
        try {
            resultado = sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("no_huesped"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static ArrayList<String> llenar_comboHab() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM `habitacion`";
        try {
            resultado = sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("no_hab"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static ArrayList<Object[]> TablaConsulta1(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q ="SELECT nombre,fecha_ini,fecha_fin FROM reservacion NATURAL JOIN huesped";
        try {
            resultado=sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[3];
                for(int i=0; i<3; i++){
                    filas[i]=resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    public static ArrayList<Object[]> TablaConsulta3(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q ="SELECT nombre, ciudad FROM hotel GROUP BY ciudad, Nombre";
        try {
            resultado=sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[2];
                for(int i=0; i<2; i++){
                    filas[i]=resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    public static ArrayList<Object[]> Consulta2(){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q ="SELECT COUNT(*) FROM huesped";
        try {
            resultado=sentencia.executeQuery(q);
            JOptionPane.showMessageDialog(null, "Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error Sentencia");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[1];
                for(int i=0; i<1; i++){
                    filas[i]=resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    }
     */

}
