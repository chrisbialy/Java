import java.text.DecimalFormat;
import java.util.Scanner;


public class IslandPassenger extends Passenger {

	private final double discount=0.10;
	private double price;
	private double cost=100;
	private double finalcost;
	private int islandDeal;
	private String island;
	
	public IslandPassenger()
	{
		passangername = this.getName();
		price = cost;
		islandDeal=this.getIslandDeal(); 
		island=this.getIslandName();
	}
	

	
	
	public IslandPassenger(String gname, int price2,int deal,String islandName)
	{
		passangername = gname;
		price = price2;
		islandDeal=deal; 
		island=islandName;
	}
	
	public void display()
	{
	System.out.print("Island Passenger Confirmation");										//+"  \nCost: "+finalcost Discount: "+discount
	System.out.print("\nIsland Deal: "+islandDeal+" \nPassenger Name: "+passangername+" \nPrice: "+price+" \nIsland Of Residence: "+island+" \n");	
	}
	
	
	public String getIslandName()
	{
		Scanner kboard = new Scanner(System.in);
		String island2;
		System.out.println("Please enter the island name");
		island2 = kboard.nextLine();
		return (island2);
		
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
	
	public String returnIslandName()
	{
		return(island);
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


	@Override
	public String returnCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}


	public int getIslandDeal() {
		//islandDeal = 1;
		//System.out.println("Island Deal: NO");
		return (1);
	}


	
	public int returnIslandDeal() {
	
		return(1);
	}






	
	
}
