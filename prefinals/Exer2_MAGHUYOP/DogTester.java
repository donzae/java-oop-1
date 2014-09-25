public class DogTester {
	public static void main(String[] args) {
		// dog instance
		Dog dog = new Dog();
		System.out.println("dog object created!");

		// methods
		System.out.println("dog methods:");
		System.out.print("Speak: "); dog.speak();
		System.out.println("\nColor: " + dog.getColor());
		System.out.println("Location: " + dog.getLocation());


		// labrador instance
		Labrador labrador = new Labrador("Black", 5.21);
		System.out.println("\nlabrador object created!");
		System.out.println("labrador methods:");
		System.out.print("Speak: "); labrador.speak();
		System.out.println("Color: " + labrador.getColor());
		System.out.println("Weight: " + labrador.getWeight());
		System.out.println("Location: " + labrador.getLocation());

		// spitz instance
		Spitz spitz = new Spitz();
		System.out.println("\nspitz object created!");
		System.out.println("spitz methods:");
		System.out.print("Speak: "); spitz.speak();
		System.out.println("Location: " + spitz.getLocation());
	}
}
