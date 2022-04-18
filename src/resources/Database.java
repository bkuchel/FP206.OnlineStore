package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String base = "langosta.store";
    private static final String user = "root";
    private static final String password = "@Admin123456";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/" + base;
    private static Connection con = null;

    public static Connection getConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch(SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
