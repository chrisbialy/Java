package ConditionsPckg;
import java.util.Scanner;
public class Tutorial1_2 
{
public static void main(String[] args)
	
	{
	Scanner kboard = new Scanner(System.in);
	
	System.out.println("Please enter your password ?");
    int password = kboard.nextInt();
    
    if(password != 1234)
    {
    	System.out.println("Please re-enter the password ?");
    	int password2 = kboard.nextInt();
    	
    	if(password2 != 1234)
    	System.out.println("ERROR INCORRECT PASSWORD !");
    }
    
    if(password == 1234)
    {
    System.out.println("ENTER");
    }
  
    kboard.close();
}
}