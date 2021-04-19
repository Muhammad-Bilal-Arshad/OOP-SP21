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
public class Book extends Publication {
    private int page_count;
    public Book(){}
    public Book(String title, double price, int page_count){
        super(title,price);
        this.page_count = page_count;
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
    public void setPg_cnt(int page_count){
        this.page_count = page_count;
    }
    public int getPg_cnt(){
        return page_count;
    }
    public void display(){
        System.out.println("Title: "+title+"\nPrice: "+price+"\nPage Count: "+page_count);
    }
}
