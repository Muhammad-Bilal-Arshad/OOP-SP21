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
    Account a1 = new Account();
    a1.setbalance(80000);
    a1.setchange(20000);
        System.out.println("The balance after depositing is: "+a1.deposit());
        double e = a1.getbalance();
        Account a2 = new Account(e,0);
        System.out.println("The balance after depositing is: "+a2.deposit());
    }
}
