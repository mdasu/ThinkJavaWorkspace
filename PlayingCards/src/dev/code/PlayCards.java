package dev.code;

import java.awt.image.SampleModel;

public class PlayCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card tenOfSpades = new Card(0, 10);
		System.out.println(tenOfSpades.getRank() + " of "
				+ tenOfSpades.getSuit());
		
		if (tenOfSpades.sameCard(tenOfSpades,tenOfSpades)) {
			 System.out.println("Card same");
		}
		
	}

}
