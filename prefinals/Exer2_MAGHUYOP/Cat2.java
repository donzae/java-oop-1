public class Cat2 extends AbstractAnimal {

	// constructors
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Cat2() {
		this.color = "No Color";
	}

	Cat2(String color) {
		this.color = color;
	}

	// methods
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void speak() {
		System.out.print("MEOW-NYAA");
	}
}
