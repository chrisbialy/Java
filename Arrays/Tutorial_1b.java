package Arrays;
import java.util.Scanner; 
public class Tutorial_1b 
{

	
	static Scanner kboard = new Scanner(System.in); 
	
	public static int getRandomNumber()
	{
		int RandomNumber=0;
		RandomNumber = (int)(Math.random()*10) + 1;
		return(RandomNumber);
		
	}
	
	public static int getRandomNumber2()
	{
		int RandomNumber2=0;
		RandomNumber2 = (int)(Math.random()*10) + 1;
		return(RandomNumber2);
		
	}
	
	
	public static int calcTotal(int RandomNumber, int RandomNumber2)
	
	{
		int z=0;
		z=RandomNumber+RandomNumber2;
		return(z);
	}
	
	public static int getResult(int z)
	
	{
	
		int result=0;
		z=result;
		if (z>18 && z<=21)
			
		{
			System.out.println("True - getResult function"); 
			
		}
		else
		{
			System.out.println("False- getResult function"); 
			
		}
		return(z);
	}
	
	public static int busted(int z)
	
	{
		int result2=0;
		z=result2;
		if (z>21)
		{
			System.out.println("True busted z i GRATER than 21"); 
		}	
		else
		{
			System.out.println("False busted z is NOT grater than 21"); 
		}
		return(z);
	}
	
	public static void display(int result2,int RandomNumber, int RandomNumber2, int z, int result)
	{
		System.out.println("x = "+RandomNumber+" and y = "+RandomNumber2);
		System.out.println("z total = "+z+"");
	}
	
	
	public static void main(String[] args)
	{
		int RandomNumber=0;  
		int RandomNumber2=0;
		int z=0;
		int result=0;
		int result2=0;
		result=getResult(z);
		result2=busted(z);
		RandomNumber = getRandomNumber();
		RandomNumber2 = getRandomNumber2();
		z = calcTotal(RandomNumber,RandomNumber2);
		display(result2,RandomNumber,RandomNumber2,z,result);
	}
	
}
