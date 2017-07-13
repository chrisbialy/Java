/*Questions*/
	
	// 1. How to automatically add new flight to program menu ?
	// 2. How to automatically add new airline to program menu ?
	// 3. Why I need to type "9" to return from FLIGHT MENU to AIRLINE MENU ?
	// 4. How to validate user input when navigate through the menus ?	LOOPS
	// 5. How to validate user input when booking ?						LOOPS
	// 6. How to validate user input when adding new flight ?			LOOPS
	// 7. How to validate user input when adding new airline ?			LOOPS
	// 8. How to access all functions and use them in GUI ?
	// 9. How to design GUI ?
	// 10. How can I access Airline Class functions in Flight Class ? 
	// 11. Cancel seat - update DB with all NULL values - company and Island fields remains... 



public class airlinedriver_1 {

	public static void main(String[] args) 
	{
		
		/*TRIED TO ADD USER INTERFACE - UNSUCCESSFUL*/
		
		/* String airnme ="Ryanair";
		airline airline = new airline(380, airnme);
	        Interface Interface = new Interface(airline);
	        Interface.AirlineMenu();*/
	
	/*TESTTING PASSENGER*/
	

	/*System.out.println("OrdinaryPassenger");
	Passenger p1 = new OrdinaryPassenger();    //this line creates an instance of customer
	double cost=100;
	p1.returncalcCost(cost);
	p1.calcCost(cost);
	p1.display();*/
	
 
	/*System.out.println("IslandPassenger");
	Passenger p2 = new IslandPassenger();   //this line creates an instance of customer
	double cost=100;
	/*p2.returncalcCost(cost);
	p2.calcCost(cost);
	p2.display();*/
	
//	p2.getIslandName();
	//p2.returnIslandName();
	
	/*System.out.println("BusinessPassenger");
	Passenger p3 = new BusinessPassenger();   //this line creates an instance of customer
	double cost=100;
	p3.returncalcCost(cost);
	p3.calcCost(cost);
	p3.display();*/
	
		
	/*TESTTING SEAT*/	
		
	seat s1 = new seat(7);
	//seat s2 = new seat(2);
	//s1.ReserveSeat();
	//s1.returnStatus();
	
	//s2.ReserveSeat();
	//s1.displaySeat();
	//s1.displaySeatStatus();
	//s2.displaySeatStatus();*/
		
	/*TESTTING FLIGHT*/
		
	flight f1 = new flight("LX888","Delhi","Bejing" );  // need to type "LX888","Delhi","Bejing"  because of constructor in carriage class: public flight(String,String,String )
	//flight f2 = new flight("PK277", "Larnaka", "Seoul"); 
	//flight f3 = new flight("0063","Dundee","Stockholm"); 
		
	//int airnos=747;
	//f1.addFlight();
	//f1.addAirline();
	//f1.bookseat();
	//f1.saveToFile(airnos);
	//f1.displayFlightStatus();
	
	//int airnos=380;
	//f1.bookseat();
	//f2.saveToFile(airnos);*/
	
	//f1.displayFlight();
	//f1.setFlightStatus();
	//f1.displayFlight();
	/*f1.displayPlaneSeatStatus();
	f1.bookseat();*/

	//f1.reserveseat();
	//f1.displayFlightStatus();
	/*f1.cancelseat();*/
	//f1.displayFlightStatus();
	//f1.displayFlight();
	//f1.flightMenu();
		
	//int airnos=380;
	//f1.flightMenu();
	/*//f2.flightMenu();
	f1.retrieveFromFile(airnos);
	//f1.displayFlight();
	f1.displayFlightStatus();
	f1.bookseat();
	f1.saveToFile(airnos);
	f1.retrieveFromFile(airnos);
	f1.displayFlightStatus();*/
		

	/*TESTTING AIRLINE*/
	
	airline a1 = new airline(380,"Ryanair");
	airline a2 = new airline(747,"BRITISH AIRWAYS");
	airline a3 = new airline(777,"Sky Express");
	
	//a1.airnmenu();
	//a2.airnmenu();
	//a3.airnmenu();
	
	//a2.displayAirline();
	//a2.bookseatAirline();
	
	//a2.saveAirline();
	
	
	
	
	
	
	
	
	
	}	
}
