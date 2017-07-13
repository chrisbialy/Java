package classes;
import java.util.Scanner;
public class person {
	
	private String forename;
	private String surname;
	private String email;
	private String mobile;
	private int age;

	public person()
	  {
		
		
		//forename = "Gill";
		//surname = "Blue";
		//email = "g.b@gmail.com";
		//mobile = "0798783022";
		//age = 22; 

		/*this.getForename();
		this.getSurname();
		this.getEmail();
		this.getMobile();
		this.getAge();*/
		
	  }

	public person(String forename, String surname)
	  {
		this.forename = forename;
		this.surname = surname;
	  }
	
	public person(String forename, String surname,int age)
	  {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	  }
	
	public void displayDetails()
	  {
		System.out.println("Name  : "+forename+" "+surname);
		System.out.println("Email : "+email);
		System.out.println("Mobile: "+mobile);
		System.out.println("Age   : "+age);
	  }
	
	public void getForename()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter forename: ");	
	forename = kboard.nextLine();
	}
	
	public void getSurname()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter surname: ");	
	surname = kboard.nextLine();
	}
	
	public void getEmail()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter email address: ");	
	email = kboard.nextLine();
	}
	
	public void getMobile()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter mobile number: ");	
	mobile = kboard.nextLine();
	}
	
	public void getAge()
	{
	Scanner kboard = new Scanner(System.in);	
	System.out.print("Please enter age: ");	
	age = kboard.nextInt();
	while (checkAge(age)!=true)
		{
		System.out.println("Sorry you must be over 18");
		System.out.print("Please enter age: ");	
		age = kboard.nextInt();
		}
	}
	
	private boolean checkAge(int age)
	{
		boolean ok=true;
		if (age<18)
			ok = false;
		else
			ok = true;
		return(ok);
	}	
} //end of class

