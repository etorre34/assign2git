package src.com.csc205.projects.project4;
 
import java.util.Scanner;

public class Project1 {
	/**
	 * 
	 * @author torre
	 *
	 */
	static class Recursion{
		/**
		 * Non-recursive function that
		 * will return n.
		 * @param input
		 * @return
		 */
		static int fact (int input)
		{
			int n, fact = 1;
			for (n= input; n > 1; n--)
				fact *= n;
			return fact;
		}
}
		
	public static void main(String[] args) {
		
		Recursion nested = new Recursion();
		System.out.println("Non-Recursive Fact(n):");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a large number: ");
		int n = scan.nextInt();
		int result = fact(n);
		System.out.println("The factorial of " + n + " is: " + result);
		
		System.out.println("Below shows the maximum values this program will compute:");
		for (int nn = 0; nn<100; nn ++) {
			System.out.println(Recursion.fact(nn) + "   ");
		}

	}
	/**
	 * For loop to return results
	 * @param n
	 * @return
	 */
	public static int fact(int n) {
		int result = 1;
			for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;

	}
}

