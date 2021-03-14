/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author B1LITE
 */
public class HotDogStand {
    private int id_number;
    private int sold;
    public HotDogStand(){
    id_number = 0;
    sold = 0;
    }
    public HotDogStand(int a, int b){
    id_number = a;
    sold = b;
    }
    public void setid_number(int a){
        id_number= a;
    }
    public void setsold(int b){
        sold = b;
    }
    public int getsold(){
        return sold;
    }
    public int getid_number(){
        return id_number;
    }
    public void justSold(){
    sold++;
    }
}
