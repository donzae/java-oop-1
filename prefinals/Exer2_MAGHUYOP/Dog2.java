public class Dog2 extends AbstractAnimal {

	// constructors
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Dog2() {
		this.color = "No Color";
	}

	Dog2(String color) {
		this.color = color;
	}

	// methods
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void speak() {
		System.out.print("AW-AW");
	}
}
