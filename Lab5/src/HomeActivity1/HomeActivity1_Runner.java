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
public class HomeActivity1_Runner {
    public static void main(String[] args){
    Distance d1 = new Distance(11,7);
    Distance d2 = new Distance(10,5);
    Distance d3 = new Distance();
    Distance d4 = d1.Add(d2, d3);
    d4.display();
    }
}
