/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity3;

/**
 *
 * @author B1LITE
 */
public class HomeActivity3_Runner {
    public static void main(String[] args){
    Student s1 = new Student("Bilal",new int[]{77,87,67,97,78});
        System.out.println("The average of Student 1 is: "+s1.average());
        int x = s1.average();
    Student s2 = new Student("Noman",new int[]{51,67,88,82,86});
        System.out.println("The average of Student 2 is: "+s2.average());
        int y = s2.average();
        if(x>y)
            System.out.println("Student 1 has more average than Student 2");
        else
            System.out.println("Student 2 has more average than Student 1");
     Student s3 = new Student();
     //s3.name = "Ali";
     //s3.Result_Array = new int[]{88,56,65,91,76};
     // s3.name and s3.Result_Array can't be created because of the fact that name and Result_Array are private and can only be accessed through parent class.
   }
    
    
    
}
