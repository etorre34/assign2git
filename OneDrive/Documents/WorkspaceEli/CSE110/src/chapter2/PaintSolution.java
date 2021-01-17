package chapter2;

//**********************************************************
//In class Activity - ch 2  
//Program Name : PaintSolution.java
//
//Author:
//Date Written : 
//Class:
//
//Brief Description:
//Determine how much paint is needed to paint the walls
//of a room given its length, width, and height in feet
//**********************************************************
import java.util.Scanner;

public class PaintSolution
{
public static void main(String[] args)
{
final int COVERAGE = 350;  //paint covers 350 sq ft/gal
final int DOOR_AREA = 20;
final int WINDOW_AREA = 15;

Scanner scan = new Scanner(System.in);

//declare double  variables for  length, width, height, totalSqFt, and paintNeeded;
double length;
double width;
double height;
double totalSqFt;
double paintNeeded;

// declare int variables numDoors and numWindows
int numDoors;
int numWindows;	

//Prompt for and read in the length of the room
System.out.print ("Enter the length of the room: ");
length = scan.nextDouble();

//Prompt for and read in the width of the room
System.out.print ("Enter the width of the room: ");
width = scan.nextDouble();

//Prompt for and read in the height of the room
System.out.print ("Enter the height of the room: ");
height = scan.nextDouble();

// Prompt for and read in the number of doors and windows
System.out.print ("How many doors are in the room? ");
numDoors = scan.nextInt();

System.out.print ("How many windows are in the room? ");
numWindows = scan.nextInt();

//Compute the total square feet to be painted--think
//about the dimensions of each wall
totalSqFt = 2 * width * height + 2 * length * height;

// Subtract off the area of the windows and doors
totalSqFt = totalSqFt - numDoors * DOOR_AREA - numWindows * WINDOW_AREA;

//Compute the amount of paint needed
paintNeeded = totalSqFt / COVERAGE;

//display your results  
System.out.println();
System.out.println (paintNeeded + " gallons of paint are needed to "
		    + "paint a room " + width + " feet wide by ");
System.out.println(length + " feet long by " + height + " feet high with "
	   + numDoors + " doors and " + numWindows + " windows.");
}
}

/* Output

Enter the length of the room: 25
Enter the width of the room: 20
Enter the height of the room: 10
How many doors are in the room? 0
How many windows are in the room? 0

2.5714285714285716 gallons of paint are needed to paint a room 20.0 feet wide by 
25.0 feet long by 10.0 feet high with 0 doors and 0 windows.


Enter the length of the room: 25
Enter the width of the room: 20
Enter the height of the room: 10
How many doors are in the room? 1
How many windows are in the room? 2

2.4285714285714284 gallons of paint are needed to paint a room 20.0 feet wide by 
25.0 feet long by 10.0 feet high with 1 doors and 2 windows.

*/
