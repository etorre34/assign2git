package src.com.csc205.projects.project8.jsjf;

import java.util.Iterator;

/**
 * The SearchTreeDriver class will be used to test the LinkedbinarySearchTree class to make sure
 * I have the correct implementations for the driver to function. 
 * <p>
 * The usage of this class consists of methods such as adding elements and finding the minimum and 
 * maximum of my linked binary search tree. To make sure these methods will call the right methods
 * in the LinkedBinarySearchTree class, I made sure to implement methods such as removeMax, findMin,
 * findMax, find getLeft, and getRight. Once these implementations are correct, this driver will
 * be able to function.
 * <p>
 * 
 * output
 * 
 * <pre>
 *Min:1
 *Max:12
 *Tree: 1,2,3,4,5,6,7,8,9,10,11,12
 * 
 * <pre>
 * @author Elias Torres
 *
 */
public class SearchTreeDriver {

	public static void main(String[] args) {
		
		/**
		 * Method is used to create a new LinkedBinarySearchTree
		 */
		LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
		
		/**
		 * This adds integers to the binary search tree
		 */
		tree.addElement(12);
		tree.addElement(10);
		tree.addElement(9);
		tree.addElement(8);
		tree.addElement(6);
		tree.addElement(7);
		tree.addElement(4);
		tree.addElement(5);
		tree.addElement(3);
		tree.addElement(11);
		tree.addElement(2);
		tree.addElement(1);
		
		

		System.out.println("Min:" + tree.findMin());
		System.out.println("Max:" + tree.findMax());
		
		System.out.print("Tree: " + tree.find(1) + "," + tree.find(2) + "," + tree.find(3) + "," + tree.find(4) + "," +
				tree.find(5) + "," + tree.find(6) + "," + tree.find(7) + "," + tree.find(8) + "," + tree.find(9) + "," 
				+ tree.find(10) + "," + tree.find(11) + "," + tree.find(12));
		
		
     

		
		
		

	}

}
