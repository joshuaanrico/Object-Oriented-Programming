
import java.util.Scanner;
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
public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pilih ID Buku yang ingin diupdate : ");
        int id = sc.nextInt();
        System.out.println("Update Judul buku : ");
        String judul = sc.nextLine();
        System.out.println("Update Penulis buku : ");
        String penulis = sc.nextLine();
        System.out.println("Update Harga buku : ");
        double harga = sc.nextDouble();
        System.out.println("Update Jumlah buku : ");
        int jumlah = sc.nextInt();
        
        String update = "UPDATE buku SET judul='"+judul+
                "',penulis='"+penulis+
                "',harga="+harga+
                ",jumlah="+jumlah+" WHERE id="+id+";";
    
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko_buku","root","");
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(update);
            
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
