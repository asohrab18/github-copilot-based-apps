package com.learning.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUtilsTest {

    @Test
    void shouldReturnFalseForNumbersLessThanTwo() {
        assertFalse(AppUtils.isPrime(0));
        assertFalse(AppUtils.isPrime(1));
        assertFalse(AppUtils.isPrime(-1));
        assertFalse(AppUtils.isPrime(-10));
    }

    @Test
    void shouldReturnTrueForTwoAndThree() {
        assertTrue(AppUtils.isPrime(2));
        assertTrue(AppUtils.isPrime(3));
    }

    @Test
    void shouldReturnFalseForEvenNumbersGreaterThanTwo() {
        assertFalse(AppUtils.isPrime(4));
        assertFalse(AppUtils.isPrime(6));
        assertFalse(AppUtils.isPrime(8));
        assertFalse(AppUtils.isPrime(18));
    }

    @Test
    void shouldReturnTrueForKnownPrimeNumbers() {
        assertTrue(AppUtils.isPrime(5));
        assertTrue(AppUtils.isPrime(7));
        assertTrue(AppUtils.isPrime(11));
        assertTrue(AppUtils.isPrime(13));
        assertTrue(AppUtils.isPrime(17));
        assertTrue(AppUtils.isPrime(29));
        assertTrue(AppUtils.isPrime(97));
    }

    @Test
    void shouldReturnFalseForKnownNonPrimeNumbers() {
        assertFalse(AppUtils.isPrime(9));
        assertFalse(AppUtils.isPrime(15));
        assertFalse(AppUtils.isPrime(21));
        assertFalse(AppUtils.isPrime(25));
        assertFalse(AppUtils.isPrime(49));
        assertFalse(AppUtils.isPrime(51));
    }

    @Test
    void shouldHandleLargePrimeAndCompositeNumbers() {
        assertTrue(AppUtils.isPrime(541));
        assertFalse(AppUtils.isPrime(999));
        assertTrue(AppUtils.isPrime(1009));
        assertFalse(AppUtils.isPrime(1024));
    }
}