
package pruebabasedatos;

import java.sql.*;

public class PruebaBaseDatos {

    public static void main(String[] args) {
        try {
            int documento;
            Connection conexion = null;         
            String nombres, apellidos, ciudad;
            //Se carga el driver correspondiente a MySQL (versión 8)
            Class.forName("com.mysql.cj.jdbc.Driver");
            /* Se obtiene una conexión a la base de datos usando el DriverManager
            Nos conectaremos a un servidor SQL en nuestra máquina (localhost)
            y a una base de datos existente llamada concesionario */
            String url = "jdbc:mysql://localhost/concesionario";
            String user      = "root";
            String password  = "CORUM2010";
            conexion = DriverManager.getConnection(url, user, password);
            
            //Se crea una consulta, en este caso para obtener todos los registros de la tabla vendedores
            String sentencia = "SELECT * FROM vendedores;";
            Statement consulta = conexion.createStatement();
            //Se crea un ResultSet con los resultados de la consulta y se itera sobre el mismo
            ResultSet resultados = consulta.executeQuery(sentencia);
            System.out.println("Listado de Vendedores");
            while (resultados.next()) {
                documento = resultados.getInt("documento");
                nombres = resultados.getString("nombres");
                apellidos = resultados.getString("apellidos");
                ciudad = resultados.getString("ciudad");
                
                System.out.println("Documento: " + documento + "\t"+
                        "Nombres: " + nombres + "\t"+
                        "Apellidos: " + apellidos + "\t"+
                        "Ciudad: " + ciudad);
            }
            
            update(conexion);
            
            int id;
            id = insertCandidate(8787,"Luisa","Otero","Barranquilla",conexion);
            System.out.println(String.format("Un nuevo candidato ha sido agregado con el identificador %d.",id));
            
            conexion.close();
            consulta.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }
    
    public static void update(Connection conn) {

        String sqlUpdate = "UPDATE vendedores "
                + "SET apellidos = ? "
                + "WHERE documento = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // prepare data for update
            String apellidos = "Múnera";
            int documento = 1964;
            pstmt.setString(1, apellidos);
            pstmt.setInt(2, documento);

            int rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Fila afectada %d", rowAffected));

            // reuse the prepared statement
            apellidos = "Vanegas";
            documento = 6501;
            pstmt.setString(1, apellidos);
            pstmt.setInt(2, documento);

            rowAffected = pstmt.executeUpdate();
            System.out.println(String.format("Filas afectadas %d", rowAffected));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static int insertCandidate(int documento,String nombres,String apellidos, 
                                       String ciudad,Connection conn) {
        // for insert a new candidate
        ResultSet rs = null;
        int candidateId = 0;
        
        String sql = "INSERT INTO vendedores(documento,nombres,apellidos,ciudad) "
                   + "VALUES(?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setInt(1, documento);
            pstmt.setString(2, nombres);
            pstmt.setString(3, apellidos);
            pstmt.setString(4, ciudad);

            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // get candidate id
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    candidateId = rs.getInt(1);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return candidateId;
    }  
    
    
}
