package polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OrdinaryCustomer extends customer
{
	private final double discount=0; 
	
	public OrdinaryCustomer()
	{
		customername = this.getName();
		customerEmail = this.getEmail();
	}

	public void display()
	{
	System.out.println("name ="+customername+" email address "+customerEmail);	
	}
	public String getName()
	{
	Scanner kboard = new Scanner(System.in);
	String name;
	System.out.println("Please enter the name of the new ordinary customer");
	name = kboard.nextLine();
	return (name);
	}
	
	public String getEmail()
	{
		Scanner kboard = new Scanner(System.in);
		String email;
		System.out.println("Please enter "+customername+"'s email address");
		email = kboard.nextLine();
		return (email);	
	}
	
	public void calcCost(double cost)
	{
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The cost of the room is "+(df.format(cost-(cost*discount))));
	}
	
}
