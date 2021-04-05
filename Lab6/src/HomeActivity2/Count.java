/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author B1LITE
 */
public class Count {
    private static int counter=0;
    private static int i;
    private static int destroyed;
    public Count(){
        counter++;
    }
    public Count(Count a){
        if(a == null){
            counter--;
            destroyed++;}
        else
            counter++;
    }
    public static int totalcreated(){
        return counter;
     }
    public static int totaldestroyed(){
        return destroyed;
     }
}
