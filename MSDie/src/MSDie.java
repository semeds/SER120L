import java.security.SecureRandom;

public class MSDie {
	private int sides;
	private int value;

	public static SecureRandom random = new SecureRandom();

	public MSDie(int sides) {
		// YOUR CODE BELOW
		SecureRandom faceValue = new SecureRandom();
		
		//this.sides = sides;
		value = faceValue.nextInt(sides) + 1; 
		
		//this.value = faceValue.nextInt(sides) + 1;
	}

	public void roll() {
		// YOUR CODE BELOW
		SecureRandom rollValue = new SecureRandom(); //all this is correct
		value = rollValue.nextInt(sides) + 1;
	}

	// PROVIDE PROPER SETTER & GETTER AS NEEDED
	public int getSides() {
		return sides; //this.sides
	}

	public int getValue() {
		return value; //this.value
	}

}