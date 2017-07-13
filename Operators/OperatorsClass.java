package OperatorsPckg;
import java.util.Scanner;
public class OperatorsClass 
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
        
        
        System.out.println("Please enter title ?");
        String title = kboard.nextLine();
        
        System.out.println("Please enter forename ?");
        String forename = kboard.nextLine();
        
        System.out.println("Please enter surname ?");
        String surname = kboard.nextLine();
        
        System.out.println("Please enter number ?");
        int number = kboard.nextInt();
        
        String dummy = kboard.nextLine();
        
        System.out.println("Please enter street ?");
        String street = kboard.nextLine();
        
        System.out.println("Please enter town ?");
        String town = kboard.nextLine();
       
        
        System.out.println("Please enter postcode ?");
        String postcode = kboard.nextLine();
        
        String firstLine = title+" "+forename+" "+surname;
        String secondLine = number+" "+street;
        String thirdLine = town;
        String fourthLine = postcode;
        
        System.out.println("Your postal Address is:");
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
        kboard.close();
    }
}

	  /*	Your postal Address is:
			Mrs Susan Smith
			12 Queen Street
			Perth
			PH1 2NX
			
			public class ConcatDemo 
{
	public static void main(String[] args)
	{
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
    }
}

}
*/
