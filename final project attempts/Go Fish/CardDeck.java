public import java.security.SecureRandom;

public class CardDeck {
	private static final SecureRandom randomNum = new SecureRandom();
	private static final int NUM_OF_CARDS = 52;

	private Card[] deck = new Card[NUM_OF_CARDS];
	private int currentCard = 0;
	
	public CardDeck() {
		String[] ranks = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for(int count=0;count<deck.length;count++) {
			deck[count] = new Card(ranks[count%13], suits[count/13]);
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++) {
			int second = randomNum.nextInt(NUM_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
}

