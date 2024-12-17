import java.util.Scanner; 

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter the sleep duration in milliseconds.
            System.out.print("Enter the sleep duration in milliseconds: ");
            long sleepDuration = scanner.nextLong(); // Read the user input as a long value.

            // Attempting to make the current thread sleep for the user-defined duration.
            Thread.sleep(sleepDuration);

            // If no exception occurs, print a success message.
            System.out.println("Thread slept for " + sleepDuration + " milliseconds successfully.");
        } catch (IllegalArgumentException e) {
            // This block will catch the IllegalArgumentException for invalid arguments (e.g., negative duration).
            System.out.println("IllegalArgumentException occurred: Invalid argument. Sleep duration must be non-negative.");
        } catch (InterruptedException e) {
            // This block will catch the InterruptedException if the thread is interrupted during sleep.
            System.out.println(" Thread was interrupted.");
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            scanner.close();
        }
    }
}
