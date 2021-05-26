/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Task1;

/**
 *
 * @author B1LITE
 */
public class Runner {
     public static void main(String[] args) {
		GeometricShape gs = new GeometricShape(5);
		display(gs);
	}
    public static void display(Shape s){
	      double area = s.area();
		  System.out.println("The area of the geomteric shape is " + area);
	}
    
}
