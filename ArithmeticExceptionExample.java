import java.util.Scanner; 

public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt(); // Read the numerator

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt(); // Read the denominator

            // Perform the division
            int result = numerator / denominator;

            // Print the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(" Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
