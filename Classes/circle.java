package classes;
import java.text.DecimalFormat;
import java.util.Scanner;

public class circle

{
	private double radius;
	
	
	public circle()
	{	
		
	}
	
	
	public circle(double radius)
	
	{
	this.radius = radius;
	}
	
	
	public double calculateArea()
	{
	Scanner kboard = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.####"); 
	double area;
	area=2*3.14*radius;
	return(area);
	
	}
	
	
	public void getRadius()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter radius: ");

	radius = kboard.nextDouble();
	
    }
	
	public void displayAll()
	{
	System.out.println("radius   : "+radius);
	System.out.println("area : "+this.calculateArea());
	}
	
	
}
	
	
	