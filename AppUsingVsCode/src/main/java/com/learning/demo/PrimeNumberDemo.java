package com.learning.demo;

import com.learning.utils.AppUtils;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		final int[] sampleNumbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		for (int number : sampleNumbers) {
			System.out.printf("%d is prime: %b%n", number, AppUtils.isPrime(number));
		}
	}
}
