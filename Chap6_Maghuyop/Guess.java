import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args) {

		// util object instance
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();


		// set up (initializations of the counting variables)
		int guess, wrong, right, num;
		wrong = 0;
		right = 0;
		String choice;

		do {
			// generate random number from 1 to 3 to guess
			num = generator.nextInt(3) + 1;

			// stats
			System.out.println("Right: " + right);
			System.out.println("Wrong: " + wrong);

			// read in a guess
			System.out.println("Guess an integer from 1 to 3: ");
			guess = scan.nextInt();

			// check the guess and print appropriate messages
			if(guess == num) {
				System.out.println("You won! The number is " + num + ".");
				right += 1;
			} else {
				System.out.println("You lose! The number is " + num + ".");
				wrong += 1;
			}

			System.out.println("Try again? Y/N: ");
			choice = scan.next();
			choice = choice.toUpperCase();
		} while (choice.equals("Y"));
	}
}



