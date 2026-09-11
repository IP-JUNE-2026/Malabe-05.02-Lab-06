import java.util.Scanner;

public class IT26102372Lab6Q3{
	public static void main(String[] args){
	
	int number;
	double meanofsquares,rms;
	
	double sumofsquares = 0;
	int count = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter positive integers (terminate input with -99):");
	while(true){
		System.out.println("Enter a number:");
		number = input.nextInt();
		
		if(number == -99){
			break;
		}
		if (number > 0){
		sumofsquares += Math.pow(number,2);
		count++;
		}else{
			System.out.println("Invalid input .please enter a positive integer or -99 to terminate");
		}
	}
	if(count > 0){
	meanofsquares = sumofsquares/count;
	rms = Math.sqrt(meanofsquares);
	
	System.out.println();
	System.out.println("The root mean square(RMS) is:" + rms);
	}
		else{
		System.out.println("no positive numbers were entered");
		}
	}
}