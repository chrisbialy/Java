package Inheritance;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class stock
{
private long stockNumber;
private String stockDescription;
private int amountInStock;
private int newStock;
private int deduction;

public stock(long a, String b, int c)
{
	this.stockNumber = a;
	this.stockDescription = b;
	this.amountInStock = c;
}

public stock()
{
	
}


public int displayAmountInStock(int currentStock)
{
// this method should return the amount of stock
	
	System.out.println("Amount In Stock  : "+amountInStock);
	return amountInStock;
	
}

public void displayAllDetails()
{
// display all the stock details
	System.out.println("Stock Number  : "+stockNumber);
	System.out.println("Stock Description  : "+stockDescription);
	System.out.println("Amount In Stock  : "+amountInStock);
}

public int updateStockAmount()
{
	
	Scanner kboard = new Scanner(System.in);
	/* this operation will deduct the amount bought from the amount in stock. A validation check must be done to ensure that sufficient stock exists to de deducted. You may wish to add additional operations/methods.*/
	int count = 0;
	String input;
	int range;
		 input = JOptionPane.showInputDialog("Please enter number of stock to deduct:");
		    try {
		    		deduction = Integer.parseInt(input);
		    		if (amountInStock < deduction)
		    		{
		    			System.out.println("Sorry only "+amountInStock+" avaliable");
		    			newStock = amountInStock; //because you are returning newstock need to set value to currect stock
		    			deduction = 0; //ensuring that display is correct as you cannot fulfill order
		    		}
		    		else
		    		{
		    			newStock=amountInStock-deduction;
		    		}	
		    	
		    	} 
		    
		    catch(NumberFormatException e) 
		    {
		        	JOptionPane.showMessageDialog(null, "Sorry that input is not valid, please choose a quantity from 1-100");
		        	count++;
		        	// set the range outside the range so we go through the loop again.
		        	// deduction = kboard.nextInt();
		        	// range = -1;
		        
		    }
	
	return(newStock);

	//http://stackoverflow.com/questions/23277619/java-input-validation-for-number-range-and-numeric-values-only-with-counter
	
	
}

	public void DisplayStockUpdated()
	
		{

				
		//System.out.println("Database Updated for : "+stockDescription+" Current stock : " +newStock+", Deducted items : " +deduction);
		JOptionPane.showMessageDialog(null,"Database Updated for : "+stockDescription+" Current stock : " +newStock+", Deducted items : " +deduction);
		}


}
