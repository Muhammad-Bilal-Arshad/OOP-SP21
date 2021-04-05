/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;
import java.util.Scanner;

/**
 *
 * @author B1LITE
 */
public class SavingAccount {
    public static double annualInterestrate;
    private double savingsBalance;
    double c;
    public SavingAccount(){}
    public SavingAccount(double a , double b){
        annualInterestrate = a;
        savingsBalance = b;
    }
    public double calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestrate)/12;
        c = monthlyInterest;
        return c;
    }
    public double newBalance(){
        savingsBalance = c + savingsBalance;
        return savingsBalance;
    }
    public static double modifyInterestRate(double d){
        annualInterestrate = d;
        return annualInterestrate;
        
    }
}
