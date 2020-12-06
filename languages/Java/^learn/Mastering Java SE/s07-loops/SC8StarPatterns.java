/* student challenge 8 - display the following patterns -
 *  a)         *
       	     * *
 		   * * *
 		 * * * *
       * * * * *

 * 	b) * * * * *
         * * * *
           * * *
             * *
       		   *
 	   
 *	c) 		   *
       	     * * *
 		   * * * * *
 		 * * * * * * *
       * * * * * * * * *
         * * * * * * *
           * * * * *
             * * *
       		   *
 */

 import java.util.Scanner;

 class SC8StarPatterns
 {
 	public static void main(String[] args) 
 	{
 		Scanner scan = new Scanner(System.in);
		int n, i, j, k;

		System.out.print("\n Enter the number of rows : ");
		n = scan.nextInt();
		System.out.println();

		// a)
		System.out.println(" Pattern a) : ");
		for (i = 1; i <= n; i++) {
			System.out.print("              ");
			for (j = 1; j <= n; j++)
			{
				if ((i+j) > n)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		// b)
		System.out.println(" Pattern b) : ");
		for (i = 1; i <= n; i++) {
			System.out.print("              ");
			for (j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (j = n; j >= i; j--) {
				System.out.print(" *");
			}
			/* // without using third loop
			for (j = 1; j <= n; j++) {
				if (j >= i) 
					System.out.print(" *");
				else
					System.out.print("  ");				
			} */
			System.out.println();
		}

		// c)
		System.out.print("\n Enter the number of rows : ");
		n = scan.nextInt();
		System.out.println();

		System.out.println(" Pattern c) : ");
		for (i = 1; i <= (n / 2); i++) {
			System.out.print("              ");
			// printing top pyramid
			for (j = i; j < (n / 2); j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			for (j = 1; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (i = 1; i <= (n / 2 - 1); i++) {
			System.out.print("              ");
			// printing bottom pyramid
			for (j = 1; j <= (n / 2 - 1); j++) {
				if (j > i) 
					System.out.print(" *");
				else 
					System.out.print("  ");
			}
			for (j = i; j <= (n / 2 - 1); j++) {
				System.out.print(" *");
			}
			System.out.println();
		}	
 	}
 }