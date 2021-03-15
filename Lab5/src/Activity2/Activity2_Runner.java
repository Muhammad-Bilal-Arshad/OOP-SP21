/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author B1LITE
 */
public class Activity2_Runner {
    public static void main(String[] args){
    Complex c1 = new Complex(11,2.3);
    Complex c2 = new Complex(9,2.3);
    Complex c3 = new Complex();
    c3 = c1.Add(c2);
    c2.Show();
    }
    
}
