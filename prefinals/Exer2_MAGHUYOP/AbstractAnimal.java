public abstract class AbstractAnimal {

	// properties
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public String color;

	// abstract methods
	public abstract void speak();

	// common methods
	public String toString() {
		return "Color: " + color + "\n";
	}

	public String getColor() {
		return color;
	}
}
