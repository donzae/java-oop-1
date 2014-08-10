import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ChargeAccount {
	public static void main(String[] args) {

		// scanner object
		Scanner scan = new Scanner(System.in);
		// format object
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

		// ask previous balance
		double previous_balance;
		System.out.println("Previous Balance: ");
		previous_balance = scan.nextDouble();

		// ask additional charges for the month
		double additional_charges;
		System.out.println("Additional charges this month: ");
		additional_charges = scan.nextDouble();

		// set interest value
		double interest = 0;
		if(previous_balance == 0) {
			interest = 0;
		}

		double total_owed;
		if(previous_balance > 0) {
			total_owed = previous_balance + additional_charges;
			interest = total_owed * 0.02;
		}

		// compute total new balance
		double total_new_balance;
		total_new_balance = previous_balance + additional_charges + interest;

		// compute minimum payment
		double minimum_payment = 0;
		if(total_new_balance < 50) {
			minimum_payment = total_new_balance;
		}
		if((total_new_balance >= 50) || (total_new_balance <= 300)) {
			minimum_payment = 50;
		}
		if(total_new_balance > 300) {
			minimum_payment = total_new_balance * 0.2;
		}


		// display report
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println("Previous Balance: " + currencyFormat.format(previous_balance));
		System.out.println("Additional Charges: " + currencyFormat.format(additional_charges));
		System.out.println("Interest: " + currencyFormat.format(interest));
		System.out.println("\nNew Balance: " + currencyFormat.format(total_new_balance));
		System.out.println("\nMinimum Payment: " + currencyFormat.format(minimum_payment));
	}
}
