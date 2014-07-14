import java.util.Scanner;
public class number3 {
	public static void main(String[] args) {
		// scanner object
		Scanner scan = new Scanner(System.in);

		int n, choice, pos, neg, zero;
		pos = 0;
		neg = 0;
		zero = 0;
		do {
			// ask an integer of any sign and value from the user
			System.out.println("Enter integer: ");
			n = scan.nextInt();

			if(n > 0) {
				pos += 1;
			}

			if(n < 0) {
				neg += 1;
			}

			if(n == 0) {
				zero += 1;
			}

			// show stats
			System.out.println("\nPositive: " + pos);
			System.out.println("Negative: " + neg);
			System.out.println("Zero: " + zero);

			// ask user to continue
			System.out.println("Enter 0 to quit: ");
			choice = scan.nextInt();
		} while(choice != 0);
	}
}
