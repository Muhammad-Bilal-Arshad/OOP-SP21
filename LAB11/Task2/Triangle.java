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
public class Triangle implements Shape {
     private double base;
    private double height;
    public Triangle(){}
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public void setHeight(double height){
		this.height = height ;
	}	
    public void setBase(double base){
            this.base = base ;
	}
    public double getBase(){
		return base;
	}
    public double getHeight(){
		return height;
	}
    public double area(){
		return ((height*base)/2);
	}
    
}
