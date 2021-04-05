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
    public static void main(String[] args){
        SavingAccount saver1 = new SavingAccount(3,2000);
        SavingAccount saver2 = new SavingAccount(3,3000);
        System.out.println("Monthly Interest on saver 1 with 3% annual interest rate:"+saver1.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 1 with 3% annual interest rate: "+saver1.newBalance());
        System.out.println("Monthly Interest on saver 2 with 3% annual interest rate:"+saver2.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 2 with 3% annual interest rate: "+saver2.newBalance());

        saver1.modifyInterestRate(4);
        saver2.modifyInterestRate(4);
        
        System.out.println("Monthly Interest on saver 1 with 4% annual interest rate:"+saver1.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 1 with 4% annual interest rate: "+saver1.newBalance());
        System.out.println("Monthly Interest on saver 2 with 4% annual interest rate:"+saver2.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 2 with 4% annual interest rate: "+saver2.newBalance());
       
        
           
    }
    
}
