// This is a simple method that takes an integer an returns its cross sum.

public class DigitSum {

	public static int sumDigits(int number) {

		if (number < 10) {
			return -1;
		}
		int sum = 0;
		while (number > 0) {
			
			// extract last digit
			sum = sum + number % 10;
			
			// discard last digit
			number = number / 10;
		}
		return sum;
	}
	
	public static void main (String[] args) {
	
		// testing random numbers
		System.out.println(sumDigits(223));
		System.out.println(sumDigits(328974));
		System.out.println(sumDigits(32));
		System.out.println(sumDigits(-30));
		
	// Output:	
	// 7
	// 34
	// 5
	// 3

	}

}
