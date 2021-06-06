package HumanResources;
import java.util.ArrayList;

public class Runner {


    public static void main(String[] args) {

        Student s1 = new Student("Bilal", "55");
        Student s2 = new Student("Ahmad", "31");
        Student s3 = new Student("Babar", "134");

        Teacher t1 = new Teacher("Mukhtar ", "1");
        Teacher t2 = new Teacher("Zubair", "2");
        Teacher t3 = new Teacher("Naeem", "3");


        ArrayList<Association> AL = new ArrayList<>();

        AL.add(s1);
        AL.add(s2);
        AL.add(s3);
        AL.add(t1);
        AL.add(t2);
        AL.add(t3);
        AL.remove(1);
        System.out.println(AL);



          /*  HumanResource hr = new HumanResource();
        hr.add(s1);
        hr.add(s2);
        hr.add(s3);

        hr.add(t1);
        hr.add(t2);
        hr.add(t3);
        hr.delete(3);
        System.out.println(hr);*/


    }}
