/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author B1LITE
 */
public class Activity1_Runner {
    public static void main(String[] args){
    ObjectPass p = new ObjectPass();
    p.value = 5;
        System.out.println("Before Calling: "+p.value);
        p.increment(p);
        System.out.println("After Calling: "+p.value);
    }
}
