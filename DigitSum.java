package arabatzis;


//Write a method with the name sumDigits that has one int parameter called number. 
//
//If parameter is >= 10 then the method should process the number and return sum of all
//		
//digits, otherwise return -1 to indicate an invalid value.
//
//The numbers from 0-9 have 1 digit so we dont want to process them, also we dont want
//
//to process negative numbers, so also return -1 for negative numbers.
//
//For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//Add some code to the main method to test out the sumDigits method to determine that it is working 
//
//correctly for valid and invalid values passed as arguments.


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
		System.out.println(sumDigits(-1));
		System.out.println(sumDigits(0));
		System.out.println(sumDigits(9));
		System.out.println(sumDigits(10));

	}

}
