package OOP.Inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Create a Car instance
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.displayInfo(); // Call the inherited method
        myCar.drive();       // Call the additional method

        System.out.println(); // Just to separate the output

        // Create a Motorcycle instance
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022, false);
        myMotorcycle.displayInfo(); // Call the inherited method
        myMotorcycle.wheelie();     // Call the additional method
    }
}

