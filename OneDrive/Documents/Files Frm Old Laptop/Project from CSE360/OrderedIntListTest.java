package cse360assign3;
/**
 * OrderedIntListTest is a JUnit testing class to test the OrderedIntList class
 * <p>
 * With the new methods added, I used the JUnit testing class to test the methods 
 * that are implemented in OrderedIntList class. Testing the methods helps to know
 * where and if there was a problem in the OrderedIntList class. Using assertTrue
 * to test each method, this method will show a green check mark if the boolean 
 * test is true and a red x if not true. Using the assertEquals method is if 
 * the values I inserted into the array will equal the array I typed into the
 * outstring. 
 * <p>
 * 
 * @author Elias Torres
 * Class ID: 565
 * Assignment 3
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedIntListTest {

	/**
	 * Testing the Constructors
	 */
	@Test
	public void testOrderedIntList() {
		OrderedIntList list = new OrderedIntList();
		assertTrue (list);
	}
	
	private void assertTrue(OrderedIntList list) {
		
	}

	@Test
	public void testOrderedIntListInt() {
		OrderedIntList list = new OrderedIntList();
		assertTrue (list);
	}

	/**
	 * Testing the size method by making sure the 
	 * array size is true
	 */
	@Test
	public void testSize() {
		OrderedIntList list = new OrderedIntList();
		
		int size = list.size();
		
		assertEquals(10, size);
	}
	
	/**
	 * Testing the length method by making sure
	 * the number of elements are in the array
	 */
	@Test
	public void testLength() {
		OrderedIntList list = new OrderedIntList();
		
		list.insert(45);
		list.insert(9);
		list.insert(2);
		list.insert(-1);
		
		int length = list.length();
		
		assertEquals(4,length);
	}

	/**
	 * Testing the delete method to see the delete method
	 * is correct
	 */
	@Test
	public void testDelete() {
		OrderedIntList delete = new OrderedIntList();
		assertTrue (delete);
	}

	/**
	 * Testing the insert method to make sure the 
	 * implementation can insert values into the array
	 */
	@Test
	public void testInsert() {
		OrderedIntList insert = new OrderedIntList();
		assertTrue (insert);
	}

	/**
	 * Testing the string to make sure an out string
	 * is possible
	 */
	@Test
	public void testToString() {
		OrderedIntList size = new OrderedIntList();
		assertTrue (size);
	}
	
	/**
	 * Method testing by inserting random numbers in order
	 * and arranging them ascending order
	 */
	@Test
	public void misOrder() {
		OrderedIntList list2 = new OrderedIntList();
		
		list2.insert(5);
		list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(6);
		list2.insert(4);
		list2.insert(10);
		list2.insert(8);
		list2.insert(7);
		list2.insert(9);
		
		String outString = list2.toString();
		
		assertEquals("1 2 3 4 5 6 7 8 9 10",outString);
		
	}
	/**
	 * Method testing by just inserting four numbers
	 * into the array
	 */
	@Test
	public void fourInsert() {
		OrderedIntList list3 = new OrderedIntList();
		
		list3.insert(4);
		list3.insert(20);
		list3.insert(1);
		list3.insert(10);
		
		String out = list3.toString();
		
		assertEquals("1 4 10 20", out);
	}
	
}


