# Simple Java Project

This project is a small Java learning application that demonstrates basic object-oriented programming, utility methods, and console-based demos.

## Project Overview

The application contains:
- an `Employee` model class
- utility methods for checking prime numbers and calculating factorials
- simple demo classes that run examples in the console

## Package Structure

```text
src/
├── com/
│   └── learning/
│       ├── demo/
│       │   ├── EmployeeDemo.java
│       │   ├── FactorialDemo.java
│       │   └── PrimeNumberDemo.java
│       ├── model/
│       │   └── Employee.java
│       └── utils/
│           └── AppUtils.java
```

## Classes and Responsibilities

### `com.learning.model.Employee`
Represents an employee record with:
- `id`
- `name`
- `salary`

It includes getters and setters for each field.

### `com.learning.utils.AppUtils`
Provides reusable utility methods:
- `isPrime(int number)` — checks whether a number is prime
- `calculateFactorial(int number)` — returns the factorial of a number
- `printFactorials(int[] numbers)` — prints factorials for an array of numbers

Notes:
- Negative numbers are rejected in factorial calculations.
- The prime-check logic optimizes by testing divisors up to the square root of the number.

### `com.learning.demo.EmployeeDemo`
Creates an `Employee` object and prints its details to the console.

### `com.learning.demo.FactorialDemo`
Demonstrates factorial calculations for sample values such as 0, 1, 5, and 10.

### `com.learning.demo.PrimeNumberDemo`
Checks several sample numbers and prints whether each one is prime.

## Example Output

```text
Employee ID: 101
Employee Name: Adam Smith
Salary: 75000.00

0! = 1
1! = 1
5! = 120
10! = 3628800

2 is prime: true
3 is prime: true
4 is prime: false
5 is prime: true
```

## How to Run

From the project root, compile the Java files and run a demo class with the Java compiler and runtime.

Example:

```bash
javac -d out $(find src -name "*.java")
java -cp out com.learning.demo.EmployeeDemo
```

You can replace `EmployeeDemo` with any of the following:
- `com.learning.demo.FactorialDemo`
- `com.learning.demo.PrimeNumberDemo`

## Learning Purpose

This project is intended for Java beginners to practice:
- package organization
- class design
- method creation
- console input/output
- utility method reuse
- basic algorithm implementation

## Summary

This is a simple Java project focused on fundamental programming concepts and beginner-level application structure. It serves as a good starting point for learning Java class modeling and utility-based design.
