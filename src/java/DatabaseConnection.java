import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
// This class can be used to initialize the database connection
public class DatabaseConnection {
    protected static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "org.apache.derby.jdbc.ClientDriver";
        String dbURL = "jdbc:derby://localhost:1527/Student";
        // Database name to access
        
        String dbUsername = "root";
        String dbPassword = "toor";
  
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL,
                                                     dbUsername, 
                                                     dbPassword);
        return con;
    }
}