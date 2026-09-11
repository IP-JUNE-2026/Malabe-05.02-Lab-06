import java.util.Scanner;

public class IT26102357Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        // Loop to take 10 inputs from the user and calculate total sum
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            sum += numbers[count];
            count++;
        }

        System.out.println("\nThe numbers you entered are:");

        // Loop to display the entered numbers
        count = 0;
        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println(); // New line

        // Calculate average
        double average = (double) sum / 10;

        // Display sum and average matching expected output formatting
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}