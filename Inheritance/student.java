package Inheritance;
import java.util.Scanner;
public class student extends person{

	protected int martNo;
	protected String courseName;
	
	
	public student()
	{
		
	}
	
	
	public void getStudentDet(int gmartNo, String gcourseName) 
	{
	  
		martNo = gmartNo;
		courseName = gcourseName;
	}
	
	public student(String gName, String gAddress, int gAge, int martNo, String courseName)
	{
		  super (gName,gAddress,gAge);
		  this.martNo = martNo;
		  this.courseName = courseName;	
	}

	public void gcourseName()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please course name: ");

	courseName = kboard.nextLine();
	}



	public void gmartNo()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter matriculation number : ");

	martNo = kboard.nextInt();
	}
	
	public void gNewcourseName()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter course name: ");

	courseName = kboard.nextLine();
	}
	
	public void gNewAddress()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter address name: ");

	personsAddress = kboard.nextLine();
	}
	
	public void displayStudentDetails()
	  {
		System.out.println("Name  : "+personsName);
		System.out.println("Email : "+personsAddress);
		System.out.println("Age   : "+personsAge);
		System.out.println("Matriculation number    : "+martNo);
		System.out.println("Course Name    : "+courseName);
		
		
	
	  }
}
