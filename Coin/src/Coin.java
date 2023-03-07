/*
 * Author: Sean Emede
 * File: Coin.java
 * Date: 2/21/2023
 * Purpose: to create a class that flips a coin 20 times and displays the results
 */

//import java.util.Random;
import java.security.SecureRandom;
					

public class Coin {
	
	//instance variables
	private String sideUp;
	
	//constructors
	public Coin () {
		//Random side = new Random();
		SecureRandom side = new SecureRandom();
		if ((side.nextInt(2) + 1) == 1) {
			sideUp = "heads";
		} else {
			sideUp = "tails";
		}
		
	}

	//accessors and mutators for sideUp
	public String getSideUp() {
		return sideUp;
	}

	public void setSideUp(String sideUp) {
		this.sideUp = sideUp;
	}
	
	//method to simulate coin toss
	public void toss() {
		//Random sideNew = new Random();
		SecureRandom sideNew = new SecureRandom();
		if ((sideNew.nextInt(2) + 1) == 1) {
			this.sideUp = "tails";
		} 
		else {
			this.sideUp = "heads";
		}
	}
	
	

}
