import java.util.Scanner;

public class import java.util.Scanner;

public class IT26102357Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Please enter 10 numbers:");

        // Loop to take 10 inputs from the user
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            count++;
        }

        System.out.println("\nThe numbers you entered are:");

        // Loop to display the entered numbers separated by space
        count = 0;
        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println(); // New line at the end

        scanner.close();
    }
} {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Please enter 10 numbers:");

        // Loop to take 10 inputs from the user
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            count++;
        }

        System.out.println("\nThe numbers you entered are:");

        // Loop to display the entered numbers separated by space
        count = 0;
        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println(); // New line at the end

        scanner.close();
    }
}