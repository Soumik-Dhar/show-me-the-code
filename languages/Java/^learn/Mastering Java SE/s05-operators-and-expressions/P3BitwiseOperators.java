/* practice program to illustrate bitwise operations using  
 * bitwise AND (&), OR (|), XOR (^), NOT (!), left shift (<<), 
 * right shift (>>) and unsigned right shift (>>>) */

import java.lang.*;

public class P3BitwiseOperators 
{
	public static void main(String[] args) 
	{
		byte num1 = 0b1010;
		short num2 = 0b0110;
		int num3 = 27583, num4 = -127, num5 = 10, num6 = 23, num = -69;

		// bitwise AND (num1 & num2)
		System.out.println("\n Bitwise AND : " + num1 + " (" + 
			Integer.toBinaryString(num1) + ") & " + num2 + " (" + 
			Integer.toBinaryString(num2) + ") = " + (num1 & num2) + " (" +
			Integer.toBinaryString(num1 & num2) + ")");

		// bitwise OR (num1 | num2)
		System.out.println("\n Bitwise OR : " + num1 + " (" + 
			Integer.toBinaryString(num1) + ") | " + num2 + " (" + 
			Integer.toBinaryString(num2) + ") = " + (num1 | num2) + " (" +
			Integer.toBinaryString(num1 | num2) + ")");

		// bitwise XOR (num1 ^ num2)
		System.out.println("\n Bitwise XOR : " + num1 + " (" + 
			Integer.toBinaryString(num1) + ") ^ " + num2 + " (" + 
			Integer.toBinaryString(num2) + ") = " + (num1 ^ num2) + " (" +
			Integer.toBinaryString(num1 ^ num2) + ")");

		// bitwise NOT (~num)
		System.out.print("\n Bitwise NOT : ~ " + num3 + " (" + 
			Integer.toBinaryString(num3) + ") = " + ~num3 + " (" +
			Integer.toBinaryString(~num3) + ")");
		System.out.println("\n             : ~ " + num4 + " (" + 
			Integer.toBinaryString(num4) + ") = " + ~num4 + " (" +
			Integer.toBinaryString(~num4) + ")");

		// left shift (num << n = num x 2 ^ n)
		System.out.print("\n Left shift : " + num5 + " (" + 
			Integer.toBinaryString(num5) + ") << 1 = " + (num5 << 1 ) 
			+ " (" + Integer.toBinaryString(num5 << 1) + ") [ "
			+ num5 + " x 2 ^ 1 = " + (num5 << 1) + " ]");
		System.out.println("\n            : " + num6 + " (" + 
			Integer.toBinaryString(num6) + ") << 5 = " + (num6 << 5 ) 
			+ " (" + Integer.toBinaryString(num6 << 5) + ") [ "
			+ num6 + " x 2 ^ 5 = " + (num6 << 5) + " ]");

		// right shift (num >> n = num / 2 ^ n)
		System.out.print("\n Right shift : " + num5 + " (" + 
			Integer.toBinaryString(num5) + ") >> 1 = " + (num5 >> 1 ) 
			+ " (" + Integer.toBinaryString(num5 >> 1) + ") [ "
			+ num5 + " / 2 ^ 1 = " + (num5 >> 1) + " ]");
		System.out.println("\n             : " + num6 + " (" + 
			Integer.toBinaryString(num6) + ") >> 5 = " + (num6 >> 5 ) 
			+ " (" + Integer.toBinaryString(num6 >> 5) + ") [ "
			+ num6 + " / 2 ^ 5 = " + (num6 >> 5) + " ]");

		// unsigned right shift 
		System.out.print("\n Unsigned right shift : " + num + " (" + 
			Integer.toBinaryString(num) + ") >>> 3 = " + (num >>> 3) + " (" + 
			String.format("%32s", Integer.toBinaryString(num >>> 3)) + ")\n");
	}	
}