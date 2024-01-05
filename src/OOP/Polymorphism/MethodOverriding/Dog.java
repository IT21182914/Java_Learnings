package OOP.Polymorphism.MethodOverriding;

class Dog extends Animal {
    // Override the makeSound method in the derived class
    @Override
    public void makeSound() {
        System.out.println("Bow Bow!");
    }
}
