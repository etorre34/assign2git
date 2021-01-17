package src.com.csc205.projects.project6;

import java.util.Stack;
import src.com.csc205.demos.module6.LinkedStack;

/**
 * Project6 class use to print out stacks and palindromes.
 * <p>
 * This class holds methods to link to the driver class so it can use the
 * methods to implement a stack and tell if the phrases are a palindrome. 
 * There is also methods that will reverse the palindrome string lines
 * so it can be read backwards. The methods to put the palindromes 
 * backwards are unfortunely not working due to running short of time to fix it.
 * <p>
 * Output: 
 * 
 * <pre>
 * Stack: [Fourth, Second, First]
 *Are we not drawn onward to new era is NOT a palindrome.
 *A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama! is NOT a palindrome.
 *I'm pretty sure this isn't a palindrome. is NOT a palindrome.
 *
 *
 *Are we not drawn onward to new era
 *Hello Asa and Anna!  Goodbye
 *A few palindromes are tot, anna, hannah, qwertytrewq, but not these hello abcdefg.
 *</pre>
 *
 * @author Elias Torres
 *
 */

public class Project6 {
	/**
	 * LinkedStack list implementing a string
	 */
	static LinkedStack<String> stack;

	
	public Project6() {
		/**
		 * New Constructor
		 */
		stack = new LinkedStack<>();
	
		
	}
	/**
	 * To check if strings are palindromes
	 * @param s
	 */
	static void checkPalindrome(String s) {
		  if (Project6.isPalindrome(s))
			   System.out.println(s + " is a palindrome.");
		  else
			  System.out.println(s + " is NOT a palindrome.");
	}

	/**
	 * To reverse the string lines
	 * @param s
	 */
	static void changeIt(String s) {
		String reverse = " "; 
		
		if (Project6.isPalindrome(s))
		// for(int x = 0; x < s.length(); x++)
		// {
		//	 stack.push(s.charAt(x) + " ");
		// }
			System.out.println(s); 
		 // for (int x = 0; x < s.length(); x++) 
		//  {
			 // reverse += stack.pop() + " ";
		 // }
			 
			//if (reverse.equals(reverse)) {
			//	System.out.println(s);
			else
				System.out.println(s);
}
			
		/**
		 * Uses stack to put palindrones in order
		 * @param s
		 * @return
		 */
		public static boolean isPalindrome(String s) {
		String line = s.replaceAll("[.,<>?';:\"\\]\\[{}!@#$%^&*()_+-=]+", "");
			
			
		    if (s.length() < 2) {
		        return true;
		    } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
		        return isPalindrome(s.substring(1, s.length() - 1));
		    } else {
		        return false;
		    }

		    
		}
		
}



	

