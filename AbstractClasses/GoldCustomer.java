package abstractClasses;
import java.text.DecimalFormat;
import java.util.Scanner;


public class GoldCustomer extends customer
{

	private final double discount=0.20; 
	private String homeAddress;
	
	public GoldCustomer()
	{
		customername = this.getName();
		customerEmail = this.getEmail();
		homeAddress = this.getHome();
	}

	public void display()
	{
	System.out.println("name ="+customername+" email address "+customerEmail+" home address "+homeAddress);	

	}
	public String getName()
	{
	Scanner kboard = new Scanner(System.in);
	String name;
	System.out.println("Welcome back Gold customer - name?");
	name = kboard.nextLine();
	return (name);
	}
	
	public String getEmail()
	{
		Scanner kboard = new Scanner(System.in);
		String email;
		System.out.println("Welcome back "+customername+"'s your email address is ");
		email = kboard.nextLine();
		return (email);	
	}
	
	public String getHome()
	{
		Scanner kboard = new Scanner(System.in);
		String home;
		System.out.println("Welcome back "+customername+"'s your home address is ");
		home = kboard.nextLine();
		return (home);	
	}
	
	public void calcCost(double cost)
	{
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The cost of the room as a GOLD customer is "+df.format(cost-(cost*discount)));
	}
	
}
