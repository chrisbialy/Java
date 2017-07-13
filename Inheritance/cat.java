package Inheritance;
import java.io.*;
import java.util.Scanner;
public class cat
{
private String catName;
private String catBreed;
private int catAge;

public cat(String a, String b, int c)
{
  getCatDetails(a,b,c);
}

public cat() {
	// TODO Auto-generated constructor stub
}

public void getCatDetails(String gCatName, String gBreed, int gAge)
{
  catName=gCatName;
  catBreed = gBreed;
  catAge = gAge;
}

public void gCatName()
{
Scanner kboard = new Scanner(System.in);

System.out.print("Please enter cat name: ");

catName = kboard.nextLine();
}


public void gBreed()
{
Scanner kboard = new Scanner(System.in);

System.out.print("Please enter cat breed: ");

catBreed = kboard.nextLine();
}

public void gAge()
{
Scanner kboard = new Scanner(System.in);

System.out.print("Please enter cat age: ");

catAge = kboard.nextInt();
}



public void displayDetails() throws IOException
{
  System.out.println("Cats name is : "+catName);
  System.out.println("Cats breed is : "+catBreed);
  System.out.println("Cats age is : "+catAge);
  
}
}
