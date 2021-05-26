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
public class Runner {
     public static void main(String[] args) {
            Shape[] shapes = new Shape[5];
            shapes[0] = new Rectangle(5, 10);
            shapes[1] = new Triangle(2.6, 1);
            shapes[2] = new Circle(8);
            shapes[3] = new Triangle(13,16);
            shapes[4] = new Circle(10);
            
            double areas[] = CalculateAreas.function(shapes);
            for(double a: areas) {
                System.out.println(a);
}
}
}