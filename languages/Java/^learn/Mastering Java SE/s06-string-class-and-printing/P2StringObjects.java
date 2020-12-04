/* practice program to declare and use objects of String class
 * and illustrate how they are stored in memory (pool, stack and heap) */

import java.lang.*;

class P2StringObjects 
{
	public static void main(String[] args) 
	{
		char c[] = {'A','B','C','D','E'};
		byte b[] = {65, 66, 67, 68, 69};

		// String ref = "string-literal"
		String stringObject1 = "ABCDE";
		System.out.println("\n  stringObject1 = " + stringObject1 
			+ "	 // String ref = \"ABCDE\"");

		// String ref = new String(char[])
		String stringObject2 = new String(c, 0, 3);
		System.out.println("  stringObject2 = " + stringObject2 
			+ "	 // String ref = new String({'A','B','C','D','E'}, 0, 3)");

		// String ref = new String(byte[])
		String stringObject3 = new String(b, 3, 2);
		System.out.println("  stringObject3 = " + stringObject3 
			+ "	 // String ref = new String({65, 66, 67, 68, 69}, 3, 2)");

		// String ref = new String("string-literal")
		String stringObject4 = new String("ABCDE");
		System.out.println("  stringObject4 = " + stringObject4 
			+ "	 // String ref = new String(\"ABCDE\")");

		// storing string objects in memory (pool, stack and heap)
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = new String("Java");

		// displaying address comparison results
		System.out.println("\n /* String str1 = \"Java\";"
			+ "\n  * String str2 = \"Java\";" 
			+ "\n  * String str3 = new String(\"Java\");"
			+ "\n  * String str4 = new String(\"Java\"); */\n");
		System.out.println(" (str1 == str2) = " + (str1 == str2));
		System.out.println(" (str2 == str3) = " + (str2 == str3));
		System.out.println(" (str3 == str4) = " + (str3 == str4));		
	}	
}