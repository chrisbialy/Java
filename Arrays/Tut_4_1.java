package Arrays;
import java.util.Scanner;
public class Tut_4_1 {
	public static int getrandom()
	{
		int x=0;
		x = (int)(Math.random()*10) + 1;
		return(x);
				
	}
	
	public static void findrandom(int value, int list[]) 
	/*
	 * value take on the rand nos generated (sim - main)
	 * list takes on value of the array list from main
	 */
	{
		switch(value)
        {
        case 1: list[1]=list[1]+1; break;
        case 2: list[2]=list[2]+1; break;
        case 3: list[3]=list[3]+1; break; 
        case 4: list[4]=list[4]+1; break;
        case 5: list[5]=list[5]+1; break;
        case 6: list[6]=list[6]+1; break;
        case 7: list[7]=list[7]+1; break;
        case 8: list[8]=list[8]+1; break;
        case 9: list[9]=list[9]+1; break;
        case 10: list[10]=list[10]+1; break;
        }	
		/*
		 * better way to do this problem
				
		list[value]=list[value]+1;
		*/
	}
	
	public static void displaylist(int list[])
	{
		 for (int x=1; x<=10;x++)
        	 System.out.println("Number of "+x+"'s generated was " +list[x]);	 	
	}
	
	public static void main(String[] args)
	{

		Scanner kboard = new Scanner(System.in);
		
		final int n=10;
		int list[] = new int[11];
		int i=0;
		int sim=0;
		
		for (i = 1;  i <= n; i++)
		{	
			sim = getrandom();
			System.out.println(i+"random number generated was "+sim); 
			/*
			 * displays the random number after each loop x = (int)(Math.random()*10) + 1
			 */
			findrandom(sim,list); 
			/*
			 * passed the random number generated (sim) and passed the whole array over to the function
			 * returns the whole array with the appropriate element updated by 1 
			 * for example if sim = 3 then element 3 of the array is updated by 1 list[3] = list[3] + 1
			 */
		} // end of for
		/*
		 * to print out the array we pass the array over to the function
		 */
       displaylist(list);

		kboard.close();
		}

}
