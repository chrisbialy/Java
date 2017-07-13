package classes;
import java.util.Scanner;
public class person_driver {

	public static void main(String[] args) {
	
		Scanner kboard = new Scanner(System.in);
		int choice=0;
		
		//person p1 = new person();
		person p2= new person("fred","smith",11);
		person p1 = new person("gill","green",22);
		
		person javaclass[] = new person[20];
		
		javaclass[0] = p1;
		javaclass[1] = p2;
		
		for (int x=0;x<javaclass.length;x++)
		{
			if (javaclass[x] != null)
				{
				System.out.println("Element "+x);
				javaclass[x].displayDetails();
				}
		}
		System.out.println("Please enter element to add deatis");
		choice = kboard.nextInt();
		javaclass[choice].getEmail();
		javaclass[choice].getMobile();
		javaclass[choice].getAge();
		
		
		for (int x=0;x<javaclass.length;x++)
		{
			if (javaclass[x] != null)
				{
				System.out.println("Element "+x);
				javaclass[x].displayDetails();
				}
		}
	}	
}