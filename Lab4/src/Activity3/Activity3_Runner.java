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
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(7);
        p1.display();
        Point p2 = new Point(10,11);
        p2.move(2,3);
        p2.display();
    }
}
