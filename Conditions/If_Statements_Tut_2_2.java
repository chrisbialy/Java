package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_2_2 

{
	
		
		
		public static void main(String[] args)
		{
			java.util.ArrayList<String> month =
		            new java.util.ArrayList<String>();

			Scanner kboard = new Scanner(System.in);
			
			System.out.println("Enter number of days");
			int days = kboard.nextInt();
			
	        
	        
	        switch (days) 
	        {
            case 31:
            month.add("January");
            month.add("March");
            month.add("May");
            month.add("July");
            month.add("August");
            month.add("December");
            month.add("October");
                break;
            
            case 30:
                month.add("April");
                month.add("June");
                month.add("September");
                month.add("November");
                    break;
                    
            case 28:
            	month.add("February");
            			break;
            			
            case 29:
            	month.add("February");
            			break;
            
                    
	           default: month.add("Invalid month");
	                     break;
	        }
	        System.out.println(month);

		
			kboard.close();
	    }
	}

