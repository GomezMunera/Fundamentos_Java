
package tienda;

import java.sql.*;

public class Tienda {

    public static void main(String[] args) {
        try{             
            Connection conexion = null;  
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url       = "jdbc:mysql://localhost:3306/tienda";
            String user      = "root";
            String password  = "CORUM2010";
            conexion = DriverManager.getConnection(url, user, password);
            
            String sentencia = "SELECT * FROM productos;";
            Statement consulta = conexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);
            
            System.out.println("Listado de Productos");
            
            System.out.printf("%-20s %-20s %-20s %s%n","Código de barras",
                    "Producto","Precio","Stock");
            
            mostrarProductos(resultados);
            
            conexion.close();
            consulta.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (java.sql.SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }
    
    public static void mostrarProductos(ResultSet resultados) throws SQLException{
        int  cod_barras,precio,stock;
            String producto;
        while(resultados.next()){
                cod_barras = resultados.getInt("cod_barras");
                producto = resultados.getString("nombre");
                precio = resultados.getInt("precio");
                stock = resultados.getInt("stock");
                
                
                System.out.printf("%-20d %-20s %-20d %d%n",cod_barras,producto,
                        precio,stock);      
            }
    }
    
}
