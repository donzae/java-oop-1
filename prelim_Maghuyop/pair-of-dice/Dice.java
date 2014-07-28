import java.util.Random;

public class Dice {

	// random object
	Random generator = new Random();

	// properties
	int dice;

	// constructor
	Dice() {
		rollDice();
	}

	// methods
	public void rollDice() {
		dice = generator.nextInt(6) + 1;
	}

	public int getDiceValue() {
		return dice;
	}

	// to string
	public String toString() {
		return "Dice : " + dice;
	}
}
