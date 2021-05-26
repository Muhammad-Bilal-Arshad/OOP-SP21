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
public class GeometricShape implements Shape {
    private double radius;
    public GeometricShape(){}
    public GeometricShape(double radius){
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
