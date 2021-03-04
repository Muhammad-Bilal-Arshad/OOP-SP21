/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity3;

/**
 *
 * @author cui
 */
public class Point {
    private int x;
    private int y;
    public Point(){
    x = 1;
    y = 2;
    }
    public Point(int a , int b){
    x = a;
    y = b;
    }
    public void setX(int a){
    x = a;
    }
    public void setY(int b){
    y = b;
    }
    public void display(){
    System.out.println("x coordinate = "+x+" y coordinate = "+y);
    }
    public void movepoint(int a, int b){
    x = x+a;
    y = y+b;
    System.out.println("x coordinate after moving = "+x+" y coordinate after moving = "+y);
    }
}
