package db;
import java.sql.*;
//import com.mysql.jdbc.Connection;

public class DatabaseConnection {
    
    static Connection connection = null;
    
   public static Connection getconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
            
        }
    catch (Exception e) {
         e.printStackTrace();
        }
        return connection;
    }
}