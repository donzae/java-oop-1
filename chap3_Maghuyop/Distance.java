// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {

	public static void main (String[] args) {

		double x1, y1, x2, y2; // coordinates of two points
		double distance, d; // distance between the points

		Scanner scan = new Scanner(System.in);

		// ask for the coordinates of point 1
		System.out.println("Coordinate 1 ------------------------ ");
		System.out.print("Enter x1: ");
		x1 = scan.nextDouble();

		System.out.print("Enter y1: ");
		y1 = scan.nextDouble();


		// ask for the coordinates of point 2
		System.out.println("Coordinate 2 ------------------------ ");
		System.out.print("Enter x2: ");
		x2 = scan.nextDouble();

		System.out.print("Enter y2: ");
		y2 = scan.nextDouble();


		// Compute the distance
		// distance = Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2))));
		distance = Math.sqrt(Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2)));

		// format
		DecimalFormat fmt = new DecimalFormat("0.####");

		// Print out the answer
		System.out.println("Distance ------------------------ ");
		System.out.println("Distance: " + fmt.format(distance));
	}
}
