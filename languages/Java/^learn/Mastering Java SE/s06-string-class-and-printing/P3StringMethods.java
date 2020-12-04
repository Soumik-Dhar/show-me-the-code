/* practice program to demonstrate commonly used methods of the String class - 
 * length(), isEmpty(), trim(), charAt(), toUpperCase(), toLowerCase(),   
 * substring(), replace(), startsWith(), endsWith(), indexOf(), lastIndexOf(),
 * contains(), concat(), valueOf(), equals(), equalsIgnoreCase(), 
 * compareTo(), compareToIgnoreCase() */

import java.lang.*;

class P3StringMethods 
{
	public static void main(String[] args) 
	{
		String str = "    Mr. Benedict Timothy Carlton Cumberbatch  ";
		System.out.println("\n Original String str = \"" + str + "\"");
		
		// str.length()
		System.out.println("\n str.length() = " + str.length());

		// str.isEmpty()
		System.out.println("\n str.isEmpty() = " + str.isEmpty());
		
		// str.trim()
		System.out.println("\n str.trim() = " + str.trim());
		System.out.println(" str.length() = " + str.length()
			+ " // String objects are immutable");

		System.out.println("\n str = str.trim() " 
			+ " // trimming leading and trailing spaces");
		str = str.trim();

		// str.charAt(index)
		System.out.println("\n str.charAt(23) = " 
			+ str.charAt(23));

		// str.toUpperCase()
		System.out.println("\n str.toUpperCase() = " 
			+ str.toUpperCase());
		// str.toLowerCase()
		System.out.println(" str.toLowerCase() = " 
			+ str.toLowerCase());
		
		// str.substring(start-index)
		System.out.println("\n str.substring(7) = " 
			+ str.substring(7));
		// str.substring(start-index, end-index)
		System.out.println(" str.substring(10, 20) = " 
			+ str.substring(10, 20));
		
		// str.replace(old-character, new-character)
		System.out.println("\n str.replace('e', '#') = " 
			+ str.replace('e', '#'));
		
		// str.startsWith(string)
		System.out.println("\n str.startsWith(\"Mr\") = " 
			+ str.startsWith("Mr"));
		// str.startsWith(string, index)
		System.out.println(" str.startsWith(\"Tim\", 3) = " 
			+ str.startsWith("Tim", 3));
		// str.endsWith(string)
		System.out.println(" str.endsWith(\"batch\") = " 
			+ str.endsWith("batch"));

		// str.indexOf(character or string)
		System.out.println("\n str.indexOf('i') = " 
			+ str.indexOf('i'));
		// str.indexOf(character or string, index)
		System.out.println(" str.indexOf('i', 10) = " 
			+ str.indexOf('i', 10));
		// str.lastIndexOf(character or string)
		System.out.println(" str.lastIndexOf(\"ton\") = " 
			+ str.lastIndexOf("ton"));
		// str.lastIndexOf(character or string, index)
		System.out.println(" str.lastIndexOf('C', 25) = " 
			+ str.lastIndexOf('C', 25));

		// using indexOf to check for occurance of a substring 
		if (str.indexOf("Carl") > 0)
			System.out.println("\n \"Carl\" exists in str " 
				+ "(index = " + str.indexOf("Carl") + ")"); 
		if (str.indexOf("Cucumber") < 0)
			System.out.println(" \"Cucumber\" does not exist in str " 
				+ "(index = " + str.indexOf("Cucumber") + ")");	

		// str.contains(charSequence)
		System.out.println("\n str.contains(\"Tim\") = " 
			+ str.contains("Tim"));
	
		// str.concat(string)
		System.out.println("\n str.concat(\" is a fine actor\") = " 
			+ str.concat(" is a fine actor"));	
		// concatenation using '+' operator
		System.out.println(" str + \" is a fine actor\" = " 
			+ str + " is a fine actor");

		// str.valueOf()
		System.out.println("\n String.valueOf(23.6912f) (float type) = " 
			+ String.valueOf(23.6912f) + " (String)");	

		String str1 = "Hello World!";
		String str2 = "hello world!";
		String str3 = new String("Hello World!");

		System.out.format("\n /* String str1 = \"%s\"\n  * String str2 = \"%s\""
			+ "\n  * String str3 = new String(\"%s\") */\n", str1, str2, str3);

		// equals(), equalsIgnoreCase(), compareTo() and compareToIgnoreCase()
		System.out.println("\n str1.equals(str2) = " 
			+ str1.equals(str2));
		System.out.println(" str1.equalsIgnoreCase(str2) = " 
			+ str1.equalsIgnoreCase(str2));
		System.out.println(" str1.compareTo(str2) = " 
			+ str1.compareTo(str2));
		System.out.println(" str1.compareToIgnoreCase(str2) = " 
			+ str1.compareToIgnoreCase(str2));

		// difference between '==' and 'equals()'
		System.out.println("\n (str1 == str3) = " + (str1 == str3));
		System.out.println(" str1.equals(str3) = " + str1.equals(str3));
	}
}
