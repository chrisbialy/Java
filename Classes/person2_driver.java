package classes;

import java.util.Scanner;

public class person2_driver {

	
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		
		person p1= new person();
		p1.getForename();
		p1.getSurname();
		p1.getAge();
		p1.getEmail();
		p1.getMobile();
		p1.displayDetails();
		
		
		
		
	}
}
