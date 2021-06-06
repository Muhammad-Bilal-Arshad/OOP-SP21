package HumanResources;

import java.util.Scanner;


public class Teacher extends Person implements Association
{
    private String designation;
    private String department;


    public Teacher(String name, String id)
    {
        super(name, id);
        associate();
    }



    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public void associate()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the designation of teacher: ");
        this.designation = input.nextLine();

        System.out.println("Enter the department of teacher: ");
        this.department = input.nextLine();
    }



    public String toString()
    {
        return super.toString() +
                "\nDesignation: " + designation +
                "\nDepartment: "  + department;
    }

}