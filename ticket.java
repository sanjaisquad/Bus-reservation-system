package busreservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ticket {
public void tick(String booking_num) throws SQLException {
    String query="Select * from booking where bookingid ="+booking_num;
    Connection con = DBconnection.getconnection();
    Statement st = con.createStatement();
    ResultSet rs= st.executeQuery(query);
    rs.next();
    System.out.println("................TICKET....................");
    System.out.println("Bus no :"+rs.getInt(1));
    System.out.println("Name   :"+rs.getString(2));
    System.out.println("Date   :"+rs.getDate(3));
    System.out.println("id     :"+rs.getString(4));
    System.out.println("..........................................");

    con.close();



}
}
