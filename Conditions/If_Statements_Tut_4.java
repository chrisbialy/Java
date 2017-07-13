package ConditionsPckg;
import java.util.Scanner;
public class If_Statements_Tut_4 
{
public static void main(String[] args)
{
	Scanner kboard = new Scanner(System.in);
	
	int constant = 100;
	int step=10;
	int qty;
	String item;
	double total;
	double discount=2.5;
	double cost;
	double redSPrice=5;
	double yellowSPrice=10;
	double greenSPrice=15;
	

	System.out.println("Scotia Supplies operates a discount system to customers who purchase over 100 pounds of goods.");
	System.out.println("\nFor every 10 pounds over 100 pounds they will receive a 2.50 pounds discount for every 10 pounds.");
	System.out.println("\nThe stock currently available online is:");
	System.out.println("\nRed socks 5 pounds per pair"
			+ "\nYellow socks 10 pounds per pair"
			+ "\nGreen socks 15 pounds per pair");
	System.out.println("\nEnter yes if you would like to oder now");
	String answer = kboard.nextLine();
	
	while (!answer.equalsIgnoreCase("yes"))
	 {
		System.out.println("Invald data entered ! Try again");
		System.out.println("\nEnter yes if you would like to oder now");
		answer = kboard.nextLine();
	 }
		
	 
	 if(answer.equalsIgnoreCase("yes"))
	 {
	  System.out.println("\nEnter name of an item"); 
	  item = kboard.nextLine();
	 
	  
	  while (!item.equalsIgnoreCase("Red socks")&&!item.equalsIgnoreCase("Green socks")&&!item.equalsIgnoreCase("Yellow socks"))
		 {
			System.out.println("Invald data entered !");
			System.out.println("\nEnter name of an item For example 'red socks'");
			item = kboard.nextLine();
		 }
			
	 System.out.println("Enter quantity"); 
	  qty = kboard.nextInt();
	  
	 
	  if(item.equalsIgnoreCase("Red socks"))
	  {
		  System.out.println("Price per item "+redSPrice+"");
		  cost =(qty*redSPrice);
		  System.out.println("Cost "+cost+"");
		  
		  if(cost>=110)
		  {
			  
			  discount =((cost-constant)/step)*discount;
			  System.out.println("Discount "+discount+"");
			  total=cost-discount;
			  System.out.println("Total price for "+qty+" pair of red socks is "+total+" pounds");
			  
		  }  
		}
	  	
	  
	  /*----------------------------------------GREEN SOCKS-------------------------------*/
	  
			  
		if(item.equalsIgnoreCase("Green socks"))
		{
		System.out.println("Price per item "+greenSPrice+"");	
		cost =(qty*greenSPrice);
		System.out.println("Cost "+cost+"");
					  
			if(cost>=110)
			{
			discount =((cost-constant)/step)*discount;
			System.out.println("Discount "+discount+"");
			total=cost-discount;
			System.out.println("Total price for "+qty+" pair of green socks is "+total+" pounds");
		    }  
		 }
		
		
		 /*----------------------------------------YELLOW SOCKS-------------------------------*/
			
		if(item.equalsIgnoreCase("Yellow socks"))
		{
		System.out.println("Price per item "+yellowSPrice+"");		
		cost =(qty*yellowSPrice);
		System.out.println("Cost "+cost+"");
					  
			if(cost>=110)
			{
			discount =((cost-constant)/step)*discount;
			System.out.println("Discount "+discount+"");
			total=cost-discount;
			System.out.println("Total price for "+qty+" pair of green socks is "+total+" pounds");
		    }  
		 }
		
	 }
		

		else
		  {
			  System.out.println("\nEnter name of an item For example 'red socks'");
		  }
		  
	
 
	kboard.close();
}
}

