/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author B1LITE
 */
public class Distance {
    private int feet;
    private int inches;
    public Distance(){
    feet = 0;
    inches = 0;
    }
    public Distance(int a, int b){
    feet = a;
    inches = b;
    }
    public void setfeet(int a){
    feet = a;
    }
    public void setinches(int b){
    inches = b;
    }
    public int getfeet(){
    return feet;
    }
    public int getinches(){
    return inches;
    }
    public Distance Add(Distance d1, Distance d2){
    Distance d_new = new Distance(feet+d1.feet+d2.feet,inches+d1.inches+d2.inches);
    return d_new;
    }
    public void display(){
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inches);
    }
}
