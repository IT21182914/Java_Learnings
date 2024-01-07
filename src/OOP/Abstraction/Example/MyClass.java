package OOP.Abstraction.Example;

class MyClass implements MyInterface {
    @Override
    public void myAbstractMethod() {
        System.out.println("Concrete implementation of myAbstractMethod");
    }

    // Overriding the default method
    @Override
    public void myDefaultMethod() {
        System.out.println("Overridden default implementation in MyClass");
    }

    // Implementing the second abstract method
    @Override
    public void anotherAbstractMethod() {
        System.out.println("Concrete implementation of anotherAbstractMethod");
    }
}
