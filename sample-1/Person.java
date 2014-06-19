class Person {

	// properties
	public String first_name;
	public String last_name;
	public int age;

	// constructor
	public Person() {
	}

	// methods
	public String get_name() {
		return first_name + ", " + last_name;
	}

	public int get_age() {
		return age;
	}
}
