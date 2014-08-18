//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************

import java.util.Random;

public class Account {
	private double balance;
	private String name;
	private int acctNum;

	private static double total_deposit = 0;
	private static double total_withdrawal = 0;
	private static int num_deposit = 0;
	private static int num_withdrawal = 0;

	Random generator = new Random();

	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Account(double initBal, String owner, int number) {
		balance = initBal;
		name = owner;
		acctNum = generator.nextInt(number);
	}

	//-------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			total_withdrawal += amount;
			num_withdrawal += 1;
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	//-------------------------------------------------
	// Adds deposit amount to balance.
	//-------------------------------------------------
	public void deposit(double amount) {
		balance += amount;
		total_deposit += amount;
		num_deposit += 1;
	}

	//-------------------------------------------------
	// Returns balance.
	//-------------------------------------------------
	public double getBalance() {
		return balance;
	}

	//-------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//-------------------------------------------------
	public String toString() {
		return "Name:" + name +
		"\nAccount Number: " + acctNum +
		"\nBalance: " + balance;
	}

	public int getAcctNumber() {
		return acctNum;
	}

	public void printSummary() {
		System.out.println(toString());
	}

	public static int getNumDeposits() {
		return num_deposit;
	}

	public static int getNumWithdrawals() {
		return num_withdrawal;
	}

	public static double getTotalDeposits() {
		return total_deposit;
	}

	public static double getTotalWithdrawals() {
		return total_withdrawal;
	}
}
