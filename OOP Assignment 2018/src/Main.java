import java.sql.*;

public class Main {
	
	public static void main(String[] args) {
		// Starts the connection to the database
		Connection conn = null;
		
		// String dbName = "ludwig_OOP";
		String userName = "ludwig_Ludwig";
		String password = "Helloworld1996!";
		
		try { // Create connection to database
			String url = "jdbc:mysql://ludwig.press:3306/ludwig_OOP";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
		} catch (Exception e) {
			System.err.println("Connection Failed!");
			System.err.println(e.getMessage());
			e.printStackTrace();
			return;
		} finally {
			if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {}
            }
		}
		
		// Code
		System.out.println("Hello World!");
	}	
}
