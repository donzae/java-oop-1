public class BulbTest {
	public static void main(String[] args) {
		// instantiate 2 bulbs
		Bulb b1 = new Bulb();
		Bulb b2 = new Bulb();

		// show bulb status
		System.out.println("Bulb 1: " + b1.getStatus());
		System.out.println("Bulb 2: " + b2.getStatus());

		// turn on bulbs
		System.out.println("\nTurning on bulbs ...\n");
		b1.switchOn();
		b2.switchOn();

		// show new bulb status
		System.out.println("Bulb 1: " + b1.getStatus());
		System.out.println("Bulb 2: " + b2.getStatus());
	}
}
