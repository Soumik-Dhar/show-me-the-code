/* student challenge 2 - overload
 * a) area() method to find the area of a rectange, circle and trapezium
 * b) reverse() method to reverse an integer number and an integer array
 * c) validate() method to validate name and age of a person */

import java.util.Scanner;

class SC2AreaOverloading 
{
	// method to find the area of a rectangle
	static double area(double length, double breadth) {
		return (length * breadth);
	}

	// method to find the area of a circle
	static double area(double radius) {
		return (Math.PI * radius * radius);
	}

	// method to find the area of a rectangle
	static double area(double a, double b, double h) {
		return (0.5 * (a + b) * h);
	}

	// method to reverse an integer number
	static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return rev;
	}

	// method to reverse an integer array
	static int[] reverse(int arr[]) {
		int n = arr.length;
		int rev[] = new int[n];

		for(int i = 0; i < n; i++) {
			rev[i] = arr[(n - 1) - i];
		}
		return rev;
	}

	// method to validate name of a person
	boolean validate(String name) {
		if (name.matches("[a-zA-Z\\s]+"))
			return true;
		else
			return false;
	}

	// method to validate age of a person
	boolean validate(String age, int flag) {
		if (age.matches("\\d{1,3}"))
			return true;
		else
			return false;
	}

	// main method to call overloaded methods
	public static void main(String[] args) 
	{
		SC2AreaOverloading obj = new SC2AreaOverloading();
		Scanner sc = new Scanner(System.in);

		double length, breadth, radius, a, b, h;
		String name, age;

		// a) overloading area() method for rectangle, circle and trapezium
		System.out.println("\n // a) overloading area() method to find " + 
			"the area of a rectange, circle and trapezium");
		// finding area of a rectangle
		System.out.print("\n Enter length and breadth of a rectangle : ");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		System.out.format(" Area = %.3f x %.3f = %.3f\n", 
			length, breadth, area(length, breadth));

		// finding area of a circle
		System.out.print("\n Enter radius of a circle : ");
		radius = sc.nextDouble();
		System.out.format(" Area = %1$.3f x %2$.3f x %2$.3f = %3$.3f\n", 
			Math.PI, radius, area(radius));

		// finding area of a rectangle
		System.out.print("\n Enter parallel sides and height of a trapezium : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		h = sc.nextDouble();
		System.out.format(" Area = 0.5 x (%.3f + %.3f) x %.3f = %.3f\n", 
			a, b, h, area(a, b, h));
		
		System.out.println();

		// b) overloading reverse() method to reverse integer number and array
		System.out.println("\n // b) overloading reverse() method to " +
			"reverse an integer number and an integer array");
		// reversing an integer number
		System.out.print("\n Enter a number : ");
		System.out.println(" Reverse = " + reverse(sc.nextInt()));

		// reversing an integer array
		System.out.print("\n Enter number of elements for an integer array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.print(" Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(" Reverse = ");
		//int rev[] = reverse(arr);
		for (int x : reverse(arr)) {
			System.out.print(x + " ");
		}	

		System.out.println();
		sc.nextLine();

		// c) overloading validate() method to validate name and age of a person
		System.out.println("\n // c) overloading validate() method to " +
			"validate name and age of a person ");
		// validating name of a person
		System.out.print("\n Enter name of a person : ");
		name = sc.nextLine();
		if (obj.validate(name)) 
			System.out.println(" " + name + " is a valid name");
		else 
			System.out.println(" " + name + " is an invalid name");

		System.out.print("\n Enter age of a person : ");
		age  = sc.nextLine();
		if (obj.validate(age, 0)) 
			System.out.println(" " + age + " is a valid age");
		else 
			System.out.println(" " + age + " is an invalid age");
	}
}