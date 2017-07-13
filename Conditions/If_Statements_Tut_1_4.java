package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_1_4 
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = kboard.nextLine();

		System.out.println("Enter Password");
		int Password = kboard.nextInt();
		
		if (Password == 3456 && username.equalsIgnoreCase("PE123"))
		{
		System.out.println("PROCEED");
		}
		else
		{
		System.out.println("WRONG DETAILS ENTERED");
		}
		
		kboard.close();

}
}
