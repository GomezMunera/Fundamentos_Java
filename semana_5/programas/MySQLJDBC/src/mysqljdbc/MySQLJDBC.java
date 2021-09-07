
package mysqljdbc;

//package org.mysqltutorial;

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new connection from MySQLJDBCUtil
        try (Connection conn = MySQLJDBCUtil.getConnection()) {
            
            // print out a message
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
