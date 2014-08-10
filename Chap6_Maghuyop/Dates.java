// ************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ************************************************************

import java.util.Scanner;

public class Dates {
	public static void main(String[] args) {
		int month, day, year; 	// date read in from user
		int daysInMonth = 0; 	// number of days in month read in
		boolean monthValid, yearValid, dayValid; //true if input from user is valid
		boolean leapYear; 		// true if user's year is a leap year

		// scan object
		Scanner scan = new Scanner(System.in);

		// Get integer month, day, and year from user
		System.out.println("Month: ");
		month = scan.nextInt();
		System.out.println("Day: ");
		day = scan.nextInt();
		System.out.println("Year: ");
		year = scan.nextInt();

		// Check to see if month is valid
		if((month < 1) || (month > 12)) {
			monthValid = false;
			daysInMonth = 0;
		} else {
			monthValid = true;
		}

		// Check to see if year is valid
		if((year < 1000) || (year > 1999)) {
			yearValid = false;
		} else {
			yearValid = true;
		}

		// Determine whether it's a leap year
		leapYear = false;
		if(((year%400) == 0) || (((year%4) == 0) && (year%100) != 0)) {
			leapYear = true;
		}

		// Determine number of days in month
		switch(month) {
			case 1: daysInMonth = 31; break;
			case 2:
				if(leapYear) {
					daysInMonth = 29;
				} else {
					daysInMonth = 28;
				}
				break;
			case 3: daysInMonth  = 31; break;
			case 4: daysInMonth  = 30; break;
			case 5: daysInMonth  = 31; break;
			case 6: daysInMonth  = 30; break;
			case 7: daysInMonth  = 31; break;
			case 8: daysInMonth  = 31; break;
			case 9: daysInMonth  = 30; break;
			case 10: daysInMonth = 31; break;
			case 11: daysInMonth = 30; break;
			case 12: daysInMonth = 31; break;
		}

		// User number of days in month to check to see if day is valid
		if((day >= 1) || (day <= daysInMonth)) {
			dayValid = true;
		} else {
			dayValid = false;
		}

		// Determine whether date is valid and print appropriate message
		if(dayValid && monthValid && yearValid) {
			System.out.print("\nDate is valid, ");
			if(leapYear) {
				System.out.print("it is a leap year.");
			} else {
				System.out.print("it is not a leap year.");
			}
		} else {
			System.out.println("Date is not valid.");
		}
	}
}
