/* student challenge 1 - list the code chart for ASCII characters
 * and other Unicode symbols like Greek and Bengali characters */

import java.lang.*;

public class SC1Unicode
{
	public static void main(String[] args) 
	{
		// ASCII character chart - a subset of Unicode (0-127)
		System.out.println("\n ASCII code chart (0-127) -");
		for (char symbol = 0; symbol < 128; symbol++)
			System.out.print(symbol + " | ");

		// Unicode chart for Greek
		System.out.println("\n\n Greek code chart (0370-03FF) -");
		for (char symbol = 0x0370; symbol < 0x03FF; symbol++)
			System.out.print(symbol + " | ");

		// Unicode chart for Bengali
		System.out.println("\n\n Bengali code chart (0980-09FF) -");
		for (char symbol = 0x0980; symbol < 0x09FF; symbol++)
			System.out.print(symbol + " | ");
	}
}