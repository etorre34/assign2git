package chapter2;

import java.util.Scanner;

public class AreaCalculationSolution {

	//In Class Activity .  Ch 2
	 //Program Name : AreaCalculationSolution
	 //Author : PBaker
	 //Date Written: 
	 //Class : 
	 //Brief Description:  This program calculates the area of a rectangle.  area = length * width

	/*Notes:   	  
	-Write pseudocode first
	-Emphasize header info
	- Introduce variable declaration and assignment.
	-Show Scanner Class	.
	-Style - variable names, indentation, white space		
	 */


	//import java.util.Scanner;  //Needed for the Scanner class

		public static void main(String[] args)
		{

			/*for now this is where all of the action
			  will be performed.  In this example program
			  we will declare and assign values to variables
			  and then display an answer using System.out.println.

			  We will then introduce the use of Scanner
			  to prompt the user for a value.

			 */

			 int area;
			 int length;
			 int width = 10;  //declare and assign in one statement
			 
			 length = 20;

		   //use the Scanner class.  Will need to import java.util.Scanner
			Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter the length:" );
			length = scan.nextInt();
			
			System.out.print("Enter the width: ");
			width = scan.nextInt();
			
			  //perform area calculation and display
			 area = length * width;

			 //now display your answer
			 System.out.println("The area is:  " + area);


		}
}



	

