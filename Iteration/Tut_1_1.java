package Week5;
import java.util.Scanner;
public class Tut_1_1 
{
	public static void main(String[] args)
	{

	Scanner kboard = new Scanner(System.in);
	
	int largest= -9999;
	int smallest = 9999;
	int number = 0;
	
    for(int count=1; count<11; count++)
    {
        
        System.out.print("Enter number?");
        number = kboard.nextInt();
    
    	
    
    	if (number>largest)
    	{
    		largest=number; // if number entered is grater than largest then largest becomes equal to the number
    				//picks , stores and returns the largest number
    	}
	
    	
    	if (number<smallest) //picks , stores and returns the smallest number
    	{
    		smallest=number;
    	}
    }
    	
    	System.out.println("The largest number entered was " +largest);
    	System.out.println("The smallest number entered was " +smallest);
	kboard.close();
}
}


