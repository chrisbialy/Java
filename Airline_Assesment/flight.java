import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class flight {
	
	/*DECLARING VARIABLES*/
	
	private final int nosSeats =8;	
	private String flightnos;
	private String departure;
	private String arrival;
	private seat seats[] = new seat[nosSeats]; // create (declare) new array  of type seat and will store number of values nosSeats = 8
	private int airnos;
	private int deal;
	private boolean checkingIn;
	private boolean closed;
	private boolean boarding;
	private boolean SeatsAva;
	private String statusMessage="Seats Available";
	private int statusCode=0;
	private int seatnos;


	public flight(String nos,String dep,String arr)
	{
		
		flightnos = nos;
		departure = dep;
		arrival = arr;
		
		
		
		seat S1 = new seat(1); 	//this line creates an instance of seat
		seat S2 = new seat(2);
		seat S3 = new seat(3);
		seat S4 = new seat(4);
		seat S5 = new seat(5);
		seat S6 = new seat(6);
		seat S7 = new seat(7);
		seat S8 = new seat(8);
		
		seats[0] = S1;	//initialize (assign a value to each array slot) 
		seats[1] = S2;
		seats[2] = S3;
		seats[3] = S4;
		seats[4] = S5;
		seats[5] = S6;
		seats[6] = S7;
		seats[7] = S8;
	}
	


	public void displayFlight()
	{
		System.out.println("\nFlight "+flightnos+" \nDeparture: "+departure+" \nArrival: "+arrival+" \nFlight Status: "+statusMessage  );
		for (int i=0; i<=7; i++)
		{
			seats[i].displaySeat();
		}
		System.out.println();
	}
	
	
	public void displayPlaneSeatStatus()
	{
		System.out.println("\nFlight "+flightnos+" \nDeparture: "+departure+" \nArrival: "+arrival+" \nFlight Status: "+statusMessage  );
		for (int i=0; i<=7; i++)
		{
			seats[i].displaySeatStatus();
		}
		System.out.println();
	}	
	

	public void reserveseat()
	{
		int seatnos;
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter seat number (1-"+nosSeats+")");
		seatnos=kboard.nextInt();
		seats[seatnos-1].ReserveSeat();
	}
	
	
	
	
	public void bookseat()
	{
		int seatnos;
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter seat number (1-"+nosSeats+")");
		seatnos=kboard.nextInt();
		seats[seatnos-1].bookSeat();
	}
	
	public void cancelseat()
	{
		int seatnos;
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter seat number (1-"+nosSeats+")");
		seatnos=kboard.nextInt();
		seats[seatnos-1].cancelSeat();
		System.out.println("Seat Cancelled");
	}	
		
	
	/*Seat Counter - goes through the array of seats and adds 1 when status = 1 (Free Seat) and returns the sum of ones (1+1+1+1...=SUM) (free seats)*/
	
	public int returnFreeSeats()
	{
		int freeSeat=0;
		for (int counter=0; counter < seats.length; counter++)
		{
			if (seats[counter].returnStatus()==1)
				freeSeat=freeSeat+1;
		}
			/*if (freeSeat==0)
			{
				System.out.println("Plane Full");
			}*/
		return(freeSeat);
	}
	
	
		
	public void setFlightStatus()
	{
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("CHANGE FLIGHT STATUS");
		System.out.println("\n1. Checking In \n2. Boarding \n3. Flight Closed \n4. Seats Available  \n9. Exit");
		statusCode = kboard.nextInt();
		switch(statusCode)
		{
		case 1:
			checkingIn = true;
			statusMessage = "Checking In";
			break;
			
		case 2:
			boarding = true;
			statusMessage = "Boarding";
			break;
			
		case 3:
			
			closed = true;
			statusMessage = "Flight Closed";
			break;
			
		case 4:
			
			SeatsAva = true;
			statusMessage = "Seats Available";
	
		}
		
	
	}//end of set flight status
	
	public String getStatusMessage()
	{
		return statusMessage;
	}
	
	public int getStatusCode()
	
	{
		return(statusCode);
		
	}
	
	
	
	public void flightMenu()
	{
		int choice=0;
		Scanner kboard = new Scanner(System.in);
		this.retrieveFromFile(airnos);
		System.out.println("\nFLIGHT MENU");
		System.out.println("\n1. Display Plane Seats \n2. Display Seat Status \n3. Book Seat \n4. Reserve Seat \n5. Cancel Seat \n6. Admin Menu \n9. AIRLINE MENU");
		choice = kboard.nextInt();
		while (choice != 9)
		{
			switch(choice)
			{
			case 1: this.displayFlight();			break;
			case 2: this.displayPlaneSeatStatus();	break;
			
			case 3: if ((this.getStatusCode()==2) || (this.getStatusCode()==3)) // no bookings allowed when Boarding and status Closed
						{
								if (this.getStatusCode()==2)
								{
								System.out.println("Boarding - No Booking Allowed");
								}
								else
								System.out.println(" Closed");
							}
							else
							
							if (this.returnFreeSeats()==0)
								{
									System.out.println("Sorry the plane is full"); // no Booking Allowed when plane is full
									System.out.println("Choose another flight");
								}
								else
								this.bookseat(); 				break;
					
			case 4:  if ((this.getStatusCode()==1) || (this.getStatusCode()==2) || (this.getStatusCode()==3)) // no Reservations allowed when checking In, Boarding and status Closed
						{
								if (this.getStatusCode()==1)
								{
								System.out.println("Checking In - No Reservations Allowed");
								}
								if (this.getStatusCode()==2)
								{
								System.out.println("Boarding - No Reservations Allowed");
								}
								if (this.getStatusCode()==3)
								{
								System.out.println("Flight Closed");
								}
						}
						else
							if (this.returnFreeSeats()==0)
							{
								System.out.println("Sorry the plane is full"); //no Reservations Allowed when plane is full
								System.out.println("Choose another flight");
							}
							else
							this.reserveseat();		
													
													break;
			case 5: this.cancelseat();				break;
			case 6:	this.adminMenu();				break;
			}
			System.out.println("\nFLIGHT MENU");
			System.out.println("\n1. Display Plane Seats \n2. Display Seat Status \n3. Book Seat \n4. Reserve Seat \n5. Cancel Seat \n6. Admin Menu \n9. AIRLINE MENU");
			choice = kboard.nextInt();
			}
		
	//this.airmenu();
	} // end method
	



	public void adminMenu()
	{
		int choice=0;
		Scanner kboard = new Scanner(System.in);
		this.retrieveFromFile(airnos);
		System.out.println("\nADMIN MENU");
		System.out.println("\n1. Change Flight Status \n2. Add Flight \n3. Add Airline  \n9. FLIGHT MENU");
		choice = kboard.nextInt();
		while (choice != 9)
		{
			switch(choice)
			{
			case 1: this.setFlightStatus();		break;
			case 2: this.addFlight();			break;
			case 3: this.addAirline();			break;
			}
			System.out.println("\nADMIN MENU");
			System.out.println("\n1. Change Flight Status \n2. Add Flight \n3. Add Airline  \n9. FLIGHT MENU");
			choice = kboard.nextInt();
			
		}
		this.flightMenu();
	}
	
	
	
	
	private void airmenu() {
		// TODO Auto-generated method stub
		
	}
	
	public void saveToFile(int airnos)
	{
		//ResultSet rs = null;
	    Connection connection = null;
	    Statement statement = null; 
	    String query="";
	    
	    
	    for (int x=0;x<nosSeats;x++)
	    {
	    	if (seats[x].returnStatus()==1)
	    	{
	    		
	    	query = "update flight set airnos = "+airnos+", flightnos = '"+flightnos+"',seatnos = "+seats[x].returnSeatnos()+",status = 1 "  
	        			+ "where airnos = "+airnos+" and flightnos = '"+flightnos+"' and seatnos = "+seats[x].returnSeatnos()+"";
	    	
	     	}//end if
	    	if ((seats[x].returnStatus()==0) || (seats[x].returnStatus()==2))
	    	{
	    		
	    					//  System.out.println(seats[x].returnStatus()); Testing passing status
	   
	   
	    	 if (seats[x].returnType()==1) 
	    		{
	    			query = "update flight set airnos = "+airnos+", seatnos="+seats[x].returnSeatnos()+", flightnos = '"+flightnos+"', status = "+seats[x].returnStatus()+", "
	    					+ "seatstatus='"+seats[x].returnseatStatus()+"',passengertype ='"+seats[x].returnType()+"',passengername='"+seats[x].returnName()+"',company='"+seats[x].returnCompanyName()+"',"
	    					+ "deal="+seats[x].returnIslandDeal()+", cost="+seats[x].returncalcCostBusinessPassenger()
	    					+"where airnos = "+airnos+" and seatnos= "+seats[x].returnSeatnos()+" and  flightnos = '"+flightnos+"'";
	    		
	    		}
	    		if (seats[x].returnType()==2)
	    		{
	    			
	    			query = "update flight set airnos = "+airnos+", seatnos="+seats[x].returnSeatnos()+", flightnos='"+flightnos+"', status = "+seats[x].returnStatus()+", "
	    					+ "seatstatus='"+seats[x].returnseatStatus()+"',passengertype ='"+seats[x].returnType()+"', passengername='"+seats[x].returnName()+"',"
	    					+ "deal="+seats[x].returnIslandDeal()+", cost="+seats[x].returncalcCost()
	    					+ "where airnos = "+airnos+" and seatnos= "+seats[x].returnSeatnos()+" and flightnos='"+flightnos+"'";
	    			
	    		}
	    		
	    		else if (seats[x].returnType()==3) 
	    		{
	    			query = "update flight set airnos = "+airnos+", seatnos="+seats[x].returnSeatnos()+", flightnos='"+flightnos+"', status = "+seats[x].returnStatus()+", "
	    					+ "seatstatus='"+seats[x].returnseatStatus()+"',passengertype ='"+seats[x].returnType()+"', passengername='"+seats[x].returnName()+"',"
	    					+ "island='"+seats[x].returnIslandName()+"',deal="+seats[x].returnIslandDeal()+", cost="+seats[x].returncalcCostIslandPassenger()
	    					+ "where airnos = "+airnos+" and seatnos= "+seats[x].returnSeatnos()+" and flightnos='"+flightnos+"'";
	    			
	    		}
	    		
	    		
	    	}
	    	try {           
	            connection = JDBCMySQLConnection.getConnection();
	            statement = connection.createStatement();
	            statement.executeUpdate(query);
	            System.out.println("Added seat"+seats[x].returnSeatnos());
	     		} catch (SQLException e) 
	     	{
	    	 e.printStackTrace();
	     	} 
	    }//end for
	}

	public void addFlight()
	{
		String flightnos;
		String seatstatus="Free";
		
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter flight number");
		flightnos=kboard.next();
			
		System.out.println("Please enter airline number: 380, 747, 777");
		airnos=kboard.nextInt();
		//System.out.println("Please enter seat number: 1 - 8");
		//seatnos=kboard.nextInt();
		System.out.println("Please enter departure");
		departure=kboard.next();
		System.out.println("Please enter arrival");
		arrival=kboard.next();
		//ResultSet rs = null;
	    Connection connection = null;
	    Statement statement = null; 
	    String query1="";
	    String query2="";
	    String query3="";
	    String query4="";
	    String query5="";
	    String query6="";
	    String query7="";
	    String query8="";
	   
	   /*INSERTING SEATS 1-8*/
	    		
	    	query1 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+1+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query2 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+2+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";	
	    	query3 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+3+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query4 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+4+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query5 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+5+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query6 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+6+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query7 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+7+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	    	query8 = "insert into flight(airnos,flightnos,seatnos,status,dep,arr,seatstatus) values ("+airnos+",'"+flightnos+"',"+8+","+1+",'"+departure+"','"+arrival+"', '"+seatstatus+"')";
	  
	    	
	    	try {           
	            connection = JDBCMySQLConnection.getConnection();
	            statement = connection.createStatement();
	            statement.executeUpdate(query1);
	            statement.executeUpdate(query2);
	            statement.executeUpdate(query3);
	            statement.executeUpdate(query4);
	            statement.executeUpdate(query5);
	            statement.executeUpdate(query6);
	            statement.executeUpdate(query7);
	            statement.executeUpdate(query8);
	            
	            
	            System.out.println("Added Flight: "+flightnos+" "+departure+" "+arrival );
	     		} catch (SQLException e) 
	     	{
	    	 e.printStackTrace();
	     	} 
	}
	
	
	public void addAirline()
	{
		String airname;
		
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter airline number");
		airnos=kboard.nextInt();
		System.out.println("Please enter airline name");
		airname=kboard.next();
		
		//ResultSet rs = null;
	    Connection connection = null;
	    Statement statement = null; 
	    String query1="";
	  
	   
	  
	    		
	    	query1 = "insert into airline(airnos,airname) values ("+airnos+",'"+airname+"')";

	    	try {           
	            connection = JDBCMySQLConnection.getConnection();
	            statement = connection.createStatement();
	            statement.executeUpdate(query1);
	        
	            
	            System.out.println("Added Airline: "+airnos+" "+airname );
	     		} catch (SQLException e) 
	     	{
	    	 e.printStackTrace();
	     	} 
	}
	
	
	
	
	public void retrieveFromFile(int airnos)
	{
		ResultSet rs = null;
	    Connection connection = null;
	    Statement statement = null;
	    String query="";
	   // int loopcounter = 0;
    
	    query = "select * from flight where flightnos='"+flightnos+"' and airnos="+airnos+"";
	    
	    try {           
	        connection = JDBCMySQLConnection.getConnection();
	        statement = connection.createStatement();
	        rs = statement.executeQuery(query);
	        
	        //adding each record back into the data structures
	        while (rs.next())
	        {
	        	if (rs.getInt("status")==1)
	        	{
	        		//do nothing because object already created in constructor 
	        		
	        		
	        	}
	        	else
	        	{
	        		if (rs.getInt("passengertype")==1) 
	        		{
	        		Passenger Business = new BusinessPassenger(rs.getString("passengername"),rs.getString("company"),rs.getInt("cost"),rs.getInt("deal"),rs.getString("seatstatus"));
	        		seats[rs.getInt("seatnos")-1].setOccupier(Business);
	        		seats[rs.getInt("seatnos")-1].setType(1);
	        		
		        		if (rs.getInt("status")==2)
		        		{
		        			seats[rs.getInt("seatnos")-1].setStatusReserved();
		        		}
		        		
		        		if (rs.getInt("status")==0)
		        		{
		        			seats[rs.getInt("seatnos")-1].setStatusBooked();
		        		}
	        			
	          		}
	        		if (rs.getInt("passengertype")==2) 
	        		{
	        			Passenger Ordinary = new OrdinaryPassenger(rs.getString("passengername"),rs.getInt("cost"),rs.getInt("deal"));
	            		seats[rs.getInt("seatnos")-1].setOccupier(Ordinary);
	            		seats[rs.getInt("seatnos")-1].setType(2);
		            		if (rs.getInt("status")==2)
			        		{
			        			seats[rs.getInt("seatnos")-1].setStatusReserved();
			        		}
			        		
			        		if (rs.getInt("status")==0)
			        		{
			        			seats[rs.getInt("seatnos")-1].setStatusBooked();
			        		}
	            		
	              	}
	        		
	        		if (rs.getInt("passengertype")==3)
	        		{
	        			Passenger Island = new IslandPassenger(rs.getString("passengername"),rs.getInt("cost"),rs.getInt("deal"),rs.getString("island"));
	            		seats[rs.getInt("seatnos")-1].setOccupier(Island);
	            		seats[rs.getInt("seatnos")-1].setType(3);
		            		if (rs.getInt("status")==2)
			        		{
			        			seats[rs.getInt("seatnos")-1].setStatusReserved();
			        		}
			        		
			        		if (rs.getInt("status")==0)
			        		{
			        			seats[rs.getInt("seatnos")-1].setStatusBooked();
			        		}
	            		
	            		
	              	}
	        		
	        		
	        		
	          	} // end of outer if - customer exists
	        }
	        System.out.println("File Retrieved");
	 		} catch (SQLException e) 
	 	{
		 e.printStackTrace();
	 	} 
 }



	public int returnSeatnos(int seatnos) {
		// TODO Auto-generated method stub
		return (seatnos);
	}



	public void displayFlightStatus() {
		// TODO Auto-generated method stub
		
	}


	
}

/*When a flight is checking in, cancellations and bookings
 *  can be made but reservations cannot. No further reservations 
 *  or bookings can be made if a flight is boarding or closed. */
