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
public class Pizza {
    private String size;
    private int numberOfcheesetoppings;
    private int numberOfpepperonitoppings;
    private int numberOfhamtoppings;
    public Pizza(){}
    public Pizza(String size, int numberOfcheesetoppings, int numberOfpepperonitoppings,int numberOfhamtoppings){
        this.size = size;
        this.numberOfcheesetoppings = numberOfcheesetoppings;
        this.numberOfpepperonitoppings = numberOfpepperonitoppings;
        this.numberOfhamtoppings = numberOfhamtoppings;
    }
    public void setSize(){
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setNumberOfcheesetoppings(int numberOfcheesetoppings) {
        this.numberOfcheesetoppings = numberOfcheesetoppings;
    }

    public int getNumberOfcheesetoppings() {
        return numberOfcheesetoppings;
    }

    public void setNumberOfpepperonitoppings(int numberOfpepperonitoppings) {
        this.numberOfpepperonitoppings = numberOfpepperonitoppings;
    }

    public int getNumberOfpepperonitoppings() {
        return numberOfpepperonitoppings;
    }

    public void setNumberOfhamtoppings(int numberOfhamtoppings) {
        this.numberOfhamtoppings = numberOfhamtoppings;
    }

    public int getNumberOfhamtoppings() {
        return numberOfhamtoppings;
    }
    public double calcCost(){
        double total_cost;
        double initial_cost ;
        double toppings;
        double toppings_cost;
        if(size =="small")
             initial_cost = 10;
        else if(size == "medium")
             initial_cost= 12;
        else if(size =="large")
            initial_cost = 14;
        else
            initial_cost = 0;
        toppings = numberOfcheesetoppings + numberOfhamtoppings + numberOfpepperonitoppings;
        toppings_cost = toppings*2;
        total_cost = toppings_cost + initial_cost;
        return total_cost;
    }
    public String getDescription()
        {
            return " Pizza size: " + size + "\n Cheese toppings: "
                    + numberOfcheesetoppings + "\n Pepperoni toppings: "
                    + numberOfpepperonitoppings + "\n Ham toppings: " + numberOfhamtoppings
                    + "\n Pizza cost: $" + calcCost() + "\n";
        }
}

