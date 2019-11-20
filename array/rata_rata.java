/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author LAURENSIUS
 */
public class rata_rata {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a));
    }
    public static double avgElements(int[] array){
        double rata,jumlah=0;
        for(int i=0; i<array.length; i++){
            jumlah=jumlah+array[i];
        }
        rata=jumlah/array.length;
        return rata;
    }
            
}
