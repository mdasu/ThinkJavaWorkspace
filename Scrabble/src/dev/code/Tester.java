package dev.code;

public class Tester {

	static char letter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Tile tile = new Tile();

		for (int i = 0; i <= 6; i++) {
			letter = tile.getNewTile();
			//System.out.println("Letter is: " + letter);
			printTile(tile); 
		}
	}

	public static void printTile(Tile t){
		System.out.println("Letter is: " + t.letter);

	}
	
	/*
	 * public static String getNewHand() {
	 * 
	 * for (int i = 0; i < 6; i++) {
	 * 
	 * } }
	 */

}