package dev.code;

public class Card {

	int suit, rank;
	String[] suits = new String[4];
	String[] ranks = new String[14];

	public Card() {
		this.suit = 0;
		this.rank = 0;
		init();
	}

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		init();
	}

	private void init() {
		suits[0] = "Clubs";
		suits[1] = "Diamonds";
		suits[2] = "Hearts";
		suits[3] = "Spades";

		for (int i = 0; i < 14; i++) {
			ranks[i] = Integer.toString(i);
			switch (i) {
			case 1:
				ranks[i] = "Ace";
				break;
			case 11:
				ranks[i] = "Jack";
				break;
			case 12:
				ranks[i] = "Queen";
				break;
			case 13:
				ranks[i] = "King";
				break;
			default:
				break;
			}
		}
	}

	public String getSuit() {
		return suits[this.suit];
	}

	public String getRank() {
		return ranks[this.rank];
	}
	public  boolean sameCard(Card c1, Card c2) {
		return (c1.suit == c2.suit && c1.rank == c2.rank);
	}
}
