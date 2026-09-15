package com.learning.demo;

import com.learning.utils.AppUtils;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		int[] testNumbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		for (int number : testNumbers) {
			System.out.println(number + " is prime: " + AppUtils.isPrime(number));
		}
	}
}
