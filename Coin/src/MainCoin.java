/*
 * Author: Sean Emede
 * File: MainCoin.java
 * Date: 2/21/2023
 * Purpose: to test the file Coin.java and flips a coin 20 times
 * 			It displays what side is facing up, and total amount of each outcome
 */
public class MainCoin {

	public static void main(String[] args) {
		Coin coinSide = new Coin();
		
		//counter for heads and tails
		int headsCounter = 0;
		int tailsCounter = 0;
		
		// for loop to toss coin 20 times and get the side that facing up
		for (int counter = 0; counter < 20; counter++ ) { 
			coinSide.toss(); 
			System.out.println("Side facing up is " + coinSide.getSideUp());
			
			if (coinSide.getSideUp() == "heads") {
				headsCounter += 1;
			} 
			else {
				tailsCounter += 1;
			}
			
		}
		
		System.out.println("Heads has shown " + headsCounter +" times.");
		System.out.println("Tails has shown " + tailsCounter +" times.");
		
	}

}
