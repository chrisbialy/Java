package Inheritance;

import java.util.Scanner;

public class nondegree extends student  {

	private String studyLevel;
	private String SupervName;
	private String tutorName;
	private String studyY;
	private String gcourseName;
	private String gtutorName;
	
	public nondegree()
	{
		
	}
	
	
	public void getdNongreeDet(String gstudyLevel, String gSupervName) 
	{
	  
		studyLevel = gstudyLevel;
		SupervName = gSupervName;
	}
	
	public nondegree(String gName, String gAddress, int gAge, int gmartNo, String gcourseName, String studyLevel, String SupervName)
	{
		  super (gName,gAddress,gAge,gmartNo,gcourseName);
		  this.studyLevel = studyLevel;
		  this.SupervName = SupervName;
	}
	
	
	public void gstudyLevel()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter your study level: ");

	studyLevel = kboard.nextLine();
	}
	
	
	public void SupervName()
	{
	Scanner kboard = new Scanner(System.in);

	System.out.print("Please enter your supervisor name: ");

	SupervName = kboard.nextLine();
	}
	
	
	public void displayNonDegreeStudentDetails()
	  {
		/*System.out.println("Name  : "+personsName);
		System.out.println("Email : "+personsAddress);
		System.out.println("Age   : "+personsAge);
		System.out.println("Matriculation number    : "+martNo);
		System.out.println("Course Name    : "+courseName);*/
		System.out.println("Supervisor Name    : "+SupervName);
		System.out.println("Level Of Study    : "+studyLevel);
	  }
	
}
