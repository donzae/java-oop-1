// ****************************************************************
// BaseballStats.java
//
// Reads baseball data in from a comma delimited file. Each line
// of the file contains a name followed by a list of symbols
// indicating the result of each at bat: h for hit, o for out,
// w for walk, s for sacrifice. Statistics are computed and
// printed for each player.
// ****************************************************************

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class BaseballStats {
	//-------------------------------------------------
	// Reads baseball stats from a file and counts
	// total hits, outs, walks, and sacrifice flies
	// for each player.
	//-------------------------------------------------

	public static void main (String[] args) throws IOException {
		// decimal format object
		DecimalFormat fmt = new DecimalFormat("0.##");

		Scanner fileScan, lineScan;
		String fileName;

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the name of the input file: ");
		fileName = scan.nextLine();

		fileScan = new Scanner(new File(fileName));
		// Read and process each line of the file

		String line;
		while (fileScan.hasNext()) {
			line = fileScan.nextLine();
			// System.out.println (line);

			lineScan = new Scanner(line);
			lineScan.useDelimiter(",");

			// String player = lineScan[0];

			// Print each part of the line
			String letter, player_name;
			int hits = 0, outs = 0, walks = 0, sacrifice_flies = 0;
			player_name = lineScan.next();
			float batting_average = 0;
			while (lineScan.hasNext()) {
				letter = lineScan.next();

				// hits
				if(letter.equals("h")) {
					hits += 1;
				}

				// outs
				if(letter.equals("o")) {
					outs += 1;
				}

				// walks
				if(letter.equals("w")) {
					walks += 1;
				}

				// sacrifies flies
				if(letter.equals("s")) {
					sacrifice_flies += 1;
				}
				// System.out.println (lineScan.next());
			}

			// compute batting average
			batting_average = (float) hits / ((float)hits + (float)outs);

			// print player statistics
			// System.out.println("Player: " + player);
			System.out.println("Player: " + player_name);
			System.out.println("Hits  : " + hits);
			System.out.println("Outs  : " + outs);
			System.out.println("Walks : " + walks);
			System.out.println("Sacrifies flies : " + sacrifice_flies);
			System.out.println("Batting average: " + fmt.format(batting_average));
			System.out.println("");
		}
	}
}
