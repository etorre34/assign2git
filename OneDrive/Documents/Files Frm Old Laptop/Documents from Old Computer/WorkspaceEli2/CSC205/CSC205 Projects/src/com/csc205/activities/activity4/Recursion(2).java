package com.csc205.activities.activity4;

public class Recursion {

	public static int fact(int n) {
		if(n==1)
			return 1;
		int value = n * fact(n-1);
		return value;
	}

	public static void test(int value) {
		/*if (value == -1) {
			return;
		}

		System.out.println(value++);
		test(value);*/
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		int f = fib(n - 1) + fib(n - 2);
		return f;
	}

	public static int gcd(int num1, int num2) {
		//case 1:
		if (num2 <= num1 && num1 % num2 == 0) {
			return num2;
		}
		//case 2:
		if (num1 < num2) {
			return gcd(num2, num1);
		}
		//case 3:
		return gcd(num2, num1 % num2); 
	}

	public static int power(int x, int y) {
		// TODO Implement for Project 4
		return 0;
	}

	public static int ack(int m, int n) {
		// TODO Implement for Project 4
		return 0;
	}
}
