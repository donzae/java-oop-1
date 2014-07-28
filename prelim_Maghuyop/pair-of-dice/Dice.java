import java.util.Random;

public class Dice {

	// random object
	Random generator = new Random();

	// properties
	int dice;

	// constructor
	Dice() {
		roll();
	}

	// methods
	public void roll() {
		dice = generator.nextInt(6) + 1;
	}

	public int getValue() {
		return dice;
	}

	public void setValue(int value) {
		dice = value;
	}

	// to string
	public String toString() {
		return "Dice : " + dice;
	}
}
