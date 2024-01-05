package OOP.Encapsulation;

/*Encapsulation is we hiding implementation details of a class
 from outside access with access modifiers and exposing only the necessary interfaces.
 Only can access private attributes through getters and setters from outside the class.
 Private methods can only be accessed within the class.
 */
public class Student {
    // Private attributes (encapsulation)
    private String name;
    private int age;

    // Public constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {


        Student student1 = new Student("John", 21);

        System.out.println(student1.getName()); // Outputs: John
    }
}

