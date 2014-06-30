// ************************************************************
// RollingDice.java
//
// Simulates a rolling dice and thier total
// ************************************************************

import java.util.Random;

class RollingDice {

	public static void main(String[] args) {

		int dice1, dice2, sum;

		Random generator = new Random();

		// first dice roll
		dice1 = generator.nextInt(6) + 1;
		System.out.println("Dice 1: " + dice1);

		// second dice roll
		dice2 = generator.nextInt(6) + 1;
		System.out.println("Dice 2: " + dice2);

		// total number of the 2 dice
		sum = dice1 + dice2;
		System.out.println("Total: " + sum);
	}
}
