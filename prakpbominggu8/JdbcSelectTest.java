
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAURENSIUS
 */
public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/toko_buku", "root", "");
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from buku";
            System.out.println("The SQL Statement is: "+strSelect+"\n");
            
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are: ");
            int rowCount=0;
            while(rset.next()){
                String title = rset.getString("judul");
                double price = rset.getDouble("harga");
                int qty = rset.getInt("jumlah");
                System.out.println(title+", "+price+", "+qty);
                ++rowCount;
            }
            System.out.println("Total number of records = "+ rowCount);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
