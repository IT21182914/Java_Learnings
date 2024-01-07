package OOP.Abstraction.Example;

// Example interface
interface MyInterface {
    // Abstract method (implicitly public and abstract)
    void myAbstractMethod();

    // Default method with a concrete implementation
    default void myDefaultMethod() {
        System.out.println("Default implementation in the interface");
    }

    // Static method in the interface (implicitly public and non-abstract)
    static void myStaticMethod() {
        System.out.println("Static method in the interface");
    }

    // Constant (implicitly public, static, and final)
    String MY_CONSTANT = "Interface Constant";

    // Another abstract method (implicitly public and abstract)
    void anotherAbstractMethod();
}

// A class implementing MyInterface





