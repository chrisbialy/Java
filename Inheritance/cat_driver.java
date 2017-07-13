package Inheritance;
import java.io.IOException;
import java.util.Scanner;


public class cat_driver {
	
public static void main(String[] args) throws IOException {
		
		Scanner kboard = new Scanner(System.in);
		
		
		cat c1= new cat("Haimsh","Fat White",3);
		cat c2= new cat("Tango","Striped Orange",10);
		cat c3= new cat("Haimsh","Fat White",21);
		kitten k1= new kitten("Haimsh2","Fat Grey",1,"Green Eyes",25);
		babykitten b1 = new babykitten("Haimsh3","Fat Grey",1,"Green Eyes",25, "Fred blogs");
		kitten k2= new kitten("MINDY","STRIPED GREY",2,"blue Eyes",40);
	
		//c1.displayDetails();
		//c2.displayDetails();
		//k1.kitttenDisplayDetails();
		//c3.gCatName();
		//c3.gBreed();
		//c3.gAge();
		//c3.displayDetails();
		b1.displayEverything();
		

	
	}

}
