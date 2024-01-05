package StaticKeyword.Example;

public class Example {
    // Static variable (shared among all instances)
    static int count = 0;

    // Instance variable
    int instanceCount = 0;

    // Static method (utility function)
    public static void incrementCount() {
        count++;
    }

    // Instance method
    public void incrementInstanceCount() {
        instanceCount++;
    }

    // Static block (executed when the class is loaded)
    static {
        System.out.println("Class Example is loaded.");
    }

    public static void main(String[] args) {
        // Accessing static variable and method
        Example.incrementCount();
        System.out.println("Static Count: " + Example.count);  // Output: Static Count: 1

        // Creating instances
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Accessing instance variables and methods
        obj1.incrementInstanceCount();
        obj2.incrementInstanceCount();
        System.out.println("Instance Count for obj1: " + obj1.instanceCount);  // Output: Instance Count for obj1: 1
        System.out.println("Instance Count for obj2: " + obj2.instanceCount);  // Output: Instance Count for obj2: 1
    }
}
