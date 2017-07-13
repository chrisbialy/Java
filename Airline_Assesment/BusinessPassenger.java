import java.text.DecimalFormat;
import java.util.Scanner;


public class BusinessPassenger extends Passenger {

	private final double discount=0.25;
	private double price;
	private double cost=100;
	private String company;
	private double finalcost;
	private int islandDeal;
	private String seatstatus;
	
	public BusinessPassenger()
	{
		passangername = this.getName();
		company=this.getCompanyName();
		price = cost;
		islandDeal = this.getIslandDeal();
		seatstatus=this.changeSeatStatus();
	}
	
	
	private String changeSeatStatus() {
		// TODO Auto-generated method stub
		return null;
	}


	public BusinessPassenger(String gname, String compname, int price2, int deal, String Sstatus)
	{
		passangername = gname;
		company=compname;
		price = price2;
		islandDeal=deal; 
		seatstatus=Sstatus;
		
	}
	


	public void display()
	{
	System.out.print("Business Passenger Confirmation");																			//" \nDiscount: "+discount+"  \nCost: "+finalcost	
	System.out.print("\nIsland Deal: "+islandDeal+" \nPassenger Name: "+passangername+" \nCompany Name: "+company+" \nPrice: "+price+" \n");	
	
	}
	
	
	public int getIslandDeal()
	{
		//islandDeal = 0;
		//System.out.println("Island Deal: NO");
		return (0);
	}
	
	
	public String getName()
	{
	Scanner kboard = new Scanner(System.in);
	String name;
	System.out.println("Please enter the name of the Passenger");
	name = kboard.nextLine();
	return (name);
	}
	
	
	
	public String getCompanyName()
	{
	Scanner kboard = new Scanner(System.in);
	String comapny;
	System.out.println("Please enter the comapny name");
	comapny = kboard.nextLine();
	return (comapny);
	}
	
	
	public String returnCompanyName() {
		
		return(company);
	}
	
	public String returnName()
	{
		System.out.println("Passanger Name: " +passangername);
		return(passangername);
	}
	

	
	
	
	public double calcCost(double cost) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(price = cost-(cost*discount));
		return price;
		
	}

	
	public double returncalcCost(double cost)
	{
		
		return(price); 
	}

	
	
	
	public int returnIslandDeal() {
		
		return(0);
	}


	@Override
	public String returnIslandName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getIslandName() {
		// TODO Auto-generated method stub
		return null;
	}





	
	
	
}
