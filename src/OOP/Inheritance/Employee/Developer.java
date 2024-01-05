package OOP.Inheritance.Employee;

class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        // Call the constructor of the base class (Employee)
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Additional method in the derived class
    public void writeCode() {
        System.out.println("Developer is writing code in " + programmingLanguage);
    }
}
