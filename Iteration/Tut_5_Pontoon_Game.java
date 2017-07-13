package Week5;
import java.util.Scanner;
public class Tut_5_Pontoon_Game 
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        int value1=0;
        int value2=0;
        int value3=0;
        int total =0;
        String choice="";

        value1 = (int)(Math.random()*10) + 1; // Card 1 = between 1 and 10
        System.out.println(value1+" from first Card ");

        value2 = (int)(Math.random()*10) + 1; // Card 2 = between 1 and 10
        System.out.println(value2+" from second Card ");

        total=value1+value2;
        System.out.println("You score is "+total+" ");

        System.out.println("Would like draw another Card ?");
        choice = kboard.nextLine();
        
        while (choice.equalsIgnoreCase("y"))
        {
            value3 = (int)(Math.random()*10) + 1;
            System.out.println(value3+" from third Card ");
            total = total + value3;
            
            System.out.println("You score is "+total+" ");
            if  (total<18 || total>21)
            {
                System.out.println("You lost");   
            }   
            else
                System.out.println("You won");

           System.out.println("\nHello");
            System.out.println("Do you wish to continue y/n?");
            choice = kboard.nextLine();
        }
        if  (total<18 || total>21)
        {
            System.out.println("You lost");   
        }   
        else
            System.out.println("You won");
        System.out.println("Bye");
        
        
        kboard.close();
    }
}


