/* student challenge 6 - display the fibonacci series upto 'n' terms */

import java.util.Scanner;

class SC6Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int n, a = 0, b = 1, c;

		System.out.print("\n Enter the number of terms 'n' : ");
		n = reader.nextInt();
		if (n <= 0)
			System.exit(1);

		System.out.print("\n Fibonacci series upto " + n + " terms is : ");
		if (n == 1) 
			// Fibonacci series for 1 term is : 0
			System.out.print(a);
		else if (n >= 2) {
			// Fibonacci series for 2 terms is : 0, 1
			System.out.print(a + ", " + b);
			// displaying Fibonacci series for more than 2 terms
			for (int i = 0; i < n-2; i++) {
				c = a + b;
				System.out.print(", " + c);
				a = b;
				b = c;
			}
		}	
		System.out.println();
	}
}