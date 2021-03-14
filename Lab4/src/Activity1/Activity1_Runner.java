/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author B1LITE
 */
public class Activity1_Runner {
public static void main(String[] args){
Circle c1 = new Circle();
c1.setRadius(5);
    System.out.println("Circumference of first circle is "+c1.CalculateCircumference());
    int r = c1.getRadius();
    Circle c2 = new Circle();
    c1.setRadius(5);
    System.out.println("Circumference of first circle is "+c2.CalculateCircumference());

}
} 
