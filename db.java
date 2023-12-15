// code for class database 

package inventory.management.system;
import java.sql.*;

public class db {

    static Object mycon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Connection mycon;
    Statement s;
    public db()
    {
        try{
            
            mycon = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Vedant@12345");
            s = (inventory.management.system.Statement) mycon.createStatement();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
                
                
    }
}

//  Extra
/*package inventory.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static Connection mycon() {
        Connection con = null;

        
            try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace "your-rds-endpoint", "your-rds-port", "your-database-name", "your-username", and "your-password"
            String jdbcUrl = "jdbc:mysql://database-1.cssolgqrj4n3.ap-south-1.rds.amazonaws.com:3306/inventorymanagement";
            String username = "admin";
            String password = "OfAE4j9unFxwEncIRqxi";

            // Establish the connection
            con = DriverManager.getConnection(jdbcUrl, username, password);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
        */

