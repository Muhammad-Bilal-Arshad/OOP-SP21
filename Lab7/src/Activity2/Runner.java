/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author B1LITE
 */
public class Runner {
    public static void main(String[] args) 
{ 
  Date b = new Date (1,12,1990);
  Date h = new Date (5,6,2016);
  Employee e1=new Employee("xxx", "yyyy",b,h);
  e1.display();
 }
    
}
