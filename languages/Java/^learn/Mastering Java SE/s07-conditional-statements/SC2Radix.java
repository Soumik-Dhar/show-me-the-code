/* student challenge 2 - 
 * a) find the radix of a given number (taken as a string)
 * b) find whether a given year is a leap year or not */

import java.util.Scanner;

class SC2Radix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String number;
		short year;

		// a) finding the radix of a given number
		System.out.print("\n // a) finding the radix of a given number\n");
		System.out.print("\n Enter a number (in bases of 2, 8, 10 or 16): ");
		number = sc.next();

		// regex for radix 2 - [01]+
		if (number.matches("[01]+")) {
			System.out.format(" Radix of %s is = %d (binary)\n", number, 2);
		// regex for radix 2 - [0-7]+
		} else if (number.matches("[0-7]+")){
			System.out.format(" Radix of %s is = %d (octal)\n", number, 8);
		// regex for radix 2 - [0-9]+
		} else if (number.matches("[0-9]+")){
			System.out.format(" Radix of %s is = %d (decimal)\n", number, 10);
		// regex for radix 2 - [0-9A-Fa-f]+
		} else if (number.matches("[0-9A-Fa-f]+")){
			System.out.format(" Radix of %s is = %d (hexadecimal)\n", number, 16);
		} else {
			System.out.println(" Number entered is invalid!");
		}

		System.out.println();

		// b) finding whether a given year is a leap year or not
		System.out.print("\n // b) finding whether a given year " 
			+ "is a leap year or not\n");
		System.out.print("\n Enter a valid year : ");
		year = sc.nextShort();
		/* a leap year is one which contains 366 days instead of 365, the extra 
		 * day added to the month of February. This is due to the fact that the
		 * approximate number of days each year amounts to 365.2425. To account 
		 * for the extra .2425 days, 1 day is added every 4 years. However this 
		 * addition leads to 3 extra days over the course of 400 years, which is
		 * accounted for by dropping 3 leap days in 3 century years except the 
		 * one that is divisible by 400.
		 * Hence, a leap year is a year which is divisible by 4 except a century
		 * year i.e. not divisible by 100 unless it is also divisible by 400 */
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
			System.out.println("\n " + year + " is a leap year");
		} else {
			System.out.println("\n " + year + " is NOT a leap year");
		}
	}
}