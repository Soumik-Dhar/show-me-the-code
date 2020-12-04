/* student challenge 4 - 
 * a) display name of a day depending on day number using switch case
 * b) display name of a month from month number using switch case
 * c) find the top-level domain of a website */

import java.util.Scanner;

class SC4SwitchCaseChallenges
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		short dayNum;
		byte monthNum;
		String dayName = "", monthName = "";
		String webURL, domain;

		// a) displaying name of a day depending on day number
		System.out.println("\n // a) displaying name of a day " 
			+ "depending on day number");
		System.out.print("\n Enter a day number (1-365) : ");
		dayNum = sc.nextShort();
		
		switch((dayNum % 7)) {
			case 0: dayName = "Sun";
					break;
			case 1: dayName = "Mon";
					break;
			case 2: dayName = "Tues";
					break;
			case 3: dayName = "Wednes";
					break;
			case 4: dayName = "Thurs";
					break;
			case 5: dayName = "Fri";
					break;
			case 6: dayName = "Satur";
					break;
			default: System.out.println("\n Invalid day number !");
		}
		if (dayName != "") {
			System.out.println("\n Day corresponding to number " + dayNum 
			+ " is = " + dayName + "day");	
		}

		System.out.println("\n -------------------------");

		// b) displaying name of a month depending on month number
		System.out.println("\n // b) displaying name of a month " 
			+ "depending on month number");
		System.out.print("\n Enter a month number (1-12) : ");
		monthNum = sc.nextByte();
		
		switch(monthNum) {
			case 1: monthName = "January";
					break;
			case 2: monthName = "February";
					break;
			case 3: monthName = "March";
					break;
			case 4: monthName = "April";
					break;
			case 5: monthName = "May";
					break;
			case 6: monthName = "June";
					break;
			case 7: monthName = "July";
					break;
			case 8: monthName = "August";
					break;
			case 9: monthName = "September";
					break;
			case 10: monthName = "October";
					break;
			case 11: monthName = "November";
					break;
			case 12: monthName = "December";
					break;
			default: System.out.println("\n Invalid month number !");
		}
		if (monthName != "") {
			System.out.println("\n Month corresponding to number " + monthNum 
			+ " is = " + monthName);	
		}

		/* // finding month name corresponding to month number using an array 
		String months[] = {"January", "February", "March", "April", "May", 
		"June", "July", "August", "September", "October", "November", "December"};
		System.out.println("\n Month corresponding to number " + monthNum 
			+ " is = " + months[monthNum-1]); */

		System.out.println("\n -------------------------");
		sc.nextLine();

		// finding the top-level domain of a website url
		System.out.println("\n // b) finding the top-level domain " 
			+ "of a website URL");
		System.out.print("\n Enter a valid website URL : ");
		webURL = sc.nextLine();
		
		// extracting the top-level domain
		domain = webURL.substring(webURL.lastIndexOf(".") + 1);
		// displaying top-level domain
		System.out.print(" Top-level domain : ");
		switch(domain) {
			case "com": 
				System.out.println("'.com' (commercial)");
				break;
			case "org": 
				System.out.println("'.org' (non-profit organizations)");
				break;
			case "net": 
				System.out.println("'.net' (networks)");
				break;
			case "gov": 
				System.out.println("'.gov' (government)");
				break;
			case "biz": 
				System.out.println("'.biz' (businesses)");
				break;
			default: 
				System.out.println("others (not .com, .org, .net, .gov or .biz)");
				break;
		}
	}
}