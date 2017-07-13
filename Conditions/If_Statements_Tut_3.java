package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_3 
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		
	
		System.out.print("Is Your parents visiting us today ?");
		
		String answer = kboard.nextLine();
		
		/*String dummy = kboard.nextLine();*/
		
		
		if(answer.equalsIgnoreCase("yes"))
		{
	           System.out.println("Let's go to cinema to see the new movie !!");
		}
		if(answer.equals("no"))
		{
				System.out.println("Maybe we could go out ? What's the weather like ? Is it sunny, windy or rainy ? ");
				String weather = kboard.nextLine();
				
				if(weather.equalsIgnoreCase("sunny"))
				{
					System.out.println("That's great !! Let's play tennis!");
				}
				
				
				if(weather.equals("rainy"))	
				{
					System.out.println("It's rainy ! We should stay in and have a good dinner and drink");
				}
				
				
				if(weather.equalsIgnoreCase("windy"))
				{
					System.out.println("Ok. It is windy outside sa mayby we could go shopping if you are rich enough? Cinema will be fine unless you are poor");
					String answer2 = kboard.nextLine();
					
					if (answer2.equalsIgnoreCase("rich"))
						System.out.println("Fantastic !! I will call a taxi and we can go to shopping centre");
					else
					{
						System.out.println("That's fine. We can go to see the new Spiderman");
					}
				
				
				}
		}
	
		
		kboard.close();
		
}
}