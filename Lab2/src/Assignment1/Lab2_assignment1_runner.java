package Assignment1;

public class Lab2_assignment1_runner {
    public static void main(String[] args) {
        Car c1,c2;
        c1 = new Car();
        c1.bodystyle = "Passenger car";
        c1.manufacturer = "Toyota";
        c1.year_of_manufacture = 2021;
        c1.seats = 4;
        c1.model = "Corolla";
        c1.colour = "Black";
        c1.display();

        c2 = new Car();
        c2.manufacturer = "Honda";
        c2.bodystyle = "Passenger car";
        c2.seats = 4;
        c2.model= "City";
        c2.colour = "White";
        c2.year_of_manufacture = 2021;
        c2.display();
    }
}
