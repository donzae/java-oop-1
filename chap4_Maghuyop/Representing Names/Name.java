class Name {

	private String first_name, middle_name, last_name;

	// constructor
	Name(String first_name, String middle_name, String last_name) {
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
	}

	public int length() {
		return first_name.length() + middle_name.length() + last_name.length();
	}

	public boolean equals(Name otherName) {
		if(first_name.equals(otherName.first_name)) {
			if(middle_name.equals(otherName.middle_name)) {
				if(last_name.equals(otherName.last_name)) {
					return true;
				}
			}
		}
		return false;
	}

	public String initials() {
		return first_name.substring(0, 1).toUpperCase() + middle_name.substring(0, 1).toUpperCase() + last_name.substring(0, 1).toUpperCase();
	}

	// getters
	public String getFirst() {
		return first_name;
	}

	public String getMiddle() {
		return middle_name;
	}

	public String getLast() {
		return last_name;
	}

	public String firstMiddleLast() {
		return first_name + " " + middle_name + " " + last_name;
	}

	public String lastFirstMiddle() {
		return last_name + ", " + first_name + " " + middle_name;
	}
}
