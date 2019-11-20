/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LAURENSIUS
 */
public class tugas4_3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       ArrayList<Integer> a = new ArrayList<Integer>();
       
       
       //Input Arraylist
       int n = scan.nextInt();
       int[] aa = new int[n];
       for(int i=0; i<n; i++){
           int m = scan.nextInt();
           aa[i] = m;
           for(int j=0; j<m; j++){
               a.add(scan.nextInt());
           }
       }
       
       //Input Query
       int N = scan.nextInt();
       for(int i=0; i<N; i++){
           int x = scan.nextInt();
           int jumlah=0;
           for(int j=0; j<x-1; j++){
               jumlah = jumlah + aa[j];
           }
           int y = scan.nextInt();
           try{
                System.out.println(a.get((y+jumlah)-1));
           }catch (Exception e){
                System.out.println("ERROR!");
           }
           
       }
    }
}
