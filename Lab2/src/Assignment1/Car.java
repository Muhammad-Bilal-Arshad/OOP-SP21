package Assignment1;

public class Car {
    public String manufacturer;
    public String model;
    public int year_of_manufacture;
    public String colour;
    public int seats;
    public String bodystyle;

    public void display(){

        System.out.println("Manufacturer : "+manufacturer);
        System.out.println("Model : "+model);
        System.out.println("Year of manufacture "+year_of_manufacture);
        System.out.println("Colour: "+colour);
        System.out.println("Seats: "+seats);
        System.out.println("Bodystyle: "+bodystyle);
    }
}
