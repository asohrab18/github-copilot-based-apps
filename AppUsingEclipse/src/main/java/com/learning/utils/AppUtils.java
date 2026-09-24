package com.learning.utils;

import java.math.BigInteger;

public class AppUtils {

	/**
	 * Compute factorial of n (n!) using BigInteger. Supports n >= 0.
	 * 
	 * @param n non-negative integer
	 * @return n! as BigInteger
	 * @throws IllegalArgumentException if n < 0
	 */
	public static BigInteger getFactorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be >= 0");
		}
		
		BigInteger result = BigInteger.ONE;
		
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}

	/**
	 * Check whether a number is prime.
	 * Uses simple deterministic checks suitable for int values.
	 * @param n number to check
	 * @return true if n is prime, false otherwise
	 */
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}
		
		int r = (int) Math.sqrt(n);
		
		for (int i = 3; i <= r; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	/**
	 * Check whether a number is an Armstrong (narcissistic) number.
	 * An Armstrong number equals the sum of its own digits each raised to
	 * the power of the number of digits. Examples: 153, 9474
	 * @param n non-negative integer
	 * @return true if n is an Armstrong number
	 */
	public static boolean isArmstrong(int n) {
		if (n < 0) {
			return false;
		}
		
		int original = n;
		int digits = (n == 0) ? 1 : 0;
		int temp = n;
		
		while (temp > 0) {
			digits++;
			temp /= 10;
		}
		
		long sum = 0L;
		temp = n;
		
		while (temp > 0) {
			int d = temp % 10;
			sum += powInt(d, digits);
			temp /= 10;
		}
		
		return sum == (long) original;
	}

	// Helper: integer power returning long (base >= 0, exp >= 0)
	private static long powInt(int base, int exp) {
		long r = 1L;
		
		for (int i = 0; i < exp; i++) {
			r *= base;
		}
		
		return r;
	}

	/**
	 * Check whether a String is a palindrome.
	 * This implementation is case-insensitive and ignores non-alphanumeric characters.
	 * Examples: "madam" -> true, "Racecar" -> true, "A man, a plan, a canal: Panama" -> true
	 * @param s input string (may be null)
	 * @return true if s is a palindrome under the described normalization, false otherwise
	 */
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		
		int i = 0, j = s.length() - 1;
		
		while (i < j) {
			char a = s.charAt(i);
			char b = s.charAt(j);
		
			if (!Character.isLetterOrDigit(a)) {
				i++;
				continue;
			}
			
			if (!Character.isLetterOrDigit(b)) {
				j--;
				continue;
			}
			
			if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
}
