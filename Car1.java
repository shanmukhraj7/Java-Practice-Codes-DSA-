public class Car1 {
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;


    Car1()
    {
        noOfWheels = 4;
        colour = "Grey";
        maxSpeed = 180;
        currentFuel = 2;
        noOfSeats = 5;
    }

    public static void main(String[] args) {
        Car1 Baleno = new Car1();
        System.out.println(Baleno.noOfWheels);
        System.out.println(Baleno.colour);
        System.out.println(Baleno.maxSpeed);
        System.out.println(Baleno.currentFuel);
        System.out.println(Baleno.noOfSeats);
    }

}
