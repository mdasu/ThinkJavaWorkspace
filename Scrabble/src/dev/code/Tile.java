package dev.code;

public class Tile {

	int value = 0;
	char letter = '\0';
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_"; /* _ = Blank */
	static String letterValue = "1332142418513113X11114484X0"; /* X = 10 */
	static String numOfLetter = "9224Z2329114268216464221212"; /* Z = 12 */

	static String[][] letterAry = new String[27][3];

	/*
	 * Tile distribution A: 9 tiles B: 2 tiles C: 2 tiles D: 4 tiles E: 12 tiles
	 * F: 2 tiles G: 3 tiles H: 2 tiles I: 9 tiles J: 1 tile K: 1 tile L: 4
	 * tiles M: 2 tiles N: 6 tiles O: 8 tiles P: 2 tiles Q: 1 tile R: 6 tiles S:
	 * 4 tiles T: 6 tiles U: 4 tiles V: 2 tiles W: 2 tiles X: 1 tile Y: 2 tiles
	 * Z: 1 tile
	 */

	/*
	 * Tile value: A is worth 1 B is worth 3 C is worth 3 D is worth 2 E is
	 * worth 1 F is worth 4 G is worth 2 H is worth 4 I is worth 1 J is worth 8
	 * K is worth 5 L is worth 1 M is worth 3 N is worth 1 O is worth 1 P is
	 * worth 3 Q is worth 10 R is worth 1 S is worth 1 T is worth 1 U is worth 1
	 * V is worth 4 W is worth 4 X is worth 8 Y is worth 4 Z is worth 10
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
		int max = 27;
		double ran = Math.random();
		double ranD = ran * max;
		int ranI = (int) ranD;
		return ranI;
	}

	private static void buildArray() {
		for (int i = 0; i < 27; i++) {
			letterAry[i][0] = String.valueOf(alphabet.charAt(i));
			letterAry[i][1] = String.valueOf(letterValue.charAt(i));
			letterAry[i][2] = String.valueOf(numOfLetter.charAt(i));

			// Convert X to 10 if found in letterValue array
			if (letterAry[i][1].equals("X")) {
				letterAry[i][1] = "10";
			}
			// Convert Z to 12 if found in numOfLetter array
			if (letterAry[i][2].equals("Z")) {
				letterAry[i][2] = "12";
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
