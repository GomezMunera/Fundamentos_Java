
package update_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLJDBCUtil {
    

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
       
       try{
           
           // db parameters
            String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
            String user      = "root";
            String password  = "CORUM2010";
            
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
