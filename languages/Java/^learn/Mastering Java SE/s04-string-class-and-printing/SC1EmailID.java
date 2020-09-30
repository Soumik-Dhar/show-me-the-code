/* student challenge 1 - for a given email id 'username@domain',
 * a) extract the username and domain
 * b) check whether domain belongs to gmail */

import java.util.Scanner;

class SC1EmailID
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// taking email address as input
		System.out.print("\n Enter a valid email ID : ");
		String email = sc.nextLine();
		
		// extracting username and domain using indexOf() and substring()
		int splitIndex = email.indexOf("@");
		String username = email.substring(0, splitIndex);
		String domain = email.substring((splitIndex+1));

		// // extracting username and domain using split()
		// String splitEmail[] = email.split("@");
		// String username = splitEmail[0];
		// String domain = splitEmail[1];

		// displaying entered email address
		System.out.println("\n Email ID : " + email);
		/* displaying - 
		 * a) username and domain
		 * b) whether domain belongs to gmail */
		System.out.println(" Username : " + username);
		System.out.println(" Domain   : " + domain);
		if(domain.startsWith("gmail"))	// if(domain.contains("gmail"))
		{
			System.out.println(" (Email belongs to 'gmail' domain)");
		} else 
		{
			System.out.println(" (Email does NOT belong to 'gmail' domain)");
		}
	}
}