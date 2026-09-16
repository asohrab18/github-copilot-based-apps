package com.learning.utils;

public final class AppUtils {

    private AppUtils() {
    }

    /**To check whether a number is prime or not.*/
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
    
    /**To find factorial of a number.*/
    public static long calculateFactorial(int number) {
        validateNonNegative(number);

        long result = 1;
        for (int current = 2; current <= number; current++) {
            result *= current;
        }
        
        return result;
    }

    private static void validateNonNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
    }

    public static void printFactorials(int[] numbers) {
        for (int number : numbers) {
            long factorial = calculateFactorial(number);
            System.out.println(number + "! = " + factorial);
        }
    }
}
