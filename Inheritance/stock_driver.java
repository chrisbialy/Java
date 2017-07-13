package Inheritance;
import java.util.Scanner;
public class stock_driver {
	
	
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		
		stock s1= new stock(100,"Red Socks",100);
		stock s2= new stock(101,"Blue Socks",90);
		stock s3= new stock(102,"Green Socks",50);
		
		
		//s1.displayAmountInStock();
		//s2.displayAmountInStock();
		//s3.displayAmountInStock();
		
		s1.displayAllDetails();
		s1.updateStockAmount();
		s1.DisplayStockUpdated();
		//s2.displayAllDetails();
		//s2.updateStockAmount();
		//s2.DisplayStockUpdated();
		 
	}
}
