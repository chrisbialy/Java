package ConditionsPckg;
import java.util.Scanner;
import java.text.DecimalFormat;
public class If_Statements_Tut_6 
{
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	//Phase 1
	double creditLimit=0.0;
	System.out.println("Please enter your credit limit");
	creditLimit=kboard.nextDouble();
	System.out.println("Your credit limit is "+df.format(creditLimit));
	if (creditLimit > 50000)
	{
	System.out.println("Credit rating is Platinum");
	}
else
	{
	if ((creditLimit>=10000) && (creditLimit<=5000))
		{
		System.out.println("Credit rating is Gold");
		}
	else
		{
		System.out.println("Credit rating is Silver");
		}
	}

	
	
	
	
	
	
	kboard.close();
	}

}
