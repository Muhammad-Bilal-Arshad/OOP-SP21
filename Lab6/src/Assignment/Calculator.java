/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author B1LITE
 */
public class Calculator {
      public static double a1;
      public static double a2;
 
  public static void Sum(){
      double sum=a1+a2;
      System.out.println("The sum of "+a1+" and "+a2+" : "+sum);
  }
  public static void  Multiply(){
      double multiply=a1*a2;
      System.out.println("The product of "+a1+" and "+a2+" : "+multiply);
  }
  public static void Divide() {
      double divide=a1 / a2;
      System.out.println("Dividing "+a1+" and "+a2+" : "+divide);
  } 
  public static void Modulus (){
      double modulus=a1 % a2;
      System.out.println("The modulus of "+a1+" and "+a2+" : "+modulus);
  } 
  public static void Sin (){
      double b1=Math.sin(a1);
       double b2=Math.sin(a2);
       System.out.println("Sin " +a1+ " is: "+b1+"\n"+"Sin " +a2+ " is: "+b2);
  } 
  public static void Tan (){
      double b1=Math.tan(a1);
       double b2=Math.tan(a2);
       System.out.println("Tan " +a1+ " is: "+b1+"\n"+"Tan " +a2+ " is: "+b2);
  } 
  public static void Cos(){
      double b1=Math.cos(a1);
       double b2=Math.cos(a2);
       System.out.println("Cos " +a1+ " is: "+b1+"\n"+"Cos " +a2+ " is: "+b2);
  }  
    
}
