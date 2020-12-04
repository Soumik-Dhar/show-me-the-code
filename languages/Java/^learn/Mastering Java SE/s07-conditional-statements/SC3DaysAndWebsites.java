/* student challenge 3 - 
 * a) display name of a day depending on day number
 * b) find the top-level domain of a website and protocol used */

import java.util.Scanner;

class SC3DaysAndWebsites
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		short dayNum;
		String dayName;
		String webURL, domain;

		// a) displaying name of a day depending on day number
		System.out.println("\n // a) displaying name of a day " 
			+ "depending on day number");
		System.out.print("\n Enter a day number (1-365) : ");
		dayNum = sc.nextShort();
		
		if (dayNum % 7 == 0) {
			dayName = "Sun";
		} else if (dayNum % 7 == 1) {
			dayName = "Mon";
		} else if (dayNum % 7 == 2) {
			dayName = "Tues";
		} else if (dayNum % 7 == 3) {
			dayName = "Wednes";
		} else if (dayNum % 7 == 4) {
			dayName = "Thurs";
		} else if (dayNum % 7 == 5) {
			dayName = "Fri";
		} else {
			dayName = "Satur";
		}
		
		System.out.println("\n Day corresponding to number " + dayNum 
			+ " is = " + dayName + "day");

		/* // finding day name corresponding to day number using an array 
		String days[] = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
		System.out.println("\n Day corresponding to number " + dayNum 
			+ " is = " + days[dayNum % 7] + "day"); */

		System.out.println();
		sc.nextLine();

		// finding the scheme and TLD of a website url
		System.out.println("\n // b) finding the scheme and top-level domain " 
			+ "of a website URL");
		System.out.print("\n Enter a valid website URL : ");
		webURL = sc.nextLine();

		// displaying the URL scheme (protocol used)
		System.out.print("\n Scheme (protocol used) : ");
		if (webURL.startsWith("http:")) 
			System.out.println("'http' (HyperText Transfer Protocol)");
		else if (webURL.startsWith("https:")) 
			System.out.println("'https' (HyperText Transfer Protocol Secure)");
		else if (webURL.startsWith("ftp:")) 
			System.out.println("'ftp' (File Transfer Protocol)");
		else 
			System.out.println("others (not http, https or ftp)");
		
		// extracting the top-level domain
		domain = webURL.substring(webURL.lastIndexOf("."));
		// displaying top-level domain
		System.out.print(" Top-level domain       : ");
		if (domain.contains("com")) 
			System.out.println("'.com' (commercial)");
		else if (domain.contains("org")) 
			System.out.println("'.org' (non-profit organizations)");
		else if (domain.contains("net")) 
			System.out.println("'.net' (networks)");
		else if (domain.contains("gov")) 
			System.out.println("'.gov' (government)");
		else if (domain.contains("biz")) 
			System.out.println("'.biz' (businesses)");
		else 
			System.out.println("others (not .com, .org, .net, .gov or .biz)");
	}
}