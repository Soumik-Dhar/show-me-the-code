/* practice program to demonstrate 2D arrays in java */

import java.lang.*;

class P2TwoDArrays 
{
	public static void main(String[] args) 
	{
		// various method of declaring and initializing 2D arrays
		int [][]arr1 = new int[3][4];
		int arr2[][];
		arr2 = new int[4][7];
		int arr3[][] = {{1, 2, 3},
						{9, 7, 4},
						{5, 8, 0}};
		// jagged arrays
		int []arr4[] = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		int [][] arr5 = new int[3][];
		arr5[0] = new int[5];
		arr5[1] = new int[2];
		arr5[2] = new int[7];

		// displaying 2D arrays
		System.out.println("\n int arr3[][] = {{1, 2, 3}, {9, 7, 4}, {5, 8, 0}};");
		System.out.print("\n arr3 =");

		for (int i = 0; i < arr3.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n Jagged arrays in Java ->");

		// displaying jagged arrays using for and for-each loop
		System.out.println("\n int [][] arr5 = new int[3][];" +
						   "\n arr5[0] = new int[5];" + 
						   "\n arr5[1] = new int[2];" +
						   "\n arr5[2] = new int[7];");
		System.out.print("\n arr5 =");

		// A.length = number of rows; A[i].length = number of columns
		for (int i = 0; i < arr5.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n int []arr4[] = {{1}, {2, 3}, {4, 5, 6}, " +
			"{7, 8, 9, 10}, {11, 12, 13, 14, 15}};");
		System.out.print("\n arr4 =");
		
		for (int x[] : arr4) {
			System.out.print("\t");
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
}