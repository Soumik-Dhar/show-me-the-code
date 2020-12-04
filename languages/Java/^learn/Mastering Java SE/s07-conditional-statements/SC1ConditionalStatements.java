/* student challenge 1 - 
 * a) find if a number is an even number or not
 * b) find whether a person is a young adult or not (18 <= age <= 35)
 * c) find grade of a student from average of marks in three subjects (PCM) */

import java.util.Scanner;

class SC1ConditionalStatements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int number;
		short age;
		double pMarks, cMarks, mMarks, average;
		char grade;

		// a) finding whether a number is even or odd
		System.out.print("\n // a) finding whether a number is even or odd\n");
		System.out.print("\n Enter a number : ");
		number = sc.nextInt();
		// a number is even if it is perfectly divisible by 2, odd otherwise
		if (number % 2 == 0) {
			System.out.format(" %d is even\n", number);
		} else {
			System.out.format(" %d is odd\n", number);
		}

		System.out.println();

		// b) finding whether a person is a young adult
		System.out.print("\n // b) finding whether a person is a young adult " 
			+ "or not (18 <= age <= 35)\n");
		System.out.print("\n Enter age of a person : ");
		age = sc.nextShort();
		// a person is a young adult if his age is in the range 18-35
		if (age >= 18 && age <= 35) {
			System.out.println(" Person is a young adult");
		} else {
			System.out.println(" Person is NOT a young adult");
		}
		/*
		// checking the same age range using logical || instead of logical &&
		if (age <= 18 || age >= 35) {
			System.out.println(" Person is NOT a young adult");
		} else {
			System.out.println(" Person is a young adult");
		}
		*/

		System.out.println();

		// c) finding grade of a student based on average of marks in PCM subjects
		System.out.print("\n // c) finding grade of a student based on average " 
			+ "of marks in three subjects (PCM)\n");
		System.out.print("\n Enter marks obtained in "
			+ "Physics, Chemistry and Maths : ");
		pMarks = sc.nextDouble();
		cMarks = sc.nextDouble();
		mMarks = sc.nextDouble();

		average = (pMarks + cMarks + mMarks) / 3;

		if (average > 85) {
			grade = 'A';
		} else if (average > 70 && average <= 85) {
			grade = 'B';
		} else if (average > 55 && average <= 70) {
			grade = 'C';
		} else if (average > 40 && average <= 55) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		System.out.format(" Average marks in PCM = %.2f\n", average);
		System.out.println(" Grade obtained = " + grade);
	}
}