/* practice program to demonstrate 1D arrays in java */

import java.util.Scanner;

class P1OneDArrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int arr1[] = new int[10];
		char[] arr2 = {'a', 'e', 'i', 'o', 'u'};
		double [] arr3;
		arr3 = new double[5];

		// displaying elements of uninitialized array arr1
		System.out.print("\n Elements of uninitialized array 'arr1' : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		} 

		System.out.println();

		// displaying elements of array arr2 using for-each loop
		System.out.print("\n Elements of array 'arr2' (using for-each loop) : ");
		for(char ch : arr2) {
			System.out.print(" " + ch);
		}

		System.out.println();

		// initializing and displaying elements of array arr3
		System.out.print("\n Elements of array arr3[i] = (i - 1) * (i + 1) / 3 : ");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (i - 1) * (i + 1) / 3D;
			System.out.format(" %.2f", arr3[i]);
		} 
		System.out.println();

		// taking user input in an array 'arr4' of size 'n'
		System.out.print("\n Enter array length : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String []arr4 = new String[n];
		
		System.out.println("\n Enter String elements into array 'arr4' : \n");
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(" Enter element " + (i + 1) + " : ");
			arr4[i] = sc.nextLine();
		} 
		
		// displaying arr4 elements
		System.out.print("\n Elements of array arr4 :");
		for (String element:arr4) {
			System.out.print(" " + element);
		}
		
		System.out.println();

		// modifying second-last element
		System.out.println("\n // modifying second-last element to \"Modified\"");
		arr4[arr4.length - 2] = "Modified";
		
		// displaying modified arr4 elements
		System.out.print("\n Updated elements of array arr4 :");
		for (String element:arr4) {
			System.out.print(" " + element);
		}

		System.out.println();
		
		// displaying length of arr4
		System.out.println("\n Length of 'arr4' = " + arr4.length);
	}
}