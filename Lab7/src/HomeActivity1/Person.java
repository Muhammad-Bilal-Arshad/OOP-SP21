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
public class Person {
    public Address address;
    public String name;
    public Person(){}
    public Person(Address address,String name){
        this.address = address;
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name+'\n'+"Address details: "+address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return 
                "here are address details=" + address +
                ", \nname='" + name + '\'';
              
    }
    

}
