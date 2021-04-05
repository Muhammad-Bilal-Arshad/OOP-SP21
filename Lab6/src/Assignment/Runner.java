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
public class Runner {
    public static void main(String[] args){
         Calculator.a1 =60;
	 Calculator.a2 = 30;
	 System.out.println("First number: "+Calculator.a1);
         System.out.println("Second number: "+Calculator.a2);
	 Calculator.Divide();
	 Calculator.Multiply();
	 Calculator.Sum();
	 Calculator.Modulus();
	 Calculator.Sin();
	 Calculator.Cos();
	 Calculator.Tan();
    }
    
}
