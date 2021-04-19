/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author B1LITE
 */
public class Runner {
    public static void main(String[] args){
        Computer c1 = new Computer(4 , 8 , 512 , 2.1);
        c1.display();
        Laptop l1 = new Laptop(12 , 16 , 1024 , 4.3,9.57, 13.58,0.91,1.95);
        l1.display();
    }
    
}
