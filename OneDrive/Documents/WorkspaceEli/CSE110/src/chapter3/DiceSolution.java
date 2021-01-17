package chapter3;

//**************************************************************
//Program Name: DiceSolution.java
//
//Author : PBaker
//Date Written : 
//Class : CSC110AA and CIS163AA
//
//Brief Description:
//Simulates the rolling of a pair of dice.
//Reviewing using the Random class
//
//Challenges reviews Scanner and String classes
//**************************************************************

import java.util.Random;

import java.util.Scanner; //needed for challenge

public class DiceSolution
{
 //-----------------------------------------------
 // Rolls two die by generating two random numbers
 // in the range 1 - 6.
 //-----------------------------------------------
 public static void main (String[] args)
 {
		//declare 3 integer variables:  die1, die2 and totalRoll
		int die1;
		int die2;
		int totalRoll;
		
		String word1, word2, gameName;  //needed for Challenge 1
		int num;  //needed for Challenge 2
		
		Scanner scan = new Scanner(System.in);

		//create a Random object called generator
		Random generator = new Random();

		//generate a random number between 1 and 6 for die1 and die2
		die1 = generator.nextInt(6) + 1;
		die2 = generator.nextInt(6) + 1;

		//compute totalRoll
		totalRoll = die1 + die2;

		System.out.println();
		System.out.println ("You rolled " + die1 + " and " + die2 +
					" for a total of " + totalRoll + ".");
		System.out.println();
		
		//Challenge 1:  Create your Game Name Alias
		// Prompt the user for two words
		//create alias as the first initial of the first word and the second word
		//example  smart Student gives a gameName of sStudent
		//generate a random number between 100 - 200
		
		System.out.println("Create your Game Name");
		System.out.print("Enter the first word: ");
		word1 = scan.nextLine();     //this is the same as word1 = new String(scan.nextLine() );
		System.out.print("Enter the second word: ");
		word2 = scan.nextLine();
		gameName = word1.substring(0,1) + word2;
		System.out.println("Challenge 1 : Your game name is : " + gameName);
		
		//Challenge 2:  Add to the Game Name Alias
		//generate a random number between 100 - 200 and add to end of Game Name
		num = 100 + generator.nextInt(101);
		gameName = gameName + num;  //will concatenate num with the String gameName
		System.out.println("Challenge 2 : Your game name is : " + gameName);
		
 }
}

/* Example output:

You rolled 6 and 4 for a total of 10.
 
Create your Game Name
Enter the first word: smart
Enter the second word: Student
Challenge 1 : Your game name is : sStudent
Challenge 2 : Your game name is : sStudent166

*/

