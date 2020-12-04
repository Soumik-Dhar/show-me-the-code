/* student challenge 3 - find surface area and volume of a cuboid given its
 * length, breadth and height are provided */

import java.util.Scanner;

public class SC3Cuboid
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		float length, breadth, height, surfaceArea, volume;

		System.out.print("\n Enter length of the cuboid : ");
		length = sc.nextFloat();
		System.out.print(" Enter breadth of the cuboid : ");
		breadth = sc.nextFloat();
		System.out.print(" Enter height of the cuboid : ");
		height = sc.nextFloat();

		// calculating surface area = 2 * (l * b + b * h + h * l)
		surfaceArea = 2 * (length * breadth + breadth * height + height * length);
		// calculating volume = l * b * h
		volume = length * breadth * breadth;
		// displaying dimensions, surface area and volume of the cuboid
		System.out.println("\n Dimensions = " 
			+ length + " (l) x " + breadth + " (b) x " + height + " (h)\n");
		System.out.println(" Surface Area = " + surfaceArea + " square units");
		System.out.println(" Volume = " + volume + " cubic units");
	}
}
