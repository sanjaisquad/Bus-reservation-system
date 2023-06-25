package busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.SQLException;


public class Booking {
    String passengerName;
     int BusNO;
     Date date;
     private String bookingnum;

    Scanner scan =new Scanner(System.in);

    Booking() throws ParseException, SQLException {
        System.out.println("Enter your name :");
        passengerName=scan.nextLine();
    System.out.println("Enter the bus your want :");
BusNO=scan.nextInt();
        System.out.println("Enter the date DD-MM-YYYY");
        String dateinstring=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        date=dateFormat.parse(dateinstring);
        BookingDAO bookk= new BookingDAO();
int book=bookk.bookings(BusNO,date);
        bookingnum = String.valueOf( BusNO)+String.valueOf(book);


    }

    public String get_bookingid(){
        return bookingnum;
    }

    public boolean isAvailable(int busNO) throws SQLException {
       //find the capacity of the bus "busno"
        BusDAO bus = new BusDAO();
        int capacity=bus.getCapacity(busNO);

        //find the bookings of that bus

        BookingDAO bookk= new BookingDAO();
        int book=bookk.bookings(busNO,date);

//saying seets are avilable true
        return book<capacity;
    }



}
