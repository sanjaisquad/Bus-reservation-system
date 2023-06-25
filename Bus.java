package busreservation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bus {
    private int busNo;
   private int ac;
    private int Capacity;

    //Constructor
    Bus(int no,int Ac,int capacityy){
        this.busNo=no;
        this.ac=Ac;
        this.Capacity=capacityy;
    }

    //get and set menthods

//    public int getCapacity(){
//        return Capacity;
//    }
//
//    public boolean getac(){
//        return ac;
//    }
//
//    public int getbusNo(){
//        return busNo;
//    }
//    //set method
//
//    public void setCapacity(int cap){
//        Capacity=cap;
//    }
//
//    public void setac(boolean ACC){
//        ac=ACC;
//
//    }

    //display bus information



    public void Availabality(){
        System.out.println("Available Seates: ");


    }

    public void Bus_insert() throws SQLException {
        String query="insert into businfo value("+busNo+","+ac+","+Capacity+")";
        Connection con= DBconnection.getconnection();
        Statement st = con.createStatement();
        int row =st.executeUpdate(query);
        System.out.println("DB connected "+row);
        con.close();

    }

}
