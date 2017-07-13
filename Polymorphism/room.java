package polymorphism;
import java.util.Scanner;


public class room 
{
private int roomNos;
private customer occupier;
private boolean status;
private int roomPrice=100;

public room(int rnos)
{
	roomNos = rnos;
	status = true; //free
}


public void display()
{
	System.out.println("Room number: "+roomNos);
	if (status==true)
		System.out.println("Room is free");
	else
		occupier.display();
}

public void displayAvaRoom()
{

	if (status==true)
		System.out.println("Room number "+roomNos+" is available"  );
	
}

/*public void calcGuest()
{

	if (status==true)
	{
		occupier.();
	}	

	
}*/


public void bookroom(customer newperson)
{
if (status==true)
	{
	status = false;
	occupier = newperson;
	}
else
	System.out.println("Sorry room booked");
}

/*
 ** BOOK A ROOM - FIRST OPTION -  NO CUSTOMER TYPES - WORKING
 */

/*public void bookroom()
{
System.out.println("Room "+roomNos);
if (status==true)						// checks to see if room is free
	{
	customer newperson = new customer();	//this line creates an instance of customer
	newperson.getname();					// then we get the details
	newperson.getemail();
	status = false;							//makes sure nobody else can too the room
	occupier = newperson;					// attaches the new customers details to the room
	}
else
	System.out.println("Sorry room booked");
}*/

/*
 ** BOOK A ROOM - SECOND OPTION -  THREE CUSTOMER TYPES - WORKING... ??
 */

public void bookroom()
{
Scanner kboard = new Scanner(System.in);
System.out.println("Room "+roomNos);
if (status==true)												// checks to see if room is free
{
int choice=0;
System.out.println("1. Ordinary customer, 2. Gold Customer or 3. Employee");
choice = kboard.nextInt();

	if (choice==1)
		
	{
	
		OrdinaryCustomer newperson = new OrdinaryCustomer();	//this line creates an instance of customer
		status = false;											//makes sure nobody else can too the room
		occupier = newperson;
		newperson.calcCost(roomPrice);
		
	}
	
	
	if (choice==2)
	{
		GoldCustomer newperson = new GoldCustomer();			//this line creates an instance of customer
		status = false;											//makes sure nobody else can too the room
		occupier = newperson;
		newperson.calcCost(roomPrice);
	}
	
	if (choice==3)
	{
		EmployeeCustomer newperson = new EmployeeCustomer();	//this line creates an instance of customer
		status = false;											//makes sure nobody else can too the room
		occupier = newperson;
		newperson.calcCost(roomPrice);
		
		
	}
	
	if  ((choice>3) || (choice<=0))
	{
	
		System.out.println(" No such customer type");
		
	}

}

else
	System.out.println("Sorry room booked");
}




public void cancelRoom()
{
	status = true;
	occupier = null;
	System.out.println("Room cancelled");
}

public int returnRoomNos()
{
	return(roomNos);
}

/*
 * Room Counter
 */



public boolean returnStatus()
{
	return(status);
}



}
