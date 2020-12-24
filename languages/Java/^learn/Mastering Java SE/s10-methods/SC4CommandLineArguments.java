/* student challenge 4 - find the sum of numbers using command line arguments */

class SC4CommandLineArguments
{
	public static void main(String[] numbers) 
	{
		float sum = 0f;
		for (String number : numbers) {
			// checking if the argument is a valid floating point number
			if (number.matches("[\\d.]+"))
				sum += Float.parseFloat(number);
		}
		System.out.println("\n Sum = " + sum);
	}
}