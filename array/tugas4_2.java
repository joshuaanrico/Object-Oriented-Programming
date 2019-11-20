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
public class tugas4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a6 = new int[6][6];

        for(int i=0; i<6; i++){ 
            for(int j=0; j<6; j++){
                a6[i][j] = scan.nextInt();
            } 
        }
        
        int jumlah,jumlahmaks=-999;
        for(int i=0; i<3; i++){ 
            for(int j=0; j<3; j++){
                jumlah=a6[i][j] + a6[i][j+1] + a6[i][j+2]
                       + a6[i+1][j+1]
                       + a6[i+2][j]+a6[i+2][j+1]+a6[i+2][j+2];
                
                //deklarasi jumlah maks
                if(jumlah>jumlahmaks){
                    jumlahmaks=jumlah;
                }
            } 
        }
        
        System.out.println(jumlahmaks);
    }
}
