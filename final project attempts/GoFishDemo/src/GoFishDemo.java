import java.util.Scanner;

public class GoFishDemo {
	
	public void GoFish(){

		boolean gameEnd = false;
		
		//initializes card deck
		CardDeck deck = new CardDeck();
		
		//create card arrays for both players
		Card[] player1Hand = new Card[7];
		Card[] player2Hand = new Card[7];

		//int to keep number of the card in each players hand
		int player1HandNum = 0;
		int player2HandNum = 0;

		//counts index of each player's hand
		int player1HandIndex = 0;
		int player2HandIndex = 0;

		
		//for player input
		Scanner playerInput = new Scanner(System.in);
		 
		 
		//check if players have no cards


		 
		 System.out.println("Let's play a game of Go Fish");

		//shuffles deck before dealing
		deck.shuffle();
		
		//for loop to deal cards one at a time to each player
		for (int cardCount = 0; cardCount < 7; cardCount++) {
			player1Hand[player1HandIndex++] = deck.dealCard(); 
			player1HandNum++;
			player2Hand[player2HandIndex++] = deck.dealCard();
			player2HandNum++;
		}
		
		int turn = 0;
		while(!gameEnd) {
			int otherPlayer = 1 - turn;
			System.out.println("Player " + (turn + 1) + ", which card do you want to ask for?");
			String rank = playerInput.next();
		}
		
		// method to go fish for a card if other player can't give any cards
//		private void fish() {
//			
//		}
//
//		private void printHands() {
//			System.out.println("Player 1's hand: " + player1Hand);
//			System.out.println("Player 2's hand: " + player2Hand);
//		}
	}
}
