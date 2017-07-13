package ConditionsPckg;
import java.util.Scanner;
public class Tutorial0b 
{
public static void main(String[] args)
	
	{
	
		 Scanner kboard = new Scanner(System.in);
		
		 System.out.println("Please enter exam1  mark");
	     int examMark1 = kboard.nextInt();
	     
	     
	     String dummy = kboard.nextLine();
	     
	     System.out.println("Please enter exam2  mark");
	     int examMark2 = kboard.nextInt();
	     int examMark=(examMark1+examMark2)/2;
	     
	   
		 	        
		if(examMark <= 50)
			{
			System.out.println("You have failed "+examMark+" percent achived");
			}
			
		else
			{
			System.out.println("You have passed "+examMark+" percent achived");
			}
		
		
		/*System.out.println(examMark);*/
		if(examMark >= 70) 
		{
			System.out.println("Grade = A");
			System.out.println("In first exam you have achived "+examMark1+" percent");
			System.out.println("In second exam you have achived "+examMark2+" percent");
		}	
			if((examMark >= 60) && (examMark <= 69)) /* Dispalys the % (percentage) Results  because of   int examMark = (examMark1+examMark2)/2;*/
		{	
			System.out.println("Grade = B");
		 	System.out.println("In first exam you have achived "+examMark1+" percent");
			System.out.println("In second exam you have achived "+examMark2+" percent");
		}
		 if((examMark >= 50) && (examMark <= 59))
		 { 
			System.out.println("Grade = C");
		 	System.out.println("In first exam you have achived "+examMark1+" percent");
			System.out.println("In second exam you have achived "+examMark2+" percent");
		 }
		 if((examMark >= 40) && (examMark <= 49))
		 {
			System.out.println("Grade = D");
		 	System.out.println("In first exam you have achived "+examMark1+" percent");
			System.out.println("In second exam you have achived "+examMark2+" percent");
		 }
		 if(examMark < 40)
		 {
			System.out.println("Grade = F");
		 	System.out.println("In first exam you have achived "+examMark1+" percent");
			System.out.println("In second exam you have achived "+examMark2+" percent");
		 }
		kboard.close();	
	}
}


