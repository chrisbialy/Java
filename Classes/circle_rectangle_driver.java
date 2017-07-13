package classes;

import java.util.Scanner;

public class circle_rectangle_driver {
public static void main(String[] args)

{
Scanner kboard = new Scanner(System.in);
	int choice=0;
	rectangle r1 = new rectangle();
	circle c1 = new circle();
	
{
for(int x=1; x<5; x++)
		
	{
	System.out.print("Press 1 for rectangle, 2 for Circle, 3 to exit:");
	choice = kboard.nextInt();
	
	if (choice==1)
	{
	System.out.println("Enter rectangle detail");
	r1.getWidth();
	r1.getHeight();
	r1.displayAll();
	r1.isSquare();
	}
	
	if (choice==2)
	{
		System.out.println("Enter circle detail");
		c1.getRadius();
		c1.displayAll();
	}
	
	if (choice==3)
		
	{
		System.out.println("Exiting program......");
		Runtime.getRuntime().exit(x);
	}
	

	}
}
}
}