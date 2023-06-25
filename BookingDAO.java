package busreservation;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BookingDAO {
    //inserting values into the database
    public void insert(Booking booking) throws SQLException {

        String query="insert into booking value(?,?,?,?)";
        Connection con =  DBconnection.getconnection();
        java.sql.Date sqldate= new java.sql.Date(booking.date.getTime());
        PreparedStatement ps= con.prepareStatement(query);
        ps.setInt(1,booking.BusNO);
        ps.setString(2,booking.passengerName);
        ps.setDate(3,sqldate);
        ps.setString(4,booking.get_bookingid());
        ps.executeUpdate();
        System.out.println("booking conform");
         con.close();
         ticket x = new ticket();

         x.tick(booking.get_bookingid());

    }

    public int bookings(int busno,Date date) throws SQLException {
        String query="select count(name) from booking where busno=? and  date=?";
        Connection con = DBconnection.getconnection();
        PreparedStatement ps = con.prepareStatement(query);
        java.sql.Date sqldate= new java.sql.Date(date.getTime());
        ps.setInt(1,busno);
        ps.setDate(2,sqldate);
        ResultSet rs= ps.executeQuery();
        rs.next();

        int a= rs.getInt(1);
        con.close();

        return a;

    }


}
