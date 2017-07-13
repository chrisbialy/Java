package Arrays;
import java.util.Scanner;
public class large_number {

	
	public static int getNumber(int nos) 
	{
	Scanner kboard = new Scanner(System.in);
	int x;
	System.out.println("Enter number "+nos); 
	x=kboard.nextInt();
	return(x);
	}
	//modified functions to use array
	public static int addnos1(int n[])
	{
	int add=0;
	for (int x=0;x<n.length;x++)
	{
	add = add + n[x];
	}
	return(add);
	}

	public static int multnos1(int n[])
	{
	int mult=1;
	for (int x=0;x<n.length;x++)
	{
	mult = mult*n[x];
	}
	return(mult);
	}

	public static void display1(int n[], int add, int mult)
	{
	for (int x=0;x<n.length;x++)
	{
	System.out.print(n[x]+"+"); 
	}
	System.out.println("="+add);
	for (int x=0;x<n.length;x++)
	{
	System.out.print(n[x]+"x"); 
	}
	System.out.println("="+mult);

	}


	public static void displayEndResult1(int n[])
	{
	int largest = Integer.MIN_VALUE;
	for (int x=0;x<n.length;x++)
	{
	if(n[x] > largest)
	{
	largest = n[x];

	}

	}
	System.out.println("Largest number in array is : " +largest);
	}
	public static String prompt()
	{
	Scanner kboard = new Scanner(System.in);
	String c1="";
	System.out.println("Do you want to enter two more numbers");
	c1=kboard.nextLine();
	return(c1);
	}
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);
	int nos[] = new int[5];
	int add, mult;
	String choice="";
	do
	{
	for(int x=0; x<nos.length;x++)
	{
	nos[x] = getNumber(x);
	}
	add = addnos1(nos);
	mult = multnos1(nos);
	display1(nos,add,mult);
	displayEndResult1(nos);

	choice=prompt();
	} while (choice.equalsIgnoreCase("y"));
	} 
	}


