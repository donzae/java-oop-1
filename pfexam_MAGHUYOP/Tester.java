import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		// scanner object
		Scanner scan = new Scanner(System.in);

		// instantiate
		IntList list = new IntList(5);

		int value;
		do {
			System.out.print("Value: ");
			value = scan.nextInt();
			list.add(value);
		} while(list.numElements <= 4);

		list.toString();
	}
}
