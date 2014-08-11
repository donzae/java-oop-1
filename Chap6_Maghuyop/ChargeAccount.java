import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ChargeAccount {

	// format object
	static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

	// variable declarations
	static double previous_balance;
	static double additional_charges;
	static double interest = 0;
	static double total_owed;
	static double total_new_balance;
	static double minimum_payment = 0;

	public static void main(String[] args) {

		// scanner object
		Scanner scan = new Scanner(System.in);

		// ask previous balance
		System.out.println("Previous Balance: ");
		previous_balance = scan.nextDouble();

		// ask additional charges for the month
		System.out.println("Additional charges this month: ");
		additional_charges = scan.nextDouble();

		// set interest value
		if(previous_balance == 0) {
			interest = 0;
		}

		if(previous_balance > 0) {
			total_owed = previous_balance + additional_charges;
			interest = total_owed * 0.02;
		}

		// compute total new balance
		total_new_balance = previous_balance + additional_charges + interest;

		// compute minimum payment
		// switch addon by type
		int type = 0;
		if(total_new_balance < 50) {
			minimum_payment = total_new_balance;
			type = 1;
		}
		if((total_new_balance >= 50) || (total_new_balance <= 300)) {
			minimum_payment = 50;
			type = 2;
		}
		if(total_new_balance > 300) {
			minimum_payment = total_new_balance * 0.2;
			type = 3;
		}

		switch(type) {
			case 1: display_report(); break;
			case 2: display_report(); break;
			case 3: display_report(); break;
		}
	}

	static void display_report() {
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println("Previous Balance: " + currencyFormat.format(previous_balance));
		System.out.println("Additional Charges: " + currencyFormat.format(additional_charges));
		System.out.println("Interest: " + currencyFormat.format(interest));
		System.out.println("\nNew Balance: " + currencyFormat.format(total_new_balance));
		System.out.println("\nMinimum Payment: " + currencyFormat.format(minimum_payment));
	}
}
