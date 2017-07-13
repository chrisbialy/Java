package Functions;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tutorial_4 
{

	static Scanner kboard = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	
	public static String getForeName()
	{
	String newforename="";
	System.out.println("Please enter your Forename.");
	newforename = kboard.nextLine();
	return(newforename); 
	}

	
	
	public static String getSurName()
	{
	String newsurename="";
	System.out.println("Please enter your Surname.");
	newsurename = kboard.nextLine();
	return(newsurename); 
	}

	
	
	public static double getRate()
	{
	double newrate=0;
	System.out.println("Please enter your hourly rate per hour.");
	newrate = kboard.nextDouble();
	return(newrate);
	}

	
	public static double getHoursWorked()
	{
	double newhoursworked=0;
	System.out.println("Please enter your hours worked.");
	newhoursworked = kboard.nextDouble();
	return(newhoursworked);
	}
	
	public static double getWage(double newrate, double newhoursworked)
	{
		double wagetotal=0;
		wagetotal=newrate*newhoursworked;
		return(wagetotal);
	}
	
	
	public static void display(String newforename, String newsurename, double newrate, double newhoursworked, double wagetotal  )
	{
	System.out.println("Forename: "+newforename.charAt(0)+" Surname: "+newsurename.toUpperCase());
	System.out.println("Total hours worked "+newhoursworked);
	System.out.println("Rate per hour: "+newrate);
	System.out.println("Total Wage: "+wagetotal);
	
	}

	
	public static void main(String[] args)
	{
		String newforename="";
		String newsurename="";
		double newrate=0;
		double newhoursworked=0;
		double wagetotal=0;
		newforename = getForeName();
		newsurename = getSurName();
		newrate=getRate();
		newhoursworked=getHoursWorked();
		wagetotal=getWage(newrate,newhoursworked);
		display(newforename,newsurename,newrate,newhoursworked,wagetotal);
		
	}
	
	
	
}
