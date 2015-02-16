package dev.code;

public class Tile {

	int value = 0;
	char letter = '\0';
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Tile() {
		this.letter = 'a';
		this.value = 1;
	}

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		value = newValue;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char newLetter) {
		letter = newLetter;
	}

	private static int getRandom() {
		int max = 25;
		double ran = Math.random();
		double ranD = ran * max;
		int ranI = (int) ranD;
		return ranI;
	}

	public char getNewTile() {
		char ltr = '\0';
		int rand = getRandom();	
		ltr = alphabet.charAt(rand);
		setLetter(ltr);
		return letter;
	}
}
