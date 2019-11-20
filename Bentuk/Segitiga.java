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
public class Segitiga {
    public double a,t;
    
    public Segitiga(double a, double t){
        this.a=a;
        this.t=t;
    }
    public double getAlas(){
        return a;
    }
    public double getTinggi(){
        return t;
    }
    public double getLuas(){
        return (a*t)/2;
    }
}
