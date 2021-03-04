package Assignment2;

public class Rectangle {
    public int length;
    public int width;
    public  void display(){
        System.out.println("The length of rectangle is: "+length+" cm");
        System.out.println("The width of rectangle is: "+width+" cm");
        System.out.println("The area of rectangle is: "+length*width+" cm^2");
        System.out.println("The Perimeter of rectangle is: "+2*(length+width)+" cm");
        System.out.println();
    }

}
