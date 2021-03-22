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
public class Assignment_Runner {
    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f2.setA(32);
        f2.setB(4);
        f1.display();
        f2.display();
        System.out.println("Identical Ratios: "+f1.equals(f1,f2));
        }
    
}
