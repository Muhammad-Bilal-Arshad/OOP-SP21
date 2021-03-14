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
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.setMaths(88);
        m1.setScience(85);
        m1.setEnglish(89);
        m1.display();
        Marks m2 = new Marks(66,76,83);
        m2.display();
    }
}
