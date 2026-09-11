import java.util.Scanner;

public class IT26101251Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating 10 separate variables as requested
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;

        System.out.println("Please enter 10 numbers:");
        
        // Asking for user input 10 separate times
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

        // Printing the result
        System.out.println("\nThe numbers you entered are:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + 
                           num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);
        
        scanner.close();
    }

}