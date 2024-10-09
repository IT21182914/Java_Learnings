package Recursion;

public class Main {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base condition: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive call: multiply n with factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Example usage
        int result = factorial(4);
        System.out.println("\nFactorial of 4 is: " + result);  // Output: 24
    }
}

