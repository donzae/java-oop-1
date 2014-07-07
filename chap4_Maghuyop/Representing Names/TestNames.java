import java.util.Scanner;

class TestNames {

	public static void main(String[] args) {

		String first_name, middle_name, last_name;

		Scanner scan = new Scanner(System.in);

		System.out.println("#########################################################");

		// prompt user for name 1
		System.out.println("Firstname: ");
		first_name = scan.next();

		System.out.println("Middlename: ");
		middle_name = scan.next();

		System.out.println("Lastname: ");
		last_name = scan.next();

		// create name 1
		Name n1 = new Name(first_name, middle_name, last_name);

		System.out.println("---------------------------------------------------------");

		// show first and reverse
		System.out.println(n1.firstMiddleLast());
		System.out.println(n1.lastFirstMiddle());
		// show initials
		System.out.println("Initials: " + n1.initials());
		// show length
		System.out.println("Name length: " + n1.length());

		System.out.println("#########################################################");

		// prompt user for name 2
		System.out.println("Firstname: ");
		first_name = scan.next();

		System.out.println("Middlename: ");
		middle_name = scan.next();

		System.out.println("Lastname: ");
		last_name = scan.next();

		// create name 1
		Name n2 = new Name(first_name, middle_name, last_name);

		System.out.println("---------------------------------------------------------");

		// show first and reverse
		System.out.println(n2.firstMiddleLast());
		System.out.println(n2.lastFirstMiddle());
		// show initials
		System.out.println("Initials: " + n2.initials());
		// show length
		System.out.println("Name length: " + n2.length());

		System.out.println("#########################################################");
		// show if names are the same
		if(n1.equals(n2)) {
			System.out.println("Name 1 and name 2 are the same.");
		} else {
			System.out.println("Name 1 and name 2 are not the same.");
		}
	}
}
