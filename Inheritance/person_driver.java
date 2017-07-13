package Inheritance;
import java.util.Scanner;
public class person_driver {
	
	
	public static void main(String[] args) {
	
		Scanner kboard = new Scanner(System.in);
		
		
		person p1= new person("Fred Bloggs","10 King Street Perth",34);
		person p2= new person("Anne Smith","6 High Street Inverness",35);
		person p3= new person();
		student s1 = new student("Chris Bialy","6 End Street London",30,410,"JAVA");
		degree d1 = new degree("Chris Bialy","6 End Street London",30,410,"JAVA","Derek Summers",2);
		nondegree n1 = new nondegree("Chris Bialy","6 End Street London",30,410,"JAVA","HND","Ian Turnbull");
		
	
		s1.displayStudentDetails();
		//s1.gNewAddress();
		//s1.gNewcourseName();
		//s1.displayStudentDetails();
		d1.displayDegreeStudentDetails();
		n1.displayNonDegreeStudentDetails();
		
		
		
		
		/*p1.displayDetails();
		p2.displayDetails();
		p2.displayNewAge();
		p2.displayDetailsNewAge();
		p3.getPersonName();
		p3.getPersonAddress();
		p3.getPersonAge();
		p3.displayDetails();*/
	}
}




