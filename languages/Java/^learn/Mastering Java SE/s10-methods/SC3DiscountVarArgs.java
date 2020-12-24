/* student challenge 3 - write methods to find
 * a) maximum from a list of numbers using varargs
 * b) product of a list of numbers using varargs
 * c) discount of a list of prices using varargs */

import java.util.Scanner;

class SC3DiscountVarArgs
{
	// a) method to find maximum from a list of numbers using varargs
	static int max(int ...n) {
		if (n.length == 0) 
			return Integer.MIN_VALUE;
		int max = n[0];
		for (int x : n) {
			if (x > max) 
				max = x;
		}
		return max;
	}

	// b) method to find product of a list of numbers using varargs
	static long product(int ...n) {
		if (n.length == 0) 
			return 0;
		long res = 1;
		for (int i = 0; i < n.length; i++)
			res *= n[i];
		return res;
	}

	// c) method to find discount on a list of prices using varargs
	static int discount(double ...prices) {
		if (prices.length == 0) 
			return 0;
		double amount = 0;
		for (double price : prices) {
			amount += price;
		}
		if (amount > 2000) return 20;
		else if (amount > 1000 ) return 10;
		else if (amount > 500) return 5;
		else return 0;
	}

	// main method to call above methods
	public static void main(String[] args) 
	{
		// a) finding maximum from a list of numbers
		System.out.println("\n // a) finding maximum from a list of numbers\n");
		System.out.format(" max() = %d\n", max());
		System.out.format(" max(%d, %d) = %d\n", 3, 5, max(3, 5));
		System.out.format(" max(%d, %d, %d, %d) = %d\n", 
			-4, 0, 1, -1, max(-4, 0, 1, -1));

		System.out.println();

		// b) finding product of a list of numbers
		System.out.println("\n // b) finding product of a list of numbers\n");
		System.out.format(" product() = %d\n", product());
		System.out.format(" product(%d, %d) = %d\n", 23, 69, product(23, 69));
		System.out.format(" product(%d, %d, %d, %d) = %d\n", 
			-291, 178, 5, -3125, product(-291, 178, 5, -3125));
		
		System.out.println();

		// c) finding discount on a list of prices
		System.out.println("\n // b) finding discount on a list of prices\n");
		System.out.format(" discount() = %d%%\n", discount());
		System.out.format(" discount(%.3f, %.3f) = %d%%\n", 
			399.99, 120.34, discount(399.99, 120.34));
		System.out.format(" discount(%.3f, %.3f, %.3f) = %d%%\n", 
			1.23, 25.55, 1099.99, discount(1.23, 25.55, 1099.99));
		System.out.format(" discount(%.3f, %.3f, %.3f, %.3f) = %d%%\n", 
			120.05, 5.99, 940.75, 1221.99, discount(120.05, 5.99, 940.75, 1221.99));
	}
}