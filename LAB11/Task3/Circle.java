/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Task3;

/**
 *
 * @author B1LITE
 */
public class Circle implements Shape {
    private double radius;
    public Circle(){}
    public Circle(double radius){
		this.radius = radius;
	}
    public void setRadius(double radius){
		this.radius = radius ;
	}
    public double getRadius(){
		return radius;
	}

    public double area(){
		return radius * radius * Math.PI;
	}
    
}
