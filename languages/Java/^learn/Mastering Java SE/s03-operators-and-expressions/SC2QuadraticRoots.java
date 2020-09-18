/* student challenge 2 -  find roots of a quadratic equation a * x * x + b * x + c = 0 
 * given that the coefficients a, b and c are provided */

import java.util.Scanner;

public class SC2QuadraticRoots
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double a, b, c, discriminant, root1, root2;

		System.out.print("\n Enter quadratic coefficients -\n a b c " +
		"(separated by spaces) : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		// computing discriminant = square root of (b * b - 4 * a * c)
		discriminant = Math.sqrt(b * b - 4 * a * c);
		// calculating roots = (-b +- discriminant) / (2 * a)
		root1 = (-b + discriminant) / (2 * a);
		root2 = (-b - discriminant) / (2 * a);
		// displaying roots
		System.out.println("\n Quadratic equation : (" 
			+ a + ")x*x + (" + b + ")x + (" + c + ") = 0");
		System.out.println("\n Roots : " + root1 + " and " + root2);

	}
}
