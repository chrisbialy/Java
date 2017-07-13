package classes;

import java.util.Scanner;


	public class rectangle {

	private int height;
	private int width;
	
	public rectangle()
	{
		
	}
	
	public rectangle(int height, int width, int area)
	{
	this.height = height;
	this.width = width;
	}


	public void displayAll()
	{
	System.out.println("height   : "+height);
	System.out.println("width : "+width);
	System.out.println("area : "+this.calculateArea());
	System.out.println();
	}


	public void getHeight()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter height: ");

	height = kboard.nextInt();
	}

	public void getWidth()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter width: ");

	width = kboard.nextInt();
	}



	public int calculateArea()
	{
	Scanner kboard = new Scanner(System.in);
	int area;
	area=width*height;
	return(area);
	}

	public void isSquare()
	
	{
		if (width==height) //ends the if statement also ned to include an ELSE clause
		{
		System.out.print("Rectangle is SQUARE!");
		System.out.println();
		}

	
		else
		{
		System.out.print("Rectangle is RECTANGLE!");	
		System.out.println();
			
		}


	}

	}

