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
    public static void main(String[] args){
   HotDogStand h1 = new HotDogStand();
   h1.setid_number(123);
   h1.setsold(79);
        System.out.println("Hotdogs sold for stand no: "+h1.getid_number()+ " are: "+h1.getsold());
   HotDogStand h2 = new HotDogStand();
   h2.setid_number(124);
   h2.setsold(88);
   h2.justSold();
        System.out.println("Hot dogs sold for stand no: "+h2.getid_number()+" are "+h2.getsold());
   HotDogStand h3 = new HotDogStand(125,99);
   h3.justSold();
   h3.justSold();
   h3.justSold();
   h3.justSold();
        System.out.println("Hot dogs sold for stand no: "+h3.getid_number()+" are "+h3.getsold());
    }
    
}
