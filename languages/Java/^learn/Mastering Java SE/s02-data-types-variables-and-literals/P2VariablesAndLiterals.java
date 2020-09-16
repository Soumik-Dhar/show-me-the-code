/* practice program to illustrate use of variables and literals and their 
 * different data types; representation of decimal numbers in binary, octal 
 * and hexadecimal form; precision of float and double data types*/

import java.lang.*;

public class P2VariablesAndLiterals 
{
	public static void main(String[] args) 
	{
		/* decimal, binary, octal and hexadecimal numbers respresented using 
		 * the integral data types - byte, short, int and long */
		byte decimalValue = 123;
		short binaryValue = 0b1111011;
		int octalValue = 0173;
		long hexValue = 0x7B;
		System.out.println("\n Decimal value 123 stored as = " + decimalValue);
		System.out.println(" Binary value 0b1111011 stored as = " + binaryValue);
		System.out.println(" Octal value 0173 stored as = " + octalValue);
		System.out.println(" Hexadecimal value 0x7B stored as = " + hexValue);

		/* byte, short and int support int type literals while long literals 
		 * should have an 'l' or 'L' at the end */
		long maxIntLiteral = 2147483647; // maximum value of integer		
		long longLiteral = 99999999999L;
		System.out.println("\n Maximum value of integer literal assigned to a" + 
			" long type variable = " + maxIntLiteral);
		System.out.println(" Literal of long type = " + longLiteral);

		// signed numbers are stored in memory using two's complement notation
		int signedNumber = -65123;
		System.out.println("\n Signed integer " + signedNumber + 
			" is stored in memory as " + Integer.toBinaryString(signedNumber));

		/* 'F' or 'f' for float type literals and 'D' or 'd' for double type 
		 * literals; by default, all fractional numbers are of double type */
		// preventing lossy conversion from double to float by adding an 'F'
		float floatTypeNumber = 12562.89F;
		// precision of float and double type tested using value of PI
		float floatPI = (float)Math.PI;
		double doublePI = (double)Math.PI;
		System.out.println("\n Value of PI using float type = " + floatPI);
		System.out.println(" Value of PI using double type = " + doublePI);

		// boolean literals are either 'true' or 'false'
		boolean booleanLiteral = true;
		System.out.println("\n Boolean literals are '" + booleanLiteral + "' and '"
			+ !booleanLiteral + "'");

		// character and string literals
		char charLiteral = '$';
		String stringLiteral = "Soumik Dhar";
		System.out.println("\n Character literal = '" + charLiteral + "'");
		System.out.println(" String literal = " + stringLiteral);
	}
}
