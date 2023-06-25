package busreservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {

    //displaying the bus information...........
    public void displaybusfnfo() throws SQLException {

        String query="Select * from businfo";

        Connection con = DBconnection.getconnection();
        Statement st = con.createStatement();


        ResultSet rs=st.executeQuery(query);

        while(rs.next()){
            System.out.print(" Bus no :"+ rs.getInt(1));

            if(rs.getInt(2)==0){
                System.out.print(" | AC : No ");
            }
            else{
                System.out.print(" | AC : Yes");
            }
            System.out.println(" | Capacity : "+rs.getInt(3));

        }
        System.out.println("...................................................");

con.close();
    }

    //find the avilable seats
    public int getCapacity(int id) throws SQLException {
        String query="select capacity from businfo where id="+id;
        Connection con = DBconnection.getconnection();
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
