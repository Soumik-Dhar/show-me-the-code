/* student challenge 5 - 
 * a) display an AP series based on the first term (a), common difference (d)
 * 	  and number of terms (n)
 * b) display a GP series based on the first term (a), common ratio (r)
 * 	  and number of terms (n) */

import java.util.Scanner;

class SC5APGPSeries
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		int n, d, r;
		long a;

		// a) displaying an AP series from 'a', 'd' and 'n'
		System.out.print("\n Enter the number of terms of the AP series 'n' : ");
		n = reader.nextInt();
		System.out.print(" Enter the first term 'a': ");  
		a = reader.nextLong();
		System.out.print(" Enter the common difference 'd' : ");
		d = reader.nextInt();
		
		System.out.print("\n The resulting AP series is : ");
		for (int i = 1; i <= n; i++) {
			// formatting to remove extra comma at the end
			if (i == n)
				System.out.print(a + "\n");
			else
				System.out.print(a + ", ");
			a += d;
		}

		System.out.println();

		// b) displaying an AP series from 'a', 'r' and 'n'
		System.out.print("\n Enter the number of terms of the GP series 'n' : ");
		n = reader.nextInt();
		System.out.print(" Enter the first term 'a': ");  
		a = reader.nextLong();
		System.out.print(" Enter the common ratio 'r' : ");
		r = reader.nextInt();

		System.out.print("\n The resulting GP series is : ");
		for (int i = 1; i <= n; i++) {
			// formatting to remove extra comma at the end
			if (i == n)
				System.out.print(a + "\n");
			else
				System.out.print(a + ", ");
			a *= r;
		}
	}
}  