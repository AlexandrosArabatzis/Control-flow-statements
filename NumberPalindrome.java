package arabatzis;

//Write a method called isPalindrome with one int parameter called number.
//
//The method needs to return a boolean.
//
//It should return true if the number is a palindrome number otherwise it should return false.
//
//Check the tips below for more info about palindromes.
//
//Example Input/Output
//
//isPalindrome(-1221); → should return true
//
//isPalindrome(707); → should return true
//
//isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//
//What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the
//		
//original number. For example: 121, 12321, 1001 etc.
//
//Logic to check a palindrome number:
//
//Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//
//If both are the the same then the number is a palindrome otherwise it is not.
//
//Logic to reverse a number:
//
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//Extract the last digit of the given number by performing the modulo division (remainder).
//Store the last digit to some variable say lastDigit = num % 10.
//Increase the place value of reverse by one.
//To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//Add lastDigit to reverse.
//Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//Repeat steps until number is not equal to (or greater than) zero. 



public class NumberPalindrome {

	public static boolean isPalindrome(int number) {

		// if number is negative make it positive
		if(number <0) {
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
		}

		else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(1234));
		System.out.println(isPalindrome(1221));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(-1234));
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(-12321));
		System.out.println(isPalindrome(0));

	}

}