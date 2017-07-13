package Week5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tut_0 
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		String name;
		String town;
		double salary;
		String dummy;
		
		for(int count=1; count<4; count++)
			
		{
		
	
		System.out.print("Please enter customer name");
		name = kboard.nextLine();
		System.out.println("Name: "+name);
		
		
		System.out.print("Please enter customer town");
		town = kboard.nextLine();
		System.out.println("Town: " +town);
		
		System.out.print("Please enter customer salary");
		salary = kboard.nextDouble();
		System.out.println("Salary: "+df.format(salary)+" ");
		dummy = kboard.nextLine();
		
		}
	
		kboard.close();
}
}


