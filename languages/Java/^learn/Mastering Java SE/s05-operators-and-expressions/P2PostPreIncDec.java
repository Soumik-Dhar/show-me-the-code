/* practice program to demonstrate pre and post increment and decrement 
 * operations (++x, x++, --x and x--) on integral, floating and character
 * data types */

import java.lang.*;

class P2PostPreIncDec
{
	public static void main(String[] args) 
	{
		short x = 5;
		int y = 0, z = 0;
		float f = 22f/7;
		char c = 'S';

		// pre and post increment and decrement operations on integral values
		System.out.println("\n // increment and decrement operations on integral types ");
		System.out.println(" Original values of x, y and z are : " + 
			"\n x = " + x + " | y = " + y + " | z = " + z);

		y = x++ + --x;
		System.out.println("\n Values of x, y and z after 'y = x++ + --x' are : "
			+ "\n x = " + x + " | y = " + y + " | z = " + z);
		z = y++ + ++x - --z;		
		System.out.println("\n Values of x, y and z after 'z = y++ + ++x - --z' are : "
			+ "\n x = " + x + " | y = " + y + " | z = " + z);

		// pre incrementing and post decrementing a floating point value
		System.out.println("\n --------------------\n" 
			+ "\n // increment and decrement operations on floating types ");
		System.out.println("\n Original value = " + f);
		System.out.println("\n Pre incrementing " + f + " = " + ++f);
		System.out.println("\n Post decrementing " + f + " = " + f--);
		System.out.println("\n Final value = " + f);

		// pre incrementing and pre and post decrementing a character
		System.out.println("\n --------------------\n" 
			+ "\n // increment and decrement operations on character types ");
		System.out.println("\n Original character = " + c);
		System.out.println("\n Pre incrementing " + c + " = " + ++c);
		System.out.println("\n Pre decrementing " + c + " = " + --c);	
		System.out.println("\n Post decrementing " + c + " = " + c--);	
		System.out.println("\n Final value = " + c);
	}	
}