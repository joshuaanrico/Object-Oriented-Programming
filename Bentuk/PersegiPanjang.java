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
public class PersegiPanjang {
    public double p,l;
    
    public PersegiPanjang(double p, double l){
        this.p=p;
        this.l=l;
    }
    public double getPanjang(){
        return p;
    }
    public double getLebar(){
        return l;
    }
    public double getLuas(){
        return p*l;
    }
}
