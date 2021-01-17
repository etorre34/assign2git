package chapter2;

//Program Name: Seconds.java
//Author: Elias Torres
//Class: CSC110
//Date Written: 31-Aug-2016
//Brief Description: This program should display the equivalent total time in seconds.


import java.util.Scanner;

public class Seconds {

	public static void main(String[] args) {
		
		int totalSeconds;
		final int CONVERSION_FACTOR = 60;
			
		Scanner scan = new Scanner(System.in);
		
		    int hours;
		    int minutes;
			int seconds;
			
		System.out.println("Case 1");	
			
		System.out.print ("Enter the number of hours:");
		hours = scan.nextInt();
		
		System.out.print ("Enter the number of minutes:");
		minutes = scan.nextInt();
			
		System.out.print ("Enter the number of seconds:");
		seconds = scan.nextInt();
		
		totalSeconds = seconds + (minutes * CONVERSION_FACTOR) + (hours * CONVERSION_FACTOR * 
				CONVERSION_FACTOR);
		
		System.out.println("");
		System.out.println("Total seconds: " + totalSeconds);
		System.out.println("");
		
		System.out.println("Case 2");	
		
		System.out.print ("Enter the number of hours:");
		hours = scan.nextInt();
		
		System.out.print ("Enter the number of minutes:");
		minutes = scan.nextInt();
			
		System.out.print ("Enter the number of seconds:");
		seconds = scan.nextInt();
			
		totalSeconds = seconds + (minutes * CONVERSION_FACTOR) + (hours * CONVERSION_FACTOR * 
				CONVERSION_FACTOR);
		
		System.out.println("");
		System.out.println("Total seconds: " + totalSeconds);
		System.out.println("");
		
System.out.println("Case 3");	
		
		System.out.print ("Enter the number of hours:");
		hours = scan.nextInt();
		
		System.out.print ("Enter the number of minutes:");
		minutes = scan.nextInt();
			
		System.out.print ("Enter the number of seconds:");
		seconds = scan.nextInt();
			
		totalSeconds = seconds + (minutes * CONVERSION_FACTOR) + (hours * CONVERSION_FACTOR * 
				CONVERSION_FACTOR);
		
		System.out.println("");
		System.out.println("Total seconds: " + totalSeconds);
		
		scan.close();
		
				
	}
}//end of main method
	
/* my output
* Case 1
Enter the number of hours:1
Enter the number of minutes:1
Enter the number of seconds:2

Total seconds: 3662

Case 2
Enter the number of hours:1
Enter the number of minutes:45
Enter the number of seconds:0

Total seconds: 6300

Case 3
Enter the number of hours:0
Enter the number of minutes:6
Enter the number of seconds:0

Total seconds: 360
*/


