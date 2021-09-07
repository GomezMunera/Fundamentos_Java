
package conexiondata;

import java.sql.*;
import java.util.Date;

public class ConexionData {


    public static void main(String[] args) {
        try{
            int cc;
//            String nombre_1, nombre_2, apellido_1, apellido_2, 
//                   direccion, contacto_1, contacto_2;
            int CodMateria, edad,creditos;
                        
            String  nombre, apellido, materia;
            
            Date horario;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/colegio";
            Connection myConexion = DriverManager.getConnection(url, "root", "CORUM2010");
            
            String sentencia = "SELECT e.nombre, \n" +
                                "e.apellido, e.edad, e.cc,\n" +
                                "m.nombre as materia,\n" +
                                "m.codigo as CodMateria,\n" +
                                "m.horario, m.creditos\n" +
                                "FROM materias m, estudiante e, estudiante_has_materias h\n" +
                                "WHERE e.cc = h.Estudiante_cc AND  m.codigo=h.Materias_codigo\n" +
                                "ORDER BY e.nombre DESC;";
 
            Statement consulta = myConexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);
            System.out.printf("%s %-7s %-10s %-5s %-15s %-3s %-5s %-9s %n","cc","nombre","apellido","edad","materia","CodM","horario","creditos");
            while (resultados.next()) {
                
                cc = resultados.getInt("cc");
                nombre= resultados.getString("nombre");
                apellido= resultados.getString("apellido");
                edad= resultados.getInt("edad");
                materia= resultados.getString("materia");
                CodMateria= resultados.getInt("CodMateria");
                horario= resultados.getTime("horario");
                creditos= resultados.getInt("creditos");
  
                System.out.printf("%d %-7s %-10s %-5d %-15s %-3d %-8s %-9d %n",cc,nombre,apellido,edad,materia,CodMateria,horario,creditos);
            }
            
            myConexion.close();
            
        }catch(ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        }catch(SQLException e ){
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }  
}
