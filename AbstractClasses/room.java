package abstractClasses;
import java.util.Scanner;


public class room 
{
		private int roomNos;
		private customer occupier;
		private boolean status;
		private final double roomcost=100.00;

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
			{
				occupier.display();
				occupier.calcCost(roomcost);
			}
		}
		
		public void bookroom()
		{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Room "+roomNos);
		if (status==true)
			{
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
			status = false;
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
}

