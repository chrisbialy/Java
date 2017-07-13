package Inheritance;
import java.util.Scanner;
public class original_stock
{
private long stockNumber;
private String stockDescription;
private int amountInStock;
private int newStock;
private int deduction;

public original_stock(long a, String b, int c)
{
	this.stockNumber = a;
	this.stockDescription = b;
	this.amountInStock = c;
}

public original_stock()
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

public void updateStockAmount()
{
	
	Scanner kboard = new Scanner(System.in);
	/* this operation will deduct the amount bought from the amount in stock. A validation check must be done to ensure that sufficient stock exists to de deducted. You may wish to add additional operations/methods.*/

	System.out.print("Please enter number of stock to deduct: ");
	deduction = kboard.nextInt();
	newStock=amountInStock-deduction;
	
	
	
}

public void DisplayStockUpdated()
{

	System.out.println("Database Updated for : "+stockDescription+" Current stock : " +newStock+", Deducted items : " +deduction);
	
}



}
