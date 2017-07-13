package Arrays;
import java.util.Scanner; 				// added
public class Tutorial_1 
{
	public static void main(String[] args)
	{
		
		int value=0;
		for (int x=0;x<40;x++)
			{
			value = (int)(Math.random()*10) + 1;
			System.out.print(value+" ");
			}
		
	Scanner DSInput = new Scanner(System.in); // added
	String choice ="";
	System.out.println("Do you wish to continue y/n?");
	choice = DSInput.nextLine();				// added
	//choice = DSInput.readString();
	//doesn't work , don't know why
	
	while (choice.equalsIgnoreCase("y"))
		{
		System.out.println("Hello");
		System.out.println("Do you wish to continue y/n?");
		choice = DSInput.nextLine();			// added
		//choice = DSInput.readString();
		//doesn't work , don't know why
		
		}
	DSInput.close();
	System.out.println("Bye");
	}

}
