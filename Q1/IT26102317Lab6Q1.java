import java.util.Scanner;

public class IT26102317Lab6Q1 {
    public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.print("Enter a number");
	   double number = scanner.nextDouble();
	   
	   double squre = number * number;
	   double squreRoot = Math.sqrt(number);
	  
	  
	   System.out.println("The squre of" + number + "is:" + squre);
	   System.out.println("The squre root of" + number + "is:" + squreRoot);
	   
	   scanner.close();
	   
	}   
	   
}     