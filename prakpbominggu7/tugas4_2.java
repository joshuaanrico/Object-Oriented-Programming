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
public class tugas4_2 {
   static Double luas(Double d){
       return 3.14 * (d/2) * (d/2);
   } 
   static Double keliling(Double d){
       return 3.14 * d;
   }
   
   public static void main(String[] args) {
        Set<Double> d = new HashSet<>();
        d.add(20.0);
        d.add(10.18);
        d.add(7.5);
        d.add(10.13);
        d.add(13.13);
        int i=0;
        for(Iterator<Double> iterator = d.iterator(); iterator.hasNext(); ){
            Double D =iterator.next();
            System.out.println("Luas "+i+" : "+ luas(D));
            System.out.println("Keliling "+i+" : "+ keliling(D));
            System.out.println("--------------------");
            i++;
        }
   }
}
