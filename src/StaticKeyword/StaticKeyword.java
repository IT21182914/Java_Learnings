package StaticKeyword;

public class StaticKeyword {
    // Static variable shared among all instances of Counter
    static int count = 0;

    // Constructor to increment count when a new instance is created
    public StaticKeyword() {
        count++;
    }

    // Method to get the current count value
    public static int getCount() {
        return count;
    }
}



