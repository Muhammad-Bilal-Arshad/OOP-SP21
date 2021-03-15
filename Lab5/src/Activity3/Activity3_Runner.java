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
public class Activity3_Runner {
    public static void main(String[] args){
    Point p1 = new Point(10,20);
    Point p2 = new Point(30,40);
    Point p3 = new Point();
    Point p4 = p1.Add(p2, p3);
    p4.display();
    }
    
}
