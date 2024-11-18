public class Car {
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;
    

    public Car start()
    {
        if(currentFuel == 0)
        {
            System.out.println("Car is out of Fuel, cannot Start");
        }
        else if(currentFuel < 5)
        {
            System.out.println("About to be dead, Please refill");
        }
        else
        {
            System.out.println("Car Started.... RATATATATATAT.......");
        }
        return this;
    }
    public void drive()
    {
       currentFuel--;
       System.out.println("Car is driving");
    }

    public void addFuel(float currentFuel)
    {
        currentFuel += currentFuel;
    }

    public float getCurrentFuel()
    {
        return currentFuel;
    }

    
}
