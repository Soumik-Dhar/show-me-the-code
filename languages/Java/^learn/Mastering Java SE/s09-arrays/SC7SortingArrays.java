/* student challenge 7 - 
 * a) sort an array of integers using bubble sort
 * b) sort an array fo String objects using sort()*/

import java.util.*;

class SC7SortingArrays
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		int n;

		// a) sorting an array of integers using bubble sort
		System.out.println("\n // a) sorting an array of integers using bubble sort");
		System.out.print("\n Enter the number of array elements : ");
		n = reader.nextInt();

		int arr[] = new int[n];

		System.out.print(" Enter array elements (separated by space) : ");
		for (int i = 0; i < n; i++)
			arr[i] = reader.nextInt();

		// displaying original array
		System.out.print("\n Original array :");
		for (int x : arr) 
			System.out.print(" " + x);

		System.out.println();

		// bubble sorting the array
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// displaying sorted array
		System.out.print("\n Sorted array :");
		for (int x : arr) 
			System.out.print(" " + x);

		System.out.println("\n"); 

		// b) sorting an array of String objects using sort()
		System.out.println("\n // b) sorting an array of String objects using sort()");
		System.out.print("\n Enter the number of array elements : ");
		n = reader.nextInt();

		String str[] = new String[n];

		System.out.print(" Enter array elements (separated by space) : ");
		for (int i = 0; i < n; i++)
			str[i] = reader.next();

		// displaying original array
		System.out.print("\n Original array :");
		for (String x : str) 
			System.out.print(" " + x);
	
		System.out.println(); 
	
		// sorting the array using sort() method of Arrays class
		// java.util.Arrays.sort(str);
		Arrays.sort(str);

		// displaying sorted array
		System.out.print("\n Sorted array :");
		for (String x : str) 
			System.out.print(" " + x);

		System.out.println(); 
	}
}