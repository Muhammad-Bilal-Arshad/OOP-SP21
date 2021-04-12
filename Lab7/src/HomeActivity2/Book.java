/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;
import HomeActivity1.Person;

/**
 *
 * @author B1LITE
 */
public class Book {
    private Person author;
    private String bookname;
    private String publisher;
    public Book(){}
    public Book(Person author, String bookname,String publisher){
        this.author = author;
        this.bookname = bookname;
        this.publisher = publisher;
    }
    public void display(){
        System.out.println("Author: "+author);
        System.out.println("Bookname: "+bookname);
        System.out.println("Publisher: "+publisher);
        System.out.println();
    }
    
   
    
    
}
