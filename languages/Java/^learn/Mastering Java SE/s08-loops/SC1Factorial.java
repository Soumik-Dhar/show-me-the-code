/* student challenge 1 - 
 * a) find the sum of the first 'n' natural numbers
 * b) find the factorial of a positive integer 'n' */

import java.util.Scanner;

class SC1Factorial 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		int n, sum = 0;
		long fact = 1;

		// a) finding the sum of the first 'n' natural numbers
		System.out.print("\n Enter the upper limit 'n' : ");
		n = reader.nextInt();

		if (n <= 0) {
			System.out.println(" Natural numbers must be > 0!");
		} else {
			System.out.print(" Sum of the first '" + n + "' natural numbers = ");
			while (n>0) {
				sum += n;
				n--;
			}
			// displaying the sum
			System.out.println(sum);
		}

		// b) finding the factorial of a positive integer 'n'
		System.out.print("\n Enter a positive integer 'n' : ");
		n = reader.nextInt();

		if (n < 0) {
			System.out.println(" Undefined! Enter a positive integer");
		} else {
			for (int i = 2; i <= n; i++) 
				fact *= i;
			// displaying the factorial
			System.out.format(" Factorial of %1$d (%1$d!) = %2$d\n", n, fact);
		}
	}
}