package OOP.Polymorphism.MethodOverriding;

class Cat extends Animal {
    // Override the makeSound method in the derived class
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}
