/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author LAURENSIUS
 */
public class tugas4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
