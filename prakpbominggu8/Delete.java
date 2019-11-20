
import java.sql.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAURENSIUS
 */
public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pilih ID Buku yang ingin di Delete : ");
        int id = sc.nextInt();
        
        String delete = "delete from buku where id = "+id+";";
        
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko_buku","root","");
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(delete);
            
            String strSelect = "select * from buku";
            System.out.println("\n\nThe SQL Statement is: "+strSelect+"\n");
            
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
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
