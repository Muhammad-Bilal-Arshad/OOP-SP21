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
public class Circle {
private int radius;
public Circle(){
radius = 7;
}
public Circle(int r){
radius = r;
}
public void setRadius(int r){
radius = r;
}
public int getRadius(){
return radius;
}
public void display(){
System.out.println("Radius = "+radius);    
}
public double CalculateCircumference(){
double a = 3.14*radius*radius;
return a;

}
}

