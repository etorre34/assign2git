package chapter3;

//Program Name: UsernameGenerator.java
//Author: Elias Torres
//Class: CSC110
//Date Written: 8-Sept-2016
//Brief Description: This program should generate three possible
//					usernames with the several questions I input.

import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {

	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		int num3;
		String result;
		
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		num1 = generator.nextInt(26) + 50;
		num2 = generator.nextInt(101) + 1;
		num3 = generator.nextInt(1001) + 1000;
		
		System.out.println("Welcome. This program will help you create a username.");
		
		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = scan.nextLine();
		
		System.out.print("Enter your birth year: ");
		String birthYear = scan.nextLine();
		System.out.print("\n");
		
		System.out.println("Here are your three possible usernames generated for you:");
		
		result = "" + firstName.substring(0,2) + firstName.length()
		+ lastName + num1;
		System.out.println(result);
		
		result = "" + firstName.substring(0,1) + lastName + birthYear.substring(2,4)
		+ num2;
		System.out.println(result);
		
		result = "" + lastName.substring(0,3) + birthYear.substring(0,2) + firstName
				+ num3;
		System.out.println(result);
		
		scan.close();

	}

}

/* my output
* Welcome. This program will help you create a username.
Enter your first name: Elias
Enter your last name: Torres
Enter your birth year: 1991

Here are your three possible usernames generated for you:
El5Torres56
ETorres9136
Tor19Elias1337
*/

