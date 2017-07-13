import java.util.Scanner;

public class seat 
{
private int seatnos;
private Passenger occupier;
private int status;
private int type;
private double cost;
private double resCost;
private String seatStatus;
private String customer;
private String currentStatus;


public seat(int seatnos)
{
	this.seatnos = seatnos;
	status = 1;
	seatStatus = "Free";
	type=0;
	cost = 100.00;
	resCost=50;
}


public void displaySeat()
{
	
	if (status == 0) //&& (seatStatus=="Booked"))
	{
		
		System.out.println("\nSeat Number: "+seatnos+" : Booked ");
		occupier.display();
	}
	
	
	if (status == 1) //&& (seatStatus=="Free"))
	{
		
		System.out.println("\nSeat Number: "+seatnos+" : Free");
	}
	
	if (status == 2)// && (seatStatus=="Reserved"))
	{
		
		System.out.println("\nSeat Number: "+seatnos+" : Reserved ");
		occupier.display();
	}
	
	
}

public void displaySeatStatus()
{
	
	if (status == 0)
	{
		//System.out.println("\nSeat "+seatnos+": ");
		System.out.println("\nSeat Number: "+seatnos+" : Booked ");
		occupier.returnName();
	}
	
	if (status == 1)
	{
		//System.out.println("\nSeat "+seatnos+": Empty");
		System.out.println("\nSeat Number: "+seatnos+" : Free");
	}
	
	if (status == 2)
	{
		//System.out.println("\nSeat "+seatnos+": Taken");
		System.out.println("\nSeat Number: "+seatnos+" : Reserved ");
		occupier.returnName();
	}
	
	
	
	
}





public int returnSeatnos()
{
	return(seatnos);
}

public int returnStatus()
{
//System.out.println(status);
	return(status);
	
}

public int returnType()
{
	//System.out.println(type);
		return(type);
		
}

public String returnseatStatus()
{
	return(seatStatus);
}


public void setStatusReserved()
{
	status = 2;
}
public void setStatusBooked()
{
	status = 0;
}

public void setType(int types)
{
	type = types;

}

public void setOccupier(Passenger x)
{
	occupier = x;
}



public void bookSeat()
{
	int passengerType=0;
	Scanner kboard = new Scanner(System.in);
	

			if ((status==0) || (status==2)) //&& (seatStatus=="Booked"))
			{
				if (status==0) 
				{
					System.out.println("Seat Booked");
				}
				
				if (status==2) //&& (seatStatus=="Reserved"))
				{
					System.out.println("Seat Reserved");
				}
			}
			else
			{
				System.out.println("Choose type of Passenger");
				System.out.println("\n1. Business Passenger 25% discount \n2. Ordinary Passenger 0 % discount \n3. Island Passenger 10% discount");
				passengerType = kboard.nextInt();
				if (passengerType==1)
				{
					Passenger Business = new BusinessPassenger();
					occupier = Business;
					status = 0;
					seatStatus="Booked";
					type=1;
					Business.calcCost(cost);
				}
				
				else if (passengerType==2)
				{
					Passenger Ordinary = new OrdinaryPassenger();
					occupier = Ordinary;
					status = 0;
					seatStatus="Booked";
					type=2;
					Ordinary.calcCost(cost);
				}
				
				
				else if (passengerType==3)
				{
					Passenger Island = new IslandPassenger();
					occupier = Island;
					status = 0;
					seatStatus="Booked";
					type=3;
					Island.calcCost(cost);
					
					
					
				}
				
			}
}	


public void ReserveSeat()
{
	int passengerType=0;
	Scanner kboard = new Scanner(System.in);
	if ((status==0) || (status==2)) //&& (seatStatus=="Booked"))
	{
		if (status==0) 
		{
			System.out.println("Seat Booked");
		}
		
		if (status==2) //&& (seatStatus=="Reserved"))
		{
			System.out.println("Seat Reserved");
		}
	}
	else
	{
		System.out.println("Choose type of Passenger");
		System.out.println("\n1. Business Passenger 25% discount \n2. Ordinary Passenger 0 % discount \n3. Island Passenger 10% discount");
		passengerType = kboard.nextInt();
		if (passengerType==1)
		{
			Passenger Business = new BusinessPassenger();
			occupier = Business;
			status = 2;
			seatStatus="Reserved";
			type=1;
			Business.calcCost(resCost);
		}
		if (passengerType==2)
		{
			Passenger Ordinary = new OrdinaryPassenger();
			occupier = Ordinary;
			status = 2;
			seatStatus="Reserved";
			type=2;
			Ordinary.calcCost(resCost);
		}
		
		
		if (passengerType==3)
		{
			Passenger Island = new IslandPassenger();
			occupier = Island;
			status = 2;
			seatStatus="Reserved";
			type=3;
			Island.calcCost(resCost);
			
			
			
		}
		
	}
}




public void cancelSeat()
{
	occupier = null;
	status = 1;
	seatStatus="Free";
}

//function used to get name name  and used in Flight class to update the Database

public String returnName()
{
	return(occupier.returnName());
}


//function used to get Island name if apply (only Island Passenger) and used in Flight class to update the Database

public String returnIslandName()
{
	return(occupier.returnIslandName());
}


// function used to calculate cost and used in Flight class to update the Database

public double returncalcCostIslandPassenger() {	
	double discount=0.10;
	return cost-(cost*discount);
}


// function used to calculate cost and used in Flight class to update the Database

public double returncalcCostBusinessPassenger() {	
	double discount=0.25;
	return cost-(cost*discount);
}

// function used to calculate cost and used in Flight class to update the Database

public double returncalcCost() { 	
	return(cost);
}

// function used to get company name if apply (only Business Passenger) and used in Flight class to update the Database

public String returnCompanyName()
{
	return(occupier.returnCompanyName());	
}


// function used to get company name if apply (only Business Passenger) and used in Flight class to update the Database

public int returnIslandDeal() {				
	
	return (occupier.returnIslandDeal());
}






}
