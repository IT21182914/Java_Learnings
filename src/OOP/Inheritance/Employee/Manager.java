package OOP.Inheritance.Employee;

class Manager extends Employee {
    String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        // Call the constructor of the base class (Employee)
        super(name, employeeId, salary);
        this.department = department;
    }

    // Additional method in the derived class
    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}
