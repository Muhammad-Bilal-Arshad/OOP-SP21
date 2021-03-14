/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author B1LITE
 */
public class Marks {
    private int Maths;
    private int Science;
    private int English;
    public Marks(){
        Maths = 80;
        Science = 79;
        English = 84;
    }
    public Marks(int a, int b, int c){
        Maths = a;
        Science = b;
        English = c;
   
    }
    public void setMaths(int a){
        Maths = a;
    }
    public void setScience(int b){
        Science = b;
    }
    public void setEnglish(int c){
        English = c;
    }
    public int getMaths(){
        return Maths;
    }
    public int getScience(){
        return Science;
    }
    public int getEnglish(){
        return English;
    }
    public void display(){
        System.out.println("Percentage = "+(Maths+Science+English)/3);
    }
}
