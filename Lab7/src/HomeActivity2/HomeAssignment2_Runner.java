/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

import HomeActivity1.Address;
import HomeActivity1.Person;

/**
 *
 * @author B1LITE
 */
public class HomeAssignment2_Runner {
    public static void main(String[] args){
        Address a = new Address(20,366,"North Oxford",1);
        Person author = new Person(a,"J.R>R Tolkien");
        Book b1 = new Book(author,"Return of the king","Allen & Unwin");
        b1.display();
        Address b = new Address(24,215,"Lahore",54000);
        author.setAddress(b);
        b1.display();
        
    }
    
}
