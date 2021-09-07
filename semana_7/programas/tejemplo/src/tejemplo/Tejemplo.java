/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tejemplo;

import java.sql.*;

public class Tejemplo {

    public static void main(String[] args) {
         try {
            
            Connection conexion = null;         
            
            //Se carga el driver correspondiente a MySQL (versión 8)
            Class.forName("com.mysql.cj.jdbc.Driver");
            /* Se obtiene una conexión a la base de datos usando el DriverManager
            Nos conectaremos a un servidor SQL en nuestra máquina (localhost)
            y a una base de datos */
            String url = "jdbc:mysql://localhost/tienda";
            String user      = "root";
            String password  = "CORUM2010";
            
            conexion = DriverManager.getConnection(url, user, password);
            
            //Se crea una consulta, en este caso para obtener todos los registros de la tabla vendedores
            String sentencia = "SELECT * FROM productos;";
            Statement consulta = conexion.createStatement();
            //Se crea un ResultSet con los resultados de la consulta y se itera sobre el mismo
            ResultSet resultados = consulta.executeQuery(sentencia);
            System.out.println("Listado de Productos");
            System.out.printf("%-20s %-20s %-10s %-10s %n","código de Barras","nombre","precio","stock");

            mostrar(resultados);
            
            conexion.close();
            consulta.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }
    
    public static void mostrar(ResultSet resultados) throws SQLException{
        int precio,cod_barras,stock;
            String nombre;
            while (resultados.next()) {
                cod_barras = resultados.getInt("cod_barras");
                nombre = resultados.getString("nombre");
                precio = resultados.getInt("precio");
                stock = resultados.getInt("stock");
                
                System.out.printf("%-20d %-20s %-10d %-10d %n",
                        cod_barras,nombre,precio,stock);
            }
    }
}
    

