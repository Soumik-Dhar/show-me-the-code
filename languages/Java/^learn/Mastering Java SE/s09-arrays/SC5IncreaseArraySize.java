/* student challenge 5 - 
 * a) copy and reverse-copy an array into another
 * b) increase the size of an array */

import java.util.Scanner;

class SC5IncreaseArraySize
{
	public static void main(String args[]) 
	{
		Scanner reader = new Scanner(System.in);

		int n;

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
		System.out.print("\n Original array (arr[]) : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
		
		// a) copying and reverse-cloning an array
		int arrCopy[] = new int[arr.length];
		int arrReverseCopy[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++)	
		{
			arrCopy[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			arrReverseCopy[i] = arr[((arr.length - 1) - i)];
		}

		/* // reverse-cloning using multiple indices
		for (int i = (arr.length - 1), j = 0; i >= 0; i--, j++) {
			arrReverseCopy[j] = arr[i];
		} */

		// displaying cloned array
		System.out.print("\n Cloned array (arrCopy[]) : ");
		for (int x : arrCopy) {
			System.out.print(x + " ");
		}

		System.out.println();
		
		// displaying reverse-copied array
		System.out.print("\n Reverse-copied array (arrReverseCopy[]) : ");
		for (int x : arrReverseCopy) {
			System.out.print(x + " ");
		}

		System.out.println();

		// b) increasing the size of an array
		System.out.print("\n Enter new size of the array (n) : ");
		n = reader.nextInt();
		int arrTemp[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arrTemp[i] = arr[i];
		}

		// updating arr to refer to the object stored in reference arrTemp
		arr = arrTemp;
		arrTemp = null;
		/* original array object stored in arr is garbage collected and arrTemp
		 * now points to a null object. Thus the original reference arr is made 
		 * to point to the updated array object with a new increased size */

		// displaying updated array with new increased size
		System.out.print("\n Updated array (arr[]) with new size (" + n + ") : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
	}
}