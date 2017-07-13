package ConditionsPckg;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Additional_Exercise_while 

{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		System.out.print("Please enter customer number");
		int customer_number = kboard.nextInt();
		
	
		double Gdiscount=0.5; 
		double Gdiscount2=0; // Gdiscount2=Originalcost-(Originalcost*Gdiscount)
		double Sdiscount=0.25; 
		double Sdiscount2=0; // Sdiscount2=Originalcost-(Originalcost*Sdiscount)
		double Bdiscount=0.1;
		double Bdiscount2=0; // Bdiscount2=Originalcost-(Originalcost*Bdiscount)
		int priceperitem=10;
		double Originalcost=0; // Originalcost=items*priceperitem
		int items=0;
		String category;
		String dummy;
		
	
		 while (customer_number<100 || customer_number >999)
		{
			System.out.println("Invalid Number");
			System.out.print("Please enter customer number");
			customer_number = kboard.nextInt();
			dummy = kboard.nextLine();
			
		}	
			
		if(customer_number>100 || customer_number<999)
		{
			
			
			System.out.println("Please enter customer name");
			dummy = kboard.nextLine();
			String customername= kboard.nextLine();
			
			System.out.println("Please enter number of items");
			
			items = kboard.nextInt();
			dummy = kboard.nextLine();
			
			System.out.println("Please enter category Gold (G), Silver (S) or Bronze (B) ");
			
			category= kboard.nextLine();
			
			
			
			if(category.equalsIgnoreCase("g"))
			{
				System.out.println("Category is Gold");
				Originalcost=items*priceperitem;
				
				System.out.println("Original cost is "+df.format(Originalcost)+" ");
				Gdiscount2=Originalcost-(Originalcost*Gdiscount);
				
				System.out.println("Discount is  "+df.format(Gdiscount2)+" ");
				System.out.println("Actual cost for "+customername.toUpperCase()+" is "+df.format(Gdiscount2)+"");
			
				
			}	
			
				
			if(category.equalsIgnoreCase("s"))
			{
				System.out.println("Category is Silver");
				Originalcost=items*priceperitem;
				
				System.out.println("Original cost is "+df.format(Originalcost)+" ");
				Sdiscount2=Originalcost-(Originalcost*Sdiscount);
				
				System.out.println("Discount is  "+df.format(Sdiscount2)+" ");
				System.out.println("Actual cost for "+customername.toUpperCase()+" is "+df.format(Sdiscount2)+"");
			}
				
			
			if(category.equalsIgnoreCase("b"))
			{
					System.out.println("Category is Bronze");
					Originalcost=items*priceperitem;
					
					System.out.println("Original cost is "+df.format(Originalcost)+" ");
					Bdiscount2=Originalcost-(Originalcost*Bdiscount);
					
					System.out.println("Discount is  "+df.format(Bdiscount2)+" ");
					System.out.println("Actual cost for "+customername.toUpperCase()+" is "+df.format(Bdiscount2)+"");
			}
		
			
			
		}
		
		kboard.close();
}
}

