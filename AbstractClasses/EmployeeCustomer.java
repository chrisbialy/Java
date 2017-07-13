package abstractClasses;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeCustomer extends customer
{
		private final double discount=1; 
		private int employeenos;
		
		public EmployeeCustomer()
		{
			customername = this.getName();
			customerEmail = "";
			employeenos = getNumber();
		}

		public void display()
		{
		System.out.println("employee name ="+customername+" employee number= "+employeenos);	
		}
		
public String getName()
		{
		Scanner kboard = new Scanner(System.in);
		String name;
		System.out.println("Please enter the name of the employee");
		name = kboard.nextLine();
		return (name);
		}
		
		


public String getEmail()
		{
			Scanner kboard = new Scanner(System.in);
			String email;
			System.out.println("Please enter "+customername+"'s email address");
			email = kboard.nextLine();
			return (email);	
		}
		
		public int getNumber()
		{
			Scanner kboard = new Scanner(System.in);
			int nos;
			System.out.println("Please enter "+customername+"'s employee number");
			nos = kboard.nextInt();
			return (nos);	
		}
		
		public void calcCost(double cost)
		{
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("The cost of the room is "+(df.format(cost-(cost*discount))));
		}
		
}
