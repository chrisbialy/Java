import java.text.DecimalFormat;
import java.util.Scanner;

public class OrdinaryPassenger extends Passenger {

	private final double discount=0;
	private double price;
	private double cost=100;
	private double finalcost;
	private int islandDeal;
	
	
	public OrdinaryPassenger()
	{
		passangername = this.getName();
		price = cost;
		islandDeal=this.getIslandDeal(); 
	}
	
	
	public OrdinaryPassenger(String gname, int price2,int deal)
	{
		passangername = gname;
		price = price2;
		islandDeal=deal; 
	}
	
	public void display()
	{
	System.out.print("Ordinary Passenger Confirmation");										// Discount: "+discount+"  \nCost: "+finalcost
	System.out.print("\nIsland Deal: "+islandDeal+" \nPassenger Name: "+passangername+" \nPrice: "+cost+" \n");	
	}
	
	public String getName()
	{
	Scanner kboard = new Scanner(System.in);
	String name;
	System.out.println("Please enter the name of the customer");
	name = kboard.nextLine();
	return (name);
	}
	
	
	
	public String returnName()
	{
		System.out.println("Passanger Name: " +passangername);
		return(passangername);
	}
	

	
	public double calcCost(double cost) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(finalcost = cost-(cost*discount));
		return finalcost;
		
	}

	
	public double returncalcCost(double cost)
	{
		
		return(finalcost); 
	}


	@Override
	public String returnCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getIslandDeal() {
		//islandDeal = 0;
		//System.out.println("Island Deal: NO");
		return (0);
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
