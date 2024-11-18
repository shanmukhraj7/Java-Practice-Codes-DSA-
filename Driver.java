public class Driver {

    static int minAgeForDriving=18;

    String name;
    int age;
    String dateOfLicense;
     public boolean isAllowed()
     {
        return this.age >= minAgeForDriving;
     }
    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(3);
        // myCar.drive();
        // System.out.println(myCar.currentFuel);

        Car Baleno = new Car();
        Baleno.addFuel(6);
        Car Started = Baleno.start();
        Started.drive();

        Driver myDriver = new Driver();
        myDriver.age = 21;
        myDriver.dateOfLicense = "1-12-2025";

        System.out.println(minAgeForDriving);
    }
}
