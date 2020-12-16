/* student challenge 1 - 
 * a) find the sum of all elements in an array
 * b) search for an element in an array (if duplicates exist, find the first index) */

import java.util.Scanner;

class SC1SumAndSearch
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		int sum = 0, n, key, index = -1;

		// taking number of array elements as input
		System.out.print("\n Enter number of array elements (n) : ");
		n = reader.nextInt();
		int arr[] = new int[n];
		// taking array elements as input
		System.out.print("\n Enter array elements (separated by space) : ");
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		// displaying entered array
		System.out.print("\n Array entered : ");
		for (int x : arr) {
			System.out.print(x + " ");
			// finding sum of all elements
			sum += x;
		}
		System.out.println();
		
		// displaying sum
		System.out.println("\n Sum of all elements : " + sum);
		
		// taking search key as input
		System.out.print("\n Enter search key : ");
		key = reader.nextInt();
		
		// traversing the array to search for key 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			} 
		}
		if (index == -1) 
			System.out.println("\n Key " + key + " NOT found!");
		else 
			System.out.format("\n Key %d is found at position %d (index %d)\n",
				key, (index + 1), index);

		/* // traversing the array to search for key using System.exit(0)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.format("\n Key %d is found at position %d (index %d)\n",
					key, (i + 1), i);
				System.exit(0);
			}
		}
		System.out.println("\n Key " + key + " NOT found!"); */
	}
}