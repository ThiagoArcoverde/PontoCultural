package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String USER = "projeto-cultural@aep-projeto-cultural";
    private static final String PASS = "coxinha321@";
    private static final String URL = "jdbc:sqlserver://aep-projeto-cultural.database.windows.net:1433;database=aep-projeto-cultural;user=projeto-cultural@aep-projeto-cultural;password=coxinha321@;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    
    public static Connection createConn() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        
        return conn;
    }
}
