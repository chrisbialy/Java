package Functions;
import java.util.Scanner;
public class Tutorial_02 
{
	
static Scanner kboard = new Scanner(System.in); 
	
	public static String getName()
	{
	String newuser="";
	System.out.println("Please enter your name ?");
	newuser = kboard.nextLine();
	return(newuser); 
	}
	
	
	public static int getAge()
	{
	//String dummy;
	int newage=0;
	System.out.println("Please enter your age ?");
	newage = kboard.nextInt();
	//dummy = kboard.nextLine();
	return(newage);
	}

	public static String getGender()
	{
	String newgender="";	
	System.out.println("Please enter your gender M or F ?");
	newgender = kboard.next(); //erased Line From nextLine - works without String dummy
	return(newgender); 
	}
	
	
	
	
	public static void display(String name, int age, String newgender )
	{
		
		if (newgender.equalsIgnoreCase("f"))
		{
		System.out.println("Her name is "+name+" and the age is "+age);
		}
		
	
	
		if (newgender.equalsIgnoreCase("m"))
		{
		System.out.println("His name is "+name+" and the age is "+age);
		}
	
	
	}

	
	
	
	public static void main(String[] args)
	{
		String user="";  
		int age=0;
		String newgender="";
		user = getName();
		age = getAge();
		newgender = getGender();
		display(user,age,newgender);

	}
	
	

	
}
