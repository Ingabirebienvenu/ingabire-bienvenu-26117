import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner; 

public class SQLExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter database connection details.
            System.out.print("Enter the database URL (e.g., jdbc:mysql://localhost:3306/your_db): ");
            String dbUrl = scanner.nextLine(); // Read the database URL.

            System.out.print("Enter the database username: ");
            String username = scanner.nextLine(); // Read the database username.

            System.out.print("Enter the database password: ");
            String password = scanner.nextLine(); // Read the database password.

            // Attempt to establish a connection to the database with the provided details.
            Connection connection = DriverManager.getConnection(dbUrl, username, password);

            // If the connection is successful, print a success message.
            System.out.println("Successfully connected to the database.");
        } catch (SQLException e) {
            // Catch SQLException and print an error message if connection fails.
            System.out.println("SQLException occurred: " + e.getMessage());
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
