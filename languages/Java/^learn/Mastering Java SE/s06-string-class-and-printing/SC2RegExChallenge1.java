/* student challenge 2 - 
 * a) find if a number is a valid binary number or not
 * b) find if a number is a valid hexadecimal number or not
 * c) find if a given date is in "dd/mm/yyyy" format */

import java.util.Scanner;

class SC2RegExChallenge1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String number, date, pattern, result = "";

		// a) checking whether given number is a valid binary number
		System.out.print("\n Enter a binary number : ");
		number = sc.nextLine();
		// matching number against pattern "[01]+"
		pattern = "[01]+";
		if(number.matches(pattern)) { 
			result = number + " is a valid binary number " 
			+ "(matches [01]+ pattern)";
		} else {
			result = number + " is NOT a valid binary number"; 
		}
		// displaying result
		System.out.println(" " + result);

		// b) checking whether given number is a valid hexadecimal number
		System.out.print("\n Enter a hexadecimal number : ");
		number = sc.nextLine();
		// matching number against pattern "[0-9a-fA-F]+"
		pattern = "[0-9a-fA-F]+";
		if(number.matches(pattern)) { 
			result = number + " is a valid hexadecimal number " 
			+ "(matches [0-9a-fA-F]+ pattern)";
		} else {
			result = number + " is NOT a valid hexadecimal number"; 
		}
		// displaying result
		System.out.println(" " + result);

		// c) checking whether given date follows "dd/mm/yyyy" format
		System.out.print("\n Enter a date (using any valid format) : ");
		date = sc.nextLine();
		// matching date against "([0-2][1-9]|10|20|30|31)/(0[1-9]|1[0-2])/\\d{4}"
		pattern = "([0-2][1-9]|10|20|30|31)/(0[1-9]|1[0-2])/\\d{4}";
		if(date.matches(pattern)) {
			result = date + " is in 'dd/mm/yyyy' format";
		} else {
			result = date + " is NOT in 'dd/mm/yyyy' format";
		}
		// displaying result
		System.out.println(" " + result);
	}
}