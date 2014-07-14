import java.util.Random;

public class PairOfDice {
	// instance variable
	int dice1, dice2, sum;

	// random object
	Random generator = new Random();

	// constructor
	PairOfDice() {
		rollDice1();
		rollDice2();
	}

	// roll dice 1
	public void rollDice1() {
		dice1 = generator.nextInt(6) + 1;
	}

	// roll dice 2
	public void rollDice2() {
		dice2 = generator.nextInt(6) + 1;
	}

	// roll both dice
	public void rollBothDice() {
		rollDice1();
		rollDice2();
	}

	// get value of dice 1
	public int getDice1Val() {
		return dice1;
	}

	// get value of dice 2
	public int getDice2Val() {
		return dice2;
	}

  // get sum of 2 dice
  public int getSum() {
  	return dice1 + dice2;
  }

	// set value of dice 1
	public void setDice1Val(int value) {
		dice1 = value;
	}

	// set value of dice 2
	public void setDice2Val(int value) {
		dice2 = value;
	}

	// to string
	public String toString() {
		return "Dice 1: " + dice1 + "\nDice 2: " + dice2 + "\nSum: " + getSum();
	}
}
