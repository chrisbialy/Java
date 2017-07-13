package Inheritance;

import java.util.Scanner;

public class degree extends student {

	private int studyY;
	private String tutorName;
	
	
	public degree()
	{
		
	}
	
	
	public void getdegreeDet(int gstudyY, String gtutorName) 
	{
	  
		studyY = gstudyY;
		tutorName = gtutorName;
	}
	
	
	public degree(String gName, String gAddress, int gAge, int gmartNo, String gcourseName, String tutorName, int studyY)
	{
		  super (gName,gAddress,gAge,gmartNo,gcourseName);
		  this.tutorName = tutorName;
		  this.studyY = studyY;
	}
	
	public void gtutorName()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter tutor name: ");

	tutorName = kboard.nextLine();
	}



	public void gstudyY()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter year of study : ");

	studyY = kboard.nextInt();
	}
	
	public void displayDegreeStudentDetails()
	  {
		/*System.out.println("Name  : "+personsName);
		System.out.println("Email : "+personsAddress);
		System.out.println("Age   : "+personsAge);
		System.out.println("Matriculation number    : "+martNo);
		System.out.println("Course Name    : "+courseName);*/
		System.out.println("Tutor Name    : "+tutorName);
		System.out.println("Year Of Study    : "+studyY);
	
	  }
}
