public class Labrador extends Dog {

	// properties
	public double weight;

	// constructor
	Labrador(String color, Double weight) {
		super(color);
		this.weight = weight;
	}

	// methods
	public void speak() {
		System.out.println("AW-AW");
	}

	public String toString() {
		String s;
		s = "Color: " + color + "\n";
		s += "Weight" + weight + "\n";
		return s;
	}

	public double getWeight() {
		return weight;
	}
}
