import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner; 

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter the file name.
            System.out.print("Enter the name of the file to open: ");
            String fileName = scanner.nextLine(); // Read the file name from the user.

            // Attempt to open the specified file using FileReader.
            FileReader reader = new FileReader(fileName);

            // If the file is found, print a success message.
            System.out.println("File '" + fileName + "' opened successfully.");
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException and handle it.
            System.out.println(" The file '" + e.getMessage() + "' was not found.");
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
