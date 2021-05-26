/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Task2;

/**
 *
 * @author B1LITE
 */
public class Runner {
    public static void main(String[] args) {
		Circle c = new Circle(7);
		display( c);
		Rectangle r = new Rectangle(10, 15);		
		display(r);
                Triangle t = new Triangle (12,16);
                display(t);
	}
    public static void display(Shape s){
	      double area = s.area();
		  System.out.println("The area of the shape is " + area);
	}
}
