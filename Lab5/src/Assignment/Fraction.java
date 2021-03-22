/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author B1LITE
 */
public class Fraction {
    private int a;
    private int b;
    public Fraction(){
        a = 8;
        b = 2;
    }
    public Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public boolean equals(Fraction f1, Fraction f2){
        if(f1 == f2)
            return true;
        else
            return false;
    }
    public void display(){
        System.out.println("Ratio: "+a/b);
    }
    
}
