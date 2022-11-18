package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/aep?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    public static Connection createConn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, "root", "");
        
        return conn;
    }
}
