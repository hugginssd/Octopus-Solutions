package octopushr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Huggins
 */
public class Connexion {

    int i = 0;

    public Connection getConnetion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/octopus", "root", "");
        System.err.println("CONNECTED SUCCESSFULLY " + i);
        i++;

        return conn;
    }
}
