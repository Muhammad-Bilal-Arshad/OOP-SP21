/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

/**
 *
 * @author B1LITE
 */
public class Tape extends Publication {
    private int playing_time;
    public Tape(){}
    public Tape(String title, double price, int playing_time){
        super(title, price);
        this.playing_time = playing_time;
    }
     public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setPlaying_time(int playing_time){
        this.playing_time = playing_time;
    }
    public int getPlaying_time(){
        return playing_time;
    }
    public void display(){
        System.out.println("Title: "+title+"\nPrice: "+price+"\nPlaying Time: "+playing_time+" mins");
    }
    
}
