package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_5 
{
	
		public static void main(String[] args)
		{
			Scanner kboard = new Scanner(System.in);
			System.out.println("Enter sex. 'YES' - MALE 'NO'- FEMALE");
			String sex=kboard.nextLine();
			

			if(sex.equalsIgnoreCase("no"))
			{
		           System.out.println("SURVIVED 0.73 / 36% of population");
			}
			if(sex.equalsIgnoreCase("yes"))
			{
				System.out.println("Is there anyone older than 9.5 years old?");
				System.out.println("ENTER 'YES' OR 'NO'");
				String age=kboard.nextLine();
				if(age.equalsIgnoreCase("yes"))
				{
					System.out.println("\nDIED 0.17 / 61% of population");
				}
				
				
				
				
				if(age.equalsIgnoreCase("no"))
				{
					System.out.println("Is there any other Siblings older than 2.5 years old ?");
					System.out.println("Enter 'YES' OR 'NO'");
					String age2=kboard.nextLine();
					if(age2.equalsIgnoreCase("yes"))
					{
						System.out.println("SURVIVED 0.89 / 2% of population");
					}
					
					if(age2.equalsIgnoreCase("no"))
					{
						System.out.println("DIED 0.05 / 2% of population");
					}
					
					
				}
				
			}
				
			else
				{
					System.out.println("INVALID DATA !");
				}
			
		kboard.close();
	}
	}

