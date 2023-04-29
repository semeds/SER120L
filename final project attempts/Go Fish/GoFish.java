import java.security.SecureRandom;
import java.util.*;

import javax.smartcardio.Card;

public class GoFish {
	// constants parameter for the game
	private static final int HAND_SIZE = 7;
	// private static final int NUM_CARDS = 52;
	// private static final int MAX_PLAYERS = 2;
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", 
						"8", "9", "10", "Jack", "Queen", "King"};
	private final int NUM_RANKS = RANKS.length;
	private final int NUM_SUITS = SUITS.length;
	
	// data
	private List<Card> deck; // deck of cards
	private List<Card>[] playerHand; // hands of each player; cards they have
	private int[] playerScores; // score of each player; the number of sets of 4 cards
	//private int currentPlayer; //index of the current player; 0 or 1
	private Scanner playerInput;	//reads player input
	private SecureRandom randomNum; // rng to shuffle deck

	// constructor that initializes data
	public GoFish(){
		//creates deck of cards
		deck = new ArrayList<>();
		for (int suit = 0; suit < NUM_SUITS; suit++){
			for (int rank = 0; rank < NUM_RANKS; rank++){
				deck.add(new Card(RANKS[rank], SUITS[suit])); //creates card objects and adds them to deck
			}
		}

		playerHand = new List[2];

		//initializes hands to empty lists
		playerHand[0] = new ArrayList<>();
		playerHand[1] = new ArrayList<>();
		
		randomNum = new SecureRandom();
		playerInput = new Scanner(System.in);

	}

	public void play(){
		System.out.println("Let's play a game of Go Fish!");
		shuffleDeck();
		dealCards();

		int turn = 0;
		while (true){
			printHands();
			int otherPlayer = 1 - turn;
			System.out.println("Player " + (turn + 1) + ", which card do you want to ask for?");
			String rank = playerInput.next();
			List<Integer> indices = searchCards(playerHand[otherPlayer], rank);
			if (indices.isEmpty()){
				System.out.println("Go fish!");
				int index = drawCard(turn);
				if (index == -1){
					System.out.println("Deck is empty, game over.");
					return;
				}
				checkForBooks(turn);
			}
			else{
				System.out.println("Player " + (otherPlayer + 1) + "' do you have any " + rank + "s?");
				int count = indices.size();
				for (int i = count - 1; i >= 0; i--){
					playerHand[otherPlayer].remove(indices.get(i).intValue());
					playerHand[turn].add(new Card(rank, null));
				}
				checkForBooks(turn);
			}
			if (playerHand[turn].isEmpty()){
				System.out.println("Player " + (turn + 1) + " wins!");
				return;
			}
			turn = otherPlayer;
		}
	}

	private void shuffleDeck(){
		Collections.shuffle(deck, randomNum);
	}

	private void dealCards(){
		for (int i = 0; i < HAND_SIZE; i++){
			for (int j = 0; j < 2; j++){
				int index = drawCard(j);
				if (index == -1){
					System.out.println("Deck is empty, game over.");
					System.exit(0);
				}
			}
		}
	}

	private void printHands(){
		System.out.println("Player 1's hand: " + playerHand[0]);
		System.out.println("Player 2's hand: " + playerHand[1]);
	}

	private int drawCard(int player){
		if (deck.isEmpty()){
			return -1;
		}
		else{
			Card card = deck.remove(0);
			playerHand[player].add(card);
			return 0;
		}
	}

	private void checkForBooks(int player){
		int[] count = new int[NUM_RANKS];
		// count the number of cards of each rank in the player's hand
		for (Card card : playerHand[player]) {
			int rankIndex = Arrays.asList(RANKS).indexOf(card.getRank());
			count[rankIndex]++;
		}
		// check for sets of four cards and remove them from the player's hand
		for (int i = 0; i < NUM_RANKS; i++) {
			if (count[i] == 4) {
				playerScores[player]++;
				System.out.println("Player " + (player + 1) + " got a set of " + RANKS[i] + "s!");
				// remove the cards from the player's hand
				Iterator<Card> iter = playerHand[player].iterator();
				while (iter.hasNext()) {
					if (iter.next().getRank().equals(RANKS[i])) {
						iter.remove();
					}
				}
			}
		}
	}



}





