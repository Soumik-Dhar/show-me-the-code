/* practice program to demonstrate -
 * a) conditional statements in Java
 * b) nested if-else statements and if-else-if ladder
 * b) difference between if-else-if ladder and multiple if statements */

import java.util.Scanner;

public class P1Conditionals
{
	public static void main(String[] args) 
	{
		float num = -3.14F;
		int max, a = 5, b = -3, c = 7, d = 0;
		double bill = 2388, grossAmount = 0;

		// finding whether a number is positive or negative using if-else 
		if (num >= 0) {
			System.out.format("\n %g is positive\n", num);
		} else {
			System.out.format("\n %g is negative\n", num);
		}

		// finding the maximum of four numbers using nested if-else 
		if (a > b && a > c && a > d) {
			max = a;
		} else {
			if (b > c && b > d) {
				max = b;
			} else {
				if (c > d) {
					max = c;
				} else {
					max = d;
				}
			}
		}
		System.out.format("\n Maximum of %d, %d, %d and %d "
			+ "(using nested if-else) is = %d", a, b, c, d, max);

		// finding the maximum of four numbers using if-else-if ladder
		if (a > b && a > c && a > d) {
			max = a;
		} else if (b > c && b > d) {
			max = b;
		} else if (c > d) {
			max = c;
		} else {
			max = d;
		}
		System.out.format("\n Maximum of %d, %d, %d and %d "
			+ "(using if-else-if ladder) is = %d", a, b, c, d, max);
		
		// finding the maximum of four numbers using ternary operators
		max = (a > b && a > c && a > d) ? 
		      a : ((b > c && b > d) ? 
		      b : (c > d) ? 
		      c : d);

		System.out.format("\n Maximum of %d, %d, %d and %d "
			+ "(using ternary operator) is = %d\n", a, b, c, d, max);


		// finding gross bill using multiple if statements
		System.out.print("\n Bill incurred = Rs." + bill);

		if (bill > 500) {
			grossAmount += bill;
		} if (bill > 1000) {
			grossAmount += (bill - 500) * 1.1;
		} if (bill > 1500) {
			grossAmount += (bill - 1000) * 1.25;
		} else {
			grossAmount += (bill - 1500) * 1.5;
		}
		System.out.println("\n Gross amount = Rs." + grossAmount + 
			" // using multiple if statements");

		grossAmount = 0;

		// finding gross bill using multiple if statements
		if (bill > 500) {
			grossAmount += bill;
		} else if (bill > 1000) {
			grossAmount += (bill - 500) * 1.1;
		} else if (bill > 1500) {
			grossAmount += (bill - 1000) * 1.25;
		} else {
			grossAmount += (bill - 1500) * 1.5;
		}
		System.out.println(" Gross amount = Rs." + grossAmount 
			+ " // using nested if-else-if");
		System.out.println("\n (in if-else-if ladder, control flows only if " +
			"the preceding condition is false \n and hence, only one block is " + 
			"executed. \n while in multiple if statements, every block is " + 
			"executed \n irrespective of falsity of preceding conditions.)\n");
	}
}