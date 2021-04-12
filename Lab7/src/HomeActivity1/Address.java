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
public class Address {
    //creating data fields
    private int street_no;
    private int house_no;
    private String city;
    private int code;
    public Address(){}
    public Address( int street_no, int house_no, String city,int code){
        this.street_no = street_no;
        this.house_no = house_no;
        this.city = city;
        this.code = code;
    }
    public void setStreet_no(int street_no){
        this.street_no = street_no;
    }
    public void setHouse_no(int b){
        house_no = b;
    }
    public void setCity(String c){
        city = c;
    }
    public void setcode(int d){
        code = d;
    }
    public int getStreet_no(){
        return street_no;
    }
    public int getHouse_no(){
        return house_no;
    }
    public String getCity(){
        return city;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return 
                "\nstreet_no=" + street_no +
                ", \nhouse_no=" + house_no +
                ", \ncity='" + city + '\'' +
                ", \ncode=" + code;
                
    }
}
