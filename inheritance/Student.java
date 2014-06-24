public class Student extends Person {

	// properties
	public byte id_no;
	public byte year_level;

	// constructor w/o parameters
	public Student() {
		super(); // call parent constructor
		id_no = 0;
		year_level = 0;
	}

	// constructor with 1 parameter
	public Student(String first_name) {
		this();
		setFirst_name(first_name);
	}

	// constructor with 2 parameters
	public Student(String first_name, String last_name) {
		this(first_name);
		setLast_name(last_name);
	}

	// constructor with 3 parameters
	public Student(String first_name, String last_name, int age) {
		this(first_name, last_name);
		setAge(age);
	}

	// constructor with 4 parameters
	public Student(String first_name, String last_name, int age, byte id_no) {
		this(first_name, last_name, age);
		setId_no(id_no);
	}

	// constructor with 5 parameters
	public Student(String first_name, String last_name, int age, byte id_no, byte year_level) {
		this(first_name, last_name, age, id_no);
		setYear_level(year_level);
	}

	// getter methods
	public byte getId_no() {
		return id_no;
	}

	public byte getYear_level() {
		return year_level;
	}

	// setter methods
	public void setId_no(byte id_no) {
		if(id_no > 0) {
			this.id_no = id_no;
		} else {
			this.id_no = 0;
		}
	}

	public void setYear_level(byte year_level) {
		if((year_level > 0) && (year_level <= 5)) {
			this.year_level = year_level;
		} else {
			this.year_level = 0;
		}
	}
}
