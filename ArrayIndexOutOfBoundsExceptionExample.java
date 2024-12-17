import java.util.Scanner; 

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        try {
            // Declare and initialize an integer array with 5 elements (indices 0 to 4)
            int[] arr = {1, 2, 3, 4, 5};

            // Print the array elements for reference
            System.out.println("Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index " + i + ": " + arr[i]);
            }

            // Prompt the user to enter an index to access
            System.out.print("Enter an index to access (0 to 4): ");
            int index = scanner.nextInt(); // Read the index input from the user

            // Access and display the element at the user-specified index
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Invalid index access.");
        } finally {
            scanner.close();
        }
    }
}
