/* student challenge 1 - calculate area of a triangle where -
 * a) base and height are provided
 * b) length of three sides are given */

import java.util.Scanner;

public class SC1AreaOfTriangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		float base, height, s, area;
		int a, b, c;

		// area of a triangle given base and height are provided
		System.out.println("\n Area of a triangle for given base and height -");
		System.out.print("\n Enter base of the triangle : ");	
		base = sc.nextFloat();
		System.out.print(" Enter height of the triangle : ");	
		height = sc.nextFloat();
		// calculating area = 1/2 * base * height
		area = (base * height) / 2;
		// displaying area
		System.out.println("\n Area of the triangle = 1/2 * " + base + " * "
			+ height + " = " + area);

		System.out.println("\n ------------------------------------------------------");

		// area of a triangle given length of three of its sides are provided
		System.out.println("\n Area of a triangle based on length of three sides -");
		System.out.print("\n Enter length of side 'a' of the triangle : ");	
		a = sc.nextInt();
		System.out.print(" Enter length of side 'b' of the triangle : ");	
		b = sc.nextInt();
		System.out.print(" Enter length of side 'c' of the triangle : ");	
		c = sc.nextInt();
		// calculating semiperimeter of the triangle
		s = (a + b + c) / 2F;
		// calculating area = square root(s * (s - a) * (s - b) * (s - c))
		area = (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
		// displaying area
		System.out.println("\n Area of the triangle = square root of (" + s + 
			" * (" + s + " - " + a + ") * (" + s + " - " + b + ") * ("+ s + 
			" - " + c + ")) = " + area);
	}
}