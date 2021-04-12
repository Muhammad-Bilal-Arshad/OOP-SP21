/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;

/**
 *
 * @author B1LITE
 */
public class HomeActivity3_Runner {
    public static void main(String[] args){
        Point p1 = new Point(7,10); 
        Point p2 = new Point(10,15); 
        Line l1 = new Line(p1,p2);
        Point p3 = new Point(9,12); 
        Point p4 = new Point(16,18);
        Line l2 = new Line(p3,p4);
        System.out.println("The length of Object 1 is: "+l1.length());
        System.out.println("The length of Object 2 is: "+l2.length());
    }
    
}
