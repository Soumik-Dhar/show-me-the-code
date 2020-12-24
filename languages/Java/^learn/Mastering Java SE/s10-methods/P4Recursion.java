/* practice program to demonstrate recursion in Java */

import java.util.*;

class P4Recursion
{
	// recursive method with statements before recursive call 
	void func1(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			// recursive method call
			func1(n - 1);
		}
	}

	// recursive method with statements after recursive call
	void func2(int n) {
		if (n > 0) {
			// recursive method call
			func2(n - 1);
			System.out.print(n + " ");
		}
	}

	// recursive method to return nth fibonacci term
	static int fib(int n) {
		if (n < 2) 
			return n;
		return (fib(n - 1) + fib(n - 2));
	}

	public static void main(String[] args) 
	{
		// creating an object of class P4Recursion to access non-static methods
		P4Recursion obj = new P4Recursion();
		int n = 5;
		// recursive function func1() with statements before recursive call
		System.out.println("\n // recursive function func1() " +
			"with statements before recursive call\n // n = 5");		
		System.out.println("\n void func1(int n) {\n  if (n > 0) {" + 
			"\n    System.out.print(n + \" \");\n    // recursive method call" + 
			"\n    func1(n - 1);\n  }\n }");
		System.out.print("\n Output = ");		
		obj.func1(n);

		System.out.println("\n\n -------------------------");		

		// recursive function func2() with statements after recursive call
		System.out.println("\n // recursive function func2() " +
			"with statements after recursive call\n // n = 5");		
		System.out.println("\n void func2(int n) {\n  if (n > 0) {" + 
			"\n    // recursive method call\n    func2(n - 1);" + 
			"\n    System.out.print(n + \" \");\n  }\n }");
		System.out.print("\n Output = ");		
		obj.func2(n);		

		System.out.println("\n\n -------------------------");		

		// printing the fibonacci series using recursion
		System.out.println("\n // printing the fibonacci series using recursion");
		Scanner reader = new Scanner(System.in);
		System.out.print("\n Enter the limit of the fibonacci series : ");	
		n = reader.nextInt();
		System.out.print("\n Fibonacci series : ");			
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}	

		System.out.println();	
	}
}