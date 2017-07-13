package polymorphism;
import java.util.Scanner;


public class hotel 
{

private int hotelnumber;
private String hotelname;
private floor floors[] = new floor[4];

public hotel(int nos, String name)
	{
	hotelnumber = nos;
	hotelname = name;
	floor f1 = new floor(1);
	floor f2 = new floor(2);
	floor f3 = new floor(3);
	floor f4 = new floor(4);
	floors[0] = f1;
	floors[1] = f2;
	floors[2] = f3;
	floors[3] = f4;
	
	}



public void display()
	{
	System.out.println("Hotel Name: "+hotelname);
	for (int counter=0;counter <floors.length; counter++)
		{
		floors[counter].displayFloor();
		}
	}

public void avaRooms()
	{
	System.out.println("Hotel Name: "+hotelname);
	for (int counter=0;counter <floors.length; counter++)
		{
		floors[counter].displayAvaRooms();
		}
	}

/*
 * ** BOOK A FLOOR
 */


public void bookAFloor()
{
	Scanner kboard = new Scanner(System.in);
	int floorchoice;
	System.out.println("Which floor would you like to stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].bookfloor();
}

public void findaFoolrtoBook()
{
	Scanner kboard = new Scanner(System.in);
	int nos; int counter=0; boolean found = false;
	System.out.println("Please enter floor number: ");
	nos = kboard.nextInt();
	for (counter=0; counter < floors.length; counter++)
	{
		if (nos == floors[counter].returnFloorNos())
		{
			found = true;
			floors[counter].bookfloor();
			break;
		}
	}
if (found == false) System.out.println("No such floor number");
}



public void display(int floornos)
{
	System.out.println("Hotel Name: "+hotelname);
	floors[floornos].displayFloor();
}

public void bookARoom()
{
	Scanner kboard = new Scanner(System.in);
	int floorchoice;
	System.out.println("Which floor would you like to stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].findaRoomtoBook();
}


public void bookARoomForTwo()
{
	Scanner kboard = new Scanner(System.in);
	int floorchoice;
	System.out.println("Book a room for two people");
	System.out.println("Person 1 details");
	System.out.println("Which floor would you like to stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].findaRoomtoBook();
	System.out.println("Person 2 details");
	System.out.println("Which floor would you like to stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].findaRoomtoBook();
}





public void CancelARoom()
{
	Scanner kboard = new Scanner(System.in);
	int floorchoice;
	System.out.println("Which floor are you staying stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].findaRoomtoCancel();
}

public void displaySpecFloor()
{
	Scanner kboard = new Scanner(System.in);
	int nos; int counter=0; boolean found = false;
	System.out.println("Please enter floor number: ");
	nos = kboard.nextInt();
	for (counter=0; counter < floors.length; counter++)
	{
		if (nos == floors[counter].returnFloorNos())
		{
			found = true;
			floors[counter].displayFloor();
			break;
		}
	}
if (found == false) System.out.println("No such floor number");
}


/*
 *Room Counter 
 */


public void DisplayNumberOfFreeRooms()
{
	for (int counter=0;counter <floors.length; counter++)
	{
		System.out.println("Floor "+counter+" has "+floors[counter].returnfreerooms()+" free rooms");
	}
}


public void hotelmenu()
{
	int option =0;
	Scanner kboard = new Scanner(System.in);
	System.out.println("Hotel number: "+hotelnumber+" Hotel Name: "+hotelname);
	while (option != 8)
	{
		System.out.println("1. Display All Rooms, 2. Display Available Rooms, 3. Book Rooms, 4. Cancel Rooms, 5. Book a floor, 6. Display Number of Free Rooms, 7. Display Secific Floor, 8. Room For Two  9. Exit");
		option = kboard.nextInt();
		switch (option)
		{
		case 1: this.display();break; 			// how it knows to display ALL the rooms in the hotel ??
		case 2: this.avaRooms();break;			// how it knows to display ALL the rooms in the hotel ??
		case 3: this.bookARoom();break;
		case 4: this.CancelARoom();break;
		case 5: this.findaFoolrtoBook();break;
		case 6: this.DisplayNumberOfFreeRooms();break;
		case 7: this.displaySpecFloor();break;
		case 8: this.bookARoomForTwo();break;
		case 9: System.exit(0); break;
		}
	}
}





}
