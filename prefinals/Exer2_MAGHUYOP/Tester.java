public class Tester {
	public static void main(String[] args) {
		// dog2 instance
		Dog2 dog2 = new Dog2("Brown");
		System.out.println("dog2 object created!");
		System.out.println("Color: " + dog2.getColor());
		dog2.speak();
		System.out.println();

		// cat2 instance
		Cat2 cat2 = new Cat2();
		System.out.println("cat2 object created!");
		System.out.println("Color: " + cat2.getColor());
		cat2.speak();
		System.out.println();
	}
}
