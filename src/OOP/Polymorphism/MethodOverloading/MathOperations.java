package OOP.Polymorphism.MethodOverloading;

//Method overloading we can call it as Compile-time Polymorphism
//method overloading means we can have same method name with different parameters. We call it as
public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(int a, String name) {


        return a + " " + name;

    }

    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}
