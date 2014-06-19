class Person {

	// properties
	public String first_name;
	public String last_name;
	public int age;

	// constructor no parameters
	public Person() {
	}

	// constructor with 2 parameters
	public Person(String first_name, String last_name) {
		if(first_name.equals("John")) {
			this.first_name = "Jan";
		} else {
			this.first_name = first_name;
		}
		age = 0;
	}

	// constructor with 3 parameters with simple age validation
	public Person(String first_name, String last_name, int age) {
		this(first_name, last_name);
		if(age > 0) {
			if(age > 100) {
				age = 100;
			} else {
				this.age = age;
			}
		} else {
			age = 0;
		}
	}

	// methods
	public String get_name() {
		return first_name + ", " + last_name;
	}

	public int get_age() {
		return age;
	}
}
