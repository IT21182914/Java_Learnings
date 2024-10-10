public class isPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number to compare later
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit.
            reversedNumber = reversedNumber * 10 + digit;  // Append digit to the reversed number
            number /= 10;  // Remove the last digit from the number
        }

        // Check if the original number is the same as the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 646;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
