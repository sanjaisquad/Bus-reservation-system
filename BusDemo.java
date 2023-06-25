package busreservation;

import java.awt.print.Book;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) throws ParseException, SQLException {

        //simple data base = list
//       BusDAO bus = new BusDAO();
//       bus.displaybusfnfo();
//        Booking booking=new Booking();
//        BookingDAO book = new BookingDAO();
//        book.insert(booking);
////        char usseropt='y';
//        Scanner scan=new Scanner(System.in);
//        while(useropt=='y'){
//            System.out.println("Enter y or n :");
//            useropt=scan.next().charAt(0);
//            if(useropt=='y'){
//                for(Bus b:buses){

//                }
//                //object for booking
//                Booking booking =new Booking();
//                //checking is available
//                if(booking.isAvailable(Booker,buses) == true){
//                    Booker.add(booking);
//                    System.out.println("yes your booking is conform");
//                }
//                else{
//                    System.out.println("Sorry it is not available");
//                }
//
//
//
//            }
//        }

        System.out.println("Welcome bus reservation system..........");
        System.out.println("CHELLO :)");
        BusDAO bus = new BusDAO();
        bus.displaybusfnfo();
      // Admin ad = new Admin();
        Booking book= new Booking();
        BookingDAO bookingDAO=new BookingDAO();
        bookingDAO.insert(book);


    }
}
