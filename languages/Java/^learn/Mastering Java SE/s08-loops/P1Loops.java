/* practice program to demonstrate -
 * a) while and do-while loops
 * b) for loop and nested for loops */

import java.lang.*;

public class P1Loops
{
	public static void main(String[] args) 
	{
		int n = 1;
		// using while and do-while loops to print perfect squares upto 10
		System.out.print("\n Perfect squares upto 10 (using while loop)    :");
		while(n <= 10) {
			System.out.print(" " + (n * n));
			n++;
		}
		
		System.out.println();
		n = 1;
		
		System.out.print("\n Perfect squares upto 10 (using do-while loop) :");
		do {
			System.out.print(" " + (n * n));
			n++;
		} while(n <= 10);
		
		System.out.println();

		// difference between while and do-while loops
		n = 100;
		System.out.println("\n n = 100");

		while (n < 50) {
			System.out.print("\n (inside while loop) : " + n + " < 50");
		}
		System.out.println("\n (outside while loop) : " + n + " > 50");

		do {
			System.out.print("\n (inside do-while loop) : " + n + " < 50");
		} while (n < 50);
		System.out.println("\n (outside do-while loop) : " + n + " > 50");

		System.out.println("\n -------------------------");

		// using for loop to print the multiplication table of a number
		n = 7;
		System.out.println("\n multiplication table for 7 is as follows :\n");

		for (int i = 1; i <= 10; i++) {
			System.out.format(" \t %d x %-2d = %02d\n", n, i, (n * i));
		}

		System.out.println();

		// demonstration of nested for loops
		n = 5;
		System.out.println("-----------------------------------------");
		for (int i = 1; i <= n; i++) {
			System.out.print("|");
			for (int j = 1; j <= n; j++) {
				System.out.format(" (%d,%d) |", i, j);
			}
			System.out.println();
			System.out.println("-----------------------------------------");
		}
	}
}