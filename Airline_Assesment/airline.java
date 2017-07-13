import java.util.Scanner;

public class airline {
	
	
	private int airnos;
	private String airname;
	private String flightnos;
	private flight flights[] = new flight[3]; // number of flights
	
	public airline(int nos, String name) // example: (747,"BRITISH AIRWAYS") in AirlineDriver class
	{
		airnos = nos;
		airname = name;
		
		flight f1 = new flight("LX888","Delhi","Bejing");  // need to type "LX888","Delhi","Bejing" because of constructor in flight class: public flight(String, String ,String)
		flight f2 = new flight("MK225","Los Angeles","Warsaw"); 
		flight f3 = new flight("PK277","Larnaka","Seoul");
		
		flights[0] = f1;
		flights[1] = f2;
		flights[2] = f3;	
	}
	
	public void airnmenu()
	{
		int option =0;
		int choice=0;
		
		Scanner kboard = new Scanner(System.in);
		for (int k=0; k< flights.length;k++)  // retrieveing seats from DB , using ONLY flights[k].retrieveFromFile(); and k=0 or k=1 displays only one record from different flight, never two records
			flights[k].retrieveFromFile(airnos);
		
		do
		{
		System.out.println("\nAIRLINE MENU");
		System.out.println("\n1. Display Airline \n2. Choose Flight \n3. Number of available seats \n9. Exit & Save");
		option = kboard.nextInt();
		switch (option)
		{
		case 1: this.displayAirline();
				break;
				/*for (int x=0; x< flights.length;x++)
				flights[x].displayFlight();*/
		case 2:	System.out.println("\nSELECT FLIGHT");
				System.out.println("\n0 --> Flight: LX888 Delhi-Bejing, \n1 --> Flight: MK225 Los Angeles-Warsaw, \n2 --> Flight: PK277 Larnaka-Seoul");
				choice = kboard.nextInt();
				flights[choice].flightMenu();
				break;
		case 3:	this.AvaSeats();
				break;
		case 9: for (int z=0; z< flights.length;z++) // for loop which would call savetofile for each flight - remembering the key of the airline	
				flights[z].saveToFile(airnos);
				break;
		}
		}
		while (option != 9);
		
		
	}

	public void AvaSeats() {
		
		//for (int k=0; k< flights.length;k++)  // USED FOR TESTING THIS AvaSeats() ON ITS OWN
		//flights[k].retrieveFromFile(airnos);  // USED FOR TESTING THIS AvaSeats() ON ITS OWN
		
		
		System.out.println("\nNUMBER OF AVAILABLE SEATS");
		System.out.println("\nAIRLINE: "+airnos+" "+airname+" ");
		for (int i=0; i<=2; i++)
		{
		/*Checks if plane is full and displays "Plane Full" message*/ // no reservations or booking allowed
		if (flights[i].returnFreeSeats()==0) //|| (flights[i].getStatusCode()==3))
		{
			if (i==0)
			{
			System.out.println("\nFlight: LX888 Delhi-Bejing - Plane Full");
			}	
			if (i==1)
			{
			System.out.println("\nFlight: MK225 Los Angeles-Warsaw - Plane Full");
			}
			if (i==2)
			{
			System.out.println("\nFlight: PK277 Larnaka-Seoul - Plane Full");
			}
			//System.out.println("Plane Full");
		}
		/*Checks available seats in plane and displays it*/
		//else
		if ((flights[i].returnFreeSeats()!=0) && (flights[i].getStatusCode()!=3))
		{
			
			if (i==0)
			{
			System.out.println("\nFlight: LX888 Delhi-Bejing - "+flights[i].returnFreeSeats()+" available seats");
			}	
			if (i==1)
			{
			System.out.println("\nFlight: MK225 Los Angeles-Warsaw - "+flights[i].returnFreeSeats()+" available seats");
			}
			if (i==2)
			{
			System.out.println("\nFlight: PK277 Larnaka-Seoul - "+flights[i].returnFreeSeats()+" available seats");
			}
		}
		
		if  (flights[i].getStatusCode()==3)
		{
			if (i==0)
			{
			System.out.println("\nFlight: LX888 Delhi-Bejing - Flight Status: Closed");
			}	
			if (i==1)
			{
			System.out.println("\nFlight: MK225 Los Angeles-Warsaw - Flight Status: Closed");
			}
			if (i==2)
			{
			System.out.println("\nFlight: PK277 Larnaka-Seoul - Flight Status: Closed");
			}
			//System.out.println("Plane Full");
		}
		
		}
		
		System.out.println();
	}



	void retrieveFromFile() {
		// TODO Auto-generated method stub

	}



	public void displayAirline()
	{
		//for (int k=0; k< flights.length;k++)  // USED FOR TESTING THIS displayAirline() ON ITS OWN
		//flights[k].retrieveFromFile(airnos);  // USED FOR TESTING THIS displayAirline() ON ITS OWN
		
		
		System.out.println("\nFLIGHTS");
		System.out.println("\nAIRLINE: "+airnos+" "+airname+"  ");
		for (int i=0; i<=2; i++)
		{
			flights[i].displayFlight();
		}
		System.out.println();
	}

	public void menu() {
		// TODO Auto-generated method stub
		
	}
	
	
}
