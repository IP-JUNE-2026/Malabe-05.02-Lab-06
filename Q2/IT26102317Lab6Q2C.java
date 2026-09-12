import java.util.Scanner;

public class IT26102317Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersStr = "";
        int sum = 0;
        int count = 1;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.println("Enter number " + count + ":");
            int num = scanner.nextInt();
            sum += num;
            numbersStr += num + " ";
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("The numbers you entered are:");
        System.out.println(numbersStr.trim());
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}