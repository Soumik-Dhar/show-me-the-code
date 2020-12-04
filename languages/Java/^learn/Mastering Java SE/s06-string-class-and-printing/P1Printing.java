/* practice program to demonstrate -
 * a) various methods of printing - print(), println(), printf() and format() 
 * b) format specifiers used in printf() and format() methods */

import java.lang.*;

class P1Printing 
{
	public static void main(String[] args) 
	{
		int a = 23;
		float b = 3.14f;
		
		// printing using print(), println(), printf() and format()
		System.out.println("\n Methods of printing - ");
		System.out.print(" print() : " + a + " x " + b + " = " + (a * b) + "\n");
		System.out.println(" println() : " + a + " x " + b + " = " + (a * b));
		System.out.printf(" printf() : %d x %f = %f\n", a, b, (a * b));
		System.out.format(" format() : %d x %f = %f\n", a, b, (a * b));

		// format specifiers 
		System.out.println("\n Format specifiers for printf() and format() -\n" 
			+ " '%[argument-index][flags][width][precision]identifier'");

		int x = 10, y = -23;
		float z = 692.145f;
		char ch = '@';
		String str = "Hello World!";

		// argument index
		System.out.printf("\n [argument-index] : " + 
			"%3$f (3$f) x %1$d (1$d) x %1$d (1$d) " + 
			"/ 2 x %2$d (2$d) = %4$f (4$f)\n", x, y, z, (z * x * x / 2 * y));

		// flags
		System.out.printf("\n [flags] : x = %5d (5d)", x);
		System.out.printf("\n           y = %+05d (+05d)", y);
		System.out.format("\n           -z = %(6.3f ((6.3f)", -z);
		System.out.format("\n           str = %20s (20s)", str);		
		System.out.format("\n           str = %-20s (-20s)\n", str);

		// width and precision
		System.out.printf("\n [width] : z = %6f (6f)", z);
		System.out.printf("\n           z = %012f (012f)\n", z);
		System.out.format("\n [precision] : z = %6.3f (6.3f)", z);
		System.out.format("\n               z = %012.2f (012.2f)\n", z);

		// identifiers
		System.out.printf("\n identifiers : x = '%1$d' in decimal(d), " +
			"'%1$o' in octal(o) and '%1$x' in hexadecimal(x)", x);
		System.out.printf("\n               z = '%1$f' (f) = '%1$e (e) and '%1$g (g)'", z);
		System.out.format("\n               ch = '%c' (c) and str = '%s' (s)\n", ch, str);
		
	}	
}