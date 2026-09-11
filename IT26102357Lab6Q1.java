import java.util.Scanner;

public class IT26102357Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate square and square root
        double square = Math.pow(number, 2); // or number * number
        double squareRoot = Math.sqrt(number);

        // Display results matching expected output formatting
        System.out.println("\nThe square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);

        scanner.close();
    }
}


