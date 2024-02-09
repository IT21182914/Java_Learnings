import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Consume the newline character after reading the age
        scanner.nextLine();

        System.out.print("Enter the gender: ");
        char gender = scanner.nextLine().charAt(0);

        if (age >= 65 && (gender == 'm' || gender == 'M')) {
            System.out.println("Senior Male");
        } else if (age >= 65 && (gender == 'f' || gender == 'F')) {
            System.out.println("Senior Female");
        } else {
            System.out.println("Not a Senior Person");
        }

        scanner.close();
    }
}
