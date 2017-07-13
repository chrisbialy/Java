package classes;
import java.util.Scanner;
public class card_driver {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		card deck[] = new card[52];
		int value = 0;
		
		card c1 = new card("Spades",1,1); //could have used symbolic rep 1 – hearts etc
		card c2 = new card("Spades",2,2);
		card c3 = new card("Spades",3,3);
		card c4 = new card("Spades",4,4);
		//card c5 = new card("Diamonds",5,5);
		//card c6 = new card("Clubs",6,6);
		
		deck[1] = c1; //Adding a card to the deck – basic method (yawn)
		deck[2] = c2;
		deck[3] = c3;
		deck[4] = c4;
		
		//deck[5] = c5;
		//deck[6] = c6;
	
		
		
		for (int x=0;x<deck.length;x++)
		{
			if (deck[x] !=null)
				{
			
				//deck[x].setCard(true);	
				//deck[x].returnCard();
				deck[x].displayCard();
				deck[x].displayAllCards();
				
				}
		/*String choice="";
			
			if (deck[1]==(deck[1]) && deck[2]==(deck[2]) && deck[3]==(deck[3])&& deck[4]==(deck[4]))
			{
				System.out.println("Number already in use. Would you like to Draw again second number (y/n)");
				choice = kboard.nextLine();
				 while (choice.equalsIgnoreCase("y"))
			        {
					 
					 	//deck[x].setCard(true);	
						//deck[x].returnCard();
						//deck[x].displayCard();
						//deck[x].displayAllCards();
					 	deck[x].generateAgain();
						System.out.println("Generating Again");
						break;
					  }
				 
							}
								else{}*/
					        }
			}
		
}
	
