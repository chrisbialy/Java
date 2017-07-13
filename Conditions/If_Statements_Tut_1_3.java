package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_1_3 
{

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		 System.out.println("PRESS 1 TO ENTER LOTTERY NUBMERS OR 2 TO ENTER NAME");
		 int x = kboard.nextInt();
		 String dummy = kboard.nextLine();
		 while (x != 1 && x != 2)
		 {
			System.out.println("Incorrect entry");
			 System.out.println("PRESS 1 TO ENTER LOTTERY NUBMERS OR 2 TO ENTER NAME");
			 x = kboard.nextInt();
			 dummy = kboard.nextLine();
		 }
		 if(x == 1)
			{
			System.out.println("Enter six numbers");
			dummy = kboard.nextLine();
			String numbers = kboard.nextLine();
			System.out.println("Your numbers: "+numbers+"");
			}
			
		 else if (x == 2)
			{
			System.out.println("Enter surname:");
			String surname = kboard.nextLine();
			surname = surname.toUpperCase();
			System.out.println("surname is "+surname);
			}
		
	 		kboard.close();
}
}
