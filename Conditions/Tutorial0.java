package ConditionsPckg;
import java.util.Scanner;
public class Tutorial0 

{
	public static void main(String[] args)
	
	{
		final int exam = 100; 
		char grade;
		/* int examMark = 50;*/
		 Scanner kboard = new Scanner(System.in);
		 System.out.println("Please enter exam1  mark");
	     int examMark1 = kboard.nextInt();
	     
	     
	     String dummy = kboard.nextLine();
	     
	     System.out.println("Please enter exam2  mark");
	     int examMark2 = kboard.nextInt();
	     int examMark = (examMark1+examMark2)/2;
	   
		 	        
		if(examMark <= 50)
			{
			System.out.println("You have failed");
			}
			
		else
			{
			System.out.println("You have passed");
			}
		
		
		System.out.println(examMark);
		if(examMark > 70) 
			System.out.println("A");
		 if((examMark >= 60) && (examMark <= 69)) /* Dispalys the % (percentage) Results  because of   int examMark = (examMark1+examMark2)/2;*/
			System.out.println("B");
		 if((examMark >= 50) && (examMark <= 59))
			System.out.println("C");
		 if((examMark >= 40) && (examMark <= 49))
			System.out.println("D");
		 if(examMark < 40)
			 System.out.println("F");

		kboard.close();	
	}
}


