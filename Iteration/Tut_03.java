package Week5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tut_03 
{

	public static void main(String[] args)
	{

		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		int number = 1;
		String name;
		String town;
		double salary;
		String dummy;
		
		
		while (number<=3)
		{
			
			System.out.print("Please enter customer "+number+"'s name ");
			name = kboard.nextLine();
			
			
			System.out.print("Please enter customer "+number+"'s town ");
			town = kboard.nextLine();
			
			System.out.print("Please enter customer "+number+"'s salary ");
			salary = kboard.nextDouble();
			dummy = kboard.nextLine();
			number = number + 1;// is needed to jump out of the loop, number <= 3	
			
		System.out.println("Name: "+name);
		System.out.println("Town: " +town);
		System.out.println("Salary: "+df.format(salary)+" ");
			
		}
		
		kboard.close();
	
}
}
