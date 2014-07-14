public class RollingDice2 {
	public static void main(String[] args) {
		// create object
		PairOfDice pair_dice_1 = new PairOfDice();

		// display initial values of the 2 dice
		System.out.println(pair_dice_1.toString());

		// roll another round
		System.out.println("\nRolling dice 1 and 2 ...\n");
		pair_dice_1.rollBothDice();

		// display 2nd values of the 2 dice
		System.out.println(pair_dice_1.toString());

		// set manual values to dice 1 and 2
		System.out.println("\nSetting values of Dice 1 to 2, Dice 2 to 5\n");
		pair_dice_1.setDice1Val(2);
		pair_dice_1.setDice2Val(5);

		// display 3rd values of the 2 dice
		System.out.println(pair_dice_1.toString());
	}
}
