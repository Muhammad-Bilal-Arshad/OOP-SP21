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
public class Publication {
    protected String title;
    protected double price;
    public Publication(){}
    public Publication(String title, double price){
        this.price = price;
        this.title = title;
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
    public void display(){
        System.out.println("Title: "+title+"\nPrice: "+price);
    }
}
