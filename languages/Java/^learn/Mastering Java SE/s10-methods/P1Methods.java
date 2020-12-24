/* practice program to demonstrate methods and parameter passing in Java */

import java.lang.*;

class P1Methods 
{
	// method to find the maximum of two numbers
	static int max(int x, int y) {
		// x and y are formal parameters
		return x > y ? x : y;
	}

	// method to modify the value of a variable of a primitive data type
	void inc(int a) {
		a++;
		System.out.println(" a = " + a + " [inside method inc()]");
	}

	// method to modify the value of a variable of a reference data type
	void sort(int A[]) {
		java.util.Arrays.sort(A);
		System.out.print("\n A[] = ");
		for (int n : A) {
			System.out.print(n + " ");
		}
		System.out.print(" [inside method inc()]");
	}

	public static void main(String[] args) 
	{
		// creating an object of class P1Methods to access non-static methods
		P1Methods obj = new P1Methods();

		int x = 5, y = 10;
		// x and y are actual parameters
		System.out.format("\n Maximum of %d and %d is = %d\n", x, y, max(x, y));

		// parameter passing in Java - strictly pass by value
		int a = 0;
		int A[] = {4, 2, 9, 0, 7};

		// passing primitive data types
		System.out.println("\n a = " + a + " [initially inside main()]");
		obj.inc(a);
		System.out.println(" a = " + a + " [outside method inc()]");

		// passing reference data types
		System.out.print("\n A[] = ");
		for (int n : A) {
			System.out.print(n + " ");
		}
		System.out.print(" [initially inside main()]");

		obj.sort(A);
		
		System.out.print("\n A[] = ");
		for (int n : A) {
			System.out.print(n + " ");
		}
		System.out.println(" [outside method inc()]");
	}
}