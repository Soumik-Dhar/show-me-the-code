/* student challenge 3 - 
 * a) rotate all elements in an array to the left by one place
 * b) rotate all elements in an array to the right by 'k' places */

import java.util.Scanner;

class SC3ArrayRotation
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		int n, k, temp;

		// taking number of array elements as input
		System.out.print("\n Enter number of array elements (n) : ");
		n = reader.nextInt();
		int arr[] = new int[n];
		int arrLeftShift[] = new int[n];
		int arrRightShift[] = new int[n];

		// taking array elements as input
		System.out.print("\n Enter array elements (separated by space) : ");
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		// cloning array for rotation operations
		for (int i = 0; i < arr.length; i++) {
			arrLeftShift[i] = arr[i];
			arrRightShift[i] = arr[i];
		}

		// taking number of places (k) for right rotation
		System.out.print("\n Enter number of places to shift right (k) : ");
		k = reader.nextInt();

		// a) rotating array elements to the left by one place
		temp = arrLeftShift[0];
		for (int i = 1; i < arrLeftShift.length; i++) {
			arrLeftShift[i - 1] = arrLeftShift[i];
		}
		arrLeftShift[arrLeftShift.length - 1] = temp;

		// displaying original array
		System.out.print("\n Original array               : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		// displaying left-rotated array
		System.out.print("\n Left-rotation (by 1 place)   : ");
		for (int x : arrLeftShift) {
			System.out.print(x + " ");
		}

		// b) rotating array elements to the right by 'k' places
		for (int j = 0; j < k; j++) {
			temp = arrRightShift[arrRightShift.length - 1];
			for (int i = (arrRightShift.length - 1); i > 0; i--) {
				arrRightShift[i] = arrRightShift[i - 1];
			}
			arrRightShift[0] = temp;
		}
		
		System.out.println();
		
		// displaying original array
		System.out.print("\n Original array               : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		// displaying right-rotated array
		System.out.print("\n Right-rotation (by " + k + " places) : ");
		for (int x : arrRightShift) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}