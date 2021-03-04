/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeactivity2;

/**
 *
 * @author Administrator
 */
public class Time {
    public int hours;
    public int minutes;
    public int seconds;
    public int milliseconds;
    
    public void display(){
    System.out.println("Current time = "+hours+"."+minutes+"."+seconds+"."+milliseconds);
    
    }
    
}
