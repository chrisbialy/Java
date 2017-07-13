package Inheritance;
import java.io.*;
import java.util.Scanner;

class babykitten extends kitten
{

	private String owner;

	public babykitten()
	{
		
	}
	
	public babykitten(String gCatName, String gBreed, int gAge, String kittenEyes, int kittenLength, String owner)
	{
		super(gCatName, gBreed, gAge, kittenEyes, kittenLength);
		this.owner = owner;
	}
	
	
	public void displayOwner()
	{
		System.out.println("Owner is "+owner);
	}
	
	public void displayEverything() throws IOException
	{
		this.displayDetails();
		this.kitttenDisplayDetails();
		this.displayOwner();
	}
	
	
}
