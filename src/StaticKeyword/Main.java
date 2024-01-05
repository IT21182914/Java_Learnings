package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Counter
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword obj3 = new StaticKeyword();

        // Accessing the static variable using the class name
        System.out.println("Count: " + StaticKeyword.count);  // Output: Count: 2

        // Accessing the count using the static method
        System.out.println("Count from method: " + StaticKeyword.getCount());  // Output: Count from method: 2
    }
}
