/* practice program to demonstrate widening (upcasting a.k.a implicit type
 * casting) and narrowing (downcasting a.k.a explicit type casting) */

import java.lang.*;

public class P4WideningNarrowing 
{
	public static void main(String[] args) 
	{
		byte b = 10;
		short s = 382;
		int i = 0;
		long l = 65535L;
		float f = 3.14F;
		double d = 27.6894;
		char c = '%';

		// widening (upcasting)
		System.out.println("\n Widening\n --------");
		// byte to short
		System.out.println("\n byte b = " + b + "\n short s = " + s);
		s = b;
		System.out.println(" widening byte to short : s = b = " + s);
		// long to double
		System.out.println("\n long l = " + l + "\n double d = " + d);
		d = l;
		System.out.println(" widening long to double : d = l = " + d);
		// char to int
		System.out.println("\n char c = " + c + "\n int i = " + i);
		i = c;
		System.out.println(" widening char to int : i = c = " + i);

		// narrowing (downcasting)
		System.out.println("\n Narrowing\n ---------");
		// int to short
		i = 69238701;
		System.out.println("\n int i = " + i + "\n short s = " + s);
		s = (short)i;
		System.out.println(" narrowing int to short : s = (short)i = " + s);
		// float to long
		System.out.println("\n float f = " + f + "\n long l = " + l);
		l = (long)f;
		System.out.println(" narrowing float to long : l = (long)f = " + l);
		// int to char
		i = 65;
		System.out.println("\n int i = " + i + "\n char c = " + c);
		c = (char)i;
		System.out.println(" narrowing int to char : c = (char)i = " + c);
	}	
}