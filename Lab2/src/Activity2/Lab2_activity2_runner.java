/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author Administrator
 */
public class Lab2_activity2_runner {
    public static void main(String[] args){
    Date date1, date2;
    date1 = new Date();
    date1.month = "December";
    date1.day = 31;
    date1.year = 2012;
    System.out.println("date1:");
    date1.displayDate();
    
    date2 = new Date();
    date2.month = "July";
    date2.day = 4;
    date2.year = 1776;
    System.out.println("date2:");
    date2.displayDate();

    
    }

}