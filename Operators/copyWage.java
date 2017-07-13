package OperatorsPckg;
import java.util.Scanner;
import java.text.*;
public class copyWage 
{
	public static void main(String[] args)
	 {
		Scanner kboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		

		double hoursWorked =0;
		System.out.println("Please enter hours worked:");
		hoursWorked = kboard.nextDouble();
				
		 
		System.out.println("Please enter rate per hour:");
		double RatePerHour = kboard.nextDouble();
		
		double TotalNormalHoursPay;
		TotalNormalHoursPay = hoursWorked*RatePerHour;
		System.out.println("Total pay for normal hours worked "+(TotalNormalHoursPay)+"");
		
		
		kboard.close();
		 
		 
	 }
}
