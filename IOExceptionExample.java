import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; 

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter the name of the file to read from.
            System.out.print("Enter the name of the file to open: ");
            String fileName = scanner.nextLine(); // Read the file name from the user.

            // Attempting to open the specified file using FileReader.
            FileReader reader = new FileReader(fileName);

            // If the file is successfully opened, print a success message.
            System.out.println("File '" + fileName + "' opened successfully.");
        } catch (IOException e) {
            // Catch the IOException and handle it (e.g., file not found).
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
