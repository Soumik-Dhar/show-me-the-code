/* practice program to illustrate arithmetic operator precedence and implicit 
 * type casting (coercion) between different primitive data types (except 
 * boolean which does not work with arithmetic operators) */

import java.lang.*;

public class P1ArithmeticOperators
{
	public static void main(String[] args) 
	{
		byte byteNum = 10;
		short shortNum = 5;
		int intNum = -25;
		long longNum = 100L;
		float floatNum = 72.812F;
		double doubleNum = 23.69;
		char charNum = 72;
		char symbol = '$';

		// coercion from byte, short and int to int type
		int intResult = byteNum + shortNum;
		System.out.println("\n // byte, short and int coerced to int type");	
		System.out.println(" " + byteNum + " (byte) + " + shortNum + " (short) = "
			+ intResult + " (int)");				

		// coercion from int to long type
		long longResult = intNum - longNum;
		System.out.println("\n // int and long coerced to long type");	
		System.out.println(" " + intNum + " (int) - " + longNum + " (long) = "
			+ longResult + " (long)");	

		// coercion from integral types to float type
		float floatResult = floatNum % longNum + intNum * 22F / 7; 
		System.out.println("\n // integral types and float coerced to float type");	
		System.out.println(" " + floatNum + " (floatNum) % " + longNum + " (long) + "
			+ intNum + " (int) * 22F / 7 = " + floatResult + "(float)");		

		// coercion from integral and float types to double type
		double doubleResult = longNum / doubleNum - floatNum;
		System.out.println("\n // integral and float types coerced to double type");	
		System.out.println(" " + longNum + " (long) / " + doubleNum + " (double) * "
			+ floatNum + " (float) = " + doubleResult + "(double)");

		// coercion from char to int type and vice-versa
		int charToInt = charNum + symbol;
		System.out.println("\n // char coerced to int type and vice-versa");
		System.out.println(" " + charNum + "(ASCII stored from int to char) + " 
			+ symbol + "(char) = " + charToInt + "(int)");
	}
}