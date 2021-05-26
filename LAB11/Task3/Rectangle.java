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
public class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle() {}
		
    public Rectangle(double length, double width){
		this.length = length ;
		this.width = width ;
	}
    public void setLength(double length){
		this.length = length ;
	}	
    public void setWidth(double width){
            this.width = width ;
	}
    public double getLength(){
		return length;
	}
    public double getWidth(){
		return width;
	}

    public double area(){
		return length * width;
	}
}
