/* practice program to demystify regular expressions in Java using
 * pattern matching, meta characters and quantifiers */

import java.util.Scanner;

class P4RegEx
{
	public static void main(String[] args) 
	{
		String str = "";

		/* pattern matching with specific characters using 
		 * '.', [abc], [^abc], [abc][xy], [a-b0-9], a|b, ab */
		System.out.println("\n /* pattern matching with specific characters " + 
			"using\n  * '.', [abc], [^abc], [abc][xy], [a-b0-9], a|b, ab */\n");

		System.out.println(" \"@\".matches(\".\") = " 
			+ "@".matches(".")); 
		System.out.println(" \"\".matches(\".\") = " 
			+ "".matches(".") + "\n"); 
		
		System.out.println(" \"b\".matches(\"[abc]\") = "
		 + "b".matches("[abc]"));
		System.out.println(" \"9\".matches(\"[abc]\") = "
		 + "9".matches("[abc]") + "\n");
		
		System.out.println(" \"z\".matches(\"[^abc]\") = "
		 + "z".matches("[^abc]"));
		System.out.println(" \"c\".matches(\"[^abc]\") = "
		 + "c".matches("[^abc]") + "\n");
		
		System.out.println(" \"ay\".matches(\"[abc][xy]\") = "
		 + "ay".matches("[abc][xy]"));
		System.out.println(" \"Ay\".matches(\"[abc][xy]\") = "
		 + "Ay".matches("[abc][xy]") + "\n");
		
		System.out.println(" \"X9\".matches(\"[a-bA-Z][0-9]\") = "
		 + "X9".matches("[a-bA-Z][0-9]"));
		System.out.println(" \"9x\".matches(\"[a-bA-Z][0-9]\") = "
		 + "9x".matches("[a-bA-Z][0-9]") + "\n");
		
		System.out.println(" \"a\".matches(\"a|b\") = "
		 + "a".matches("a|b"));
		System.out.println(" \"ab\".matches(\"a|b\") = "
		 + "ab".matches("a|b") + "\n");
		
		System.out.println(" \"ab\".matches(\"ab\") = "
		 + "ab".matches("ab"));
		System.out.println(" \"a\".matches(\"ab\") = "
		 + "a".matches("ab") + "\n");
				
		System.out.println(" ------------------------------");

		// meta characters \d, \D, \s, \S, \w, \W 
		System.out.println("\n // meta characters " + 
			"\\d, \\D, \\s, \\S, \\w, \\W\n");

		System.out.println(" \"7\".matches(\"\\d\") = "
		 + "7".matches("\\d"));
		System.out.println(" \"$\".matches(\"\\d\") = "
		 + "$".matches("\\d") + "\n");
		
		System.out.println(" \"F\".matches(\"\\D\") = "
		 + "F".matches("\\D"));
		System.out.println(" \"5\".matches(\"\\D\") = "
		 + "5".matches("\\D") + "\n");

		System.out.println(" \" \".matches(\"\\s\") = "
		 + " ".matches("\\s"));
		System.out.println(" \"*\".matches(\"\\s\") = "
		 + "*".matches("\\s") + "\n");
		
		System.out.println(" \"@\".matches(\"\\S\") = "
		 + "@".matches("\\S"));
		System.out.println(" \" \".matches(\"\\S\") = "
		 + " ".matches("\\S") + "\n");
		
		System.out.println(" \"x\".matches(\"\\w\") = "
		 + "x".matches("\\w"));
		System.out.println(" \"%\".matches(\"\\w\") = "
		 + "%".matches("\\w") + "\n");
		
		System.out.println(" \"&\".matches(\"\\W\") = "
		 + "&".matches("\\W"));
		System.out.println(" \"3\".matches(\"\\W\") = "
		 + "3".matches("\\W") + "\n");

		System.out.println(" ------------------------------");

		// quantifiers *, +, ?, {X}, {X,Y}, {X,}
		System.out.println("\n // quantifiers *, +, ?, {X}, {X,Y}, {X,}\n");

		
	}
}