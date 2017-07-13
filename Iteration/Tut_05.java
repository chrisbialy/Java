package Week5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Tut_05
{
	public static void main(String[] args)
	{

		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		int number = 1;
		String name;
		String town;
		double salary=0;
		double totalsalary=0;
		String dummy;
		String ready;
		
		
	
		System.out.print("Do you want to enter data?");
		ready = kboard.nextLine();

		while (ready.equalsIgnoreCase("y")) //number<=3 && ask just for 3 users
		{
			
			 
			System.out.print("Please enter customer "+number+"'s name ");
			name = kboard.nextLine();
			
			
			System.out.print("Please enter customer "+number+"'s town ");
			town = kboard.nextLine();
			
			System.out.print("Please enter customer "+number+"'s salary ");
			salary = kboard.nextDouble();
			totalsalary = totalsalary + salary;
			dummy = kboard.nextLine();
			
			number = number + 1;// is needed to jump out of the loop, number <= 3	
			
		System.out.println("Name: "+name);
		System.out.println("Town: " +town);
		System.out.println("Salary: "+df.format(salary)+" ");
		
		System.out.print("Do you want to enter another record?");
		ready = kboard.nextLine();
			
		}
		
		
		System.out.println(" Total Salary: "+df.format(totalsalary)+" ");
		
		
		//while (ready.equalsIgnoreCase("n"))
		//{
		//System.out.println("are you ready?");
		//ready = kboard.nextLine();
		//}
		kboard.close();
	
}
}

