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
public class sum_el {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(sumElements(a));
    }
    public static int sumElements(int[] array){
        int jumlah=0;
        for(int i=0; i<array.length; i++){
            jumlah=jumlah+array[i];
        }
        return jumlah;
    }
}
