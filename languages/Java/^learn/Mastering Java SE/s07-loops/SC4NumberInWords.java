/* student challenge 4 - display a number in words (including trailing zeros) */

import java.util.Scanner;

class SC4NumberInWords
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		String num;
		char digit;

		System.out.print("\n Enter a number : ");
		num = reader.nextLine();

		if (num.length() < 0) 
			System.exit(1);

		System.out.print("\n " + num + " in words : ");

		for (int i = 0; i < num.length(); i++) {
			// extracting digits
			digit = num.charAt(i);
			// switching digit to find its corresponding word
			switch(digit) {
				case '0': System.out.print("zero ");
						  break;
				case '1': System.out.print("one ");
						  break;
				case '2': System.out.print("two ");
						  break;
				case '3': System.out.print("three ");
						  break;
				case '4': System.out.print("four ");
						  break;
				case '5': System.out.print("five ");
						  break;
				case '6': System.out.print("six ");
						  break;
				case '7': System.out.print("seven ");
						  break;
				case '8': System.out.print("eight ");
						  break;
				case '9': System.out.print("nine ");
						  break;
				default: System.out.print("NAN ");
			}
		}

		System.out.println();

		/* // displaying number in words using an array
		String numWords[] = {"zero ", "one ", "two ", "three ", "four ", "five ",
						   "six ", "seven ", "eight ", "nine "}; 
		for (int i = 0; i < num.length(); i++) {
			String ch = num.charAt(i) + "";
			int n = Integer.parseInt(ch);
			System.out.print(numWords[n]);
		} */
	}
}