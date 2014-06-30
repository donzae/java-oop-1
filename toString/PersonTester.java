class PersonTester {

	// executable main
	public static void main(String[] args) {

		// instantiate object p1 using constructor with no parameters
		Person p1 = new Person();

		// assign values in p1 object
		p1.first_name = "John";
		p1.last_name = "Ginko";
		p1.age = 19;

		// display object p1
		System.out.println("Person 1");
		System.out.println("Firstname: " + p1.first_name);
		System.out.println("Lastname: " + p1.last_name);
		System.out.println("Age: " + p1.age);

		System.out.println("=======================================");

		// instantiate object p2 using constructor with 2 parameters
		Person p2 = new Person("Megan", "Lopez");

		// display object p2
		System.out.println("Person 2");
		System.out.println("Firstname: " + p2.first_name);
		System.out.println("Lastname: " + p2.last_name);
		System.out.println("Age: " + p2.age);

		System.out.println("=======================================");

		// instantiate object p3 using constructor with 3 parameters
		Person p3 = new Person("Jan", "Maghuyop", 101);

		// display object p3
		System.out.println("Person 3");
		System.out.println("Firstname: " + p3.first_name);
		System.out.println("Lastname: " + p3.last_name);
		System.out.println("Age: " + p3.age);

		System.out.println("=======================================");

		// using to string method
		System.out.println("Using toString method:");
		System.out.println(p3.toString());
	}
}
