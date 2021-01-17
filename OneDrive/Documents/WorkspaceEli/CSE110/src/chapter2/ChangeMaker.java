package chapter2;

//Program Name: ChangeMaker.java
//Author: Elias Torres
//Date Written: 05-Sept-2016
//Class: CSC100
//Brief Description: This program makes change (least amount of coins) from a 
//					value of cents 1 to 99. Assume that change is made in quarters, dimes, nickels,
//					and pennies
import java.util.Scanner;


public class ChangeMaker {

	public static void main(String[] args) {
	
		
		int cents, totalCents;
		int quarters, dimes, nickels, pennies;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to ChangeMaker.");
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins\n"
				+ "that equals that amount of change you should recieve.\n");
		

		System.out.print("Case 1\n");
		System.out.print("Please enter an amount from 1 to 99: ");
		cents = scan.nextInt();
		System.out.print("" + cents + " cents in coins can be given as:\n");
		
		totalCents = cents;
		
		quarters = cents / 25;
		cents = cents % 25;
		System.out.println("" + quarters + " quarters");
		
		dimes = cents / 10;
		cents = cents % 10;
		System.out.println("" + dimes + " dimes");
		
		nickels = cents / 5;
		cents = cents % 5;
		System.out.println("" + nickels + " nickels and");
		
		pennies = cents / 1;
		cents = cents % 1;
		System.out.println("" + pennies + " pennies");
		
		System.out.println("\n");
		
		System.out.print("Case 2\n");
		System.out.print("Please enter an amount from 1 to 99: ");
		cents = scan.nextInt();
		System.out.print("" + cents + " cents in coins can be given as:\n");
		
		totalCents = cents;
		
		quarters = cents / 25;
		cents = cents % 25;
		System.out.println("" + quarters + " quarters");
		
		dimes = cents / 10;
		cents = cents % 10;
		System.out.println("" + dimes + " dimes");
		
		nickels = cents / 5;
		cents = cents % 5;
		System.out.println("" + nickels + " nickels and");
		
		pennies = cents / 1;
		cents = cents % 1;
		System.out.println("" + pennies + " pennies");
		
		System.out.println("\n");
		
		System.out.print("Case 3\n");
		System.out.print("Please enter an amount from 1 to 99: ");
		cents = scan.nextInt();
		System.out.print("" + cents + " cents in coins can be given as:\n");
		
		totalCents = cents;
		
		quarters = cents / 25;
		cents = cents % 25;
		System.out.println("" + quarters + " quarters");
		
		dimes = cents / 10;
		cents = cents % 10;
		System.out.println("" + dimes + " dimes");
		
		nickels = cents / 5;
		cents = cents % 5;
		System.out.println("" + nickels + " nickels and");
		
		pennies = cents / 1;
		cents = cents % 1;
		System.out.println("" + pennies + " pennies");
		
System.out.println("\n");
		
		System.out.print("Case 4\n");
		System.out.print("Please enter an amount from 1 to 99: ");
		cents = scan.nextInt();
		System.out.print("" + cents + " cents in coins can be given as:\n");
		
		totalCents = cents;
		
		quarters = cents / 25;
		cents = cents % 25;
		System.out.println("" + quarters + " quarters");
		
		dimes = cents / 10;
		cents = cents % 10;
		System.out.println("" + dimes + " dimes");
		
		nickels = cents / 5;
		cents = cents % 5;
		System.out.println("" + nickels + " nickels and");
		
		pennies = cents / 1;
		cents = cents % 1;
		System.out.println("" + pennies + " pennies");
		
		
		
		scan.close();
	}

}

/* my output
* Welcome to ChangeMaker.
Enter a whole number from 1 to 99.
I will find a combination of coins
that equals that amount of change you should recieve.

Case 1
Please enter an amount from 1 to 99: 88
88 cents in coins can be given as:
3 quarters
1 dimes
0 nickels and
3 pennies


Case 2
Please enter an amount from 1 to 99: 51
51 cents in coins can be given as:
2 quarters
0 dimes
0 nickels and
1 pennies


Case 3
Please enter an amount from 1 to 99: 17
17 cents in coins can be given as:
0 quarters
1 dimes
1 nickels and
2 pennies


Case 4
Please enter an amount from 1 to 99: 4
4 cents in coins can be given as:
0 quarters
0 dimes
0 nickels and
4 pennies
*/

