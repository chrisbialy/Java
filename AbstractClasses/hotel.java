package abstractClasses;
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

public void hotelmenu()
{
	Scanner kboard = new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("1. Display all rooms, 2. Display a floor, 3. Book a room, 4. Cancel a room, 9. Exit");
		choice = kboard.nextInt();
		String dummy =kboard.nextLine();
		switch (choice)
		{
		case 1: this.display();break;
		case 2: 
				int floornos;
				System.out.println("Please enter a floor number 1-4");
				floornos = kboard.nextInt();
				this.display(floornos-1);
				break;
		case 3: this.bookARoom();
				break;
		case 4: this.CancelARoom();
				break;
		case 9: System.out.println("Exit"); break;
		default: System.out.println("incorrect option"); break;
		}
	} while (choice != 9);
}

public void display()
	{
	System.out.println("Hotel Name: "+hotelname+" Hotel Number: "+hotelnumber);
	for (int counter=0;counter <floors.length; counter++)
		{
		floors[counter].displayFloor();
		}
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
	floors[floorchoice-1].findaRoomtoBook(); // *******why we can use this function here ?? But we can not use getName, calcCost, getEmail...******
}





public void CancelARoom()
{
	Scanner kboard = new Scanner(System.in);
	int floorchoice;
	System.out.println("Which floor are you staying stay on?");
	floorchoice = kboard.nextInt();
	floors[floorchoice-1].findaRoomtoCancel();
}

}// end of class
