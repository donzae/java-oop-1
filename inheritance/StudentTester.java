// include scanner
import java.util.Scanner;

class StudentTester {

	public static void main(String[] args) {

		// variables
		String first_name;
		String last_name;
		int age;
		byte id_no;
		byte year_level;


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

		// ask id no
		System.out.print("Id No: ");
		id_no = scan.nextByte();

		// ask
		System.out.print("Year Level: ");
		year_level = scan.nextByte();


		// instantiate person s1 as object
		Student s1 = new Student(first_name, last_name, age, id_no, year_level);

		// display object properties
		// System.out.println("Firstname: " + s1.first_name);
		// System.out.println("Lastname: " + s1.last_name);
		// System.out.println("Age: " + s1.age);

		// using methods
		System.out.println("Firstname: " + s1.getFirst_name());
		System.out.println("Lastname: " + s1.getLast_name());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Id No: " + s1.getId_no());
		System.out.println("Year level: " + s1.getYear_level());
	}
}
