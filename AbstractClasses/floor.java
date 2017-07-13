package abstractClasses;
import java.util.Scanner;


public class floor 
{
private int floornumber;
private final int nosrooms = 4;
room rooms[] = new room[nosrooms];

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
	System.out.println("Floor: "+floornumber);
	for(int counter=0;counter<rooms.length;counter++)
		rooms[counter].display();
}

public void findaRoomtoBook()
{
	Scanner kboard = new Scanner(System.in);
	int nos;
	int counter=0;
	boolean found = false;
	System.out.println("FLOOR"+floornumber);
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




public void findaRoomtoCancel()
{
	Scanner kboard = new Scanner(System.in);
	int nos;
	int counter=0;
	boolean found = false;
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

}
