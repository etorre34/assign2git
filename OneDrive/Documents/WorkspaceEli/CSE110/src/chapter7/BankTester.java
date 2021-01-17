package chapter7;
//BankTester class - Updated use in Array of Objects Activity
//Author:  P Baker
//Uses the Bank and BankAccount classes
//
//Students fill in as indicated with **


import java.util.Scanner;
import java.text.NumberFormat;

public class BankTester {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		int size = 3;
		
		Bank wellsFargo = new Bank();
		
		System.out.println("Load the bank with BankAccounts");
		
		for(int i = 0; i < size; i++)
		{
			int acctNo;
			double initBalance;
			String owner;
			System.out.print("Enter the account number, balance, and owner: ");
			acctNo = scan.nextInt();
			initBalance = scan.nextDouble();
			owner = scan.nextLine();
			
			//Add a BankAccount object to wellsFargo
			wellsFargo.add(new BankAccount(acctNo, initBalance, owner));		
		}
		
		System.out.println("\nWells Fargo Accounts");
		//**display all the account information in wellsFargo
		wellsFargo.displayAllBankAccounts();
		
		//**display the total cash in wellsFargo
		System.out.println("Total Cash in Wells Fargo Bank: " + fmt.format(wellsFargo.getTotalCash()) );
		
		System.out.println("Bank Closed");
		scan.close();

	}

}
/*
Load the bank with BankAccounts
Enter the account number, balance, and owner: 1111 550.50 Minnie Mouse
Enter the account number, balance, and owner: 2222 325.25 Donald Duck
Enter the account number, balance, and owner: 3333 850.25 Bart Simpson

Wells Fargo Accounts
BankAccount #0:  acctNumber 1111 balance : $550.50 name :  Minnie Mouse
BankAccount #1:  acctNumber 2222 balance : $325.25 name :  Donald Duck
BankAccount #2:  acctNumber 3333 balance : $850.25 name :  Bart Simpson
Total Cash in Wells Fargo Bank: $1,726.00
Bank Closed

*/

