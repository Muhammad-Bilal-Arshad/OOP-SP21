/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;
import java.util.Scanner;

/**
 *
 * @author B1LITE
 */
public class Runner {
    public static void main(String[] args){
        System.out.println("Please Enter Price");
        Scanner c1 = new Scanner(System.in);
        int a = c1.nextInt();
        Book b1 = new Book();
        b1.setPrice(a);
        System.out.println("Please Enter Title ");
        Scanner c2= new Scanner(System.in);
        String b = c2.next();
        b1.setTitle(b);
        System.out.println("Please enter number of pages");
        Scanner c3 = new Scanner(System.in);
        int c = c3.nextInt();
        b1.setPg_cnt(c);
        b1.display();
        
        Tape t1 = new Tape();
        System.out.println("Please Enter Price");
        Scanner d1 = new Scanner(System.in);
        int d = d1.nextInt();
        t1.setPrice(d);
       
        System.out.println("Please Enter Title ");
        Scanner d2= new Scanner(System.in);
        String e = d2.next();
        t1.setTitle(e);
        
        System.out.println("Please Enter Playing time");
        Scanner d3 = new Scanner(System.in);
        int f = d3.nextInt();
        t1.setPlaying_time(f);
        
        t1.display();
        
    }
}
