package src.com.csc205.projects.project9;

import src.com.csc205.projects.project9.jsjf.ArrayHeap;

/**
 * Project 9 driver class will be used to implement a stack using the heap implementation.
 * 
 * <p>
 * The usage of this driver is to implement the various classes that was provided such as a
 * Binary Search Tree List and Linked Binary Search Tree and other various classes to implement
 * a heap. To use a heap is another binary tree that uses two properties added to the original property
 * of the binary tree. 
 * <p>
 * 
 * output
 * 
 * <pre>
 * List of tokens [size=16]:
 *	This
 * is
 *a
 *really
 *cool
 *test
 *string!
 *Time
 *to
 *think
 *of
 *more
 *ways
 *to
 *do
 *this.
 *
 *Items from stack [size=16]:
 *This
 *is
 *a
 *really
 *cool
 *test
 *string!
 *Time
 *to
 *think
 *of
 *more
 *ways
 *to
 *do
 *this.
 *
 *Items from MinHeap [size=16]:
 *This
 *Time
 *a
 *cool
 *do
 *is
 *more
 *of
 *really
 *string!
 *test
 *think
 *this.
 *to
 *to
 *ways
 *<pre>
 *
 *

 * 
 * 
 * @author Elias Torres
 *
 */

public class Project9 {

	public static void main(String[] args) {

		/**
		 * Creates a new HeapStack and ArrayHeap object
		 */
		// Create a stack and minHeap to work with
		HeapStack<String> stack = new HeapStack<>();
		ArrayHeap<String> minHeap = new ArrayHeap<>();
		
		/**
		 * Creates a string to test the implementation
		 */
		// Create a test string
		String testString = "This is a really cool test string! Time to think of more ways to do this.";
		
		/**
		 * Tokes that is a string to make whitespace
		 */
		// Split on any number of whitespace characters
		String[] tokens = testString.split("\\s+"); 
		
		/**
		 * Print the token as strings
		 */
		// Print tokens
		System.out.println("List of tokens [size=" + tokens.length + "]:");
		for (String s : tokens) {
			System.out.println(s);
		}
		
		/**
		 * Adds vales to the stack being made
		 */
		// Add values to stack
		for (String s : tokens) {
			stack.push(s);
		}
		
		// Add values to minHeap
		for (String s : tokens) {
			minHeap.addElement(s);
		}
		/**
		 * Prints the values in the stack
		 */
		// Print values from stack
		System.out.println("\nItems from stack [size=" + stack.size() + "]:");
		int stackSize = stack.size();
		for (int x = 0; x < stackSize; x++) {
			System.out.println(stack.pop());
		}
		
		/**
		 * Prints the minHeap binary tree
		 */
		// Print values from minHeap
		System.out.println("\nItems from MinHeap [size=" + minHeap.size() + "]:");
		int minHeapSize = minHeap.size();
		for (int x = 0; x < minHeapSize; x++) {
			System.out.println(minHeap.removeMin());
			
		
		}
			
			
	}

}



