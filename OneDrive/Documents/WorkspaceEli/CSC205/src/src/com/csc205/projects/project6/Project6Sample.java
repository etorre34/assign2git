package src.com.csc205.projects.project6;

import java.util.Stack;
import src.com.csc205.demos.module6.LinkedStack;
/**
 * Driver class to use with Project6 class
 *
 */
//   This class performs some basic tests on your stack & queue classes as well as your 
//   changeit & palindrome method.  It assumes you have a class called Project6 with 
//   methods called changeIt() and isPalindrome()

/* Sample output:
		Stack: top -> Fourth Second First 
		Queue: front -> Third Fourth Fifth  <- rear
		
		Are we not drawn onward to new era is a palindrome.
		A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama! is a palindrome.
		I'm pretty sure this isn't a palindrome. is NOT a palindrome.
		
		
		erA ew ton nward drawno ot wen are 
		olleH dna eybdooG 
*/

public class Project6Sample {

	public static void main(String[] args) {
		
		/**
		 * String lines to be used to identify
		 * it it's a palindrone.
		 */
		String line = "Are we not drawn onward to new era";
		String line2 = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
		String line3 = "I'm pretty sure this isn't a palindrome.";
		String line4 = "Hello Asa and Anna!  Goodbye";
		String line5 = "A few palindromes are tot, anna, hannah, qwertytrewq, but not these hello abcdefg.";

		Stack<String> s = new Stack<String>();

		/**
		 * Methods to use with a Stack list
		 */
		//Test Stack
		s.push("Fourth");
		s.push("Second");
		s.push("Third");
		s.pop();
		s.push("First");
		s.push("Fifth");
		s.pop();
		
		System.out.println("Stack: " + s);
		
		//q.enqueue("First");
		//q.enqueue("Second");
		//q.enqueue("Third");
		//q.dequeue();
		//q.enqueue("Fourth");
		//q.enqueue("Fifth");
		//q.dequeue();
		
		//System.out.println("Queue: " + q + "\n");
		
		/**
		 * To check if palindrome methods work.
		 */
		//Check if the palindrome method works 
	    Project6.checkPalindrome(line);
	    Project6.checkPalindrome(line2);
	    Project6.checkPalindrome(line3);
	    
	    System.out.println("\n");
	    
	    /**
	     * To put the methods in reverse.
	     */
	    // Check if the changeIt method works
	   Project6.changeIt(line);
	   Project6.changeIt(line4);
	   Project6.changeIt(line5);
	}
	  
	
	
	}
	
	
	
	
		
