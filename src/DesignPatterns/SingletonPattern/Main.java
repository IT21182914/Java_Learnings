package DesignPatterns.SingletonPattern;

public class Main {

    public static void main(String[] args) {
        // Get the instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance();

        // Call a method on the singleton instance
        singletonInstance.doSomething();
    }
}

