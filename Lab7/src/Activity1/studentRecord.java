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
public class studentRecord {
    private String degree;
    public studentRecord(){}
    public void setDegree(String deg){
        degree = deg;
    }
    public String getDegree(){
        return degree;
    }
}
class EmployeeRecord{
    private int emp_id;
    private double salary;
    public EmployeeRecord(){}
    public EmployeeRecord(int a, double b){
        emp_id = a;
        salary = b;
    }
    public void setEmp_id(int id){
        emp_id = id;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public void seSalary(double sal){
        salary = sal;
    }
    public double getsal(){
        return salary;
    }
 }
class Manager{
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private studentRecord stu;
    public Manager(String t, double d,EmployeeRecord e,studentRecord s){
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display(){
        System.out.println("Title is: "+title);
        System.out.println("Dues are: "+dues);
        
        System.out.println("Employee record is as udner: ");
        System.out.println("Employee id is: "+emp.getEmp_id());
        System.out.println("Employee salary is: "+emp.getsal());
        
        System.out.println("Student record is as under: ");
        System.out.println("Degree is: "+stu.getDegree());
    }
}
