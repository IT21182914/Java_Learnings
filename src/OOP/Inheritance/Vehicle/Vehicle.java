package OOP.Inheritance.Vehicle;

// Base class or Parent class
class Vehicle {
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method in the base class
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class or Child class (inherits from Vehicle)
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        // Call the constructor of the base class (Vehicle)
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Additional method in the derived class
    public void drive() {
        System.out.println("Car is in motion.");
    }
}

// Another derived class
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        // Call the constructor of the base class (Vehicle)
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    // Additional method in the derived class
    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie!");
    }
}
