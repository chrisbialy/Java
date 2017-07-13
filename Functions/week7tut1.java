package Functions;
import java.util.Scanner;
import java.text.*;
import java.text.DecimalFormat;
public class week7tut1
{
	
	
	static Scanner kboard = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.00");


	public static int get_type()
	{
		int type=0;
		System.out.println("Please enter 1. Red Socks, 2. Yellow Socks, 3. Green socks");
		type = kboard.nextInt();
		return(type);
	}


	public static int get_qty()
	{
		int qty=0;
		System.out.println("Please enter quantity");
		qty = kboard.nextInt();
		return(qty);
	}


	public static double calculate_cost(int type, int qty)
	{

		final double redsock = 5.00;
		final double yellowsock = 10.00;
		final double greensock = 10.00;
		double cost=0;
		double discount=0;
		
		switch (type)
		{
		case 1:
			if ((qty*redsock)>=100)
			{
				discount = (((qty*redsock)-100)/10)*2.50;
				System.out.println("Discount is "+df.format(discount));
				cost = (qty*redsock)-discount;
			}
			else
				cost = qty*redsock; 
			break;
		case 2: 
			if ((qty*yellowsock)>=100)
			{
				discount = (((qty*yellowsock)-100)/10)*2.50;
				System.out.println("Discount is "+df.format(discount));
				cost = (qty*yellowsock)-discount;
			}
			else
				cost = qty*yellowsock; 
			break;
		case 3:
			if ((qty*greensock)>=100)
			{
				discount = (((qty*greensock)-100)/10)*2.50;
				System.out.println("Discount is "+df.format(discount));
				cost = (qty*greensock)-discount;
			}
			else
				cost = qty*greensock; 
			break;
		}

		return(cost);
	}




	public static void display_calc(double cost) 
	{

		System.out.println("Cost of order was "+df.format(cost));
		String dummy = kboard.nextLine();

	}




	public static void main(String[] args)
	{
		String another="";
		int type;
		int qty;
		double cost = 0;
		double discount = 0;
	
		do 
		{
			
		type = get_type();	
		qty = get_qty();
		cost = calculate_cost(type, qty);
		display_calc(cost);
		System.out.println("Do you want to calculate the cost of another order (y/n)");
		another = kboard.nextLine();
		}
		while (another.equalsIgnoreCase("y"));
		System.out.println("Bye");
	}
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	/*public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");



		final double redsock = 5.00;
		final double yellowsock = 10.00;
		final double greensock = 10.00;
		int type = 0; int qty = 0; double cost=0.0; double discount=0.0;
		String another="";
		do {
			System.out.println("Please enter 1. Red Socks, 2. Yellow Socks, 3. Green socks");
			type = kboard.nextInt();
			System.out.println("Please enter quantity");
			qty = kboard.nextInt();
			switch (type)
			{
			case 1:
				if ((qty*redsock)>=100)
				{
					discount = (((qty*redsock)-100)/10)*2.50;
					System.out.println("Discount is "+df.format(discount));
					cost = (qty*redsock)-discount;
				}
				else
					cost = qty*redsock; 
				break;
			case 2: 
				if ((qty*yellowsock)>=100)
				{
					discount = (((qty*yellowsock)-100)/10)*2.50;
					System.out.println("Discount is "+df.format(discount));
					cost = (qty*yellowsock)-discount;
				}
				else
					cost = qty*yellowsock; 
				break;
			case 3:
				if ((qty*greensock)>=100)
				{
					discount = (((qty*greensock)-100)/10)*2.50;
					System.out.println("Discount is "+df.format(discount));
					cost = (qty*greensock)-discount;
				}
				else
					cost = qty*greensock; 
				break;
			}
			System.out.println("Cost of order was "+df.format(cost));
			String dummy = kboard.nextLine(); //strips ENTER 
			System.out.println("Do you want to calculate the cost of another order (y/n)");
			another = kboard.nextLine();
		} while (another.equalsIgnoreCase("y"));
	} //end of main
} //end of class

*/