/* student challenge 6 - 
 * a) add two matrices
 * b) multiply two matrices */

import java.util.Scanner;

class SC6MatrixMultiplication
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		// a) adding two matrices
		System.out.println("\n // a) adding two matrices");
		int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][]arr2 = {{-7, 3, 8}, {5, 1, -6}, {9, 3, -2}};
		
		// displaying the matrices
		System.out.print("\n arr1 = ");
		for (int x[] : arr1) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
			System.out.print("\t");
		}

		System.out.println();
		
		System.out.print("\n arr2 = ");
		for (int x[] : arr2) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
			System.out.print("\t");
		}

		System.out.println();

		// checking for compatibility
		if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
			System.out.println("\n Matrices are incompatible for addition!");
		} else {
			int []arr3[] = new int[arr1.length][arr1[0].length];

			System.out.println("\n // arr3 = arr1 + arr2");
			System.out.print("\n arr3 = ");

			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[0].length; j++) {
					// adding the matrices
					arr3[i][j] = arr1[i][j] + arr2[i][j];
					// displaying resulting matrix
					System.out.format("%d ", arr3[i][j]);
				}
				System.out.println();
				System.out.print("\t");
			}			
		}

		System.out.println();

		// b) multiplying two matrices
		System.out.println("\n // b) multiplying two matrices");

		int a, b, A[][], B[][];

		System.out.print("\n Enter size of matrix A (separated by space) : ");
		a = reader.nextInt();
		b = reader.nextInt();
		A = new int[a][b];

		System.out.print("\n Enter size of matrix B (separated by space) : ");
		a = reader.nextInt();
		b = reader.nextInt();
		B = new int[a][b];
		
		/* checking for compatibility (number of columns of matrix A must be 
		 * equal to the number of rows in matrix B) */
		if (A[0].length != B.length) {
			System.out.println("\n Matrices are incompatible for multiplication!");
			System.exit(0);
		} 

		// taking elements of matrices A and B as input
		System.out.println("\n Enter elements of matrix A : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(" Enter element (" + i + ", " + j +") : ");
				A[i][j] = reader.nextInt();
			}
		}
		System.out.println("\n Enter elements of matrix B : ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(" Enter element (" + i + ", " + j +") : ");
				B[i][j] = reader.nextInt();
			}
		}

		// size of product matrix = number of rows of A x number of columns in B
		int C[][] = new int[A.length][B[0].length];
		// multiplying matrices A and B
		for (int i = 0; i < C.length; i++) {
			// i and j are row and column counters for C
			for (int j = 0; j < C[i].length; j++) {
				C[i][j] = 0;
				/* k is multiplication counter equal to either number of columns
 				 * in A or number of rows in B*/
				for (int k = 0; k < B.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		// displaying matrices A, B and C
		System.out.print("\n A = ");
		for (int x[] : A) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
			System.out.print("     ");
		}

		System.out.print("\n B = ");
		for (int x[] : B) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
			System.out.print("     ");
		}

		System.out.println("\n // C = A x B");
		System.out.print("\n C = ");
		for (int x[] : C) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
			System.out.print("     ");
		}		
	}	
}