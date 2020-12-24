/* practice program to demonstrate method overloading in Java */

import java.lang.*;

class P2MethodOverloading 
{
	// method to find the maximum of two integral values
	static int min(int x, int y) {
		System.out.println("\n // inside min(int, int)");
		return x < y ? x : y;
	}

	// method to find the maximum of two double type values
	static double min(double x, double y) {
		System.out.println("\n // inside min(double, double)");
		return x < y ? x : y;		
	}

	// method to find the maximum of three byte type values
	static byte min(byte x, byte y, byte z) {
		System.out.println("\n // inside min(byte, byte, byte)");
		if (x < y && x < z) {
			return x;
		} else if (y < z) {
			return y;
		} else {
			return z;
		}
	}

	public static void main(String[] args) 
	{
		byte a = -3, b = 8, c = 0;
		int x1 = 5, y1 = 10;
		long x2 = 5, y2 = 10;
		double m = 3.14, n = 2.19;

		// min(byte, byte, byte) is called
		System.out.format(" min(%d, %d, %d) = %d\n", a, b, c, min(a, b, c));
		
		// min(int, int) is called
		System.out.format(" min(%d, %d) = %d\n", x1, y1, min(x1, y1));
		
		// min(double, double) is called
		System.out.format(" min(%f, %f) = %f\n", m, n, min(m, n));

		// min(double, double) is called due to upcasting (implicit type conversion)
		System.out.format(" min(%d, %d) = %f\n", x2, y2, min(x2, y2));
		
	}
}