// ************************************************************
// PlayingCards.java
//
// Simple card values and display
// ************************************************************

class PlayingCards {

	// rank values
	public enum Rank {
		ace,
		two,
		three,
		four,
		five,
		six,
		seven,
		eight,
		nine,
		ten,
		jack,
		queen,
		king
	};

	public static void main(String[] args) {

		// 1. Declare variables highCard, faceCard, card1, and card2 of type Rank.

		Rank highCard, faceCard, card1, card2;


		// 2. Assign highCard to be an ace, faceCard to be a jack,
		// queen or king (your choice), and card1 and card2 to be
		// two different numbered cards (two through ten - your choice).

		highCard = Rank.ace;
		faceCard = Rank.jack;
		card1    = Rank.three;
		card2    = Rank.two;


		// 3. Print a line, using the highCard and faceCard objects, in the following format:
		// A blackjack hand: ace and ....
		// The faceCard variable should be printed instead of the dots.

		System.out.println("A blackjack hand: " + highCard + " and " + faceCard);


		// 4. Declare two variables card1 Val and card2Val of type int and assign them the
		// face value of your card1 and card2 objects. Use your card1 and card2 variables and
		// the ordinal method associated with enumerated types. Remember that the face value
		// of two is 2, three is 3, and so on so you need to make a slight adjustment to the
		// ordinal value of the enumerated type.

		int card1Val, card2Val;
		card1Val = card1.ordinal() + 1;
		card2Val = card2.ordinal() + 1;


		// 5. Print two lines, using the card1 and card2 objects and the name method, as follows:
		// A two card hand: (print card1 and card2)
		// Hand value: (print the sum of the face values of the two cards)
		System.out.println("A two card hand: " + card1 + " and " + card2);
		System.out.println("Hand value: " + (card1Val + card2Val));
	}
}






