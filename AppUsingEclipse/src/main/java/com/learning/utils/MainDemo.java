package com.learning.utils;

public class MainDemo {

	public static void getFactorial(int n) {
		System.out.println("factorial(" + n + ") = " + AppUtils.getFactorial(n));
	}

	public static void checkPrime(int n) {
		System.out.println("isPrime(" + n + ") = " + AppUtils.isPrime(n));
	}

	public static void checkArmstrong(int n) {
		System.out.println("isArmstrong(" + n + ") = " + AppUtils.isArmstrong(n));
	}

	public static void checkPalindrome(String s) {
		System.out.println("isPalindrome(" + s + ") = " + AppUtils.isPalindrome(s));
	}

	public static void main(String[] args) {
		getFactorial(3);
		getFactorial(5);
		checkPrime(1);
		checkPrime(5);
		checkPrime(10);
		checkArmstrong(123);
		checkArmstrong(153);
		checkArmstrong(9474);
		checkArmstrong(54748);
		checkArmstrong(92727);
		checkArmstrong(93084);
		checkArmstrong(548834);
		checkPalindrome("hello");
		checkPalindrome("madam");
		checkPalindrome("A man, a plan, a canal: Panama");
	}

}
