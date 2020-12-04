/* practice program to demonstrate switch statement in Java */

import java.util.Scanner;

public class P2SwitchStatement
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		String input, size;

		// getting the size of a t-shirt (in inches) using if-else-if ladder
		System.out.println("\n // getting the size of a t-shirt (in inches) "
			+ "using if-else-if ladder");

		System.out.print("\n Enter t-shirt size (xs, s, m, l, xl) : ");
		input = reader.next();

		// all the conditions are checked until a match is found
		if (input.equalsIgnoreCase("xs")) 
			size = "34 inches (extra small)";
		else if (input.equalsIgnoreCase("s")) 
			size = "36 inches (small)";
		else if (input.equalsIgnoreCase("m")) 
			size = "38 inches (medium)";
		else if (input.equalsIgnoreCase("l")) 
			size = "40 inches (large)";
		else if (input.equalsIgnoreCase("xl")) 
			size = "42 inches (extra large)";
		else 
			size = "Invalid size entered!";
		System.out.println(" " + input + " -> " + size);

		System.out.println();

		// getting the size of a t-shirt (in inches) using switch statement
		System.out.println("\n // getting the size of a t-shirt (in inches) "
			+ "using switch statement");

		System.out.print("\n Enter t-shirt size (xs, s, m, l, xl) : ");
		input = reader.next();

		// control flows directly to the matching condition and ignores the rest
		switch(input) {
			case "xs": size = "34 inches (extra small)";
					   break;
			case "s": size = "36 inches (small)";
					   break;
			case "m": size = "38 inches (medium)";
					   break;
			case "l": size = "40 inches (large)";
					   break;
			case "xl": size = "42 inches (extra large)";
					   break;
			default: size = "Invalid size entered!";
		}
		System.out.println(" " + input + " -> " + size);
	}
}