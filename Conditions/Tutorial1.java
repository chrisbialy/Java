package ConditionsPckg;
import java.util.Scanner;
public class Tutorial1 
{
public static void main(String[] args)
	
	{
	Scanner kboard = new Scanner(System.in);
	
	System.out.println("Please enter your name ?");
    String name = kboard.nextLine();
    
    String dummy = kboard.nextLine();
    
    System.out.println("Please enter your age ?");
    int age = kboard.nextInt();
    
    if(age >= 65)
    {
    System.out.println("You are over 65 and MAY RETIRE");
    }
    
    else
    {
    System.out.println("You are under 65 and MAY NOT RETIRE");
    }
	kboard.close();
}
}