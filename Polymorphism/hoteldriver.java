package polymorphism;
public class hoteldriver 
{
	public static void main(String[] args)
	{
		
		

		/*	double cost =100;
			customer occupiers[] = new customer[10];
			occupiers[0] = new OrdinaryCustomer();
			occupiers[1] = new GoldCustomer();

			occupiers[0].display();
			occupiers[0].calcCost(cost);
			
			occupiers[1].display();
			occupiers[1].calcCost(cost);*/
			
		

		
		
		
		
		
		
		//customer c1 = new customer("mary singleton","m.g@gmail.com");
		//customer c2 = new customer();
		
		 room r1 = new room(1);
		 room r2 = new room(2);
		 room r3 = new room(3);
		 room r4 = new room(4);
		 
		 floor f1 = new floor(1);
		 floor f2 = new floor(2);
		 
		 f1.returnfreerooms();
		
		/*r1.display();
		
		r1.display();
		r1.cancelRoom();*/
		
		 

		
	
		//r1.bookroom();
		//f1.displayFloor();
		//f2.displayFloor();
		//f1.findaRoomtoBook();
		//f1.displayFloor();
		//f1.findaRoomtoBook(); // to make sure you can't double book 
		/*f1.displayFloor();
		f1.findaRoomtoCancel();
		f1.displayFloor();
		*/
		 //f1.calcNumGuest();
		 //f1.floormenu();
		//f2.floormenu();
	
		hotel h1 = new hotel(101,"The Grand");
		
		h1.hotelmenu();
		//h1.display();
		//h1.bookARoom();
		//h1.DisplayNumberOfFreeRooms();
		//h1.CancelARoom();
		//h1.display();
		//h1.displaySpecFloor();
		
	}
}




