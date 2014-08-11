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
		int type = 0;
		if(critical) {
			type = 0;
		} else {
			if((temp >= 80) || (temp < 80)) {
				type = 1;
				activity = "Swimming";
				if(60 >= temp) {
					type = 2;
					activity = "Tennis";
					if(40 >= temp) {
						type = 3;
						activity = "Golf";
						if(temp < 40) {
							type = 4;
							activity = "Skiing";
						}
					}
				}
			}
		}

		switch(type) {
			case 0: System.out.println("Visit our shops!"); break;
			case 1: System.out.println("Activity : " + activity); break;
			case 2: System.out.println("Activity : " + activity); break;
			case 3: System.out.println("Activity : " + activity); break;
			case 4: System.out.println("Activity : " + activity); break;
		}
	}
}
