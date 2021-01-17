package com.csc205.activities.activity4;

public class Activity4 {

	public static void main(String[] args) {
		
		Recursion.test(1);

		System.out.println("Test Activity 4:");
		System.out.println("Factorial:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		System.out.println("\n\nFibonacci:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		// Test Euclid's algorithm : Copy this into Project 4
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));
		System.out.println();

	}

}
