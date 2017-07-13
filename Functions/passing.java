package Functions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class passing 
{

	public static void main(String[] args)
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
		
		
		kboard.close();
	} //end of main
} //end of class


