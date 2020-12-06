/* student challenge 7 - display the following patterns -
 *  a) 1				
 	   1 2			   
 	   1 2 3           
 	   1 2 3 4  		   
 	   1 2 4 4 5
 	
 * 	b) 01 02 03 04 05				
 	   06 07 08 09			   
 	   10 11 12           
 	   13 14  		   
 	   15        

 *	c) 5
 	   4 4 
 	   3 3 3
 	   2 2 2 2
 	   1 1 1 1 1
 */

 import java.util.Scanner;

 class SC7NumberPatterns
 {
 	public static void main(String[] args) 
 	{
 		Scanner scan = new Scanner(System.in);
		int n, i, j, count = 1;

		System.out.print("\n Enter the number of rows : ");
		n = scan.nextInt();
		System.out.println();

		// a)
		System.out.println(" Pattern a) : ");
		for (i = 1; i <= n; i++) {
			System.out.print("              ");
			for (j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		// b)
		System.out.println(" Pattern b) : ");
		for (i = 1; i <= n; i++) {
			System.out.print("              ");
			for (j = n; j >= i; j--) {
				System.out.format(" %02d", count++);
			}
			System.out.println();
		}

		// c)
		System.out.println(" Pattern c) : ");
		for (i = n; i >= 1; i--) {
			System.out.print("              ");
			for (j = n; j >= i; j--) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
 	}
 }