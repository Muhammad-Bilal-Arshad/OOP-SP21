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
            Shape[] shapes = new Shape[3];
            shapes[0] = new Rectangle(5, 10);
            shapes[1] = new Triangle(2.6, 1);
            shapes[2] = new Circle(8);
            
            double areas[] = CalculateAreas.function(shapes);
            for(double a: areas) {
                System.out.println(a);
}
}
}
