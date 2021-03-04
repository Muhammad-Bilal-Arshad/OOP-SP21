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
public class Lab3_Homeactivity1_Runner {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1.circumference());
        
        Circle c2 = new Circle(16,3.14);
        System.out.println(c2.circumference());
    }
}
