/* student challenge 1 - write methods to
 * a) find whether a number is prime or not
 * b) find whether a number is a perfect number or not
 * c) find the GCD and LCM of two numbers
 * d) find the maximum element in an array of integers
 * e) print the fibonacci series by returning each term of the series */

import java.util.Scanner;

class SC1Prime
{
	// a) method to find whether a number is prime or not
	static boolean isPrime(int n) {
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// b) method to find whether a number is a perfect number or not
	static boolean isPerfect(int n) {
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) return true;
		else return false;
	}

	// c) method to find the GCD and LCM of two numbers
	static int[] gcdlcm(int a, int b) {
		int m = a, n =b;
		// array to store gcd and lcm
		int result[] = new int[2];
		// finding gcd by continous subtraction method
		while (a != b) {
			if (a > b) 
				a = a - b;
			else
				b = b - a;
		}
		result[0] = a;
		// finding lcm using continous addition method
		a = m;
		b = n;
		int x = a > b ? a : b;
		while (true) {
			if (x % a == 0 && x % b == 0) {
				result[1] = x;
				return result;
			}	 
			x++;
		}
		// finding lcm = a * b / gcd
		// result[1] = (a * b) / result[0];
		// return result;
	}

	// d) method to find the maximum element in an array of integers
	static int max(int arr[]) {
		int max = arr[0];
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}

	// e) method to return a term of the fibonacci series based on its index
	static int fibonacci(int index) {
		int a = 0, b = 1, c = 0;
		if (index <= 1) {
			return index;
		} else {
			for (int i = 2; i <= index; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}

	// main method to call above methods
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n, res[];

		// finding whether a number is prime or not
		System.out.println("\n // a) finding whether a number is prime or not");
		System.out.print("\n Enter a number : ");
		n = sc.nextInt();
		if (isPrime(n)) 
			System.out.println(" " + n + " is a prime number\n");
		else
			System.out.println(" " + n + " is NOT a prime number\n");

		// finding whether a number is perfect or not
		System.out.println("\n // b) finding whether a number is a " +
			"perfect number or not");
		System.out.print("\n Enter a number : ");
		n = sc.nextInt();
		if (isPerfect(n)) 
			System.out.println(" " + n + " is a perfect number\n");
		else
			System.out.println(" " + n + " is NOT a perfect number\n");

		// finding the GCD and LCM of two numbers
		res = new int[2];
		System.out.println("\n // c) finding the GCD and LCM of two numbers");
		System.out.print("\n Enter two numbers : ");
		res = gcdlcm(sc.nextInt(), sc.nextInt());
		System.out.println(" GCD = " + res[0] + " and LCM = " + res[1] + "\n");

		// finding the maximum element in an array of integers
		res = new int[2];
		System.out.println("\n // d) finding the maximum element " +
			"in an array of integers");
		System.out.print("\n Enter number of elements in the array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.print(" Enter array elements : ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println(" Maximum element = " + max(arr) + "\n");

		// printing the fibonacci series by getting terms based on their indices
		System.out.println("\n // b) printing the fibonacci series " +
			"by returning terms based on their indices");
		System.out.print("\n Enter the limit of the fibonacci series : ");
		n = sc.nextInt();
		System.out.print(" Fibonacci series upto " + n + "th term : ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
}