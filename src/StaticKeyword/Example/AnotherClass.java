package StaticKeyword.Example;

public class AnotherClass {

    public static void main(String[] args) {
        // Accessing the static method and variable from the Example class
        Example.incrementCount();
        System.out.println("Static Count from AnotherClass: " + Example.count);  // Output: Static Count from AnotherClass: 2
    }
}

