
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class modelo1 {
    
    //OJO LA CONEXION NO PUEDE SER UN ATRIBUTO, GENERA ERRORES.
    //private Connection modConexion;
    
    private ResultSet modResultados;
    private String modInstruccion;
//    
    public ArrayList<String> nombreCliente;
    public ArrayList<String> apellidoCliente;
    public ArrayList<String> nombreVendedor;
    public ArrayList<String> apellidoVendedor;
    public ArrayList<String> lugar;
    public ArrayList<Integer> cedulaCliente;
    public ArrayList<Integer> num_compra;
    
    
    private Connection iniciarConexion(){
        Connection nuevaCon=null;
        try {
            String url = "jdbc:mysql://localhost:3306/tienda_n";
            String user      = "root";
            String password  = "CORUM2010";
            nuevaCon = DriverManager.getConnection(url, user, password);
            Class.forName("com.mysql.cj.jdbc.Driver");
        
        }catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage() + 
                    ". >>> Error de Conexion 1!!");
        }catch (SQLException ex){
            System.out.println(ex.getMessage() + 
                    ". >>> Error de Conexion 2!!");
        }
        return nuevaCon;
    }
    
    private void finalizarConexion(Connection conexion) {
    if (conexion != null) {
        try {
            conexion.close();
            conexion = null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + 
                    ". >>> Error de Desconexion!!");
        }
    }
    }
    
    
    public modelo1() throws ClassNotFoundException, SQLException{
        
        nombreCliente = new ArrayList<>();
        apellidoCliente  = new ArrayList<>();
        nombreVendedor  = new ArrayList<>();
        apellidoVendedor  = new ArrayList<>();
        lugar  = new ArrayList<>();
        cedulaCliente = new ArrayList<>();
        num_compra = new ArrayList<>();
    }
    
    public void ejeConsulta(String sqlConsulta) throws SQLException{
        Connection conexion = this.iniciarConexion();
        Statement consulta = conexion.createStatement();
        ResultSet resultados = consulta.executeQuery(sqlConsulta);
        this.modResultados=resultados;
        this.recibirData();
        this.finalizarConexion(conexion);
        consulta.close();
    }
    
    public void recibirData() throws SQLException{
        //Connection conexion = this.iniciarConexion();
        while (this.modResultados.next()) {
            int cc = this.modResultados.getInt("cedulaCliente");
            //System.out.println(String.valueOf(cc));
            this.cedulaCliente.add(this.modResultados.getInt("cedulaCliente"));
            nombreCliente.add(this.modResultados.getString("nombreCliente"));
            apellidoCliente.add(this.modResultados.getString("apellidoCliente"));
            num_compra.add(this.modResultados.getInt("num_compra"));
            nombreVendedor.add(this.modResultados.getString("nombreVendedor"));
            apellidoVendedor.add(this.modResultados.getString("apellidoVendedor"));
            lugar.add(this.modResultados.getString("lugar"));
            
        }
        //System.out.println(this.cedulaCliente.toString());
        //System.out.println(this.nombreCliente.toString());
        //this.finalizarConexion(conexion);
    }
    
}
