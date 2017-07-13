package Functions;
import java.util.Scanner;
public class Tutorial_1 
{
static Scanner kboard = new Scanner(System.in);
	
	public static int getNumber()
	{
	
		int nos=0;
		System.out.println("Please enter number");
		nos = kboard.nextInt();
		return(nos);
	}
	
	public static int calcSquare(int nos)
	{
		int sqrnos=0;
		sqrnos=nos*nos;
		return(sqrnos);
	}
	
	public static void display(int nos, int sqrnos)
	{
		System.out.println(+nos+ " squared equals " +sqrnos);
	}
	
	public static void main(String[] args)
	{
		int nos=0;
		int sqrnos=0;
		nos =  getNumber();
		sqrnos = calcSquare(nos);
		display(nos,sqrnos);
	}
	
	
	
}
	

