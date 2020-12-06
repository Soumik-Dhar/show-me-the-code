/* student challenge 3 - 
 * a) find the reverse of a given number 'n'
 * b) find whether a given number 'n' is a Palindrome or not */

import java.util.Scanner;

class SC3Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		int n, digit, copy, reverse = 0;

		// a) finding the reverse of a given number 'n'
		System.out.print("\n Enter a number 'n' : ");
		n = reader.nextInt();
		copy = n;
		// using absolute value of 'n'
		if (n < 0) 
			n = -n;
		// getting reverse of 'n' 
		while (n > 0) {
			// storing the reverse by extracting each digit
			reverse = (reverse * 10) + n % 10;
			// removing the digit from 'n'
			n /= 10;
		}

		n = copy;
		// displaying reverse of 'n'
		System.out.format("\n Reverse of %d = %d\n", n, reverse);

		System.out.println();

		// b) finding whether a given number 'n' is a Palindrome or not
		System.out.print("\n Enter a number 'n' : ");
		n = reader.nextInt();
		copy = n;
		reverse = 0;
		// using absolute value of 'n'
		if (n < 0) 
			n = -n; 
		// getting reverse of 'n'
		while (n > 0) {
			// storing the reverse by extracting each digit
			reverse = (reverse * 10) + n % 10;
			// removing the digit from 'n'
			n /= 10;
		}

		n = copy;

		// 'n' is Palindromic if it is equal to its reverse
		if (n == reverse) 
			System.out.println(" " + n + " is a Palindrome");
		else
			System.out.println(" " + n + " is NOT a Palindrome");

		/* // checking for Palindrome using String methods
		String num = String.valueOf(n); 
		String rev = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			rev += num.charAt(i);
		}
		if (num.equals(rev)) 
			System.out.println(" " + n + " is a Palindrome");
		else
			System.out.println(" " + n + " is NOT a Palindrome"); */ 
	}
}  