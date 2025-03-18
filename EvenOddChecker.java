import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner in main
        int number = getIntegerInput(scanner); // Get user input
        scanner.close(); // Close scanner in main after use

        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput(Scanner scanner) {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) { // Validate user input
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Clear invalid input
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
