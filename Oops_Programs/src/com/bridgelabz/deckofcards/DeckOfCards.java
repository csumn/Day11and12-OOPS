package com.bridgelabz.deckofcards;

public class DeckOfCards {
	static final int numOfPlayers = 4;
	static final int numOfDistCards = 9;
	public static void main(String[] args) {
		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		shuffle(SUITS, RANKS);
	}
	
	public static void shuffle(String[] SUITS, String[] RANKS) {
		int[][] array = new int[SUITS.length][RANKS.length]; 
		int n = SUITS.length * RANKS.length; 
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < numOfPlayers; i++){ 
			array[i][0] = i + 1;
			System.out.println("\n --> Person  " + array[i][0]+"\n");
			for (int j = 0; j < numOfDistCards; j++) {
				System.out.println(deck[i + j * numOfPlayers]);
			}
		}
	}
}