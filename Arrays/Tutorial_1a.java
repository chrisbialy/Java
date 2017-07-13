package Arrays;
import java.util.Scanner; 
public class Tutorial_1a 
{
	public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        int card1=0;
        int card2=0;
        int card3=0;
        int total=0;
        String choice="";
        
        card1 = (int)(Math.random()*10) + 1; // Card 1 = between 1 and 10


        card2 = (int)(Math.random()*10) + 1; // Card 2 = between 1 and 10
        System.out.println("You have drawn " +card1+ " and " +card2+ ".");
        
        total=card1+card2;
      
        System.out.println("Would like draw another Card ? (y/n)");
        choice = kboard.nextLine();
        
        while (choice.equalsIgnoreCase("y"))
        {
            card3 = (int)(Math.random()*10) + 1;
            System.out.println("You have drawn "+card3+" ");
            total = total + card3;
            System.out.println("Would like draw another Card ? (y/n)");
            choice = kboard.nextLine();
            
            //System.out.println("Your score is "+total+" ");
            if  (total>19 && total<=21)
            {
                System.out.println("You won with total of "+total+" ");   
            }   
            else
            {
                System.out.println("You lost with total of "+total+" ");
            }
          
        
      /*  System.out.println("Do you wish to continue y/n?");
        choice = kboard.nextLine();
        
        }
        
    if  (total<19 || total>21)
    {
        System.out.println("You lost");   
    }   
    else
    	System.out.println("You won with total of "+total+" ");
    System.out.println("Bye");*/
            
            break;   
        }
        
        kboard.close();
    
    }
}
