package OOP.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {


        MathOperations mathOps = new MathOperations();

        // Call the add method with two integers
        System.out.println("Sum of two integers: " + mathOps.add(5, 10));

        // Call the add method with three integers
        System.out.println("Sum of three integers: " + mathOps.add(5, 10, 15));

        // Call the concatenate method with two strings
        System.out.println("Concatenated string: " + mathOps.concatenate("Hello, ", "world!"));

        System.out.println("Concatenated Int & String: " + mathOps.add(1000000, "Salary"));
    }
}

