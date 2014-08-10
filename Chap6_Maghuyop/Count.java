// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************

import java.util.Scanner;

public class Count {
	public static void main (String[] args) {
		String phrase; // a string of characters
		int count_blank; // the number of blanks (spaces) in the phrase
		int length; // the length of the phrase
		char ch; // an individual character in the string

		Scanner scan = new Scanner(System.in);

		String choice;
		do {
			// Print a program header
			System.out.println ();
			System.out.println ("Character Counter");
			System.out.println ();

			// Read in a string and find its length
			System.out.print ("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			length = phrase.length();

			// Initialize counts
			count_blank = 0;
			int count_a = 0;
			int count_A = 0;
			int count_b = 0;
			int count_e = 0;
			int count_E = 0;
			int count_s = 0;
			int count_S = 0;
			int count_t = 0;
			int count_T = 0;

			// a for loop to go through the string character by character
			// and count the blank spaces
			for(int i = 0; i < length; i += 1) {
				ch = phrase.charAt(i);
				switch(ch) {
					case 'a': count_a += 1; break;
					case 'A': count_A += 1; break;
					case 'e': count_e += 1; break;
					case 'E': count_E += 1; break;
					case 's': count_s += 1; break;
					case 'S': count_S += 1; break;
					case 't': count_t += 1; break;
					case 'T': count_T += 1; break;
					case ' ': count_blank += 1; break;
				}
			}

			// Print the results
			System.out.println ();
			System.out.println ("Number of blank spaces: " + count_blank);
			System.out.println ("Number of a's: " + count_a);
			System.out.println ("Number of A's: " + count_A);
			System.out.println ("Number of e's: " + count_e);
			System.out.println ("Number of E's: " + count_E);
			System.out.println ("Number of s's: " + count_s);
			System.out.println ("Number of S's: " + count_S);
			System.out.println ("Number of t's: " + count_t);
			System.out.println ("Number of T's: " + count_T);
			System.out.println ();

			// prompt to quit or proceed
			System.out.println ("Quit? Y/N: ");
			choice = scan.nextLine();
			choice = choice.toUpperCase();
		} while(!choice.equals("Y"));
	}
}
