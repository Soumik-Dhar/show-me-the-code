/* student challenge 3 - 
 * a) remove special characters from a string
 * b) remove extra whitespaces from a string
 * c) find number of words in a string */

import java.util.Scanner;

class SC3RegExChallenge2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String inputString, result = "";

		System.out.print("\n Enter a string : ");
		inputString = sc.nextLine();
		
		// a)(1) removing special characters (including spaces) from inputString
		result = inputString.replaceAll("\\W","");
		// displaying result
		System.out.println("\n // removing special characters (including spaces)" 
			+ "\n Resulting string : " + result);

		// a)(2) removing special characters (excluding spaces) from inputString
		result = inputString.replaceAll("[^0-9a-zA-Z\\s]","");
		// displaying result
		System.out.println("\n // removing special characters (excluding spaces)" 
			+ "\n Resulting string : " + result);

		// b) removing extra whitespaces from inputString
		result = inputString.replaceAll("\\s+"," ").trim();
		// displaying result
		System.out.println("\n // removing extra whitespaces" 
			+ "\n Resulting string : " + result);

		// c) finding number of words in inputString
		System.out.print("\n // removing extra whitespaces and counting words"); 
		inputString = inputString.replaceAll("\\s{2,}"," ").trim();
		// splitting inputString into words based on spaces in-between
		String words[] = inputString.split("\\s");
		// displaying number of words
		System.out.println("\n Number of words = " + words.length);
		// printing extracted words
		// for(String word : words) {
		// 	System.out.println(" " + word);	
		// }
	}
}