import java.util.Scanner; 
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter the fully qualified name of a class
            System.out.print("Enter the fully qualified class name (e.g., java.util.ArrayList): ");
            String className = scanner.nextLine(); // Read the class name from the user

            // Attempt to load the class dynamically
            Class.forName(className);

            // If the class is found, print a success message
            System.out.println("Class '" + className + "' loaded successfully.");
        } catch (ClassNotFoundException e) {
            // Catch the ClassNotFoundException and handle it
            System.out.println("ClassNotFoundException occurred: The class '" + e.getMessage() + "' was not found.");
        } finally {
            // Close the scanner to release resources
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
