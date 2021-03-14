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
public class Rectangle {
    private int length, width;
    public Rectangle(){
    length = 5;
    width = 2;
    }
    public Rectangle(int l, int w){
    length = l;
    width = w;
    }
    public void setlength(int l){
    length = l;
    }
    public void setwidth(int w){
    width = w;
    }
    public int getlength(){
    return length;
    }
    public int getwidth(){
    return width;
    }
    public int area(){
    return(length*width);
    }
}


