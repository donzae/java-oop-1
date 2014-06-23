// include scanner
import java.util.Scanner;

class Exer1_Maghuyop {

	public static void main(String[] args) {

		// variables
		String first_name;
		String last_name;
		int age;

		// instantiate scan object
		Scanner scan = new Scanner(System.in);

		// ask firstname
		System.out.print("Firstname: ");
		first_name = scan.next();

		// ask lastname
		System.out.print("Lastname: ");
		last_name = scan.next();

		// ask age
		System.out.print("Age: ");
		age = scan.nextInt();

		// instantiate person p1 as object
		Person p1 = new Person(first_name, last_name, age);

		// display object properties
		// System.out.println("Firstname: " + p1.first_name);
		// System.out.println("Lastname: " + p1.last_name);
		// System.out.println("Age: " + p1.age);

		// using methods
		System.out.println("Firstname: " + p1.getFirst_name());
		System.out.println("Lastname: " + p1.getLast_name());
		System.out.println("Age: " + p1.getAge());
	}
}
