/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author B1LITE
 */
public class Activity1_Runner {
    public static void main(String[] args){
        ABC ob1 = new ABC();
        ABC ob2 = new ABC();
        ob1.Var1 = 88;
        ob1.Var2 = "I am Object 1";
        ob2.Var2 = "I am Object 2";
        System.out.println("Ob1 integer: "+ob1.Var1);
        System.out.println("Ob1 String: "+ob1.Var2);
        System.out.println("Ob2 integer: "+ob2.Var1);
        System.out.println("Ob2 String: "+ob2.Var2);
    }
    
}
