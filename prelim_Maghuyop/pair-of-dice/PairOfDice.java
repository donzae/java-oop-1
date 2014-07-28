public class PairOfDice extends Dice {
	// instance variable
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	int sum;

	// constructor
	PairOfDice() {
		dice1.roll();
		dice2.roll();
	}

	// roll both dice
	public void rollBothDice() {
		dice1.roll();
		dice2.roll();
	}

	// get sum of 2 dice
	public int getSum() {
		return dice1.getValue() + dice2.getValue();
	}

	public void setDice1Val(int value) {
		dice1.setValue(value);
	}

	public void setDice2Val(int value) {
		dice2.setValue(value);
	}

	// to string
	public String toString() {
		return "Dice 1: " + dice1.getValue() + "\nDice 2: " + dice2.getValue() + "\nSum: " + getSum();
	}
}
