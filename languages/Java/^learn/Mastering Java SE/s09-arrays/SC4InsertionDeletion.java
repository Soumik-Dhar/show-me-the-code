/* student challenge 4 - 
 * a) insert an element at an index in an array
 * b) remove an element by index as well as value in an array */

import java.util.Scanner;

class SC4InsertionDeletion
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		int n, elem, index;

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
		
		// a) inserting an element at an index in an array
		// taking element to be added and insertion index as input
		System.out.print("\n Enter element to be inserted : ");
		elem = reader.nextInt();
		System.out.print("\n Enter index to insert " + elem + " : ");
		index = reader.nextInt();

		int[] arrInsert = new int[arr.length + 1];

		// cloning arr to arrInsert as is till index
		for (int i = 0; i < index; i++) {
			arrInsert[i] = arr[i];
		}			
		// right-shifting the rest of the elements
		for (int i = (index + 1); i < arrInsert.length; i++) {
			arrInsert[i] = arr[i - 1];	
		}
		// inserting element at index
		arrInsert[index] = elem;

		// updating original array
		arr = arrInsert;
		arrInsert = null;

		// displaying updated array
		System.out.print("\n Updated array  : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();

		// b) removing an element from an array based on index 
		System.out.print("\n Enter index of element to remove (by index) : ");
		index = reader.nextInt();
		
		int[] arrRemoveIndex = new int[arr.length - 1];

		// cloning arr to arrRemoveIndex as is till index
		for (int i = 0; i < index; i++) {
			arrRemoveIndex[i] = arr[i];
		}		
		// left-shifting elements index onwards
		for (int i = index; i < arr.length - 1; i++) {
			arrRemoveIndex[i] = arr[i + 1];
		}

		// updating original array
		arr = arrRemoveIndex;
		arrRemoveIndex = null;

		// displaying updated array
		System.out.print("\n Updated array  : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();

		// b) removing an element from an array based on value 
		System.out.print("\n Enter element to remove (by value) : ");
		elem = reader.nextInt();
		
		int[] arrRemoveValue = new int[arr.length - 1];
		index = -1;

		// getting first index of element in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elem) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("\n Element not found!");
			System.exit(0);
		}

		// cloning arr to arrRemoveValue as is till index
		for (int i = 0; i < index; i++) {
			arrRemoveValue[i] = arr[i];
		}		
		// left-shifting elements index onwards
		for (int i = index; i < arr.length - 1; i++) {
			arrRemoveValue[i] = arr[i + 1];
		}

		// updating original array
		arr = arrRemoveValue;
		arrRemoveValue = null;

		// displaying updated array
		System.out.print("\n Updated array  : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
	}
}