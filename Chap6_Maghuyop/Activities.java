import java.util.Scanner;

public class Activities {
	public static void main(String[] args) {
		// scanner object
		Scanner scan = new Scanner(System.in);

		// banner
		System.out.println("Lake LazyDays Resort\n");

		// ask temperature
		int temp;
		System.out.println("Temperature :");
		temp = scan.nextInt();

		String activity = "";

		boolean critical = false;

		if((temp  < 20) || (temp > 95)) {
			critical = true;
		}

		// show approriate activity
		if(critical) {
			System.out.println("Visit our shops!");
		} else {
			if((temp >= 80) || (temp < 80)) {
				activity = "Swimming";
				if(60 >= temp) {
					activity = "Tennis";
					if(40 >= temp) {
						activity = "Golf";
						if(temp < 40) {
							activity = "Skiing";
						}
					}
				}
			}
			System.out.println("Activity : " + activity);
		}
	}
}
