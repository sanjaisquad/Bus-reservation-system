package busreservation;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
    int no;
  int Ac;
    int capacityy;
    Scanner scan = new Scanner(System.in);

    Admin() throws SQLException {
        System.out.println("Enter Bus no  :");
        no = scan.nextInt();
        System.out.println("Enter Bus AC  :");
        Ac = scan.nextInt();
        System.out.println("Enter Bus Cap :");
        capacityy = scan.nextInt();
        scan.close();
      Bus x=  new Bus(no,Ac,capacityy);
      try{
      x.Bus_insert();}
      catch (Exception e){
          System.out.println("not inserted"+e);
      }
        System.out.println("................");
    }




}
