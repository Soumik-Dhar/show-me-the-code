/* practice program to read input from the keyboard using Scanner class 
 * imported from the java.util package
 * note: Use "javap" from the command line to get a quick reference of all 
 * fields and methods of any class or interface ("javap java.util.Scanner") */

import java.util.*;

public class P2ReadingFromKeyboard 
{
	public static void main(String args[]) 
	{
		// creating an instance of the Scanner class
		Scanner sc = new Scanner(System.in);

		// scanning integer using nextInt()
		System.out.print("\n Enter an integer value: ");
		int integerInput = sc.nextInt();
		System.out.println(" You have entered : " + integerInput);

		// scanning double using nextDouble()
		System.out.print("\n Enter a double value : ");
		double doubleInput = sc.nextDouble();
		System.out.println(" You have entered : " + doubleInput);

		// scanning byte using nextByte()
		System.out.print("\n Enter a byte value : ");
		short byteInput = sc.nextByte();
		System.out.println(" You have entered : " + byteInput);

		// scanning boolean using nextBoolean()
		System.out.print("\n Enter a boolean value : ");
		boolean booleanInput = sc.nextBoolean();
		System.out.println(" You have entered : " + booleanInput);

		// scanning string using next() and nextLine()
		System.out.print("\n Enter a string (word) : ");
		String nextInput = sc.next();
		System.out.println(" You have entered : " + nextInput);
		/* consuming the left-over newline since sc.nextFoo does not capture
		 * the new line after taking the input - resulting in sc.nextLine 
		 * receiving the "\n" character only*/
		sc.nextLine();
		System.out.print("\n Enter a string (line of text) : ");
		String nextLineInput = sc.nextLine();
		System.out.println(" You have entered : " + nextLineInput);

		// setting the input radix using useRadix()
		sc.useRadix(2);
		System.out.print("\n Enter a binary value: ");
		int binaryInput = sc.nextInt();
		System.out.println(" Integer decimal equivalent : " + binaryInput);

		sc.useRadix(16);
		System.out.print("\n Enter a hexadecimal value: ");
		short hexInput = sc.nextShort();
		System.out.println(" Short decimal equivalent : " + hexInput);

		// checking for valid type using hasNext() or hasNextFoo()
		System.out.print("\n Enter an integer or boolean value : ");
		System.out.print("\n Entered input is an integer : " + sc.hasNextInt());
		System.out.println("\n Entered input is a boolean : " + sc.hasNextBoolean());
	}
}