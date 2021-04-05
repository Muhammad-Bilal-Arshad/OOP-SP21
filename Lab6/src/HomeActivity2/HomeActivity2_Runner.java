/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author B1LITE
 */
public class HomeActivity2_Runner {
    public static void main(String[] args){
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println("The total number of objects created are: "+c1.totalcreated());
        
        c3 = null;
        Count c4 = new Count(c3);
        System.out.println("The total number of objects created are: "+c1.totalcreated());
        System.out.println("The total number of objects destroyed are: "+c1.totaldestroyed());
        
        c2 = null;
        Count c5 = new Count(c2);
        System.out.println("The total number of objects created are: "+c1.totalcreated());
        System.out.println("The total number of objects destroyed are: "+c1.totaldestroyed());
        
        c1 = null;
        Count c6 = new Count(c1);
        System.out.println("The total number of objects created are: "+c1.totalcreated());
        System.out.println("The total number of objects destroyed are: "+c1.totaldestroyed());
        
    }
}
