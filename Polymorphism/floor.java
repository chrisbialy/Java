package polymorphism;
import java.util.Scanner;


public class floor 
{
private int floornumber;
private final int nosrooms = 4;
room rooms[] = new room[nosrooms];
//private customer occupier;
//private boolean status;
//room rooms[] = new room[4];



/*
 ** DISPLAYING ROOMS 1,2,3,4.. WORKING
 */

/*
public floor(int nos)
{
	floornumber = nos;
	status = true; //free
	room r1 = new room(1);	// links room to the floor by aggregation 
	room r2  = new room(2);
	room r3 = new room(3);
	room r4 = new room(4);
	
	rooms[0] = r1; 
	rooms[1] = r2; 
	rooms[2] = r3; 	
	rooms[3] = r4;
	
	
}
*/



/*
 ** DISPLAYING ROOMS 101,202,303,404.. WORKING ..??
 */

public floor(int nos)
{
	floornumber = nos; 
	String gnos="";
	int inos=0;
	/* old way but not efficient
	gnos = Integer.toString(nos)+"01";
	inos = Integer.parseInt(gnos);
	room r1 = new room(inos);
	
	gnos = Integer.toString(nos)+"02";
	inos = Integer.parseInt(gnos);
	room r2  = new room(inos);
	
	gnos = Integer.toString(nos)+"03";
	inos = Integer.parseInt(gnos);
	room r3 = new room(inos);
	
	gnos = Integer.toString(nos)+"04";
	inos = Integer.parseInt(gnos);
	room r4 = new room(inos);
	
	rooms[0] = r1;
	rooms[1] = r2;
	rooms[2] = r3;
	rooms[3] = r4;
	*/
	int roomdigit=1;
	for (int x=0;x<nosrooms;x++)
		{
		gnos = Integer.toString(nos)+"0"+Integer.toString(roomdigit++);
		inos = Integer.parseInt(gnos);
			switch(x)
			{
			case 0: room r1 = new room(inos);rooms[0] = r1; break;
			case 1: room r2 = new room(inos);rooms[1] = r2; break;
			case 2: room r3 = new room(inos);rooms[2] = r3; break;
			case 3: room r4 = new room(inos);rooms[3] = r4; break;
			}
		}
}





public void displayFloor()
{
	System.out.println("Floor number: "+floornumber);
	for(int counter=0;counter<rooms.length;counter++)
		rooms[counter].display();
	
}


/*
 * Room Counter
 */

public int returnfreerooms()
{
	int freeroom=0;
	for (int counter=0; counter < rooms.length; counter++)
	{
		if (rooms[counter].returnStatus()==true)
			freeroom=freeroom+1;
	}
	return(freeroom);
}



/*public void calcNumGuest()
{


	for(int counter=0;counter<rooms.length;counter++)
		
		rooms[counter].calcGuest();
	
	System.out.println("The total occupier :"+guestNum);
}*/
	

public void displayAvaRooms()
{
	System.out.println("Floor number: "+floornumber);
	
	for(int counter=0;counter<rooms.length;counter++)
		rooms[counter].displayAvaRoom();
	
}

public void findaRoomtoBook()
{
	Scanner kboard = new Scanner(System.in);
	int nos; int counter=0; boolean found = false;
	System.out.println("FLOOR: "+floornumber);
	System.out.println("Please enter room number: ");
	nos = kboard.nextInt();
	for (counter=0; counter < rooms.length; counter++)
	{
		if (nos == rooms[counter].returnRoomNos())
		{
			found = true;
			rooms[counter].bookroom();
			break;
		}
	}
if (found == false) System.out.println("No such room number");
}

public void BookAllRooms(customer person)
{
	Scanner kboard = new Scanner(System.in);
	for (int x=0; x<rooms.length; x++)
			rooms[x].bookroom(person);
	//need to go through the array booking each room with the person
}



public void findaRoomtoCancel()
{
	Scanner kboard = new Scanner(System.in);
	int nos; int counter=0; boolean found = false;
	System.out.println("Please enter room number: ");
	nos = kboard.nextInt();
	for (counter=0; counter < rooms.length; counter++)
	{
		if (nos == rooms[counter].returnRoomNos())
		{
			found = true;
			rooms[counter].cancelRoom();
			break;
		}
	}
if (found == false) System.out.println("No such room number");
}

public int returnFloorNos()
{
	return(floornumber);
}

public void floormenu()
{
	int option =0;
	Scanner kboard = new Scanner(System.in);
	System.out.println("Floor number: "+floornumber);
	while (option != 4)
	{
		System.out.println("1. Display All Rooms, 2. Display Available Rooms, 3. Book Rooms, 4. Cancel Rooms,  5. Exit");
		option = kboard.nextInt();
		switch (option)
		{
		case 1: this.displayFloor();break;
		case 2: this.displayAvaRooms();break;
		case 3: this.findaRoomtoBook();break;
		case 4: this.findaRoomtoCancel();break;
		case 5: System.exit(0);
		}
	}
}
/*
 * ** BOOK A FLOOR FIRST OPTION - WORKING
 */

/*
public void bookfloor()
{
int counter1=0;
System.out.println("Floor "+floornumber);
for(int counter=0;counter<rooms.length;counter++)
{
	if(rooms[counter].returnStatus()==true)
		counter1++;
}

if (counter1 < 4)
	System.out.println("Cannot book floor");
else
{
	System.out.println("Can book floor");
	customer newperson = new customer();	//this line creates an instance of customer
	newperson.getname();					// then we get the details
	newperson.getemail();
	this.BookAllRooms(newperson);
	System.out.println("Floor booked");
	
}	
*/

/*
 * ** BOOK A FLOOR SECOND OPTION WITH DIFFERENT CUSTOMER TYPES
 */

public void bookfloor()
{
customer occupier=null;
int counter1=0;
System.out.println("Floor "+floornumber);
for(int counter=0;counter<rooms.length;counter++)
{
	if(rooms[counter].returnStatus()==true)
		counter1++;
}

if (counter1 < nosrooms)
	System.out.println("Cannot book floor");
else
{
	Scanner kboard = new Scanner(System.in);
	int choice=0;
	System.out.println("1. Ordinary customer, 2. Gold Customer or 3. Employee");
	choice = kboard.nextInt();
	switch (choice)
		{
		case 1: occupier = new OrdinaryCustomer(); break;
		case 2: occupier = new GoldCustomer(); break;
		case 3: occupier = new EmployeeCustomer(); break;
		default: System.out.println(" No such customer type"); break;
		}
	this.BookAllRooms(occupier);
	
}




/*
 * ** FIRST ATTEMPT TO BOOK A WHOLE FLOOR FOR ONE PERSON - NOT WORKING
 */

	
	
	/*
if (status==true)						// checks to see if room is free
	{
	customer newperson = new customer();	//this line creates an instance of customer
	newperson.getname();					// then we get the details
	newperson.getemail();
	status = false;							//makes sure nobody else can too the room
	occupier = newperson;					// attaches the new customers details to the room
	}
else
	System.out.println("Sorry floor booked");
*/
}



public void cancelfloor()
{
	//status = true;
	customer occupier = null;
	System.out.println("Floor cancelled");
}





}

