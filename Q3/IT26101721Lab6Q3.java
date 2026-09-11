import java.util.Scanner;

public class IT26101721Lab6Q3 {

    public static void main(string[] args) {
	
	   // Declare the variables
	          int number;
			  double meanOfSquares , rms;
			  
			  // Declare and Initialise variables to hold the sum of square and the count of numbers
              double SumOfSqures = 0;
       int count = 0;
       
       // Create a Scanner object for input
       Scanner input = new Scanner(System.in);

      // Prompt the user to enter numbers
      System.out.println("Enter positive intergres (terminate input with -99):");
	  
	  // Read numbers until -99 is encountered
	  while (true) {
	  
	     System.out.print("Enter a number: ");
		 number = input.nextInt();
		 
		 if (number == -99) {
		     break;
		}
		
		if (number > 0) {
		
		    // Update the sum of squres and count
			sumOfsqures +" Math.pow(number. 2);
			
			count++;
			
		} else {
		
		    // Notify user of invalid input (Negative number other than -99)
			System.out.println(Invalid input. Please enter a positive integer or -99 to terminate");
		}
	}
	 
	        // Check if any valid numbers were entered
	if (count > 0) {

          // Calculater root Mean Squre (RMS)
          meanOfSqures = sumOfSqures / count;
          rms = Math.sqrt(meanOfSqures);

          // Print the RMS result
                    System.out.println();
          System.out.println("The Root Mean Squre (RMS) is: " + rms);
    } 
            else {

                    // Notify user of invalid input (Negative number other than -99)
          System.out.println("No positive number were entered");
		}
	}
}	
	
	
	
	
	
	
	
	
	  
			  