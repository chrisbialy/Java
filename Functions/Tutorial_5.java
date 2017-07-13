package Functions;
import java.util.Scanner;
public class Tutorial_5 
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
			nos1 = getNumber();
			total = calcFactorial(nos1);
			displayAnswer(total);
			
		}
		
		
}



/*public class factorial {
public static void main(String[] args)
{
Scanner kboard = new Scanner(System.in);
int nos1=0;
int total=1;
System.out.print("Please enter number to factor ");
nos1 = kboard.nextInt();
for (int x=1;x<=nos1;x++)
{
total = total *x;	
}
String dummy = kboard.nextLine();
System.out.println("Factorial = "+total);
}

Create a program which has a function called getNumber , calcFactorial and displayAnswer.
*/