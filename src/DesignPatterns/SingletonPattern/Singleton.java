package DesignPatterns.SingletonPattern;

public class Singleton {

    // The single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code, if any
    }

    // Method to get the single instance of the class
    public static Singleton getInstance() {
        // If the instance is null, create a new one
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the single instance
        return instance;
    }

    // Other methods and properties of the class

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

    // Additional methods and properties can be added as needed
}

