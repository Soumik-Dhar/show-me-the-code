/* practice program to list the sizes, min and max values of primitive data
 * types in Java using the corresponding Wrapper class methods BYTES, SIZE,
 * MIN_VALUE and MAX_VALUE */

import java.lang.*;

public class P1DataTypesSizeRange
{
	public static void main(String args[])
	{
		System.out.println("\n Sizes and range of primitive data types - ");
		System.out.println("\n Data Type |  Size  | Range");
		System.out.println("-----------|--------|-------");
		// size and range of byte
		System.out.println("  byte     | " + Byte.BYTES + " ("+ Byte.SIZE +")  | " 
			+ Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		// size and range of short
		System.out.println("  short    | " + Short.BYTES + " ("+ Short.SIZE +") | " 
			+ Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		// size and range of int
		System.out.println("  int      | " + Integer.BYTES + " ("+ Integer.SIZE +") | " 
			+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		// size and range of long
		System.out.println("  long     | " + Long.BYTES + " ("+ Long.SIZE +") | " 
			+ Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		// size and range of float
		System.out.println("  float    | " + Float.BYTES + " ("+ Float.SIZE +") | " 
			+ Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		// size and range of double
		System.out.println("  double   | " + Double.BYTES + " ("+ Double.SIZE +") | " 
			+ Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		// size and range of char
		System.out.println("  char     | " + Character.BYTES + " ("+ Character.SIZE +") | " 
			+ (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
		// size and range of boolean
		System.out.println("  boolean  | size is VM dependent and values are " + true 
			+ " and " + false);
	}
}