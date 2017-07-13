package Inheritance;
import java.util.Scanner;
public class person {
	
	
	protected String personsName;
	protected String personsAddress;
	protected int personsAge;
	private int newAge;
	
	public person()
	  {
		
	  }
	
	
	public person(String gName, String gAddress,int gAge)
	  {
		this.personsName = gName;
		this.personsAddress = gAddress;
		this.personsAge = gAge;
	  }
	
	
	public void getPersonName() 
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter Name: ");	
	personsName = kboard.nextLine();
	}
	
	
	public void getPersonAddress()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter Address: ");	
	personsAddress = kboard.nextLine();
	}
	
	public void getPersonAge()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter Age: ");	
	personsAge = kboard.nextInt();
	}
	
	public int returnAge()
	
	{
		
		return(personsAge);
	}
	
	
public int changeAge(int cAge)
	
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter new Age: ");	
	newAge = kboard.nextInt();
		return(newAge);
	}
	
	
	public void displayDetails()
	  {
		System.out.println("Name  : "+personsName);
		System.out.println("Email : "+personsAddress);
		System.out.println("Age   : "+personsAge);
	
	  }
	
	
	public void displayNewAge()
	  {
		
		System.out.println("New Age : "+this.changeAge(newAge));
	  }
	
	public void displayDetailsNewAge()
	  {
		System.out.println("Name  : "+personsName);
		System.out.println("Email : "+personsAddress);
		System.out.println("Age   : "+newAge);
		
		
	  }
	
	
	
}

