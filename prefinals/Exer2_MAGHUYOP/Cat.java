public class Cat implements Animal {

	// properties
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public String color;

	// constructors
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Cat() {
		this.color = "No Color";
	}

	Cat(String color) {
		this.color = color;
	}

	// methods
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void speak() {
		System.out.print("AW-AW");
	}

	public String toString() {
		return "Color: " + color + "\n";
	}

	public String getColor() {
		return color;
	}
}
