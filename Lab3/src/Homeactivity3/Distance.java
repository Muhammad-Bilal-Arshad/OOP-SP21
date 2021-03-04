/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeactivity3;

/**
 *
 * @author cui
 */
public class Distance {
    public int feet , inches;
    public Distance(){
    feet = 16;
    inches = 7;
    }
    public Distance(int a, int b){
    feet = a;
    inches = b;
    }
    public void display(){
        System.out.println("Feet = "+feet);
        System.out.println("Inches = "+inches);
        System.out.println();
    }
}
