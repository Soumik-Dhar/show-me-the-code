/* student challenge 2 - 
 * a) find the largest element in an array
 * b) find the second largest element in an array */

import java.util.*;

class SC2SecondLargestElement
{
	public static void main(String args[])
	{ 
		Scanner reader = new Scanner(System.in);

		int n, max, firstLargest, secondLargest, temp; 

		// taking number of array elements as input
		System.out.print("\n Enter number of array elements (n) : ");
		n = reader.nextInt();
		int arr[] = new int[n]; 

		// taking array elements as input
		System.out.print("\n Enter array elements (separated by space) : ");
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		// displaying original array
		System.out.print("\n Original array : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
		
		// a) finding the largest element in an array
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\n Largest element in the array : " + max);

		// b) finding the second largest element in an array
		firstLargest = secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			} 
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("\n No second largest element found in the array");
		} else {
			System.out.println("\n Second largest element in the array : " 
				+ secondLargest);
		}

		 // b) finding the second largest element in an array using sorting
		Arrays.sort(arr);
		n = arr.length;
		firstLargest = arr[n - 1];
		secondLargest = Integer.MIN_VALUE;

		System.out.println("\n Largest element in the array : " + firstLargest);
		
		for (int i = (n - 1); i >= 0; i--) {
			if (arr[i] != firstLargest) {
				secondLargest = arr[i];
				break;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("\n No second largest element found in the array");
		} else {
			System.out.println("\n Second largest element in the array : " 
				+ secondLargest);
		} 
	}
}