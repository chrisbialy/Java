package OperatorsPckg;
import java.util.Scanner;
public class Rectangle 
{
	public static void main(String[] args)
	 {
		Scanner kboard = new Scanner(System.in);
		
		double width = 0.0;
		double height = 0.0;
		double area = 0.0; /*calculation formula*/
		
		
		System.out.println("Please enter width");
		width = kboard.nextDouble();
		
		System.out.println("Please enter height");
		height = kboard.nextDouble();
		area =  (width * height);
		kboard.close();
		System.out.println("The area of the rectangle is "+area+" square metres");

		if(width - height == 0)
	           System.out.println("YOUR RECTANGLE IS A SQUARE !");
	 }
}
