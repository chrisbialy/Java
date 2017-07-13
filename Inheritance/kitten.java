package Inheritance;
import java.io.*;
import java.util.Scanner;
class kitten extends cat {

	private String kittenEyes;
	private int kittenLength;

public kitten()
{
	
}

public void getKittenDetails(String gKittentEeyes, int gKittenLength) 
	{
	  
	  kittenEyes = gKittentEeyes;
	  kittenLength = gKittenLength;
	}


public kitten(String gCatName, String gBreed, int gAge, String kittenEyes, int kittenLength)
{
	  super (gCatName,gBreed,gAge);
	  this.kittenEyes = kittenEyes;
	  this.kittenLength = kittenLength;	
}



public void gKittentEeyes()
{
Scanner kboard = new Scanner(System.in);

System.out.print("Please enter cat eyes colour: ");

kittenEyes = kboard.nextLine();
}



public void gKittenLength()
{
Scanner kboard = new Scanner(System.in);

System.out.print("Please enter cat length: ");

kittenLength = kboard.nextInt();
}


public void kitttenDisplayDetails() throws IOException
{
	
  //this.displayDetails();
  System.out.println("Kitten eyes are  : "+kittenEyes);
  System.out.println("Kitten Length is : "+kittenLength);
  
}


}