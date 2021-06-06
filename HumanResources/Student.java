package HumanResources;

import java.util.Scanner;

public class Student extends Person implements Association {
    private int rollNo;
    private int semester;


    public Student(String name, String id) {
        super(name, id);
        associate();
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


    public void associate() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the roll number of student: ");
        this.rollNo = input.nextInt();

        System.out.println("Enter the semester of student: ");
        this.semester = input.nextInt();
    }


    public String toString() {
        return super.toString() +
                "\nRoll Number: " + rollNo +
                "\nSemester: " + semester;
    }
}
