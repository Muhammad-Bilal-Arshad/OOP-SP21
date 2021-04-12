/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author B1LITE
 */
public class Activity1_Runner {
    void main(){
        studentRecord s = new studentRecord();
        s.setDegree("MBA");
        EmployeeRecord e = new EmployeeRecord(111,50000);
        Manager m1 = new Manager("Finance manager",5000,e,s);
        m1.display();
        
    }
    
}
