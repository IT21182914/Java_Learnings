import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the 3rd highest number
        if (numbers.length < 3) {
            System.out.println("There are less than 3 numbers entered.");
        } else {
            System.out.println("The 3rd highest number is: " + numbers[numbers.length - 3]);
        }


    }
}
