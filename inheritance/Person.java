class Person {

	// properties
	public String first_name;
	public String last_name;
	public int age;

	// constructor no parameters
	public Person() {
		this.first_name = "Unkown Firstname";
		this.last_name = "Unkown Lastname";
		this.age = 0;
	}

	// constructor with 1 parameter
	public Person(String first_name) {
		this();
		setFirst_name(first_name);
	}

	// constructor with 2 parameters
	public Person(String first_name, String last_name) {
		this(first_name);
		setLast_name(last_name);
	}

	// constructor with 3 parameters
	public Person(String first_name, String last_name, int age) {
		this(first_name, last_name);
		setAge(age);
	}

	// getter methods
	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public int getAge() {
		return age;
	}

	// setter methods
	public void setFirst_name(String first_name) {
		if(first_name.equals("Jan")) {
			this.first_name = "Maghuyop";
		} else {
			this.first_name = first_name;
		}
	}

	public void setLast_name(String last_name) {
		if(last_name.equals("Maghuyop")) {
			this.last_name = "Willblow";
		} else {
			this.last_name = last_name;
		}
	}

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		} else {
			age = 0;
		}
	}
}
