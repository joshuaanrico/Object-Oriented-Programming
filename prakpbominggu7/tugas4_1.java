/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_prak7;
import java.util.*;
/**
 *
 * @author LAURENSIUS
 */
public class tugas4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> nama = new HashMap<String, String>();
        Map<String,String> prodi = new HashMap<String, String>();
        Map<String,String> semester = new HashMap<String, String>();
        Map<String,String> ukt = new HashMap<String, String>();
        String[] NIM = new String[5];
        //memasukan data mahasiswa
        for(int i=0; i<5; i++){
            String nim = scan.next();
            String Nama = scan.next();
            String Prodi = scan.next();
            String Semester = scan.next();
            String Ukt = scan.next();
            nama.put(nim,Nama);
            prodi.put(nim,Prodi);
            semester.put(nim,Semester);
            ukt.put(nim,Ukt);
            NIM[i] = nim;
        }
        
        //Menampilkan data mahasiswa
        for(int i=0; i<5; i++){
            System.out.println(NIM[i]);
            System.out.println( nama.values() );
            System.out.println( prodi.values() );
            System.out.println( semester.values() );
            System.out.println( ukt.values() );
        }
        
        
    }
}
