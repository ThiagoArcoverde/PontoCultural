package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/aep?zeroDateTimeBehavior=convertToNull";
    
    public static Connection createConn() throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "");
        
        return conn;
    }
}
