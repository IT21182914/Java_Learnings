package OOP.Encapsulation.Person;

public class Person {
    private int age;

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <= 120) {
            age = newAge;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Private method to increment age
    private void incrementAge() {
        age++;
    }

    // Private method to check if the person is an adult
    private boolean isAdult() {
        return age >= 18;
    }

    // Public method to perform a task using private methods
    public void celebrateBirthday() {
        incrementAge();
        System.out.println("Happy Birthday! Age is now: " + age);

        if (isAdult()) {
            System.out.println("Congratulations! You are an adult.");
        } else {
            System.out.println("Enjoy your youth!");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Setting the age using the setter
        person.setAge(25);

        // Getting the age using the getter
        System.out.println("Current Age: " + person.getAge());

        // Performing a task using public method (celebrateBirthday)
        person.celebrateBirthday();
    }
}


