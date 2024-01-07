package OOP.Abstraction.Example;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myClass = new MyClass();

        // Invoking abstract and overridden default method
        myClass.myAbstractMethod();
        myClass.myDefaultMethod();

        // Invoking static method from the interface
        MyInterface.myStaticMethod();

        // Accessing the constant from the interface
        System.out.println("Constant value: " + MyInterface.MY_CONSTANT);

        // Invoking the second abstract method
        myClass.anotherAbstractMethod();
    }
}
