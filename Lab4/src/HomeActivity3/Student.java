/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;

/**
 *
 * @author B1LITE
 */
public class Student {
    private String name; 
    private int[]Result_Array;
    public Student(){
    this.name = name;
    this.Result_Array = Result_Array;
    }
    public Student(String b, int[]c){
    name = b;
    Result_Array = c;
    }
    public int average(){
    int sum = 0;
    for(int item : Result_Array) {
    sum += item;
    }
     return sum / 5;
    }
    
}
