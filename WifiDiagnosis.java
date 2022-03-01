/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Only one class that goes to a decision matrix of informing the user what to do next.
 * Due: 2/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Erfan Khosravi
*/
import java.util.Scanner;
public class WifiDiagnosis {
//This will be the entire body of code's class
	public static void main(String[] args)
	{
		
		//Introduction and asking the user to answer yes or no in the first step
		System.out.println("Hi, I am a program that will aid in your WiFi diagnosis. "
				+ "\nThe first stem in the daignosis of your WiFi is to reboot your computer!");
		System.out.println("Did the reboot work? Please answer in 'yes' or 'no'.");
		//Scanner instances named a series of keyboards to provide inputs 
		Scanner keyboard1= new Scanner (System.in); 
		Scanner keyboard2= new Scanner (System.in);
		Scanner keyboard3= new Scanner (System.in);
		Scanner keyboard4= new Scanner (System.in);
		/*A series of nested if statements to provide the menu options for the user.
		 * Each if statement provides input for a step
		 * A yes terminates the program and congratulates the user
		 * A no proceeds to the next step. There is no input validation. */
		if (keyboard1.hasNext("yes"))
		{
			System.out.println("I'm glad your WiFi is reconnected!");
		}
		else if (keyboard1.hasNext("no"))
		{
			System.out.println("Then we proceed to the next step. "
					+ "\nPlease reboot your router!"
					+ "\nDid it work? answer as a 'yes' or 'no'");
			
			if(keyboard2.hasNext("yes"))
			{
				System.out.println("I'm glad your WiFi is reconnected!");
			}
			else if (keyboard2.hasNext("no"))
			{
				System.out.println("Then we proceed to the next step. "
						+ "\nPlease check the cables to see if they are connected!"
						+ "\nDid it work? answer as a 'yes' or 'no'");
				
				if(keyboard3.hasNext("yes"))
				{
					System.out.println("I'm glad your WiFi is reconnected!");
				}
				else if (keyboard3.hasNext("no"))
				{
					System.out.println("Then we proceed to the next step. "
							+ "\nPlease move your computer closer to the router to see if it works now!"
							+ "\nDid it work? answer as a 'yes' or 'no'");
					
					if(keyboard4.hasNext("yes"))
					{
						System.out.println("I'm glad your WiFi is reconnected!");
					}
					else if (keyboard4.hasNext("no"))
					{
						System.out.println("Then we proceed to the next step. "
								+ "\nPlease call your Internet Service Provider. They will assist you!");
						
				}			
			}			
		}
		//The closing of the opened keyboard objects.
			keyboard1.close();
			keyboard2.close();
			keyboard3.close();
			keyboard4.close();
			
	}
	}
}

