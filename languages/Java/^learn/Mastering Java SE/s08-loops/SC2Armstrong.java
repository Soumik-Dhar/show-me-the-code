/* student challenge 2 - 
 * a) count the number of digits in a number 'n' and display the digits
 * b) find whether a given number 'n' is an Armstrong number or not */

import java.util.Scanner;

class SC2Armstrong
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		int n, digit, copy, countDigits = 0, sum = 0;

		// a) counting and displaying the digits in a number 'n'
		System.out.print("\n Enter a number 'n' : ");
		n = reader.nextInt();
		copy = n;
		// using absolute value of 'n'
		if (n < 0) 
			n = -n;
		// displaying digits in 'n'
		System.out.print("\n Digits of " + n + " are : ");
		while (n > 0) {
			// extracting each digit from 'n'
			digit = n % 10;
			// printing the digit
			System.out.print(digit + " ");
			// removing the digit from 'n'
			n /= 10;
			// counting number of digits
			countDigits++;
		}

		n = copy;
		// displaying number of digits in 'n'
		System.out.format("\n Number of digits in %d : %d\n", n, countDigits);

		/* // counting number of digits using String methods - valueOf () and length()
		countDigits = String.valueOf(n).length();
		System.out.format("\n Number of digits in %d : %d\n", n, countDigits); */

		System.out.println();

		// b) finding whether a given number 'n' is an Armstrong number or not
		System.out.print("\n Enter a number 'n' : ");
		n = reader.nextInt();
		copy = n;

		// using absolute value of 'n'
		if (n < 0) 
			n = -n;
		// counting number of digits in 'n'
		countDigits = (n + "").length();
		// extracting digits from 'n'
		for (; n > 0; n /= 10) {
			digit = n % 10;
			// computing sum of powers of digit
			sum += (int)Math.pow(digit, countDigits);
		}
		n = copy;
		// 'n' is an Armstrong number if it is equal to the sum obtained above
		if (n == sum) 
			System.out.println(" " + n + " is an Armstrong number");
		else
			System.out.println(" " + n + " is NOT an Armstrong number");
	}
}