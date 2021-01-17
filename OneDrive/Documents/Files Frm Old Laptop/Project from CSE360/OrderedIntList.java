package cse360assign3;
/**
 * OrderedIntList class from assignment 1 has been edited to practice test driven development.
 * <p>
 * New methods have been added to the assignment 1 class OrderedIntList. Without changing
 * the data structure of the array, I added methods such as public int size(), public 
 * int length(), and public void delete (int key). The print method has been deleted 
 * since the assignment was not to have no output but to practice using JUnit testing. 
 * With JUnit testing, a new class OrdredIntListTest class has been created linking this
 * class to the testing class.
 * <p>
 * 
 * @author Elias Torres
 * Class ID: 565
 * Assignment 3
 *
 */

public class OrderedIntList {
	/**
	 * Constructors
	 */
	private int[] array;
	private int c; // counter
	
	OrderedIntList() {
	/**
	 * Identifiers
	 */
	 array = new int[10];// initializes a for 10 variables
	 c = 0;// initializes c to equal 0
	 
    }
	/**
	 * Overloaded constructor so size can be specified
	 * @param size
	 */
	OrderedIntList (int size) {
		array = new int[size];
		c = 0;
	}
	/**
	 * Method that returns the current size of the array
	 * @return
	 */
	public int size () { 
		
		return array.length;
		
	}
	/**
	 * Method that returns the # of elements stored in the array
	 * @return
	 */
	public int length () {
		
		return c;
	}
	/**
	 * Method that removes an item from the array
	 * The key is removed from the array if all other items
	 * are up in the array and ascending. Array is never 50%
	 * empty
	 * @param key
	 */
	public void delete (int key) {
		int min;
		int size;
		int position;
		
		position = search (key, 0, c - 1);
		if (position != -1) {
			for (int i = position + 1; i < c; i++)
				array[i - 1] = array[i];
				c--;
		}
		
		min = array[10] / 2;
		if (c < min) {
			size = array[10] * 4 / 10;
			copyOfArray (size);
		}
	}
	/**
	 * Method inserts a value in ascending order without duplicates
	 * Array is increased by 50% if array is full, never overflows
	 * @param v
	 */
	public void insert(int v) {
		int size;
		
		if (c == array.length) {
			size = c + c / 2;
			copyOfArray(size);
		}
		
		int position = 0;
		while (position < c && array[position] < v)
			position++;
		
		//if (position == c) {
		//	if (array[position] != v)  {
		if (position == c || array[position] != v) {// Combined both if statements
				for (int i = c; i > position; i--)
				array[i] = array[i - 1];
			array[position] = v;
			c++;
		}
	}
//}
	/**
	 * Method copies the array but its smaller
	 * @param size
	 */
	private void copyOfArray (int size) {
		int[] temp = new int [size];
		
		for (int i = 0; i < c; i++)
			temp[i] = array[i];
		
			array = temp;
	}
	/**
	 * Method that uses binary search to help array not
	 * become half empty
	 * @param target
	 * @param left
	 * @param right
	 * @return
	 */
	private int search (int target, int left, int right) {
		int middle;
		
		if (left > right) {
			return -1;
		} else {
			 middle = (left + right) / 2;
			if (array[middle] == target) {
				return middle;
			} else {
				if (array[middle] < target) {
					return search (target, middle + 1, right);
				} else {
					return search (target, left, middle - 1);
				}
			}
		}
	}
	
	/**
	 * Returns the integers in the array
	 * separated by space
	 */
	public String toString() {
		
		String str = "";
		if (c > 0) {
			str = "" + array[0];
			for (int i = 1; i < c; i++)
				str = str + " " + array[i];
		}
		return str;
	}
}
		

	
	

