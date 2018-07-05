
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lutfijamaluddin
 * A Class to connect the program to the java database
 */

public class ConnectServer {
    public ConnectServer() throws SQLException { // Default Constructor
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/OOP", "ludwig", "password");
        System.out.println("Connection Established");
    }
}
