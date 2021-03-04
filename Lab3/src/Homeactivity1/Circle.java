/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeactivity1;

/**
 *
 * @author cui
 */
public class Circle {
    public int radius ;
    public double pi;
    public Circle(){
    radius = 5; 
    pi = 3.4;
    }
    public Circle(int a, double b){
    radius = a;
    pi = b;
    }
    public double circumference(){
    return(2*pi*radius);
    }
}
