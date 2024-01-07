package ExceptionHandling.ExampleTryCatchBlock;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Try to read an integer from the user
            System.out.print("Enter an integer: ");
            int userInput = Integer.parseInt(scanner.nextLine());

            // Perform some operation with the user input
            int result = 10 / userInput;

            // Display the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.err.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            // Handle invalid input (not an integer)
            System.err.println("Error: Please enter a valid integer.");
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.err.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            // Close the scanner in the final block to ensure it always happens
            scanner.close();
        }

        System.out.println("Program continues after the try-catch block.");
    }
}

