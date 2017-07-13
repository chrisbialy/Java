package Functions;
import java.util.Scanner;
public class Tutorial_6 
{
static Scanner kboard = new Scanner(System.in);
	
	public static int getNumber()
	{
	int nos1=0;
	System.out.println("Please enter number to factor:");
	nos1 = kboard.nextInt();
	return(nos1);
	}
	
	public static int calcFactorial(int nos1)
	{
		int total=1;
		for (int x=1;x<=nos1;x++)
		{
		total = total *x;	
		}
		return(total);
	
	}
		public static void displayAnswer(int total)
		{
			
			System.out.println("Factorial: "+total);
			
		}
		
		
		public static void main(String[] args)
		{
			int nos1=0;
			int total=0;
			String choice;
			do
			{
			nos1 = getNumber();
			total = calcFactorial(nos1);
			displayAnswer(total);
			String dummy = kboard.nextLine();
			System.out.println("Would like calculate another number ? Y - Yes  N - No ");
		    choice = kboard.nextLine();
			}
			while (choice.equalsIgnoreCase("y"));
		System.out.println("Bye");
		}
		
}

