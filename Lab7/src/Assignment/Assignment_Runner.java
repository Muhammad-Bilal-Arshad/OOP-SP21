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
public class Assignment_Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("small",2,2,2);
        Pizza p2 = new Pizza("medium",4,3,1);
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(p1);
        order.setPizza2(p2);
        double total = order.calcTotal();

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        System.out.println("BILL: $" + total);


    }
}
