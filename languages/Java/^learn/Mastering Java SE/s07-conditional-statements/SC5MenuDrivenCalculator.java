/* student challenge 5 - create a menu driven calculator to perform the 
 * addition, subtraction, multiplication and division of two numbers */

import java.util.Scanner;

class SC5MenuDrivenCalculator 
{
	public static void main(String[] args) 
 	{
 		Scanner scan = new Scanner(System.in);

 		char choice;
 		int a, b;

 		// looping all operations till user chooses to exit
	 	do {
	 		// displaying the menu
	 		System.out.println("\n MENU DRIVEN CALCULATOR");	
	 		System.out.println(" ======================");	
	 		System.out.println(" 1. ADD (press +)");	
	 		System.out.println(" 2. SUBTRACT (press -)");	
	 		System.out.println(" 3. MULTIPLY (press x)");	
	 		System.out.println(" 4. DIVIDE (press /)");	

	 		// taking operator as input from the user
	 		System.out.print("\n Enter your choice (+, -, x, /) : ");
	 		choice = scan.next().charAt(0);
	 		// taking operands as input from the user
	 		System.out.print("\n Enter two numbers 'a' and 'b' : ");
	 		a = scan.nextInt();
	 		b = scan.nextInt();

	 		// switching choice
	 		switch(choice) {
	 			case '+': System.out.format("\n %d + %d = %d\n", a, b, (a+b));
	 					  break;
	 			case '-': System.out.format("\n %d - %d = %d\n", a, b, (a-b));
	 					  break;
	 			case 'x': System.out.format("\n %d x %d = %d\n", a, b, (a*b));
	 					  break;
	 			case '/': if (b == 0) {
	 					  	System.out.format("\n %d cannot be zero!\n", b);
	 					  	break;
	 					  }
	 					  System.out.format("\n %d / %d = %d(Q) %d(R)\n",
	 			 		  a, b, (a/b), (a%b));
	 					  break;
	 			default: System.out.println("\n Invalid choice! Please try again!");
	 		}	 
	 		// taking user input to continue operations or exit
	 		System.out.print("\n Do you wish to continue (y/n) : ");
	 		choice = scan.next().charAt(0);			
 		} 
 		while (choice == 'y' || choice == 'Y');
 	}
 }