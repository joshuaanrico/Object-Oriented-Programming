
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
public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tambah ID Buku : ");
        int id = sc.nextInt();
        System.out.println("Tambah Judul buku : ");
        String judul = sc.nextLine();
        System.out.println("Tambah Penulis buku : ");
        String penulis = sc.nextLine();
        System.out.println("Tambah Harga buku : ");
        double harga = sc.nextDouble();
        System.out.println("Tambah Jumlah buku : ");
        int jumlah = sc.nextInt();
        
        String insert = "INSERT INTO buku values ("+id+",'"+judul+"','"+penulis+"',"+harga+","+jumlah+");";
    
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko_buku","root","");
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(insert);
            
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
