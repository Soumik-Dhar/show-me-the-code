/* student challenge 1 - input an username and display a welcome message */

import java.lang.*;
import java.util.*;

public class SC1WelcomeMessage
{
	public static void main(String args[]) 
	{
		String username = "";

		// creating Scanner instance
		Scanner sc = new Scanner(System.in);

		// taking username as a string input
		System.out.print("\nEnter an username : ");
		username = sc.nextLine();

		// displaying welcome message
		System.out.println("Welcome " + username + "!" +
		" You've completed your first student challenge!");
	}
}