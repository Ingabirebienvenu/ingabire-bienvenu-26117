import java.util.Scanner; 
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            // Prompt the user to enter a value
            System.out.print("Enter a value (e.g., a number or text): ");
            String input = scanner.nextLine(); // Read the input as a String

            // Store the input as an Object
            Object obj = input;

            // Attempt to cast the Object to an Integer
            // If the input is not a valid Integer, this will throw a ClassCastException
            Integer num = (Integer) obj;

            // Print the number if the cast succeeds
            System.out.println("The number is: " + num);
        } catch (ClassCastException e) {
            // Catch the ClassCastException and handle it
            System.out.println(" Invalid type cast.");
        } finally {
            scanner.close();
        }
    }
}
