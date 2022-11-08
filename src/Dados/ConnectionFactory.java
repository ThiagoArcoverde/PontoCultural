package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String URL = "jdbc:sqlserver://aep-projeto-cultural.database.windows.net:1433;instanceName=MSSQLSERVER;databaseName=aep-projeto-cultural";
    
    public static Connection createConn() throws Exception {
        Connection conn = DriverManager.getConnection(URL, "projeto-cultural", "coxinha321@");
        
        return conn;
    }
}
