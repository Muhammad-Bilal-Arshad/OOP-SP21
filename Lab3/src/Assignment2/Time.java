/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(){
        hours = 11;
        minutes = 55;
        seconds = 28;
    }
    public Time(int a , int b , int c){
        if (a >=1&& a<=24) {
			 hours=a;
		}
		
		if (b >=1&& b<=60) {			
			minutes=b;
		}
		
		if (c >=1&& c<=60) {
			seconds=c;
   
    }
    }              
  public void display(){
          System.out.println("Time is "+hours+"."+minutes+"."+seconds);
    }
    
}
