package polymorphism;
import java.util.Scanner;


public abstract class customer 
{
protected String customername;
protected String customerEmail;

abstract public void display();
abstract public String getName();
abstract public String getEmail();
abstract public void calcCost(double cost);
}



/*
public class customer 
{
private String customerName; // Attributes
private String customerEmail;

public customer()
{
	
}

public customer(String cname, String cemail) // Initialise (constructor – with name and address for testing)
{
	customerName = cname;
	customerEmail = cemail;
}

public void display()
{
	System.out.println("Details are "+customerName+ " "+customerEmail);
}

public void getname()
{
	Scanner kboard = new Scanner(System.in);
	System.out.println("Please enter your name");
	customerName = kboard.nextLine();
}
public void getemail()
{
	Scanner kboard = new Scanner(System.in);
	System.out.println("Please enter your contact details");
	customerEmail = kboard.nextLine();
}



}*/


