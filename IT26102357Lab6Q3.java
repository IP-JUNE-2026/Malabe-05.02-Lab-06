import java.util.Scanner;

public class IT26102357Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sumOfSquares = 0.0;
        
        System.out.println("Enter positive integers (terminate input with -99):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Check for termination value
            if (number == -99) {
                break;
            }
            
            // Validate for negative input (excluding sentinel value -99)
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                continue;
            }
            
            // Accumulate sum of squares and count valid inputs
            sumOfSquares += Math.pow(number, 2);
            count++;
        }
        
        // Calculate and display Root Mean Square if at least one valid number was entered
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nRoot Mean Square (RMS) = " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered.");
        }
        
        scanner.close();
    }
}