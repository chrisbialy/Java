package OperatorsPckg;
import java.util.Scanner;
public class ConditionalDemo1 
{
	 public static void main(String[] args)
	 {
		 
	 final int exam = 100; 
	/* int examMark = 50;*/
	 Scanner kboard = new Scanner(System.in);
	 System.out.println("Please enter exam1  mark");
     int examMark1 = kboard.nextInt();
     
     String dummy = kboard.nextLine();
     
     System.out.println("Please enter exam2  mark");
     int examMark2 = kboard.nextInt();
     kboard.close();
	 	        
	 	        if((examMark1+examMark2) <= 100)
	 	           System.out.println("You have failed");
	 	 
	 if((examMark1+examMark2) >= 100)
	 	           System.out.println("You have passed");
	 	    }
}


/*Tutorial 5a
1.	Modify the code shown above to allow the user to enter an exam mark.
Tutorial 5b
1.	Modify tutorial 5a to allow the user to enter two exam marks. Each exam in marked out of 100. You will need to modify the code – if the combined total of both exams is 100 or above they have passed.
*/


