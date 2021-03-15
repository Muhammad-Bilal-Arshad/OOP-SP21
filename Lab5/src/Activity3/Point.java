/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity3;

/**
 *
 * @author B1LITE
 */
public class Point {
    private int x;
    private int y;
    public Point(){
    x = 5;
    y = 6;
    }
    public Point(int a,int c){
    x = a;
    y = c;
    }
    public void setx(int a){
    x = a;
    }
    public void sety(int b){
    y = b;
    }
    public int getx(){
    return x;
    }
    public int gety(){
    return y;
    }
    public Point Add(Point pa, Point pb){
    Point p_new = new Point(x+pa.x+pb.x,y+pa.y+pb.y);
    return p_new;
    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
    
    }
}
