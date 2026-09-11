import java.util.Scanner;

public class IT26102372Lab6Q1{
	public static void main(String[] args){
		double number,The_Squre,The_Squre_root;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		number = input.nextDouble();
		
		if(number <= 0){
		System.out.println("error: the number must be greater than zero");}
				else{
		 The_Squre_root =Math.sqrt(number);
		 The_Squre = number * number;
		 
		
		System.out.println("The squre root of :" +The_Squre_root);
				System.out.println("The squre of :" +The_Squre);
				}
	}	
}