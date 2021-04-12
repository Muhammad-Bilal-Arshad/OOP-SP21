/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;
import java.lang.Math;


/**
 *
 * @author B1LITE
 */
public class Line {
    private Point startPoint = new Point(1,5);
    private Point endPoint = new Point(7,10);
    public Line(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double length(){
        double a;
        double b;
        int x1 = startPoint.getX();
        int x2 = endPoint.getX();
        int y1 = startPoint.getY();
        int y2 = endPoint.getY();
        a = ((x2 - x1)*(x2-x1))+((y2-y1)*(y2-y1));
        b= Math.sqrt(a);
        return b;
    }
    
    
}
