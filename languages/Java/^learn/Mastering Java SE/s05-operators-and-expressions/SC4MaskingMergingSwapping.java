/* student challenge 4 - 
 * a) store two numbers of size <= to a nibble (4 bits) into a byte type 
 * variable (8 bits) and retrieve those numbers using masking and merging 
 * b) swap two numbers without using a third variable using bitwise operators */

import java.lang.*;

public class SC4MaskingMergingSwapping 
{
	public static void main(String[] args) 
	{
		byte num1 = 12, num2 = 7, num;
		int a = 23, b = 69;

		System.out.println("\n num1 = " + num1 + " (" + 
			Integer.toBinaryString(num1) + ")" + "\n num2 = " + num2 + " (" +
			Integer.toBinaryString(num2) + ")");

		/* left shifting num1 by 4 bits and storing the result in num in order  
		 * to occupy the first 4 places from MSB */
		num = (byte)(num1 << 4); 
		// storing num2 in the last 4 bits of num using bit merging
		num = (byte)(num | num2);
		// displaying num
		System.out.println(" num = " + Integer.toBinaryString(num & 0b11111111));

		/* retrieving num1 and num2 from num using bit masking
		 * num1 = (num & 0b11110000) >> 4 
		 * num2 = num & 0b00001111 */
		System.out.println(" num1 = (" + Integer.toBinaryString(num & 0b11111111)
		 + " & 11110000) = " + Integer.toBinaryString(num & 0b11110000) 
		 + " >> 4 = " + Integer.toBinaryString((num & 0b11110000) >> 4) 
		 + " = " + ((num & 0b11110000) >> 4));
		System.out.println(" num2 = (" + Integer.toBinaryString(num & 0b11111111)
		 + " & 00001111) = " + Integer.toBinaryString(num & 0b00001111) 
		 + " = " + (num & 0b00001111) + "\n");

		// swapping a and b using bitwise XOR (^)
		// displaying original values
		System.out.println(" Original values      : a = " + a + " | b = " + b);
		System.out.println(" -------------------------------------- ");
		a = a ^ b;
		System.out.println(" Step 1 - 'a = a ^ b' : a = " + a + " | b = " + b);
		b = a ^ b;
		System.out.println(" Step 2 - 'b = a ^ b' : a = " + a + " | b = " + b);
		a = a ^ b;
		System.out.println(" Step 3 - 'a = a ^ b' : a = " + a + " | b = " + b);
		System.out.println(" -------------------------------------- ");
		// displaying swapped values
		System.out.println(" Final swapped values : a = " + a + " | b = " + b);
	}	
}