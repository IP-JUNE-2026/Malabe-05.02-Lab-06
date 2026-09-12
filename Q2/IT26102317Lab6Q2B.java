import java.util.Scanner;

public class IT26102317Lab6Q2B {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        String numbersStr = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.println("Enter number" + count + ":");
            int num = input.nextInt();
            
            numbersStr = numbersStr + num + " ";
            
            count++;
        }

        System.out.println("The numbers you entered are:");
        System.out.println(numbersStr);

        input.close();
    }
}    