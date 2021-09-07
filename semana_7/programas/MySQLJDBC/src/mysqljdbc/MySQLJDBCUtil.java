
package mysqljdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class MySQLJDBCUtil {
    
    /**
     * Get database connection
     *
     * @return a Connection object
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection conn = null;

       /* try (FileInputStream f = new FileInputStream("D:\\mysqljdbc.sql")) {

            // load the properties file
            Properties pros = new Properties();
            pros.load(f);

            // assign db parameters
            String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");*/
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
