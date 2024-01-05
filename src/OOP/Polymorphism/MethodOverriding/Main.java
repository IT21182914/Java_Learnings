package OOP.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {

        // Create an instance of the Animal class (polymorphism)
        Animal animal1 = new Dog();

        // Call the makeSound method on the Animal object
        animal1.makeSound();  // Outputs: Bow Bow! (runtime polymorphism)


        Animal animal2 = new Cat();
        animal2.makeSound(); // Outputs: Meow Meow! (runtime polymorphism)


    }
}

