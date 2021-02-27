package arabatzis;

public class AllExamples {

//	this is a collection of simple methods making use of different control flow statements
//	- sumDigits -> takes an integer an returns the checksum
//	- getEvenDigitSum -> takes an integer and returns the sum of its even digits
//	- sumOdd -> sums up all odd numbers that lie in a given range
//	- isOdd -> checks if an integer is odd
//	- hasSameLastDigit -> takes three integers betweeen 10 and 1000 an checks if at least on
//		the numbers have the same last digit
//	- isLeapYear -> checks if a year is a leap year
//	- getDaysInMonth -> takes a month in a year and returns the number of days in this month
//	- isPalindrome -> checks if an integer is a palindrome
//	- isPrime -> checks if an integer is a prime number
//	- sumFirstAndLastDigit -> takes an integer and return whether its first and last digit
//		are the same
	
	// takes an integer an returns the checksum
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

	// takes an integer an returns the sum of its even digits
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		
		int sum = 0;
		int lastDigit;
		
		while (number > 0) {

			// extract last digit
			lastDigit = number % 10;

			if (lastDigit % 2 == 0) {
				sum = sum + lastDigit;
			}

			// discard last digit
			number = number / 10;
		}
		return sum;

	}

	
	// this method sums up all odd numbers that lie in a given range
	public static int sumOdd(int start, int end) {
		
		int sum = 0;
		if (end < start) {
			return -1;
		}
		if ((end < 0) || (start < 0)) {
			return -1;
		}
		for (int i = start; i <= end; i++) {

			if (isOdd(i) == true) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	// checks if an integer is odd.
	public static boolean isOdd(int number) {
		
		if (number <= 0) {
			return false;
		}

		if (number % 2 == 0) {
			return false;
		}

		if (number % 2 == 1) {
			return true;
		}
		return false;

	}

	//  takes three integers between 10 and 100 an checks if at least two of these
	// have the same last digit
	public static boolean hasSameLastDigit(int a, int b, int c) {
		
		if ((a > 1000) || (a < 10)) {
			return false;
		}

		if ((b > 1000) || (b < 10)) {
			return false;
		}

		if ((c > 1000) || (c < 10)) {
			return false;
		}

		int lastDigitA = a % 10;
		int lastDigitB = b % 10;
		int lastDigitC = c % 10;

		if ((lastDigitA == lastDigitB) || (lastDigitB == lastDigitC) || (lastDigitA == lastDigitC)) {
			return true;
		}

		return false;

	}

	// checks if a year is a leap year
	public static boolean isLeapYear(int year) {
		if ((year < 1) || (year > 9999)) {
			return false;
		}
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	// takes a month and a year an returns the numbers of day the month had
	public static int getDaysInMonth(int month, int year) {
		if ((month > 12) || (month < 1)) {
			return -1;
		}
		if ((year > 9999) || (year < 1)) {
			return -1;
		}
		switch (month) {
		case 1:
			return 31;
		case 2:

			if (isLeapYear(year) == true) {
				return 29;
			} else {
				return 28;
			}
		case 3:
			return 31;

		case 4:
			return 30;

		case 5:
			return 31;

		case 6:
			return 30;

		case 7:
			return 31;

		case 8:
			return 31;

		case 9:
			return 30;

		case 10:
			return 31;

		case 11:
			return 30;

		case 12:
			return 31;
		}

		return 0;
	}

	// checks if a numbers is a palindrome
	public static boolean isPalindrome(int number) {
		// if number is negative make it positive
		if (number < 0) {
			number = Math.abs(number);
		}

		int reverse = 0;
		int lastDigit;
		int originalNumber = number;

		// generate reversed number
		while (number > 0) {
			reverse = reverse * 10;
			lastDigit = number % 10;
			reverse = reverse + lastDigit;
			number = number / 10;
		}
		// compare if reversed number and original number are same
		if (reverse == originalNumber) {
			return true;
		} else {
			return false;
		}
	}

	// checks if an integer is a prime number
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// takes an integer and returns the sum of the first and last digit
	public static int sumFirstAndLastDigit(int number) {
		int firstDigit = number;
		int lastDigit = number;
		int sum;

		if (number < 0) {
			return -1;
		}
		// find out first digit
		while (firstDigit > 9) {
			firstDigit /= 10;
		}
		// find out last digit
		lastDigit = lastDigit % 10;
		sum = lastDigit + firstDigit;
		return sum;
	}
}
