// ************************************************************
// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// ************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Election {
	public static void main (String[] args) {

		int votesForIronman; // number of votes for Ironman in each precinct
		int votesForSuperman; // number of votes for Superman in each precinct
		int totalIronman; // running total of votes for Ironman
		int totalSuperman; // running total of votes for Superman
		String response; // answer (y or n) to the "more precincts" question

		// util objects
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");

		System.out.println ();
		System.out.println ("Election Day Vote Counting Program");
		System.out.println ();

		// Initializations
		totalIronman  = 0;
		totalSuperman = 0;
		int precinctSuperman = 0;
		int precinctIronman = 0;
		int tie = 0;
		int precinct  = 0;

		// Loop to "process" the votes in each precinct
		do {
			votesForSuperman = 0;
			votesForIronman  = 0;

			precinct += 1;
			System.out.println("Precinct: " + precinct);

			// ask votes for ironman and superman
			System.out.print("Number of votes for Ironman: ");
			votesForIronman = scan.nextInt();
			totalIronman += votesForIronman;

			System.out.print("Number of votes for Superman: ");
			votesForSuperman = scan.nextInt();
			totalSuperman += votesForSuperman;

			// determine precinct winner
			if(votesForIronman == votesForSuperman) {
				System.out.println("Tie!");
				tie += 1;
			} else {
				if(votesForSuperman < votesForIronman) {
					precinctIronman += 1;
					System.out.println("Ironman Won in this precinct!");
				} else {
					precinctSuperman += 1;
					System.out.println("Superman Won in this precinct!");
				}
			}

			System.out.print("Add precinct? Y/N: ");
			response = scan.next();
			response = response.toUpperCase();
		} while(response.equals("Y"));

		// Print out the results
		System.out.println("**** Election results ****\n");
		System.out.println("Number of total precincts: " + precinct);
		System.out.println("Number of precincts Ironman won: " + precinctIronman);
		System.out.println("Number of precincts Superman won: " + precinctSuperman);
		System.out.println("Number of precincts with tie results: " + tie);

		int total_votes = totalSuperman + totalIronman;
		System.out.println("\nNumber of total votes: " + total_votes);
		System.out.println("Number of total votes for Ironman: " + totalIronman);
		System.out.println("Number of total votes for Superman: " + totalSuperman);

		double percentageIronman = ((double)totalIronman / (double)total_votes) * 100.0;
		System.out.println("\nPercentage of votes for Ironman: " + fmt.format(percentageIronman) + "%");
		double percentageSuperman = ((double)totalSuperman / (double)total_votes) * 100.0;
		System.out.println("Percentage of votes for Superman: " + fmt.format(percentageSuperman) + "%");
	}
}
