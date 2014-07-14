public class Bulb {
	// properties
	private String status;

	// constructor
	Bulb() {
		status = "OFF";
	}

	public void switchOn() {
		status = "ON";
	}

	public void switchOff() {
		status = "OFF";
	}

	public String getStatus() {
		return status;
	}
}
