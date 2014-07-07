//	ManageAccounts.java
//
//	Use Account class to create and manage Sally and Joe's
//	bank accounts
// ************************************************************

public class ManageAccounts {

	public static void main(String[] args) {

		Account acct1, acct2;

		// create account1 for Sally with $1000
		acct1 = new Account(1000, "Sally", 1111);

		// create account2 for Joe with $500
		acct2 = new Account(500, "Joe", 2222);

		// display initial balance
		System.out.println("---------------------------------------");
		System.out.println("Initial Balance of Accounts:");
		System.out.println(acct1.getName() + ": " + acct1.getBalance());
		System.out.println(acct2.getName() + ": " + acct2.getBalance());
		System.out.println("---------------------------------------");

		// deposit $100 to Joe's account
		acct2.deposit(100);
		System.out.println(acct2.getName() + " deposites 100.");

		// print Joe's new balance (use getBalance())
		System.out.println(acct2.getName() + "'s New Balance is: " + acct2.getBalance());

		System.out.println("---------------------------------------");

		// withdraw $50 from Sally's account
		acct1.withdraw(50);
		System.out.println(acct1.getName() + " withdraws 50.");

		// print Sally's new balance (use getBalance())
		System.out.println(acct1.getName() + "'s New Balance is: " + acct1.getBalance());

		System.out.println("---------------------------------------");

		// charge fees to both accounts
		acct1.chargeFee();
		acct2.chargeFee();
		System.out.println("Charged both accounts by 10:");
		System.out.println(acct1.getName() + "'s New Balance is: " + acct1.getBalance());
		System.out.println(acct2.getName() + "'s New Balance is: " + acct2.getBalance());
		System.out.println("---------------------------------------");

		// change the name on Joe's account to Joseph
		acct2.changeName("Joseph");
		System.out.println("Account 2's new name is " + acct2.getName());
		System.out.println("---------------------------------------");

		// print summary for both accounts
		System.out.println("Summary of Accounts: ");
		System.out.println("---------------------------------------");
		System.out.println(acct1);
		System.out.println("---------------------------------------");
		System.out.println(acct2);
	}
}
