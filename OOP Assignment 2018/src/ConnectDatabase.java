
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author lutfijamaluddin
 */
public class ConnectDatabase {
    
    public ConnectDatabase() { // Default constructor
    }
    
    public void connect() throws SQLException {
        Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/OOP", "ludwig", "password").createStatement();
    }
}
