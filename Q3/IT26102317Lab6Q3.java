import java.util.Scanner;

public class IT26102317Lab6Q3 {
    public static void main(String[] args) {
        
        int number;
        double meanOfSquares, rms;
        
        double sumOfSquares = 0;
        int count = 0;
		
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue; 
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) {
            meanOfSquares = sumOfSquares / count;
            rms = Math.sqrt(meanOfSquares);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }

        input.close();
    }
}