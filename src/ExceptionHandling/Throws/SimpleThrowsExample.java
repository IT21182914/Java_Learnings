package ExceptionHandling.Throws;

public class SimpleThrowsExample {

    public static void main(String[] args) {
        try {
            // Call the method that may throw InterruptedException
            performOperation();
        } catch (InterruptedException e) {
            // Handle the InterruptedException
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block.");
    }

    // Declare that this method may throw an InterruptedException
    private static void performOperation() throws InterruptedException {
        // Simulate some time-consuming operation
        System.out.println("Performing an operation...");
        Thread.sleep(2000);
        System.out.println("Operation completed.");
    }
}

