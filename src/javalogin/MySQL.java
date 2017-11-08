package javalogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    public static Connection getDBConnection() {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            String u = "root";
            String p = "";
            con = (Connection) DriverManager.getConnection(url, u, p);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null; //comment option

        }

    }

}
