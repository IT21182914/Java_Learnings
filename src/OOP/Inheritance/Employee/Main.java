package OOP.Inheritance.Employee;

public class Main {
    public static void main(String[] args) {
        // Create a Manager instance
        Manager manager = new Manager("John Doe", 101, 80000.0, "Human Resources");
        manager.displayInfo();       // Call the inherited method
        manager.conductMeeting();    // Call the additional method

        System.out.println(); // Just to separate the output

        // Create a Developer instance
        Developer developer = new Developer("Jane Smith", 201, 70000.0, "Java");
        developer.displayInfo();    // Call the inherited method
        developer.writeCode();      // Call the additional method
    }
}

