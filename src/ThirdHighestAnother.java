import java.util.Scanner;

public class ThirdHighestAnother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the third highest number
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                thirdMax = secondMax;
                secondMax = numbers[i];
            } else if (numbers[i] > thirdMax && numbers[i] != secondMax && numbers[i] != max) {
                thirdMax = numbers[i];
            }
        }

        // Print the 3rd highest number
        if (thirdMax == Integer.MIN_VALUE) {
            System.out.println("There are less than 3 distinct numbers entered.");
        } else {
            System.out.println("The 3rd highest number is: " + thirdMax);
        }
    }
}
