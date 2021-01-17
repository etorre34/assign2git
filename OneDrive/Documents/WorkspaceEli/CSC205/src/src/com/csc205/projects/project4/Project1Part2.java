package src.com.csc205.projects.project4;

import java.util.Scanner;
/**
 * 
 * @author Elias Torres
 *
 */
public class Project1Part2 {

	public static void main(String[] args) {
	
	/**
	 * Initialize a variable x
	*/
	int x; 

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for X:  ");
		int num = scan.nextInt();
		/**
		 * For loop to create an 
		 * array with X.
		 */
		for (x = 1; x < num; x++)
		{
			boolean Three = x % 3 == 0;
			boolean Five = x % 5 == 0;
			boolean Skip = x % 7 != 0;
			
			 if (Three && Five && Skip)
			{
				
				System.out.print(" fifteen ");
			}
			 else if (Three & Skip)
			{
				
				System.out.print("three ");
			}
			else if (Five && Skip)
			{
				System.out.print(" five ");
			}
			 /**
			  * Skip the element 7 and other 
			  * multiples of 7.
			  */
			else if (Integer.valueOf(x).toString().indexOf("7") != -1)
				{
				System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("14") != -1)
				{
				System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("21") != -1)
				{
				System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("28") != -1)
				{
				System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("35") != -1)
				{
				System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("42") != -1)
				{
					System.out.print("");
				}
			else if (Integer.valueOf(x).toString().indexOf("49") != -1)
				{
					System.out.print("");
				}
			else if (x % 11 == 0)
			{
				System.out.print(x + " ");
				x++;
			}
			else
			{
				System.out.print(x + " ");
			
			}
			 /**
			  * If statement to have 
			  * 15 elements per line.
			  */
			 if (x % 10 == 0) {
				 System.out.print(x);
				 System.out.println();
			 }
		
			 scan.close();
		}
			
	}
}


