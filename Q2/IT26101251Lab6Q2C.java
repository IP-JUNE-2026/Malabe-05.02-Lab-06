import java.util.Scanner;

public class IT26101251Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;

        System.out.println("Please enter 10 numbers:");
        
        System.out.print("Enter number 1: ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter number 2: ");
        num2 = scanner.nextInt();
        
        System.out.print("Enter number 3: ");
        num3 = scanner.nextInt();
        
        System.out.print("Enter number 4: ");
        num4 = scanner.nextInt();
        
        System.out.print("Enter number 5: ");
        num5 = scanner.nextInt();
        
        System.out.print("Enter number 6: ");
        num6 = scanner.nextInt();
        
        System.out.print("Enter number 7: ");
        num7 = scanner.nextInt();
        
        System.out.print("Enter number 8: ");
        num8 = scanner.nextInt();
        
        System.out.print("Enter number 9: ");
        num9 = scanner.nextInt();
        
        System.out.print("Enter number 10: ");
        num10 = scanner.nextInt();

        System.out.println("\nThe numbers you entered are:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + 
                           num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);
        
        System.out.println(); // Blank line to match expected output formatting
        
        // Calculate sum and average
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double average = (double) sum / 10;
        
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
        scanner.close();
    }
}