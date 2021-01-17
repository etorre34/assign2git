package chapter1;

public class HelloSolution {

	//Program Name:  	HelloSolution.java
	//Author:  			Your name
	//Class:  			Your class
	//Date:  			Todays date
	//Description:  	This program tests our software installs. Introduces some basic concepts from
//	                Chapter 1 and 2.  Topics : comment header, 
//	                basic program structure, add both kinds of comments, syntax,
//	                print, println, escape sequences, concatenation. 
		public static void main (String[] args)
		{
			System.out.println("Hello World!");
			
			System.out.println("Java is great!");
			
			System.out.println();  //just a blank line
			
			//print vs. println
			System.out.print("Three...");
			System.out.print("Two...");
			System.out.println("One...");
			System.out.println("Blast Off!");
			
			//Escape sequences
			System.out.println("\nHouston \n \twe have a problem!");
			System.out.println("\tStay calm!");
			
			
			//concatenation 
			System.out.println("This is a silly example to show "
			   + "how to concatenate strings.");
			
			
			
		}
	}

	/* Example output

	   ----jGRASP exec: java HelloSolution
	    
	    Hello World!
	    Java is great!
	    
	    Three...Two...One...
	    Blast Off!
	    
	    Houston 
	     	we have a problem!
	    	Stay calm!
	    This is a silly example to show how to concatenate strings.
	    
	     ----jGRASP: operation complete.


	*/

