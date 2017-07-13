package Week5;
import java.util.Scanner;
public class Tut2_1 
{
	public static void main(String[] args)
	{

		Scanner kboard = new Scanner(System.in);
		
		int number1 = 0;
		int number2 = 0;
		int total1 = 0;
		int total2 = 0;
		int largest= -9999;
		int counter = 0;
		String option;
		String dummy;
		
		
		do
		{
			System.out.println("Please enter a number 1 ");
			number1 = kboard.nextInt();
			
			
			System.out.println("Please enter a number 2 ");
			number2 = kboard.nextInt();
			
			
			total1 = number1+number2;
			total2 = number1*number2;
			dummy = kboard.nextLine();
			
			System.out.println("Do you want to calculate the total? y/n ");
			option = kboard.next();
			
			if (number1>largest)
	    	{
	    		largest=number1; // if number entered is grater than largest then largest becomes equal to the number
	    				//picks , stores and returns the largest number
	    	}
			
			
			if (number2>largest)
	    	{
	    		largest=number2; // if number entered is grater than largest then largest becomes equal to the number
	    				//picks , stores and returns the largest number
	    	}
			
			
			
		}
		while (option.equalsIgnoreCase("y"));
		System.out.println("The total of number1 + number2 is "+total1);
		System.out.println("The total of number1 * number2 is "+total2);
		System.out.println("The largest number entered was " +largest);

		kboard.close();
}
}