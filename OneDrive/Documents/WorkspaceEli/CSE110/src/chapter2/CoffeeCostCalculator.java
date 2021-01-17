package chapter2;

//In Class Activity : 2.1
//Program Name : CoffeeCostCalculator
//Author : Elias Torres Devin Frazee
//Date Written: 8-29-2016
//Class : CSC110
//Brief Description:  
//        This program calculates the cost of a cup of coffee everyday for a week and then for a year.
import java.util.Scanner;  //Needed for the Scanner class


public class CoffeeCostCalculator
{

	public static void main(String[] args)  //all the action happens here!
	{

		 //define all variables and assign values
		final int WEEK = 7;
		final int WEEKYEAR = 52;
		final int MONTH = 30;
		 double javaCup = 2.25;
		 double javaCupweek;
		 double javaCupyear;
		 double javaCupmonth;

		 Scanner scan = new Scanner(System.in);

		 System.out.print("Enter the cost of cup of coffee: ");
		 javaCup = scan.nextDouble();
		 
		 
		 
		  //perform area calculation 
		 javaCupweek = javaCup * WEEK;
		 javaCupyear = javaCupweek * WEEKYEAR;
		 javaCupmonth = javaCup * MONTH;
		 

		 //now display your answer
		 System.out.println("Coffee Cost Calculator");
		 System.out.println("----------------------");
		 System.out.println("The cost of one cup of coffee:  " + "$" + javaCup);
		 System.out.println("The cost of one week of coffee:  " + "$" + javaCupweek);
		 System.out.println("The cost of one month of coffee:  " + "$" + javaCupmonth);
		 System.out.println("The cost of one year of coffee:  " + "$" + javaCupyear);
		 

		 scan.close();
	} //end of the main method


} // end of the class 

/* my output
Enter the cost of cup of coffee: 2.25
Coffee Cost Calculator
----------------------
The cost of one cup of coffee:  $2.25
The cost of one week of coffee:  $15.75
The cost of one month of coffee:  $67.5
The cost of one year of coffee:  $819.0
*/

