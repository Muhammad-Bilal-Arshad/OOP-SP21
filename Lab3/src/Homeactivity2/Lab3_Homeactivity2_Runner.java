/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeactivity2;

/**
 *
 * @author cui
 */
public class Lab3_Homeactivity2_Runner {
    public static void main(String[] args){
        Account a1 = new Account();
        System.out.println(a1.deposit());
        
        Account a2 = new Account(60000,15000);
        System.out.println(a2.withdraw());
    
    }
    
}
