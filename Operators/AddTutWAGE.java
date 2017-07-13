package OperatorsPckg;
import java.util.Scanner;
public class AddTutWAGE 
{
	public static void main(String[] args)
	 {
		Scanner kboard = new Scanner(System.in);
		
		double hoursWorked=0;
		double RatePerHour=0;
		double OverTimeWorked=0;
		double base = 40;
		double TotalNormalHoursPay=0;
		double TotalOvertimePay=0;
		double ExtraOvertimePercent = 0.20;
		double GrossTotalPay=0;
		double TaxPayable=0;
		double Tax = 0.25;
		double NetTotalPay=0;
		
		
		/*GrossTotalPay = (hoursWorked+OverTimeWorked);
		TaxPayable = (Tax*GrossTotalPay);
		NetTotalPay = (GrossTotalPay - TaxPayable);*/
		
		 System.out.println("Please enter hours worked:");
		 hoursWorked = kboard.nextDouble();
		 
		 System.out.println("Please enter rate per hour:");
		 RatePerHour = kboard.nextDouble();
		 
		 
		TotalNormalHoursPay = (hoursWorked * RatePerHour);
		System.out.println("Total pay for normal hours worked "+TotalNormalHoursPay+"");
	
		 kboard.close();
		 
		 if(hoursWorked > 40) 
		{	
			OverTimeWorked = hoursWorked - base;
		 	TotalOvertimePay = OverTimeWorked*((RatePerHour*ExtraOvertimePercent)+RatePerHour);  
			System.out.println("Total pay for overtime worked "+TotalOvertimePay+"");
			GrossTotalPay = (TotalNormalHoursPay+TotalOvertimePay);
			System.out.println("Gross Total Pay "+GrossTotalPay+"");
			TaxPayable = (Tax*GrossTotalPay);
			System.out.println("Tax payable(25%) "+TaxPayable+"");
			NetTotalPay = (GrossTotalPay - TaxPayable);
			System.out.println("Net Total Pay "+NetTotalPay+""); 
			
		} 
		 
		 /*else*/ if(hoursWorked <= 40)
		 {
			 
			OverTimeWorked = 0;
			TotalOvertimePay = 0;
			System.out.println("Total pay for overtime worked "+TotalOvertimePay+"");
			GrossTotalPay = (TotalNormalHoursPay+TotalOvertimePay);
			System.out.println("Gross Total Pay "+GrossTotalPay+"");
			TaxPayable = (Tax*GrossTotalPay);
			System.out.println("Tax payable(25%) "+TaxPayable+"");
			NetTotalPay = (GrossTotalPay - TaxPayable);
			System.out.println("Net Total Pay "+NetTotalPay+""); 
				
		 }
	 }	
}
