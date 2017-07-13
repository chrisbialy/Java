package Functions;
import java.util.Scanner;
public class Tutorial_01 
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
	int newage=0;
	System.out.println("Please enter your age ?");
	newage = kboard.nextInt();
	return(newage);
	}

	
	public static void display(String name, int age)
	{
	System.out.println("The users name is "+name+" and the age is "+age);
	}

	
	public static void main(String[] args)
	{
		String user="";  
		int age=0;
		user = getName();
		age = getAge();
		display(user,age);

	}
	
	
	
	
	
}