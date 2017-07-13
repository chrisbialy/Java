package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_2_1 
{

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		
		

	        
	        System.out.println("Enter a year The World Cup Was Played ");
			int year = kboard.nextInt();
	        
	        String host;
	        switch (year) {
	            case 1934:  host = "Italy";
	            			break;
	            case 1938:  host = "France";
	                     	break;
	            case 1954:  host = "Switzerland";
	                     	break;
	            case 1958:  host = "Sweden";
	                     	break;
	            case 1966:  host = "England";
	                     	break;
	            case 1974:  host = "Germany";
	                     	break;
	            case 1982:  host = "Spain";
	                     	break;
	            case 1990:  host = "Italy";
	                     	break;
	            case 1998:  host = "France";
	                     	break;
	            case 2006:  host = "Germany";
	                        break;
	            case 2018:  host = "Russia";
	                        break;
	            
	            default: host = "Incorect year. Please enter again";
	                     break;
	                   
	        }
	        System.out.println(host);
	        
	        kboard.close();
	    }
	}

		
