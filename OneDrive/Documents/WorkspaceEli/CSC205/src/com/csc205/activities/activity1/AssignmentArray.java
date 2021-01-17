package com.csc205.activities.activity1;
/**
 * Program of the array
 * @author torre
 *
 */
public class AssignmentArray {

	public static void main(String[] args) {
		
		int b[] = new int[4];
		
		b[0] = 7;
		b[1] = 8;
		b[2] = 9;
		b[3] = 12;
		
		for (int i=0; i < 1; i++) {
			System.out.println("First element of the array: ");
			System.out.println(b[i] + "\n");
		}
			System.out.println("All the elements in the array: ");
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
				
			}
		System.out.println("");
		System.out.println("Sum of element one and element two: ");
		System.out.println(b[0] + b[1]);


	}

}
