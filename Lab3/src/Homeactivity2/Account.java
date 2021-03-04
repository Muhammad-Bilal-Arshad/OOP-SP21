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
public class Account {
    public int balance;
    public int change;
    public Account(){
    balance = 20000;
    change = 5000;
    }
    public Account(int a, int b){
    balance = a;
    change = b;
    }
    public int deposit(){
    return(balance+change);
    }
    public int withdraw(){
    return(balance-change);
    }
}
