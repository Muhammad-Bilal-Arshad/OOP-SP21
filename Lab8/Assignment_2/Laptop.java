/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author B1LITE
 */
public class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;
    public Laptop(){}
    public Laptop(int wordsize, int memorysize, int storagesize,double speed, double length, double width, double height, double weight){
        super(wordsize,memorysize,storagesize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void display(){
        System.out.println("Wordsize: "+wordsize+" bits");
        System.out.println("MemorySize: "+memorysize+" megabytes");
        System.out.println("Storagesize: "+storagesize+" megabytes");
        System.out.println("Speed: "+speed+" megahertz");
        System.out.println("Length: "+length+" inches");
        System.out.println("Width: "+width+" inches");
        System.out.println("Height: "+height+" inches");
        System.out.println("Weight: "+weight+" kg");
    }
    
}
