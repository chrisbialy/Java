package Week5;
import java.util.Scanner;
public class Tut_3_1 
{
	public static void main(String[] args)
	{

		Scanner kboard = new Scanner(System.in);
		
		int mark;
		int largemark=100;
		int smallmark=50;
		int student=1;
		
		for(student=1; student<11; student++)
		
		{
			System.out.println("Student enter mark");
			mark=kboard.nextInt();
            //System.out.println("Student " + student+ "  mark is " +mark);
			
			
			if (mark>=smallmark && mark<=largemark)
	    	{
				largemark=mark;
				System.out.println("Student " + student+ "  mark is " +mark+ " YOU PASSED ");
	    	}
			
			if (mark<=smallmark)
	    	{
				smallmark=mark;
				System.out.println("Student " + student+ "  mark is " +mark+ " YOU FAILED ");
	    	}
			
			
			
		}
		
		System.out.println(+student+ " Students has Passed");
		
		
		
		
		kboard.close();
}
}