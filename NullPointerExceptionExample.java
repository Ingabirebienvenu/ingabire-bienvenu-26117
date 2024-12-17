import java.util.Scanner; 

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter a string value.
            System.out.print("Enter a number ");
            String str = scanner.nextLine(); // Read the input string from the user.

            // Attempting to access the length of the string.
            // If the string is null, a NullPointerException will be thrown.
            System.out.println("Length of the entered string: " + str.length());
        } catch (NullPointerException e) {
            // This block will catch the NullPointerException if the string is null.
            System.out.println("NullPointerException occurred: Attempted to access null.");
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
