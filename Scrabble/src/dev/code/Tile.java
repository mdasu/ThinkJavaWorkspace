package dev.code;

public class Tile {

	int value = 0;
	char letter = '\0';
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String letterValue = "1332142418513113X11114484X";

	static String[][] letterAry = new String[26][2];

	/*
	 * A is worth 1 B is worth 3 C is worth 3 D is worth 2 E is worth 1 F is
	 * worth 4 G is worth 2 H is worth 4 I is worth 1 J is worth 8 K is worth 5
	 * L is worth 1 M is worth 3 N is worth 1 O is worth 1 P is worth 3 Q is
	 * worth 10 R is worth 1 S is worth 1 T is worth 1 U is worth 1 V is worth 4
	 * W is worth 4 X is worth 8 Y is worth 4 Z is worth 10
	 */

	public Tile() {
		this.letter = 'a';
		this.value = 1;
		buildArray();
	}

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
		buildArray();
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

	private static void buildArray() {
		for (int i = 0; i < 26; i++) {
			letterAry[i][0] = String.valueOf(alphabet.charAt(i));
			letterAry[i][1] = String.valueOf(letterValue.charAt(i));

			if (letterAry[i][1].equals("X")) {
				letterAry[i][1] = "10";
			}
		}
	}

	public void setNewTile() {
		char ltr = '\0';

		String letter = "";
		String value = "";
		int rand = getRandom();

		letter = letterAry[rand][0];
		value = letterAry[rand][1];

		ltr = letter.charAt(0);
		setLetter(ltr);

		// System.out.println("value " + value + " " + rand);
		setValue(Integer.valueOf(value));
		// return letter;
	}
}
