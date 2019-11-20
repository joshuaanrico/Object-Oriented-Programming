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
public class mystery {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        mystery(a);
    }
    public static void mystery(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i] / 2);
            }else{
                System.out.println(array[i] * 10);
            }
        }
    } 
}
