package classes;
import java.util.Scanner;
public class card 
	{
	private String suite;
	private int value;
	private boolean drawn;

public card(String s, int v, int v2)
{
	this.suite = s;
	this.value = v;
	this.drawn = false;
	
}

public void displayCard()
	{
	System.out.print("Card drawn was "+value+" of "+ suite);
	if (drawn==false)
		System.out.println(" and has not been picked");
	else
		System.out.println(" and has been picked");
	}

public boolean returnCard()
	{
		return(drawn);
	}

public void setCard(boolean z)
	{
		drawn = z;
	}





/*public void generateAgain()
{
	card deck[] = new card[52];
	int Againvalue = 0;
	
	for (int x=1;x<5;x++)
		//deck[x].displayCard();
	
		Againvalue = (int)(Math.random()*10) + 1;
	System.out.println("First random number generated was "+Againvalue);
	//deck[value].setCard(true);
	

}*/




public void displayAllCards()
	{
	//display all cards
	card deck[] = new card[52];
	int value = 0;
	int value2 =0 ;
	String choice="";
	Scanner kboard = new Scanner(System.in);
	
			for (int x=1;x<5;x++)
				//deck[x].displayCard();
			
			value = (int)(Math.random()*10) + 1;
			System.out.println("First random number generated was "+value);
			//deck[value].setCard(true);
		
			
			for (int x=1;x<5;x++)
				//deck[x].displayCard();
			
			value2 = (int)(Math.random()*10) + 1;
			System.out.println("Second random number generated was "+value2);
			
			if (value==value2)
			{
				System.out.println("Number already in use. Would you like to Draw again second number (y/n)");
				choice = kboard.nextLine();
				 while (choice.equalsIgnoreCase("y"))
			        {
				value2 = (int)(Math.random()*10) + 1;
				System.out.println("Second random number generated again was "+value2);
				break;
			        }
			}
			else
			{
				
			}
	}
	




		
		
    


String[] suites = { "Hearts", "Diamonds", "Spades", "Clubs" };
{
	System.out.println("The third element is: " + suites[1]);
}


}
