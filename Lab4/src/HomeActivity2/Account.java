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
public class Account {
    private double balance;
    private double change;
    public Account(){
        balance = 50000;
        change = 15000;
        }
    public Account(double a,double b){
    
        balance = a;
        change = b;
    }
    public void setbalance(double a){
        balance= a;
    }
    public void setchange(double b){
        change = b;
    }
    public double getbalance(){
        return balance;
    }
    public double getchange(){
        return change;
    }
    public double withdraw(){
        double c = balance - change;
        return c;
    }
    public double deposit(){
       double c = balance + change;
        return c;
    }
}
