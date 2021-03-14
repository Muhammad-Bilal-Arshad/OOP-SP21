/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

public class Marks {
    public int a;
    public int b;
    public int c;
    public Marks(){
    a = 20;
    b = 40;
    c = 60;
   }
    public Marks(int x, int y , int z){
    a = x;
    b = y;
    c = z;
    }
    public int Sum(){
    return(a+b+c);
    }
    
}
