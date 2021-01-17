package src.com.csc205.projects.project4;
/**
 * Recursion class to show and print recursions in driver class.
 * <p>
 * This class uses methods to be used for the driver class. These methods are the 
 * different type of formulas to perform the factorial, fibonacci, gcd, power, 
 * and the ackerman functions. 
 * <p>
 * 
 * Author Elias Torres
 *
 */

public class Recursion {
	/**
	 * Uses an if statement with the 
	 * factorial recursion formula to return 
	 * the result.
	 * @param n
	 * @return
	 */
	public static int fact(int n) {
		if (n == 0) 
			return 1;
		
		else
			
		return (n * fact(n-1));
	}
	/**
	 * Use an if statement with the 
	 * fibonacci recursion formula to 
	 * return the result.
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		if (n <= 1)
			return n;
		
		else
			
		return fib(n -1) + fib(n-2);
	}
	/**
	 * Uses an if statement with the GCD
	 * formula to return the result.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int gcd(int num1, int num2) {
		if (num2 == 0) 
			return num1;
		else 
			
		return gcd(num2, num1 % num2);
	}
	/**
	 * Uses an if statement with the power
	 * function to return the results.
	 * @param x
	 * @param y
	 * @return
	 */
	public static int power(int x, int y) {
		if (y == 0)
			return 1;
		
		return (x * power(x, y - 1));
	}
	/**
	 * Uses an if statment with the ackerman
	 * formula to return the results of m and n.
	 * @param m
	 * @param n
	 * @return
	 */
	public static int ack(int m, int n) {
		if (m == 0) {
			
			return n + 1;
			
		} else if (m > 0 && n == 0) {
			
			return ack(m - 1, 1);
			
		} else if (m > 0 && n > 0)
			
			return ack(m - 1, ack(m, n - 1));
			return n;
			
		}
	}
