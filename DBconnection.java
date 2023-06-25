package busreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    //used this class to connect out data
    private static final String url="jdbc:mysql://localhost:3306/busreservation";
    private static final String user="root";
    private static final String password="";

    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

}
