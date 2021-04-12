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
public class Runner {
    public static void main(String[] args){
        Address a = new Address(18,276,"Islamabad",44000);
        String b = "Ahmad";
        Person p = new Person(a,b);
        p.display();
        Address c = new Address();
        c.setStreet_no(14);
        c.setHouse_no(178);
        c.setCity("Karachi");
        c.setcode(75270);
        Person p2 = new Person();
        p2.setName("Babar");
        p2.setAddress(c);
        p2.display();

    }

}
