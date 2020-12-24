/* practice program to demonstrate variable arguments (varargs) in Java */

import java.lang.*;

class P3VarArgs
{
	// method to print a list of names starting from a given ID
	static void dispNames(int id, String ...names) {
		if(names.length > 0) {
			System.out.println("\n  ID  | NAMES");
			System.out.println(" -----|------");
			for (String name : names) {
				System.out.format(" %04d | %s\n", id++, name);	
			}
		} else
			System.out.println("\n No names to display!");
	}

	public static void main(String ...args) 
	{
		String arr[] = {"Soumik", "Rahul", "Richik", "Ankit", "Gaurav", "Arjya"};
		
		System.out.println("\n // dispNames(23)");
		dispNames(23);

		System.out.println("\n\n // dispNames(1069, " 
			+"\"Sounak\", \"Arindam\", \"Swarnendu\")");
		dispNames(1069, "Sounak", "Arindam", "Swarnendu");

		System.out.println("\n\n // dispNames(1, arr)");
		dispNames(1, arr);

		System.out.println("\n // dispNames(537, " +
			"new String[]{\"Rajdip\", \"Pritesh\", \"Sayantan\", \"Avranil\"})");
		dispNames(537, new String[]{"Rajdip", "Pritesh", "Sayantan", "Avranil"});
	}
}