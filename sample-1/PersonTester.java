class PersonTester {

	// executable main
	public static void main(String[] args) {

		// instantiate object p1
		Person p1 = new Person();

		// assign values in p1 object
		p1.first_name = "John";
		p1.last_name = "Ginko";
		p1.age = 19;

		// display object p1
		System.out.println("firstname: " + p1.first_name);
		System.out.println("Lastname: " + p1.last_name);
		System.out.println("Age: " + p1.age);
	}
}
