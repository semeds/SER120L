public class Card {
	private final String rank;
	private final String suit;
	
	public Card(String cardRank, String cardSuit) {
		this.rank = cardRank;
		this.suit = cardSuit;
	}
	
	public String toString() {
		return this.rank + " of " + this.suit;
	}
	
	public String getFace() {
		return this.rank;
	}
	
	public String getSuit() {
		return this.suit;
	}
}
