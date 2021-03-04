/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeactivity1;

/**
 *
 * @author Administrator
 */
public class lab2_homeactivity1_runner {
    public static void main(String[] args){
    Student s1,s2;
    s1 = new Student();
    s1.name = "Muhammad Bilal Arshad";
    s1.Semester = 3;
    s1.CGPA = 3.26;
    s1.Degree = "Bachelor of Science in Software Engineering";
    s1.email = "bilalarshad@gmail.com";
    s1.Registration_Number = "SP20-BSE-055";
    s1.mobile_no = 03001203123;
    s1.Department = "CS";
    s1.display();
    
    s2 = new Student();
    s2.name = "John";
    s2.Semester = 6;
    s2.CGPA = 3.78;
    s2.Degree = "Bachelor of Science in Computer Science";
    s2.email = "john123@gmail.com";
    s2.Registration_Number = "SP17-BSE-055";
    s2.mobile_no = 031412331321;
    s2.Department = "CS";
    s2.display();
           
            
    
    
    
    
    }
    
}
