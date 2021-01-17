package chapter7;

//BankAccount class - Updated use in Array of Objects Activity
//Author:  P Baker
//
//Students do not alter this class
import java.text.NumberFormat;

class BankAccount 
{

 private int acctNumber;
 private double balance;
 private String name;


 /** constructs a bank account with zero balance, zero account number
     and name set to Unknown

  */

 public BankAccount() {
		 acctNumber = 0;
		 balance = 0.0;
		 name = "Unknown";
	}

	/*
	  constructs a bank account with an account number, an  initial balance, and
	  an owner!
	 */

	public BankAccount(int acctNo, double initBalance, String owner) {
		acctNumber = acctNo;
		balance = initBalance;
		name = owner;
	}


 //all of the mutator methods - set

 public void setAcctNumber(int acct)
	 {
		    acctNumber = acct;
 }

public void setBalance(double amount)
	 {
	    balance = amount;
 }

 public void setName(String someName)
	 {
		name = someName;
 }

	//all of the accessor methods - get

	public int getAcctNumber()
	{
	    return acctNumber;
 }

 public double getBalance()
	 {
     return balance;
 }

 public String getName()
	 {
	    return name;
 }


 public void deposit(double amount)
{
     balance = balance + amount;
 }

 public void withdraw(double amount) {
     balance = balance - amount;
 }
	 
	 //overloaded method.  charges a fee!
	 public void withdraw(double amount, double fee)
	 {
	 		balance = balance - amount - fee;
	 }

 public String toString()
 {
 	    NumberFormat fmt = NumberFormat.getCurrencyInstance();
			return (" acctNumber "  + acctNumber +  " balance : " + fmt.format(balance)
			   + " name : " + name  );
	}

	
	
}// end of class definition

