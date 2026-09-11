import java.util.Scanner;

public class IT26101721Lab6Q1 {

    public static void main(String[] args) {
	
	    // Declare the variables
		        double number , squre , squreRoot;
				
				// Create a Scanner object to read input
			Scanner input = new Scanner(System.in);
			
			// Prompt the user to enter a number
			System.out.print("Enter a number: ");
			number = input.nextDouble();
			
			// Vaildate the input
			if (number <= 0) {
			   System.out.println("Error: The number must be greater than zero");
			}
			       else {
				// Calcuate the squre of the number
				squre = number * number;
				
				// Calculate the squre root of the number
				squreRoot = Math.sqrt(number);
				
				// Display the squre and squre root
				            System.out.println();
				System.out.println("The squre of " + number + " is : " + squre);
				System.out.println("The squre root of " + number + " is : " + squreRoot);
			}
		}
	}