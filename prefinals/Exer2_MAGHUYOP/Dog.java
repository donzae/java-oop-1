public class Dog implements Animal {

	// properties
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public String color;

	// constructors
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Dog() {
		this.color = "No Color";
	}

	Dog(String color) {
		this.color = color;
	}

	// methods
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void speak() {
		System.out.print("AW-AW");
	}

	public String getLocation() {
		return location;
	}

	public String toString() {
		return "Color: " + color + "\n";
	}

	public String getColor() {
		return color;
	}
}
