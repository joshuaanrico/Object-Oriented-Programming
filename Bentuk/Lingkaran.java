/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bentuk;

/**
 *
 * @author LAURENSIUS
 */
public class Lingkaran {
    public double r;
    
    public Lingkaran(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    public double getLuas(){
        return 3.14*r*r;
    }
    
}
